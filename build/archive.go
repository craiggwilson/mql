package build

import (
	"archive/tar"
	"archive/zip"
	"compress/gzip"
	"errors"
	"io"
	"io/ioutil"
	"os"
	"path/filepath"
	"strings"

	"github.com/craiggwilson/goke/task"
)

func archive(ctx *task.Context, src, dest string) error {
	if strings.HasSuffix(dest, ".zip") {
		return archiveZip(ctx, src, dest)
	}

	return archiveTarGZ(ctx, src, dest)
}

func archiveTarGZ(ctx *task.Context, src, dest string) error {
	ctx.Logf("targz: %s -> %s\n", src, dest)
	f, err := os.Create(dest)
	if err != nil {
		return err
	}
	defer f.Close()

	gw := gzip.NewWriter(f)
	defer gw.Close()

	tw := tar.NewWriter(gw)
	defer tw.Close()

	srcFileInfos, err := ioutil.ReadDir(src)
	if err != nil {
		return err
	}

	for _, srcFileInfo := range srcFileInfos {
		err = func() error {
			srcFile, err := os.Open(filepath.Join(src, srcFileInfo.Name()))
			if err != nil {
				return err
			}
			defer srcFile.Close()

			stat, _ := srcFile.Stat()

			_, srcFileName := filepath.Split(srcFileInfo.Name())
			header := tar.Header{
				Name:    srcFileName,
				Size:    stat.Size(),
				Mode:    int64(stat.Mode()),
				ModTime: stat.ModTime(),
			}

			err = tw.WriteHeader(&header)
			if err != nil {
				return err
			}

			_, err = io.Copy(tw, srcFile)
			if err != nil {
				return err
			}

			return nil
		}()
		if err != nil {
			return err
		}
	}

	return nil
}

func archiveZip(ctx *task.Context, src, dest string) error {
	ctx.Logf("zip: %s -> %s\n", src, dest)
	f, err := os.Create(dest)
	if err != nil {
		return err
	}
	defer f.Close()

	w := zip.NewWriter(f)
	defer w.Close()

	srcFileInfos, err := ioutil.ReadDir(src)
	if err != nil {
		return err
	}

	for _, srcFileInfo := range srcFileInfos {
		err = func() error {
			srcFile, err := os.Open(filepath.Join(src, srcFileInfo.Name()))
			if err != nil {
				return err
			}
			defer srcFile.Close()

			_, srcFileName := filepath.Split(srcFileInfo.Name())
			destFile, err := w.Create(srcFileName)
			if err != nil {
				return err
			}

			_, err = io.Copy(destFile, srcFile)
			if err != nil {
				return err
			}

			return nil
		}()
		if err != nil {
			return err
		}
	}

	return nil
}

func unarchive(ctx *task.Context, src, dest string) error {
	if strings.HasSuffix(src, ".zip") {
		return unarchiveZip(ctx, src, dest)
	}

	return unarchiveTarGZ(ctx, src, dest)
}

func unarchiveTarGZ(ctx *task.Context, src, dest string) error {
	ctx.Logf("untargz: %s -> %s\n", src, dest)
	return errors.New("only unarchiving zip is supported")
}

func unarchiveZip(ctx *task.Context, src, dest string) error {
	ctx.Logf("unzip: %s -> %s\n", src, dest)
	r, err := zip.OpenReader(src)
	if err != nil {
		return err
	}
	defer r.Close()

	for _, f := range r.File {
		err := func() error {
			fpath := filepath.Join(dest, f.Name)

			outFile, err := os.Create(fpath)
			if err != nil {
				return err
			}
			defer outFile.Close()

			rc, err := f.Open()
			if err != nil {
				return err
			}
			defer rc.Close()

			_, err = io.Copy(outFile, rc)
			if err != nil {
				return err
			}

			return nil
		}()

		if err != nil {
			return err
		}
	}

	return nil
}