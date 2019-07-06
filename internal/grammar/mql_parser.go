// Code generated from ./internal/grammar/MQL.g4 by ANTLR 4.7.1. DO NOT EDIT.

package grammar // MQL
import (
	"fmt"
	"reflect"
	"strconv"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// Suppress unused import errors
var _ = fmt.Printf
var _ = reflect.Copy
var _ = strconv.Itoa

var parserATN = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 90, 500,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 4, 13,
	9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4, 18, 9,
	18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23, 9, 23,
	4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9, 28, 4,
	29, 9, 29, 4, 30, 9, 30, 4, 31, 9, 31, 4, 32, 9, 32, 4, 33, 9, 33, 4, 34,
	9, 34, 4, 35, 9, 35, 4, 36, 9, 36, 3, 2, 3, 2, 3, 2, 3, 3, 3, 3, 3, 3,
	3, 4, 3, 4, 3, 4, 3, 4, 5, 4, 83, 10, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 6,
	7, 6, 90, 10, 6, 12, 6, 14, 6, 93, 11, 6, 3, 7, 3, 7, 5, 7, 97, 10, 7,
	3, 7, 3, 7, 3, 7, 5, 7, 102, 10, 7, 3, 7, 3, 7, 5, 7, 106, 10, 7, 3, 8,
	3, 8, 5, 8, 110, 10, 8, 3, 8, 3, 8, 3, 8, 5, 8, 115, 10, 8, 3, 9, 3, 9,
	3, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 7, 10, 125, 10, 10, 12, 10, 14,
	10, 128, 11, 10, 3, 10, 3, 10, 3, 10, 5, 10, 133, 10, 10, 3, 10, 3, 10,
	3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 7, 10, 145, 10,
	10, 12, 10, 14, 10, 148, 11, 10, 3, 10, 3, 10, 3, 10, 5, 10, 153, 10, 10,
	3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 7,
	10, 165, 10, 10, 12, 10, 14, 10, 168, 11, 10, 3, 10, 3, 10, 3, 10, 3, 10,
	3, 10, 3, 10, 3, 10, 3, 10, 7, 10, 178, 10, 10, 12, 10, 14, 10, 181, 11,
	10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 6, 10, 188, 10, 10, 13, 10, 14,
	10, 189, 3, 10, 3, 10, 5, 10, 194, 10, 10, 5, 10, 196, 10, 10, 3, 11, 3,
	11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 5, 11, 205, 10, 11, 3, 12, 3, 12,
	5, 12, 209, 10, 12, 3, 13, 3, 13, 3, 13, 5, 13, 214, 10, 13, 3, 14, 3,
	14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 6, 14, 223, 10, 14, 13, 14, 14,
	14, 224, 3, 14, 3, 14, 5, 14, 229, 10, 14, 3, 14, 3, 14, 3, 14, 3, 14,
	3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 7, 14, 242, 10, 14, 12,
	14, 14, 14, 245, 11, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14,
	3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 7, 14, 263,
	10, 14, 12, 14, 14, 14, 266, 11, 14, 3, 14, 3, 14, 3, 14, 3, 14, 5, 14,
	272, 10, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 5, 14, 280, 10,
	14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14,
	3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3,
	14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 5, 14, 310, 10, 14,
	3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 5, 14, 319, 10, 14, 3,
	14, 3, 14, 3, 14, 3, 14, 5, 14, 325, 10, 14, 3, 14, 3, 14, 3, 14, 5, 14,
	330, 10, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 5, 14, 339,
	10, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 5, 14, 346, 10, 14, 3, 14, 3,
	14, 7, 14, 350, 10, 14, 12, 14, 14, 14, 353, 11, 14, 3, 15, 3, 15, 3, 15,
	3, 15, 7, 15, 359, 10, 15, 12, 15, 14, 15, 362, 11, 15, 5, 15, 364, 10,
	15, 3, 15, 3, 15, 3, 16, 3, 16, 3, 16, 3, 16, 7, 16, 372, 10, 16, 12, 16,
	14, 16, 375, 11, 16, 5, 16, 377, 10, 16, 3, 16, 3, 16, 3, 17, 3, 17, 3,
	17, 3, 17, 3, 18, 3, 18, 3, 18, 3, 18, 7, 18, 389, 10, 18, 12, 18, 14,
	18, 392, 11, 18, 5, 18, 394, 10, 18, 3, 18, 3, 18, 3, 19, 3, 19, 3, 19,
	3, 19, 3, 20, 3, 20, 3, 20, 5, 20, 405, 10, 20, 3, 20, 3, 20, 3, 21, 3,
	21, 3, 21, 7, 21, 412, 10, 21, 12, 21, 14, 21, 415, 11, 21, 3, 21, 3, 21,
	3, 21, 7, 21, 420, 10, 21, 12, 21, 14, 21, 423, 11, 21, 5, 21, 425, 10,
	21, 3, 22, 3, 22, 3, 22, 3, 22, 3, 23, 3, 23, 5, 23, 433, 10, 23, 3, 24,
	3, 24, 3, 24, 3, 24, 3, 24, 3, 25, 3, 25, 3, 25, 3, 25, 3, 26, 3, 26, 3,
	26, 3, 26, 3, 26, 3, 26, 3, 26, 5, 26, 451, 10, 26, 3, 27, 3, 27, 3, 27,
	3, 27, 3, 27, 3, 27, 3, 27, 3, 27, 3, 27, 3, 27, 5, 27, 463, 10, 27, 3,
	28, 3, 28, 3, 28, 3, 28, 3, 28, 5, 28, 470, 10, 28, 3, 29, 3, 29, 3, 30,
	3, 30, 3, 31, 3, 31, 3, 32, 3, 32, 3, 33, 3, 33, 3, 34, 3, 34, 3, 34, 7,
	34, 485, 10, 34, 12, 34, 14, 34, 488, 11, 34, 3, 35, 3, 35, 3, 35, 7, 35,
	493, 10, 35, 12, 35, 14, 35, 496, 11, 35, 3, 36, 3, 36, 3, 36, 2, 3, 26,
	37, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36,
	38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 2,
	8, 4, 2, 32, 32, 38, 38, 5, 2, 7, 7, 19, 19, 21, 21, 4, 2, 18, 18, 24,
	24, 5, 2, 10, 12, 16, 17, 22, 22, 4, 2, 55, 55, 59, 59, 4, 2, 40, 40, 68,
	68, 2, 559, 2, 72, 3, 2, 2, 2, 4, 75, 3, 2, 2, 2, 6, 82, 3, 2, 2, 2, 8,
	84, 3, 2, 2, 2, 10, 91, 3, 2, 2, 2, 12, 94, 3, 2, 2, 2, 14, 107, 3, 2,
	2, 2, 16, 116, 3, 2, 2, 2, 18, 195, 3, 2, 2, 2, 20, 204, 3, 2, 2, 2, 22,
	206, 3, 2, 2, 2, 24, 213, 3, 2, 2, 2, 26, 279, 3, 2, 2, 2, 28, 354, 3,
	2, 2, 2, 30, 367, 3, 2, 2, 2, 32, 380, 3, 2, 2, 2, 34, 384, 3, 2, 2, 2,
	36, 397, 3, 2, 2, 2, 38, 401, 3, 2, 2, 2, 40, 424, 3, 2, 2, 2, 42, 426,
	3, 2, 2, 2, 44, 432, 3, 2, 2, 2, 46, 434, 3, 2, 2, 2, 48, 439, 3, 2, 2,
	2, 50, 450, 3, 2, 2, 2, 52, 462, 3, 2, 2, 2, 54, 469, 3, 2, 2, 2, 56, 471,
	3, 2, 2, 2, 58, 473, 3, 2, 2, 2, 60, 475, 3, 2, 2, 2, 62, 477, 3, 2, 2,
	2, 64, 479, 3, 2, 2, 2, 66, 481, 3, 2, 2, 2, 68, 489, 3, 2, 2, 2, 70, 497,
	3, 2, 2, 2, 72, 73, 5, 6, 4, 2, 73, 74, 7, 2, 2, 3, 74, 3, 3, 2, 2, 2,
	75, 76, 5, 10, 6, 2, 76, 77, 7, 2, 2, 3, 77, 5, 3, 2, 2, 2, 78, 83, 5,
	8, 5, 2, 79, 83, 5, 12, 7, 2, 80, 83, 5, 14, 8, 2, 81, 83, 5, 16, 9, 2,
	82, 78, 3, 2, 2, 2, 82, 79, 3, 2, 2, 2, 82, 80, 3, 2, 2, 2, 82, 81, 3,
	2, 2, 2, 83, 7, 3, 2, 2, 2, 84, 85, 7, 41, 2, 2, 85, 86, 5, 54, 28, 2,
	86, 87, 5, 10, 6, 2, 87, 9, 3, 2, 2, 2, 88, 90, 5, 18, 10, 2, 89, 88, 3,
	2, 2, 2, 90, 93, 3, 2, 2, 2, 91, 89, 3, 2, 2, 2, 91, 92, 3, 2, 2, 2, 92,
	11, 3, 2, 2, 2, 93, 91, 3, 2, 2, 2, 94, 96, 7, 62, 2, 2, 95, 97, 7, 42,
	2, 2, 96, 95, 3, 2, 2, 2, 96, 97, 3, 2, 2, 2, 97, 98, 3, 2, 2, 2, 98, 101,
	7, 35, 2, 2, 99, 100, 7, 45, 2, 2, 100, 102, 5, 56, 29, 2, 101, 99, 3,
	2, 2, 2, 101, 102, 3, 2, 2, 2, 102, 105, 3, 2, 2, 2, 103, 104, 7, 54, 2,
	2, 104, 106, 5, 26, 14, 2, 105, 103, 3, 2, 2, 2, 105, 106, 3, 2, 2, 2,
	106, 13, 3, 2, 2, 2, 107, 109, 7, 62, 2, 2, 108, 110, 7, 42, 2, 2, 109,
	108, 3, 2, 2, 2, 109, 110, 3, 2, 2, 2, 110, 111, 3, 2, 2, 2, 111, 114,
	7, 36, 2, 2, 112, 113, 7, 54, 2, 2, 113, 115, 5, 26, 14, 2, 114, 112, 3,
	2, 2, 2, 114, 115, 3, 2, 2, 2, 115, 15, 3, 2, 2, 2, 116, 117, 7, 71, 2,
	2, 117, 118, 5, 56, 29, 2, 118, 17, 3, 2, 2, 2, 119, 120, 7, 43, 2, 2,
	120, 121, 7, 13, 2, 2, 121, 126, 5, 32, 17, 2, 122, 123, 7, 5, 2, 2, 123,
	125, 5, 32, 17, 2, 124, 122, 3, 2, 2, 2, 125, 128, 3, 2, 2, 2, 126, 124,
	3, 2, 2, 2, 126, 127, 3, 2, 2, 2, 127, 129, 3, 2, 2, 2, 128, 126, 3, 2,
	2, 2, 129, 132, 7, 26, 2, 2, 130, 131, 7, 33, 2, 2, 131, 133, 5, 26, 14,
	2, 132, 130, 3, 2, 2, 2, 132, 133, 3, 2, 2, 2, 133, 196, 3, 2, 2, 2, 134,
	135, 7, 51, 2, 2, 135, 196, 7, 75, 2, 2, 136, 137, 7, 52, 2, 2, 137, 138,
	7, 13, 2, 2, 138, 139, 5, 66, 34, 2, 139, 152, 7, 4, 2, 2, 140, 141, 7,
	13, 2, 2, 141, 146, 5, 48, 25, 2, 142, 143, 7, 5, 2, 2, 143, 145, 5, 48,
	25, 2, 144, 142, 3, 2, 2, 2, 145, 148, 3, 2, 2, 2, 146, 144, 3, 2, 2, 2,
	146, 147, 3, 2, 2, 2, 147, 149, 3, 2, 2, 2, 148, 146, 3, 2, 2, 2, 149,
	150, 7, 26, 2, 2, 150, 151, 7, 3, 2, 2, 151, 153, 3, 2, 2, 2, 152, 140,
	3, 2, 2, 2, 152, 153, 3, 2, 2, 2, 153, 154, 3, 2, 2, 2, 154, 155, 5, 8,
	5, 2, 155, 156, 7, 26, 2, 2, 156, 196, 3, 2, 2, 2, 157, 158, 7, 54, 2,
	2, 158, 196, 5, 26, 14, 2, 159, 160, 7, 60, 2, 2, 160, 161, 7, 13, 2, 2,
	161, 166, 5, 20, 11, 2, 162, 163, 7, 5, 2, 2, 163, 165, 5, 20, 11, 2, 164,
	162, 3, 2, 2, 2, 165, 168, 3, 2, 2, 2, 166, 164, 3, 2, 2, 2, 166, 167,
	3, 2, 2, 2, 167, 169, 3, 2, 2, 2, 168, 166, 3, 2, 2, 2, 169, 170, 7, 26,
	2, 2, 170, 196, 3, 2, 2, 2, 171, 172, 7, 63, 2, 2, 172, 196, 7, 75, 2,
	2, 173, 174, 7, 64, 2, 2, 174, 179, 5, 22, 12, 2, 175, 176, 7, 5, 2, 2,
	176, 178, 5, 22, 12, 2, 177, 175, 3, 2, 2, 2, 178, 181, 3, 2, 2, 2, 179,
	177, 3, 2, 2, 2, 179, 180, 3, 2, 2, 2, 180, 196, 3, 2, 2, 2, 181, 179,
	3, 2, 2, 2, 182, 183, 7, 69, 2, 2, 183, 193, 5, 68, 35, 2, 184, 185, 7,
	72, 2, 2, 185, 187, 7, 15, 2, 2, 186, 188, 5, 24, 13, 2, 187, 186, 3, 2,
	2, 2, 188, 189, 3, 2, 2, 2, 189, 187, 3, 2, 2, 2, 189, 190, 3, 2, 2, 2,
	190, 191, 3, 2, 2, 2, 191, 192, 7, 28, 2, 2, 192, 194, 3, 2, 2, 2, 193,
	184, 3, 2, 2, 2, 193, 194, 3, 2, 2, 2, 194, 196, 3, 2, 2, 2, 195, 119,
	3, 2, 2, 2, 195, 134, 3, 2, 2, 2, 195, 136, 3, 2, 2, 2, 195, 157, 3, 2,
	2, 2, 195, 159, 3, 2, 2, 2, 195, 171, 3, 2, 2, 2, 195, 173, 3, 2, 2, 2,
	195, 182, 3, 2, 2, 2, 196, 19, 3, 2, 2, 2, 197, 198, 7, 23, 2, 2, 198,
	205, 5, 66, 34, 2, 199, 205, 5, 66, 34, 2, 200, 201, 5, 58, 30, 2, 201,
	202, 7, 4, 2, 2, 202, 203, 5, 26, 14, 2, 203, 205, 3, 2, 2, 2, 204, 197,
	3, 2, 2, 2, 204, 199, 3, 2, 2, 2, 204, 200, 3, 2, 2, 2, 205, 21, 3, 2,
	2, 2, 206, 208, 5, 68, 35, 2, 207, 209, 9, 2, 2, 2, 208, 207, 3, 2, 2,
	2, 208, 209, 3, 2, 2, 2, 209, 23, 3, 2, 2, 2, 210, 211, 7, 46, 2, 2, 211,
	214, 5, 66, 34, 2, 212, 214, 7, 73, 2, 2, 213, 210, 3, 2, 2, 2, 213, 212,
	3, 2, 2, 2, 214, 25, 3, 2, 2, 2, 215, 216, 8, 14, 1, 2, 216, 217, 7, 18,
	2, 2, 217, 280, 5, 26, 14, 27, 218, 219, 7, 56, 2, 2, 219, 280, 5, 26,
	14, 26, 220, 222, 7, 66, 2, 2, 221, 223, 5, 46, 24, 2, 222, 221, 3, 2,
	2, 2, 223, 224, 3, 2, 2, 2, 224, 222, 3, 2, 2, 2, 224, 225, 3, 2, 2, 2,
	225, 228, 3, 2, 2, 2, 226, 227, 7, 39, 2, 2, 227, 229, 5, 26, 14, 2, 228,
	226, 3, 2, 2, 2, 228, 229, 3, 2, 2, 2, 229, 280, 3, 2, 2, 2, 230, 231,
	7, 44, 2, 2, 231, 232, 5, 26, 14, 2, 232, 233, 7, 67, 2, 2, 233, 234, 5,
	26, 14, 2, 234, 235, 7, 39, 2, 2, 235, 236, 5, 26, 14, 12, 236, 280, 3,
	2, 2, 2, 237, 238, 7, 13, 2, 2, 238, 243, 5, 48, 25, 2, 239, 240, 7, 5,
	2, 2, 240, 242, 5, 48, 25, 2, 241, 239, 3, 2, 2, 2, 242, 245, 3, 2, 2,
	2, 243, 241, 3, 2, 2, 2, 243, 244, 3, 2, 2, 2, 244, 246, 3, 2, 2, 2, 245,
	243, 3, 2, 2, 2, 246, 247, 7, 26, 2, 2, 247, 248, 7, 3, 2, 2, 248, 249,
	5, 26, 14, 11, 249, 280, 3, 2, 2, 2, 250, 251, 7, 15, 2, 2, 251, 252, 5,
	26, 14, 2, 252, 253, 7, 28, 2, 2, 253, 280, 3, 2, 2, 2, 254, 255, 5, 44,
	23, 2, 255, 256, 7, 3, 2, 2, 256, 257, 5, 26, 14, 2, 257, 272, 3, 2, 2,
	2, 258, 259, 7, 15, 2, 2, 259, 264, 5, 44, 23, 2, 260, 261, 7, 5, 2, 2,
	261, 263, 5, 44, 23, 2, 262, 260, 3, 2, 2, 2, 263, 266, 3, 2, 2, 2, 264,
	262, 3, 2, 2, 2, 264, 265, 3, 2, 2, 2, 265, 267, 3, 2, 2, 2, 266, 264,
	3, 2, 2, 2, 267, 268, 7, 28, 2, 2, 268, 269, 7, 3, 2, 2, 269, 270, 5, 26,
	14, 2, 270, 272, 3, 2, 2, 2, 271, 254, 3, 2, 2, 2, 271, 258, 3, 2, 2, 2,
	272, 280, 3, 2, 2, 2, 273, 280, 5, 38, 20, 2, 274, 280, 5, 60, 31, 2, 275,
	280, 5, 70, 36, 2, 276, 280, 5, 30, 16, 2, 277, 280, 5, 28, 15, 2, 278,
	280, 5, 50, 26, 2, 279, 215, 3, 2, 2, 2, 279, 218, 3, 2, 2, 2, 279, 220,
	3, 2, 2, 2, 279, 230, 3, 2, 2, 2, 279, 237, 3, 2, 2, 2, 279, 250, 3, 2,
	2, 2, 279, 271, 3, 2, 2, 2, 279, 273, 3, 2, 2, 2, 279, 274, 3, 2, 2, 2,
	279, 275, 3, 2, 2, 2, 279, 276, 3, 2, 2, 2, 279, 277, 3, 2, 2, 2, 279,
	278, 3, 2, 2, 2, 280, 351, 3, 2, 2, 2, 281, 282, 12, 28, 2, 2, 282, 283,
	7, 20, 2, 2, 283, 350, 5, 26, 14, 28, 284, 285, 12, 21, 2, 2, 285, 286,
	9, 3, 2, 2, 286, 350, 5, 26, 14, 22, 287, 288, 12, 20, 2, 2, 288, 289,
	9, 4, 2, 2, 289, 350, 5, 26, 14, 21, 290, 291, 12, 19, 2, 2, 291, 292,
	9, 5, 2, 2, 292, 350, 5, 26, 14, 20, 293, 294, 12, 18, 2, 2, 294, 295,
	7, 31, 2, 2, 295, 350, 5, 26, 14, 19, 296, 297, 12, 17, 2, 2, 297, 298,
	9, 6, 2, 2, 298, 350, 5, 26, 14, 18, 299, 300, 12, 16, 2, 2, 300, 301,
	7, 6, 2, 2, 301, 350, 5, 26, 14, 17, 302, 303, 12, 15, 2, 2, 303, 304,
	7, 9, 2, 2, 304, 350, 5, 26, 14, 16, 305, 306, 12, 25, 2, 2, 306, 309,
	7, 8, 2, 2, 307, 310, 5, 60, 31, 2, 308, 310, 5, 38, 20, 2, 309, 307, 3,
	2, 2, 2, 309, 308, 3, 2, 2, 2, 310, 350, 3, 2, 2, 2, 311, 312, 12, 24,
	2, 2, 312, 329, 7, 14, 2, 2, 313, 330, 5, 26, 14, 2, 314, 315, 5, 26, 14,
	2, 315, 318, 7, 25, 2, 2, 316, 317, 7, 4, 2, 2, 317, 319, 5, 26, 14, 2,
	318, 316, 3, 2, 2, 2, 318, 319, 3, 2, 2, 2, 319, 330, 3, 2, 2, 2, 320,
	321, 7, 25, 2, 2, 321, 324, 5, 26, 14, 2, 322, 323, 7, 4, 2, 2, 323, 325,
	5, 26, 14, 2, 324, 322, 3, 2, 2, 2, 324, 325, 3, 2, 2, 2, 325, 330, 3,
	2, 2, 2, 326, 327, 7, 25, 2, 2, 327, 328, 7, 4, 2, 2, 328, 330, 5, 26,
	14, 2, 329, 313, 3, 2, 2, 2, 329, 314, 3, 2, 2, 2, 329, 320, 3, 2, 2, 2,
	329, 326, 3, 2, 2, 2, 330, 331, 3, 2, 2, 2, 331, 332, 7, 27, 2, 2, 332,
	350, 3, 2, 2, 2, 333, 334, 12, 23, 2, 2, 334, 335, 7, 25, 2, 2, 335, 338,
	5, 26, 14, 2, 336, 337, 7, 4, 2, 2, 337, 339, 5, 26, 14, 2, 338, 336, 3,
	2, 2, 2, 338, 339, 3, 2, 2, 2, 339, 350, 3, 2, 2, 2, 340, 341, 12, 22,
	2, 2, 341, 342, 7, 50, 2, 2, 342, 350, 7, 74, 2, 2, 343, 345, 12, 14, 2,
	2, 344, 346, 7, 56, 2, 2, 345, 344, 3, 2, 2, 2, 345, 346, 3, 2, 2, 2, 346,
	347, 3, 2, 2, 2, 347, 348, 7, 45, 2, 2, 348, 350, 5, 28, 15, 2, 349, 281,
	3, 2, 2, 2, 349, 284, 3, 2, 2, 2, 349, 287, 3, 2, 2, 2, 349, 290, 3, 2,
	2, 2, 349, 293, 3, 2, 2, 2, 349, 296, 3, 2, 2, 2, 349, 299, 3, 2, 2, 2,
	349, 302, 3, 2, 2, 2, 349, 305, 3, 2, 2, 2, 349, 311, 3, 2, 2, 2, 349,
	333, 3, 2, 2, 2, 349, 340, 3, 2, 2, 2, 349, 343, 3, 2, 2, 2, 350, 353,
	3, 2, 2, 2, 351, 349, 3, 2, 2, 2, 351, 352, 3, 2, 2, 2, 352, 27, 3, 2,
	2, 2, 353, 351, 3, 2, 2, 2, 354, 363, 7, 14, 2, 2, 355, 360, 5, 26, 14,
	2, 356, 357, 7, 5, 2, 2, 357, 359, 5, 26, 14, 2, 358, 356, 3, 2, 2, 2,
	359, 362, 3, 2, 2, 2, 360, 358, 3, 2, 2, 2, 360, 361, 3, 2, 2, 2, 361,
	364, 3, 2, 2, 2, 362, 360, 3, 2, 2, 2, 363, 355, 3, 2, 2, 2, 363, 364,
	3, 2, 2, 2, 364, 365, 3, 2, 2, 2, 365, 366, 7, 27, 2, 2, 366, 29, 3, 2,
	2, 2, 367, 376, 7, 13, 2, 2, 368, 373, 5, 32, 17, 2, 369, 370, 7, 5, 2,
	2, 370, 372, 5, 32, 17, 2, 371, 369, 3, 2, 2, 2, 372, 375, 3, 2, 2, 2,
	373, 371, 3, 2, 2, 2, 373, 374, 3, 2, 2, 2, 374, 377, 3, 2, 2, 2, 375,
	373, 3, 2, 2, 2, 376, 368, 3, 2, 2, 2, 376, 377, 3, 2, 2, 2, 377, 378,
	3, 2, 2, 2, 378, 379, 7, 26, 2, 2, 379, 31, 3, 2, 2, 2, 380, 381, 5, 58,
	30, 2, 381, 382, 7, 4, 2, 2, 382, 383, 5, 26, 14, 2, 383, 33, 3, 2, 2,
	2, 384, 393, 7, 13, 2, 2, 385, 390, 5, 36, 19, 2, 386, 387, 7, 5, 2, 2,
	387, 389, 5, 36, 19, 2, 388, 386, 3, 2, 2, 2, 389, 392, 3, 2, 2, 2, 390,
	388, 3, 2, 2, 2, 390, 391, 3, 2, 2, 2, 391, 394, 3, 2, 2, 2, 392, 390,
	3, 2, 2, 2, 393, 385, 3, 2, 2, 2, 393, 394, 3, 2, 2, 2, 394, 395, 3, 2,
	2, 2, 395, 396, 7, 26, 2, 2, 396, 35, 3, 2, 2, 2, 397, 398, 5, 66, 34,
	2, 398, 399, 7, 4, 2, 2, 399, 400, 5, 26, 14, 2, 400, 37, 3, 2, 2, 2, 401,
	402, 5, 62, 32, 2, 402, 404, 7, 15, 2, 2, 403, 405, 5, 40, 21, 2, 404,
	403, 3, 2, 2, 2, 404, 405, 3, 2, 2, 2, 405, 406, 3, 2, 2, 2, 406, 407,
	7, 28, 2, 2, 407, 39, 3, 2, 2, 2, 408, 413, 5, 26, 14, 2, 409, 410, 7,
	5, 2, 2, 410, 412, 5, 26, 14, 2, 411, 409, 3, 2, 2, 2, 412, 415, 3, 2,
	2, 2, 413, 411, 3, 2, 2, 2, 413, 414, 3, 2, 2, 2, 414, 425, 3, 2, 2, 2,
	415, 413, 3, 2, 2, 2, 416, 421, 5, 42, 22, 2, 417, 418, 7, 5, 2, 2, 418,
	420, 5, 42, 22, 2, 419, 417, 3, 2, 2, 2, 420, 423, 3, 2, 2, 2, 421, 419,
	3, 2, 2, 2, 421, 422, 3, 2, 2, 2, 422, 425, 3, 2, 2, 2, 423, 421, 3, 2,
	2, 2, 424, 408, 3, 2, 2, 2, 424, 416, 3, 2, 2, 2, 425, 41, 3, 2, 2, 2,
	426, 427, 5, 64, 33, 2, 427, 428, 7, 4, 2, 2, 428, 429, 5, 26, 14, 2, 429,
	43, 3, 2, 2, 2, 430, 433, 5, 70, 36, 2, 431, 433, 7, 30, 2, 2, 432, 430,
	3, 2, 2, 2, 432, 431, 3, 2, 2, 2, 433, 45, 3, 2, 2, 2, 434, 435, 7, 34,
	2, 2, 435, 436, 5, 26, 14, 2, 436, 437, 7, 67, 2, 2, 437, 438, 5, 26, 14,
	2, 438, 47, 3, 2, 2, 2, 439, 440, 5, 70, 36, 2, 440, 441, 7, 4, 2, 2, 441,
	442, 5, 26, 14, 2, 442, 49, 3, 2, 2, 2, 443, 451, 5, 52, 27, 2, 444, 451,
	7, 87, 2, 2, 445, 451, 9, 7, 2, 2, 446, 451, 7, 57, 2, 2, 447, 451, 7,
	85, 2, 2, 448, 451, 7, 90, 2, 2, 449, 451, 7, 74, 2, 2, 450, 443, 3, 2,
	2, 2, 450, 444, 3, 2, 2, 2, 450, 445, 3, 2, 2, 2, 450, 446, 3, 2, 2, 2,
	450, 447, 3, 2, 2, 2, 450, 448, 3, 2, 2, 2, 450, 449, 3, 2, 2, 2, 451,
	51, 3, 2, 2, 2, 452, 463, 7, 75, 2, 2, 453, 463, 7, 78, 2, 2, 454, 463,
	7, 76, 2, 2, 455, 463, 7, 77, 2, 2, 456, 463, 7, 79, 2, 2, 457, 463, 7,
	80, 2, 2, 458, 463, 7, 81, 2, 2, 459, 463, 7, 82, 2, 2, 460, 463, 7, 83,
	2, 2, 461, 463, 7, 84, 2, 2, 462, 452, 3, 2, 2, 2, 462, 453, 3, 2, 2, 2,
	462, 454, 3, 2, 2, 2, 462, 455, 3, 2, 2, 2, 462, 456, 3, 2, 2, 2, 462,
	457, 3, 2, 2, 2, 462, 458, 3, 2, 2, 2, 462, 459, 3, 2, 2, 2, 462, 460,
	3, 2, 2, 2, 462, 461, 3, 2, 2, 2, 463, 53, 3, 2, 2, 2, 464, 470, 7, 86,
	2, 2, 465, 466, 5, 56, 29, 2, 466, 467, 7, 8, 2, 2, 467, 468, 7, 86, 2,
	2, 468, 470, 3, 2, 2, 2, 469, 464, 3, 2, 2, 2, 469, 465, 3, 2, 2, 2, 470,
	55, 3, 2, 2, 2, 471, 472, 7, 86, 2, 2, 472, 57, 3, 2, 2, 2, 473, 474, 7,
	86, 2, 2, 474, 59, 3, 2, 2, 2, 475, 476, 7, 86, 2, 2, 476, 61, 3, 2, 2,
	2, 477, 478, 7, 86, 2, 2, 478, 63, 3, 2, 2, 2, 479, 480, 7, 86, 2, 2, 480,
	65, 3, 2, 2, 2, 481, 486, 5, 58, 30, 2, 482, 483, 7, 8, 2, 2, 483, 485,
	5, 58, 30, 2, 484, 482, 3, 2, 2, 2, 485, 488, 3, 2, 2, 2, 486, 484, 3,
	2, 2, 2, 486, 487, 3, 2, 2, 2, 487, 67, 3, 2, 2, 2, 488, 486, 3, 2, 2,
	2, 489, 494, 5, 60, 31, 2, 490, 491, 7, 8, 2, 2, 491, 493, 5, 60, 31, 2,
	492, 490, 3, 2, 2, 2, 493, 496, 3, 2, 2, 2, 494, 492, 3, 2, 2, 2, 494,
	495, 3, 2, 2, 2, 495, 69, 3, 2, 2, 2, 496, 494, 3, 2, 2, 2, 497, 498, 7,
	88, 2, 2, 498, 71, 3, 2, 2, 2, 51, 82, 91, 96, 101, 105, 109, 114, 126,
	132, 146, 152, 166, 179, 189, 193, 195, 204, 208, 213, 224, 228, 243, 264,
	271, 279, 309, 318, 324, 329, 338, 345, 349, 351, 360, 363, 373, 376, 390,
	393, 404, 413, 421, 424, 432, 450, 462, 469, 486, 494,
}
var deserializer = antlr.NewATNDeserializer(nil)
var deserializedATN = deserializer.DeserializeFromUInt16(parserATN)

var literalNames = []string{
	"", "'=>'", "':'", "','", "'||'", "'/'", "'.'", "'??'", "'='", "'>'", "'>='",
	"'{'", "'['", "'('", "'<'", "'<='", "'-'", "'%'", "'**'", "'*'", "'!='",
	"'!'", "'+'", "'..'", "'}'", "']'", "')'", "';'", "'_'",
}
var symbolicNames = []string{
	"", "ARROW", "COLON", "COMMA", "CONCAT", "DIV", "DOT", "DQUESTION", "EQ",
	"GT", "GTE", "LBRACE", "LBRACK", "LPAREN", "LT", "LTE", "MINUS", "MOD",
	"POWER", "MULT", "NEQ", "EXCLUDE", "PLUS", "RANGE", "RBRACE", "RBRACK",
	"RPAREN", "SEMI", "UNDERSCORE", "AND", "ASC", "BY", "CASE", "COLLECTIONS",
	"DATABASES", "DELETE", "DESC", "ELSE", "FALSE", "FROM", "FULL", "GROUP",
	"IF", "IN", "INDEX", "INSERT", "INTO", "LET", "LIKE", "LIMIT", "LOOKUP",
	"MANY", "MATCH", "NOR", "NOT", "NULL", "ONE", "OR", "PROJECT", "SET", "SHOW",
	"SKIP_", "SORT", "STEP", "SWITCH", "THEN", "TRUE", "UNWIND", "UPDATE",
	"USE", "WITH", "PRESERVE_NULL_AND_EMPTY", "REGEX", "INT", "DOUBLE", "DECIMAL",
	"LONG", "BIN", "LONG_BIN", "HEX", "LONG_HEX", "OCT", "LONG_OCT", "OID",
	"ID", "STRING", "VARIABLE_ID", "WS", "DATE_TIME",
}

var ruleNames = []string{
	"fullStatement", "fullPipeline", "statement", "queryStatement", "pipeline",
	"showCollectionsStatement", "showDatabasesStatement", "useDatabaseStatement",
	"queryStage", "projectItem", "sortField", "unwindOption", "expression",
	"array", "document", "fieldAssignment", "multipart_document", "multipartFieldAssignment",
	"function", "functionArguments", "functionNamedArgument", "lambdaArgument",
	"switchCase", "variableAssignment", "value", "number", "collectionName",
	"databaseName", "fieldDeclaration", "fieldName", "functionName", "functionArgumentName",
	"multipartFieldDeclaration", "multipartFieldName", "variableName",
}
var decisionToDFA = make([]*antlr.DFA, len(deserializedATN.DecisionToState))

func init() {
	for index, ds := range deserializedATN.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(ds, index)
	}
}

type MQLParser struct {
	*antlr.BaseParser
}

func NewMQLParser(input antlr.TokenStream) *MQLParser {
	this := new(MQLParser)

	this.BaseParser = antlr.NewBaseParser(input)

	this.Interpreter = antlr.NewParserATNSimulator(this, deserializedATN, decisionToDFA, antlr.NewPredictionContextCache())
	this.RuleNames = ruleNames
	this.LiteralNames = literalNames
	this.SymbolicNames = symbolicNames
	this.GrammarFileName = "MQL.g4"

	return this
}

// MQLParser tokens.
const (
	MQLParserEOF                     = antlr.TokenEOF
	MQLParserARROW                   = 1
	MQLParserCOLON                   = 2
	MQLParserCOMMA                   = 3
	MQLParserCONCAT                  = 4
	MQLParserDIV                     = 5
	MQLParserDOT                     = 6
	MQLParserDQUESTION               = 7
	MQLParserEQ                      = 8
	MQLParserGT                      = 9
	MQLParserGTE                     = 10
	MQLParserLBRACE                  = 11
	MQLParserLBRACK                  = 12
	MQLParserLPAREN                  = 13
	MQLParserLT                      = 14
	MQLParserLTE                     = 15
	MQLParserMINUS                   = 16
	MQLParserMOD                     = 17
	MQLParserPOWER                   = 18
	MQLParserMULT                    = 19
	MQLParserNEQ                     = 20
	MQLParserEXCLUDE                 = 21
	MQLParserPLUS                    = 22
	MQLParserRANGE                   = 23
	MQLParserRBRACE                  = 24
	MQLParserRBRACK                  = 25
	MQLParserRPAREN                  = 26
	MQLParserSEMI                    = 27
	MQLParserUNDERSCORE              = 28
	MQLParserAND                     = 29
	MQLParserASC                     = 30
	MQLParserBY                      = 31
	MQLParserCASE                    = 32
	MQLParserCOLLECTIONS             = 33
	MQLParserDATABASES               = 34
	MQLParserDELETE                  = 35
	MQLParserDESC                    = 36
	MQLParserELSE                    = 37
	MQLParserFALSE                   = 38
	MQLParserFROM                    = 39
	MQLParserFULL                    = 40
	MQLParserGROUP                   = 41
	MQLParserIF                      = 42
	MQLParserIN                      = 43
	MQLParserINDEX                   = 44
	MQLParserINSERT                  = 45
	MQLParserINTO                    = 46
	MQLParserLET                     = 47
	MQLParserLIKE                    = 48
	MQLParserLIMIT                   = 49
	MQLParserLOOKUP                  = 50
	MQLParserMANY                    = 51
	MQLParserMATCH                   = 52
	MQLParserNOR                     = 53
	MQLParserNOT                     = 54
	MQLParserNULL                    = 55
	MQLParserONE                     = 56
	MQLParserOR                      = 57
	MQLParserPROJECT                 = 58
	MQLParserSET                     = 59
	MQLParserSHOW                    = 60
	MQLParserSKIP_                   = 61
	MQLParserSORT                    = 62
	MQLParserSTEP                    = 63
	MQLParserSWITCH                  = 64
	MQLParserTHEN                    = 65
	MQLParserTRUE                    = 66
	MQLParserUNWIND                  = 67
	MQLParserUPDATE                  = 68
	MQLParserUSE                     = 69
	MQLParserWITH                    = 70
	MQLParserPRESERVE_NULL_AND_EMPTY = 71
	MQLParserREGEX                   = 72
	MQLParserINT                     = 73
	MQLParserDOUBLE                  = 74
	MQLParserDECIMAL                 = 75
	MQLParserLONG                    = 76
	MQLParserBIN                     = 77
	MQLParserLONG_BIN                = 78
	MQLParserHEX                     = 79
	MQLParserLONG_HEX                = 80
	MQLParserOCT                     = 81
	MQLParserLONG_OCT                = 82
	MQLParserOID                     = 83
	MQLParserID                      = 84
	MQLParserSTRING                  = 85
	MQLParserVARIABLE_ID             = 86
	MQLParserWS                      = 87
	MQLParserDATE_TIME               = 88
)

// MQLParser rules.
const (
	MQLParserRULE_fullStatement             = 0
	MQLParserRULE_fullPipeline              = 1
	MQLParserRULE_statement                 = 2
	MQLParserRULE_queryStatement            = 3
	MQLParserRULE_pipeline                  = 4
	MQLParserRULE_showCollectionsStatement  = 5
	MQLParserRULE_showDatabasesStatement    = 6
	MQLParserRULE_useDatabaseStatement      = 7
	MQLParserRULE_queryStage                = 8
	MQLParserRULE_projectItem               = 9
	MQLParserRULE_sortField                 = 10
	MQLParserRULE_unwindOption              = 11
	MQLParserRULE_expression                = 12
	MQLParserRULE_array                     = 13
	MQLParserRULE_document                  = 14
	MQLParserRULE_fieldAssignment           = 15
	MQLParserRULE_multipart_document        = 16
	MQLParserRULE_multipartFieldAssignment  = 17
	MQLParserRULE_function                  = 18
	MQLParserRULE_functionArguments         = 19
	MQLParserRULE_functionNamedArgument     = 20
	MQLParserRULE_lambdaArgument            = 21
	MQLParserRULE_switchCase                = 22
	MQLParserRULE_variableAssignment        = 23
	MQLParserRULE_value                     = 24
	MQLParserRULE_number                    = 25
	MQLParserRULE_collectionName            = 26
	MQLParserRULE_databaseName              = 27
	MQLParserRULE_fieldDeclaration          = 28
	MQLParserRULE_fieldName                 = 29
	MQLParserRULE_functionName              = 30
	MQLParserRULE_functionArgumentName      = 31
	MQLParserRULE_multipartFieldDeclaration = 32
	MQLParserRULE_multipartFieldName        = 33
	MQLParserRULE_variableName              = 34
)

// IFullStatementContext is an interface to support dynamic dispatch.
type IFullStatementContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFullStatementContext differentiates from other interfaces.
	IsFullStatementContext()
}

type FullStatementContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFullStatementContext() *FullStatementContext {
	var p = new(FullStatementContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_fullStatement
	return p
}

func (*FullStatementContext) IsFullStatementContext() {}

func NewFullStatementContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FullStatementContext {
	var p = new(FullStatementContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_fullStatement

	return p
}

func (s *FullStatementContext) GetParser() antlr.Parser { return s.parser }

func (s *FullStatementContext) Statement() IStatementContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IStatementContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IStatementContext)
}

func (s *FullStatementContext) EOF() antlr.TerminalNode {
	return s.GetToken(MQLParserEOF, 0)
}

func (s *FullStatementContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FullStatementContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FullStatementContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFullStatement(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) FullStatement() (localctx IFullStatementContext) {
	localctx = NewFullStatementContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, MQLParserRULE_fullStatement)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(70)
		p.Statement()
	}
	{
		p.SetState(71)
		p.Match(MQLParserEOF)
	}

	return localctx
}

// IFullPipelineContext is an interface to support dynamic dispatch.
type IFullPipelineContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFullPipelineContext differentiates from other interfaces.
	IsFullPipelineContext()
}

type FullPipelineContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFullPipelineContext() *FullPipelineContext {
	var p = new(FullPipelineContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_fullPipeline
	return p
}

func (*FullPipelineContext) IsFullPipelineContext() {}

func NewFullPipelineContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FullPipelineContext {
	var p = new(FullPipelineContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_fullPipeline

	return p
}

func (s *FullPipelineContext) GetParser() antlr.Parser { return s.parser }

func (s *FullPipelineContext) Pipeline() IPipelineContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPipelineContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPipelineContext)
}

func (s *FullPipelineContext) EOF() antlr.TerminalNode {
	return s.GetToken(MQLParserEOF, 0)
}

func (s *FullPipelineContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FullPipelineContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FullPipelineContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFullPipeline(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) FullPipeline() (localctx IFullPipelineContext) {
	localctx = NewFullPipelineContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, MQLParserRULE_fullPipeline)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(73)
		p.Pipeline()
	}
	{
		p.SetState(74)
		p.Match(MQLParserEOF)
	}

	return localctx
}

// IStatementContext is an interface to support dynamic dispatch.
type IStatementContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsStatementContext differentiates from other interfaces.
	IsStatementContext()
}

type StatementContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyStatementContext() *StatementContext {
	var p = new(StatementContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_statement
	return p
}

func (*StatementContext) IsStatementContext() {}

func NewStatementContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *StatementContext {
	var p = new(StatementContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_statement

	return p
}

func (s *StatementContext) GetParser() antlr.Parser { return s.parser }

func (s *StatementContext) QueryStatement() IQueryStatementContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IQueryStatementContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IQueryStatementContext)
}

func (s *StatementContext) ShowCollectionsStatement() IShowCollectionsStatementContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IShowCollectionsStatementContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IShowCollectionsStatementContext)
}

func (s *StatementContext) ShowDatabasesStatement() IShowDatabasesStatementContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IShowDatabasesStatementContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IShowDatabasesStatementContext)
}

func (s *StatementContext) UseDatabaseStatement() IUseDatabaseStatementContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IUseDatabaseStatementContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IUseDatabaseStatementContext)
}

func (s *StatementContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StatementContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *StatementContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitStatement(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) Statement() (localctx IStatementContext) {
	localctx = NewStatementContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, MQLParserRULE_statement)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(80)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 0, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(76)
			p.QueryStatement()
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(77)
			p.ShowCollectionsStatement()
		}

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(78)
			p.ShowDatabasesStatement()
		}

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(79)
			p.UseDatabaseStatement()
		}

	}

	return localctx
}

// IQueryStatementContext is an interface to support dynamic dispatch.
type IQueryStatementContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsQueryStatementContext differentiates from other interfaces.
	IsQueryStatementContext()
}

type QueryStatementContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyQueryStatementContext() *QueryStatementContext {
	var p = new(QueryStatementContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_queryStatement
	return p
}

func (*QueryStatementContext) IsQueryStatementContext() {}

func NewQueryStatementContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *QueryStatementContext {
	var p = new(QueryStatementContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_queryStatement

	return p
}

func (s *QueryStatementContext) GetParser() antlr.Parser { return s.parser }

func (s *QueryStatementContext) FROM() antlr.TerminalNode {
	return s.GetToken(MQLParserFROM, 0)
}

func (s *QueryStatementContext) CollectionName() ICollectionNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ICollectionNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ICollectionNameContext)
}

func (s *QueryStatementContext) Pipeline() IPipelineContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPipelineContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPipelineContext)
}

func (s *QueryStatementContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *QueryStatementContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *QueryStatementContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitQueryStatement(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) QueryStatement() (localctx IQueryStatementContext) {
	localctx = NewQueryStatementContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, MQLParserRULE_queryStatement)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(82)
		p.Match(MQLParserFROM)
	}
	{
		p.SetState(83)
		p.CollectionName()
	}
	{
		p.SetState(84)
		p.Pipeline()
	}

	return localctx
}

// IPipelineContext is an interface to support dynamic dispatch.
type IPipelineContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsPipelineContext differentiates from other interfaces.
	IsPipelineContext()
}

type PipelineContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyPipelineContext() *PipelineContext {
	var p = new(PipelineContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_pipeline
	return p
}

func (*PipelineContext) IsPipelineContext() {}

func NewPipelineContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PipelineContext {
	var p = new(PipelineContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_pipeline

	return p
}

func (s *PipelineContext) GetParser() antlr.Parser { return s.parser }

func (s *PipelineContext) AllQueryStage() []IQueryStageContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IQueryStageContext)(nil)).Elem())
	var tst = make([]IQueryStageContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IQueryStageContext)
		}
	}

	return tst
}

func (s *PipelineContext) QueryStage(i int) IQueryStageContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IQueryStageContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IQueryStageContext)
}

func (s *PipelineContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PipelineContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PipelineContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitPipeline(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) Pipeline() (localctx IPipelineContext) {
	localctx = NewPipelineContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, MQLParserRULE_pipeline)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(89)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for ((_la-41)&-(0x1f+1)) == 0 && ((1<<uint((_la-41)))&((1<<(MQLParserGROUP-41))|(1<<(MQLParserLIMIT-41))|(1<<(MQLParserLOOKUP-41))|(1<<(MQLParserMATCH-41))|(1<<(MQLParserPROJECT-41))|(1<<(MQLParserSKIP_-41))|(1<<(MQLParserSORT-41))|(1<<(MQLParserUNWIND-41)))) != 0 {
		{
			p.SetState(86)
			p.QueryStage()
		}

		p.SetState(91)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}

	return localctx
}

// IShowCollectionsStatementContext is an interface to support dynamic dispatch.
type IShowCollectionsStatementContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsShowCollectionsStatementContext differentiates from other interfaces.
	IsShowCollectionsStatementContext()
}

type ShowCollectionsStatementContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyShowCollectionsStatementContext() *ShowCollectionsStatementContext {
	var p = new(ShowCollectionsStatementContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_showCollectionsStatement
	return p
}

func (*ShowCollectionsStatementContext) IsShowCollectionsStatementContext() {}

func NewShowCollectionsStatementContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ShowCollectionsStatementContext {
	var p = new(ShowCollectionsStatementContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_showCollectionsStatement

	return p
}

func (s *ShowCollectionsStatementContext) GetParser() antlr.Parser { return s.parser }

func (s *ShowCollectionsStatementContext) SHOW() antlr.TerminalNode {
	return s.GetToken(MQLParserSHOW, 0)
}

func (s *ShowCollectionsStatementContext) COLLECTIONS() antlr.TerminalNode {
	return s.GetToken(MQLParserCOLLECTIONS, 0)
}

func (s *ShowCollectionsStatementContext) FULL() antlr.TerminalNode {
	return s.GetToken(MQLParserFULL, 0)
}

func (s *ShowCollectionsStatementContext) IN() antlr.TerminalNode {
	return s.GetToken(MQLParserIN, 0)
}

func (s *ShowCollectionsStatementContext) DatabaseName() IDatabaseNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDatabaseNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDatabaseNameContext)
}

func (s *ShowCollectionsStatementContext) MATCH() antlr.TerminalNode {
	return s.GetToken(MQLParserMATCH, 0)
}

func (s *ShowCollectionsStatementContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ShowCollectionsStatementContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ShowCollectionsStatementContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ShowCollectionsStatementContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitShowCollectionsStatement(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) ShowCollectionsStatement() (localctx IShowCollectionsStatementContext) {
	localctx = NewShowCollectionsStatementContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 10, MQLParserRULE_showCollectionsStatement)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(92)
		p.Match(MQLParserSHOW)
	}
	p.SetState(94)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserFULL {
		{
			p.SetState(93)
			p.Match(MQLParserFULL)
		}

	}
	{
		p.SetState(96)
		p.Match(MQLParserCOLLECTIONS)
	}
	p.SetState(99)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserIN {
		{
			p.SetState(97)
			p.Match(MQLParserIN)
		}
		{
			p.SetState(98)
			p.DatabaseName()
		}

	}
	p.SetState(103)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserMATCH {
		{
			p.SetState(101)
			p.Match(MQLParserMATCH)
		}
		{
			p.SetState(102)
			p.expression(0)
		}

	}

	return localctx
}

// IShowDatabasesStatementContext is an interface to support dynamic dispatch.
type IShowDatabasesStatementContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsShowDatabasesStatementContext differentiates from other interfaces.
	IsShowDatabasesStatementContext()
}

type ShowDatabasesStatementContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyShowDatabasesStatementContext() *ShowDatabasesStatementContext {
	var p = new(ShowDatabasesStatementContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_showDatabasesStatement
	return p
}

func (*ShowDatabasesStatementContext) IsShowDatabasesStatementContext() {}

func NewShowDatabasesStatementContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ShowDatabasesStatementContext {
	var p = new(ShowDatabasesStatementContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_showDatabasesStatement

	return p
}

func (s *ShowDatabasesStatementContext) GetParser() antlr.Parser { return s.parser }

func (s *ShowDatabasesStatementContext) SHOW() antlr.TerminalNode {
	return s.GetToken(MQLParserSHOW, 0)
}

func (s *ShowDatabasesStatementContext) DATABASES() antlr.TerminalNode {
	return s.GetToken(MQLParserDATABASES, 0)
}

func (s *ShowDatabasesStatementContext) FULL() antlr.TerminalNode {
	return s.GetToken(MQLParserFULL, 0)
}

func (s *ShowDatabasesStatementContext) MATCH() antlr.TerminalNode {
	return s.GetToken(MQLParserMATCH, 0)
}

func (s *ShowDatabasesStatementContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ShowDatabasesStatementContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ShowDatabasesStatementContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ShowDatabasesStatementContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitShowDatabasesStatement(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) ShowDatabasesStatement() (localctx IShowDatabasesStatementContext) {
	localctx = NewShowDatabasesStatementContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, MQLParserRULE_showDatabasesStatement)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(105)
		p.Match(MQLParserSHOW)
	}
	p.SetState(107)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserFULL {
		{
			p.SetState(106)
			p.Match(MQLParserFULL)
		}

	}
	{
		p.SetState(109)
		p.Match(MQLParserDATABASES)
	}
	p.SetState(112)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserMATCH {
		{
			p.SetState(110)
			p.Match(MQLParserMATCH)
		}
		{
			p.SetState(111)
			p.expression(0)
		}

	}

	return localctx
}

// IUseDatabaseStatementContext is an interface to support dynamic dispatch.
type IUseDatabaseStatementContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsUseDatabaseStatementContext differentiates from other interfaces.
	IsUseDatabaseStatementContext()
}

type UseDatabaseStatementContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyUseDatabaseStatementContext() *UseDatabaseStatementContext {
	var p = new(UseDatabaseStatementContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_useDatabaseStatement
	return p
}

func (*UseDatabaseStatementContext) IsUseDatabaseStatementContext() {}

func NewUseDatabaseStatementContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *UseDatabaseStatementContext {
	var p = new(UseDatabaseStatementContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_useDatabaseStatement

	return p
}

func (s *UseDatabaseStatementContext) GetParser() antlr.Parser { return s.parser }

func (s *UseDatabaseStatementContext) USE() antlr.TerminalNode {
	return s.GetToken(MQLParserUSE, 0)
}

func (s *UseDatabaseStatementContext) DatabaseName() IDatabaseNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDatabaseNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDatabaseNameContext)
}

func (s *UseDatabaseStatementContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *UseDatabaseStatementContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *UseDatabaseStatementContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitUseDatabaseStatement(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) UseDatabaseStatement() (localctx IUseDatabaseStatementContext) {
	localctx = NewUseDatabaseStatementContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 14, MQLParserRULE_useDatabaseStatement)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(114)
		p.Match(MQLParserUSE)
	}
	{
		p.SetState(115)
		p.DatabaseName()
	}

	return localctx
}

// IQueryStageContext is an interface to support dynamic dispatch.
type IQueryStageContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsQueryStageContext differentiates from other interfaces.
	IsQueryStageContext()
}

type QueryStageContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyQueryStageContext() *QueryStageContext {
	var p = new(QueryStageContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_queryStage
	return p
}

func (*QueryStageContext) IsQueryStageContext() {}

func NewQueryStageContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *QueryStageContext {
	var p = new(QueryStageContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_queryStage

	return p
}

func (s *QueryStageContext) GetParser() antlr.Parser { return s.parser }

func (s *QueryStageContext) CopyFrom(ctx *QueryStageContext) {
	s.BaseParserRuleContext.CopyFrom(ctx.BaseParserRuleContext)
}

func (s *QueryStageContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *QueryStageContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type SortStageContext struct {
	*QueryStageContext
}

func NewSortStageContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *SortStageContext {
	var p = new(SortStageContext)

	p.QueryStageContext = NewEmptyQueryStageContext()
	p.parser = parser
	p.CopyFrom(ctx.(*QueryStageContext))

	return p
}

func (s *SortStageContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SortStageContext) SORT() antlr.TerminalNode {
	return s.GetToken(MQLParserSORT, 0)
}

func (s *SortStageContext) AllSortField() []ISortFieldContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*ISortFieldContext)(nil)).Elem())
	var tst = make([]ISortFieldContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(ISortFieldContext)
		}
	}

	return tst
}

func (s *SortStageContext) SortField(i int) ISortFieldContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ISortFieldContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(ISortFieldContext)
}

func (s *SortStageContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *SortStageContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *SortStageContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitSortStage(s)

	default:
		return t.VisitChildren(s)
	}
}

type ProjectStageContext struct {
	*QueryStageContext
}

func NewProjectStageContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *ProjectStageContext {
	var p = new(ProjectStageContext)

	p.QueryStageContext = NewEmptyQueryStageContext()
	p.parser = parser
	p.CopyFrom(ctx.(*QueryStageContext))

	return p
}

func (s *ProjectStageContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ProjectStageContext) PROJECT() antlr.TerminalNode {
	return s.GetToken(MQLParserPROJECT, 0)
}

func (s *ProjectStageContext) LBRACE() antlr.TerminalNode {
	return s.GetToken(MQLParserLBRACE, 0)
}

func (s *ProjectStageContext) AllProjectItem() []IProjectItemContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IProjectItemContext)(nil)).Elem())
	var tst = make([]IProjectItemContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IProjectItemContext)
		}
	}

	return tst
}

func (s *ProjectStageContext) ProjectItem(i int) IProjectItemContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IProjectItemContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IProjectItemContext)
}

func (s *ProjectStageContext) RBRACE() antlr.TerminalNode {
	return s.GetToken(MQLParserRBRACE, 0)
}

func (s *ProjectStageContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *ProjectStageContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *ProjectStageContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitProjectStage(s)

	default:
		return t.VisitChildren(s)
	}
}

type UnwindStageContext struct {
	*QueryStageContext
}

func NewUnwindStageContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *UnwindStageContext {
	var p = new(UnwindStageContext)

	p.QueryStageContext = NewEmptyQueryStageContext()
	p.parser = parser
	p.CopyFrom(ctx.(*QueryStageContext))

	return p
}

func (s *UnwindStageContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *UnwindStageContext) UNWIND() antlr.TerminalNode {
	return s.GetToken(MQLParserUNWIND, 0)
}

func (s *UnwindStageContext) MultipartFieldName() IMultipartFieldNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMultipartFieldNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMultipartFieldNameContext)
}

func (s *UnwindStageContext) WITH() antlr.TerminalNode {
	return s.GetToken(MQLParserWITH, 0)
}

func (s *UnwindStageContext) LPAREN() antlr.TerminalNode {
	return s.GetToken(MQLParserLPAREN, 0)
}

func (s *UnwindStageContext) RPAREN() antlr.TerminalNode {
	return s.GetToken(MQLParserRPAREN, 0)
}

func (s *UnwindStageContext) AllUnwindOption() []IUnwindOptionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IUnwindOptionContext)(nil)).Elem())
	var tst = make([]IUnwindOptionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IUnwindOptionContext)
		}
	}

	return tst
}

func (s *UnwindStageContext) UnwindOption(i int) IUnwindOptionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IUnwindOptionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IUnwindOptionContext)
}

func (s *UnwindStageContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitUnwindStage(s)

	default:
		return t.VisitChildren(s)
	}
}

type LimitStageContext struct {
	*QueryStageContext
}

func NewLimitStageContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LimitStageContext {
	var p = new(LimitStageContext)

	p.QueryStageContext = NewEmptyQueryStageContext()
	p.parser = parser
	p.CopyFrom(ctx.(*QueryStageContext))

	return p
}

func (s *LimitStageContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LimitStageContext) LIMIT() antlr.TerminalNode {
	return s.GetToken(MQLParserLIMIT, 0)
}

func (s *LimitStageContext) INT() antlr.TerminalNode {
	return s.GetToken(MQLParserINT, 0)
}

func (s *LimitStageContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitLimitStage(s)

	default:
		return t.VisitChildren(s)
	}
}

type GroupStageContext struct {
	*QueryStageContext
}

func NewGroupStageContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *GroupStageContext {
	var p = new(GroupStageContext)

	p.QueryStageContext = NewEmptyQueryStageContext()
	p.parser = parser
	p.CopyFrom(ctx.(*QueryStageContext))

	return p
}

func (s *GroupStageContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *GroupStageContext) GROUP() antlr.TerminalNode {
	return s.GetToken(MQLParserGROUP, 0)
}

func (s *GroupStageContext) LBRACE() antlr.TerminalNode {
	return s.GetToken(MQLParserLBRACE, 0)
}

func (s *GroupStageContext) AllFieldAssignment() []IFieldAssignmentContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IFieldAssignmentContext)(nil)).Elem())
	var tst = make([]IFieldAssignmentContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IFieldAssignmentContext)
		}
	}

	return tst
}

func (s *GroupStageContext) FieldAssignment(i int) IFieldAssignmentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFieldAssignmentContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IFieldAssignmentContext)
}

func (s *GroupStageContext) RBRACE() antlr.TerminalNode {
	return s.GetToken(MQLParserRBRACE, 0)
}

func (s *GroupStageContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *GroupStageContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *GroupStageContext) BY() antlr.TerminalNode {
	return s.GetToken(MQLParserBY, 0)
}

func (s *GroupStageContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *GroupStageContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitGroupStage(s)

	default:
		return t.VisitChildren(s)
	}
}

type LookupStageContext struct {
	*QueryStageContext
}

func NewLookupStageContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LookupStageContext {
	var p = new(LookupStageContext)

	p.QueryStageContext = NewEmptyQueryStageContext()
	p.parser = parser
	p.CopyFrom(ctx.(*QueryStageContext))

	return p
}

func (s *LookupStageContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LookupStageContext) LOOKUP() antlr.TerminalNode {
	return s.GetToken(MQLParserLOOKUP, 0)
}

func (s *LookupStageContext) AllLBRACE() []antlr.TerminalNode {
	return s.GetTokens(MQLParserLBRACE)
}

func (s *LookupStageContext) LBRACE(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserLBRACE, i)
}

func (s *LookupStageContext) MultipartFieldDeclaration() IMultipartFieldDeclarationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMultipartFieldDeclarationContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMultipartFieldDeclarationContext)
}

func (s *LookupStageContext) COLON() antlr.TerminalNode {
	return s.GetToken(MQLParserCOLON, 0)
}

func (s *LookupStageContext) QueryStatement() IQueryStatementContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IQueryStatementContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IQueryStatementContext)
}

func (s *LookupStageContext) AllRBRACE() []antlr.TerminalNode {
	return s.GetTokens(MQLParserRBRACE)
}

func (s *LookupStageContext) RBRACE(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserRBRACE, i)
}

func (s *LookupStageContext) AllVariableAssignment() []IVariableAssignmentContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IVariableAssignmentContext)(nil)).Elem())
	var tst = make([]IVariableAssignmentContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IVariableAssignmentContext)
		}
	}

	return tst
}

func (s *LookupStageContext) VariableAssignment(i int) IVariableAssignmentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IVariableAssignmentContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IVariableAssignmentContext)
}

func (s *LookupStageContext) ARROW() antlr.TerminalNode {
	return s.GetToken(MQLParserARROW, 0)
}

func (s *LookupStageContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *LookupStageContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *LookupStageContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitLookupStage(s)

	default:
		return t.VisitChildren(s)
	}
}

type MatchStageContext struct {
	*QueryStageContext
}

func NewMatchStageContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *MatchStageContext {
	var p = new(MatchStageContext)

	p.QueryStageContext = NewEmptyQueryStageContext()
	p.parser = parser
	p.CopyFrom(ctx.(*QueryStageContext))

	return p
}

func (s *MatchStageContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MatchStageContext) MATCH() antlr.TerminalNode {
	return s.GetToken(MQLParserMATCH, 0)
}

func (s *MatchStageContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *MatchStageContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitMatchStage(s)

	default:
		return t.VisitChildren(s)
	}
}

type SkipStageContext struct {
	*QueryStageContext
}

func NewSkipStageContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *SkipStageContext {
	var p = new(SkipStageContext)

	p.QueryStageContext = NewEmptyQueryStageContext()
	p.parser = parser
	p.CopyFrom(ctx.(*QueryStageContext))

	return p
}

func (s *SkipStageContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SkipStageContext) SKIP_() antlr.TerminalNode {
	return s.GetToken(MQLParserSKIP_, 0)
}

func (s *SkipStageContext) INT() antlr.TerminalNode {
	return s.GetToken(MQLParserINT, 0)
}

func (s *SkipStageContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitSkipStage(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) QueryStage() (localctx IQueryStageContext) {
	localctx = NewQueryStageContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, MQLParserRULE_queryStage)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(193)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserGROUP:
		localctx = NewGroupStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(117)
			p.Match(MQLParserGROUP)
		}
		{
			p.SetState(118)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(119)
			p.FieldAssignment()
		}
		p.SetState(124)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(120)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(121)
				p.FieldAssignment()
			}

			p.SetState(126)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(127)
			p.Match(MQLParserRBRACE)
		}
		p.SetState(130)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		if _la == MQLParserBY {
			{
				p.SetState(128)
				p.Match(MQLParserBY)
			}
			{
				p.SetState(129)
				p.expression(0)
			}

		}

	case MQLParserLIMIT:
		localctx = NewLimitStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(132)
			p.Match(MQLParserLIMIT)
		}
		{
			p.SetState(133)
			p.Match(MQLParserINT)
		}

	case MQLParserLOOKUP:
		localctx = NewLookupStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(134)
			p.Match(MQLParserLOOKUP)
		}
		{
			p.SetState(135)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(136)
			p.MultipartFieldDeclaration()
		}
		{
			p.SetState(137)
			p.Match(MQLParserCOLON)
		}
		p.SetState(150)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		if _la == MQLParserLBRACE {
			{
				p.SetState(138)
				p.Match(MQLParserLBRACE)
			}
			{
				p.SetState(139)
				p.VariableAssignment()
			}
			p.SetState(144)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)

			for _la == MQLParserCOMMA {
				{
					p.SetState(140)
					p.Match(MQLParserCOMMA)
				}
				{
					p.SetState(141)
					p.VariableAssignment()
				}

				p.SetState(146)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)
			}
			{
				p.SetState(147)
				p.Match(MQLParserRBRACE)
			}
			{
				p.SetState(148)
				p.Match(MQLParserARROW)
			}

		}
		{
			p.SetState(152)
			p.QueryStatement()
		}
		{
			p.SetState(153)
			p.Match(MQLParserRBRACE)
		}

	case MQLParserMATCH:
		localctx = NewMatchStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(155)
			p.Match(MQLParserMATCH)
		}
		{
			p.SetState(156)
			p.expression(0)
		}

	case MQLParserPROJECT:
		localctx = NewProjectStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(157)
			p.Match(MQLParserPROJECT)
		}
		{
			p.SetState(158)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(159)
			p.ProjectItem()
		}
		p.SetState(164)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(160)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(161)
				p.ProjectItem()
			}

			p.SetState(166)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(167)
			p.Match(MQLParserRBRACE)
		}

	case MQLParserSKIP_:
		localctx = NewSkipStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(169)
			p.Match(MQLParserSKIP_)
		}
		{
			p.SetState(170)
			p.Match(MQLParserINT)
		}

	case MQLParserSORT:
		localctx = NewSortStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(171)
			p.Match(MQLParserSORT)
		}
		{
			p.SetState(172)
			p.SortField()
		}
		p.SetState(177)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(173)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(174)
				p.SortField()
			}

			p.SetState(179)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	case MQLParserUNWIND:
		localctx = NewUnwindStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(180)
			p.Match(MQLParserUNWIND)
		}
		{
			p.SetState(181)
			p.MultipartFieldName()
		}
		p.SetState(191)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		if _la == MQLParserWITH {
			{
				p.SetState(182)
				p.Match(MQLParserWITH)
			}
			{
				p.SetState(183)
				p.Match(MQLParserLPAREN)
			}
			p.SetState(185)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)

			for ok := true; ok; ok = _la == MQLParserINDEX || _la == MQLParserPRESERVE_NULL_AND_EMPTY {
				{
					p.SetState(184)
					p.UnwindOption()
				}

				p.SetState(187)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)
			}
			{
				p.SetState(189)
				p.Match(MQLParserRPAREN)
			}

		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IProjectItemContext is an interface to support dynamic dispatch.
type IProjectItemContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsProjectItemContext differentiates from other interfaces.
	IsProjectItemContext()
}

type ProjectItemContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyProjectItemContext() *ProjectItemContext {
	var p = new(ProjectItemContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_projectItem
	return p
}

func (*ProjectItemContext) IsProjectItemContext() {}

func NewProjectItemContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ProjectItemContext {
	var p = new(ProjectItemContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_projectItem

	return p
}

func (s *ProjectItemContext) GetParser() antlr.Parser { return s.parser }

func (s *ProjectItemContext) CopyFrom(ctx *ProjectItemContext) {
	s.BaseParserRuleContext.CopyFrom(ctx.BaseParserRuleContext)
}

func (s *ProjectItemContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ProjectItemContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type AssignProjectItemContext struct {
	*ProjectItemContext
}

func NewAssignProjectItemContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *AssignProjectItemContext {
	var p = new(AssignProjectItemContext)

	p.ProjectItemContext = NewEmptyProjectItemContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ProjectItemContext))

	return p
}

func (s *AssignProjectItemContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AssignProjectItemContext) FieldDeclaration() IFieldDeclarationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFieldDeclarationContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFieldDeclarationContext)
}

func (s *AssignProjectItemContext) COLON() antlr.TerminalNode {
	return s.GetToken(MQLParserCOLON, 0)
}

func (s *AssignProjectItemContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *AssignProjectItemContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitAssignProjectItem(s)

	default:
		return t.VisitChildren(s)
	}
}

type IncludeProjectItemContext struct {
	*ProjectItemContext
}

func NewIncludeProjectItemContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *IncludeProjectItemContext {
	var p = new(IncludeProjectItemContext)

	p.ProjectItemContext = NewEmptyProjectItemContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ProjectItemContext))

	return p
}

func (s *IncludeProjectItemContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *IncludeProjectItemContext) MultipartFieldDeclaration() IMultipartFieldDeclarationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMultipartFieldDeclarationContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMultipartFieldDeclarationContext)
}

func (s *IncludeProjectItemContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitIncludeProjectItem(s)

	default:
		return t.VisitChildren(s)
	}
}

type ExcludeProjectItemContext struct {
	*ProjectItemContext
}

func NewExcludeProjectItemContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *ExcludeProjectItemContext {
	var p = new(ExcludeProjectItemContext)

	p.ProjectItemContext = NewEmptyProjectItemContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ProjectItemContext))

	return p
}

func (s *ExcludeProjectItemContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExcludeProjectItemContext) EXCLUDE() antlr.TerminalNode {
	return s.GetToken(MQLParserEXCLUDE, 0)
}

func (s *ExcludeProjectItemContext) MultipartFieldDeclaration() IMultipartFieldDeclarationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMultipartFieldDeclarationContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMultipartFieldDeclarationContext)
}

func (s *ExcludeProjectItemContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitExcludeProjectItem(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) ProjectItem() (localctx IProjectItemContext) {
	localctx = NewProjectItemContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, MQLParserRULE_projectItem)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(202)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 16, p.GetParserRuleContext()) {
	case 1:
		localctx = NewExcludeProjectItemContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(195)
			p.Match(MQLParserEXCLUDE)
		}
		{
			p.SetState(196)
			p.MultipartFieldDeclaration()
		}

	case 2:
		localctx = NewIncludeProjectItemContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(197)
			p.MultipartFieldDeclaration()
		}

	case 3:
		localctx = NewAssignProjectItemContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(198)
			p.FieldDeclaration()
		}
		{
			p.SetState(199)
			p.Match(MQLParserCOLON)
		}
		{
			p.SetState(200)
			p.expression(0)
		}

	}

	return localctx
}

// ISortFieldContext is an interface to support dynamic dispatch.
type ISortFieldContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsSortFieldContext differentiates from other interfaces.
	IsSortFieldContext()
}

type SortFieldContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySortFieldContext() *SortFieldContext {
	var p = new(SortFieldContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_sortField
	return p
}

func (*SortFieldContext) IsSortFieldContext() {}

func NewSortFieldContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SortFieldContext {
	var p = new(SortFieldContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_sortField

	return p
}

func (s *SortFieldContext) GetParser() antlr.Parser { return s.parser }

func (s *SortFieldContext) MultipartFieldName() IMultipartFieldNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMultipartFieldNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMultipartFieldNameContext)
}

func (s *SortFieldContext) ASC() antlr.TerminalNode {
	return s.GetToken(MQLParserASC, 0)
}

func (s *SortFieldContext) DESC() antlr.TerminalNode {
	return s.GetToken(MQLParserDESC, 0)
}

func (s *SortFieldContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SortFieldContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SortFieldContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitSortField(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) SortField() (localctx ISortFieldContext) {
	localctx = NewSortFieldContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 20, MQLParserRULE_sortField)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(204)
		p.MultipartFieldName()
	}
	p.SetState(206)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserASC || _la == MQLParserDESC {
		{
			p.SetState(205)
			_la = p.GetTokenStream().LA(1)

			if !(_la == MQLParserASC || _la == MQLParserDESC) {
				p.GetErrorHandler().RecoverInline(p)
			} else {
				p.GetErrorHandler().ReportMatch(p)
				p.Consume()
			}
		}

	}

	return localctx
}

// IUnwindOptionContext is an interface to support dynamic dispatch.
type IUnwindOptionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsUnwindOptionContext differentiates from other interfaces.
	IsUnwindOptionContext()
}

type UnwindOptionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyUnwindOptionContext() *UnwindOptionContext {
	var p = new(UnwindOptionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_unwindOption
	return p
}

func (*UnwindOptionContext) IsUnwindOptionContext() {}

func NewUnwindOptionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *UnwindOptionContext {
	var p = new(UnwindOptionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_unwindOption

	return p
}

func (s *UnwindOptionContext) GetParser() antlr.Parser { return s.parser }

func (s *UnwindOptionContext) INDEX() antlr.TerminalNode {
	return s.GetToken(MQLParserINDEX, 0)
}

func (s *UnwindOptionContext) MultipartFieldDeclaration() IMultipartFieldDeclarationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMultipartFieldDeclarationContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMultipartFieldDeclarationContext)
}

func (s *UnwindOptionContext) PRESERVE_NULL_AND_EMPTY() antlr.TerminalNode {
	return s.GetToken(MQLParserPRESERVE_NULL_AND_EMPTY, 0)
}

func (s *UnwindOptionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *UnwindOptionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *UnwindOptionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitUnwindOption(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) UnwindOption() (localctx IUnwindOptionContext) {
	localctx = NewUnwindOptionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 22, MQLParserRULE_unwindOption)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(211)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserINDEX:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(208)
			p.Match(MQLParserINDEX)
		}
		{
			p.SetState(209)
			p.MultipartFieldDeclaration()
		}

	case MQLParserPRESERVE_NULL_AND_EMPTY:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(210)
			p.Match(MQLParserPRESERVE_NULL_AND_EMPTY)
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IExpressionContext is an interface to support dynamic dispatch.
type IExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsExpressionContext differentiates from other interfaces.
	IsExpressionContext()
}

type ExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyExpressionContext() *ExpressionContext {
	var p = new(ExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_expression
	return p
}

func (*ExpressionContext) IsExpressionContext() {}

func NewExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpressionContext {
	var p = new(ExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_expression

	return p
}

func (s *ExpressionContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpressionContext) CopyFrom(ctx *ExpressionContext) {
	s.BaseParserRuleContext.CopyFrom(ctx.BaseParserRuleContext)
}

func (s *ExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type ValueExpressionContext struct {
	*ExpressionContext
}

func NewValueExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *ValueExpressionContext {
	var p = new(ValueExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *ValueExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ValueExpressionContext) Value() IValueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IValueContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IValueContext)
}

func (s *ValueExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitValueExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type AdditionExpressionContext struct {
	*ExpressionContext
	op antlr.Token
}

func NewAdditionExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *AdditionExpressionContext {
	var p = new(AdditionExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *AdditionExpressionContext) GetOp() antlr.Token { return s.op }

func (s *AdditionExpressionContext) SetOp(v antlr.Token) { s.op = v }

func (s *AdditionExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AdditionExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *AdditionExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *AdditionExpressionContext) PLUS() antlr.TerminalNode {
	return s.GetToken(MQLParserPLUS, 0)
}

func (s *AdditionExpressionContext) MINUS() antlr.TerminalNode {
	return s.GetToken(MQLParserMINUS, 0)
}

func (s *AdditionExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitAdditionExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type NotExpressionContext struct {
	*ExpressionContext
}

func NewNotExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *NotExpressionContext {
	var p = new(NotExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *NotExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NotExpressionContext) NOT() antlr.TerminalNode {
	return s.GetToken(MQLParserNOT, 0)
}

func (s *NotExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *NotExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitNotExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type ComparisonExpressionContext struct {
	*ExpressionContext
	op antlr.Token
}

func NewComparisonExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *ComparisonExpressionContext {
	var p = new(ComparisonExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *ComparisonExpressionContext) GetOp() antlr.Token { return s.op }

func (s *ComparisonExpressionContext) SetOp(v antlr.Token) { s.op = v }

func (s *ComparisonExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ComparisonExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *ComparisonExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ComparisonExpressionContext) EQ() antlr.TerminalNode {
	return s.GetToken(MQLParserEQ, 0)
}

func (s *ComparisonExpressionContext) GT() antlr.TerminalNode {
	return s.GetToken(MQLParserGT, 0)
}

func (s *ComparisonExpressionContext) GTE() antlr.TerminalNode {
	return s.GetToken(MQLParserGTE, 0)
}

func (s *ComparisonExpressionContext) LT() antlr.TerminalNode {
	return s.GetToken(MQLParserLT, 0)
}

func (s *ComparisonExpressionContext) LTE() antlr.TerminalNode {
	return s.GetToken(MQLParserLTE, 0)
}

func (s *ComparisonExpressionContext) NEQ() antlr.TerminalNode {
	return s.GetToken(MQLParserNEQ, 0)
}

func (s *ComparisonExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitComparisonExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type VariableExpressionContext struct {
	*ExpressionContext
}

func NewVariableExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *VariableExpressionContext {
	var p = new(VariableExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *VariableExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VariableExpressionContext) VariableName() IVariableNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IVariableNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IVariableNameContext)
}

func (s *VariableExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitVariableExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type ConcatExpressionContext struct {
	*ExpressionContext
}

func NewConcatExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *ConcatExpressionContext {
	var p = new(ConcatExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *ConcatExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ConcatExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *ConcatExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ConcatExpressionContext) CONCAT() antlr.TerminalNode {
	return s.GetToken(MQLParserCONCAT, 0)
}

func (s *ConcatExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitConcatExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type NullCoalesceExpressionContext struct {
	*ExpressionContext
}

func NewNullCoalesceExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *NullCoalesceExpressionContext {
	var p = new(NullCoalesceExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *NullCoalesceExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NullCoalesceExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *NullCoalesceExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *NullCoalesceExpressionContext) DQUESTION() antlr.TerminalNode {
	return s.GetToken(MQLParserDQUESTION, 0)
}

func (s *NullCoalesceExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitNullCoalesceExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type FunctionExpressionContext struct {
	*ExpressionContext
}

func NewFunctionExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *FunctionExpressionContext {
	var p = new(FunctionExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *FunctionExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionExpressionContext) Function() IFunctionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFunctionContext)
}

func (s *FunctionExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFunctionExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type AndExpressionContext struct {
	*ExpressionContext
}

func NewAndExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *AndExpressionContext {
	var p = new(AndExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *AndExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AndExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *AndExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *AndExpressionContext) AND() antlr.TerminalNode {
	return s.GetToken(MQLParserAND, 0)
}

func (s *AndExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitAndExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type LetExpressionContext struct {
	*ExpressionContext
}

func NewLetExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LetExpressionContext {
	var p = new(LetExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *LetExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LetExpressionContext) LBRACE() antlr.TerminalNode {
	return s.GetToken(MQLParserLBRACE, 0)
}

func (s *LetExpressionContext) AllVariableAssignment() []IVariableAssignmentContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IVariableAssignmentContext)(nil)).Elem())
	var tst = make([]IVariableAssignmentContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IVariableAssignmentContext)
		}
	}

	return tst
}

func (s *LetExpressionContext) VariableAssignment(i int) IVariableAssignmentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IVariableAssignmentContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IVariableAssignmentContext)
}

func (s *LetExpressionContext) RBRACE() antlr.TerminalNode {
	return s.GetToken(MQLParserRBRACE, 0)
}

func (s *LetExpressionContext) ARROW() antlr.TerminalNode {
	return s.GetToken(MQLParserARROW, 0)
}

func (s *LetExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *LetExpressionContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *LetExpressionContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *LetExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitLetExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type FieldExpressionContext struct {
	*ExpressionContext
}

func NewFieldExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *FieldExpressionContext {
	var p = new(FieldExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *FieldExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FieldExpressionContext) FieldName() IFieldNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFieldNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFieldNameContext)
}

func (s *FieldExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFieldExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type LikeExpressionContext struct {
	*ExpressionContext
}

func NewLikeExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LikeExpressionContext {
	var p = new(LikeExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *LikeExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LikeExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *LikeExpressionContext) LIKE() antlr.TerminalNode {
	return s.GetToken(MQLParserLIKE, 0)
}

func (s *LikeExpressionContext) REGEX() antlr.TerminalNode {
	return s.GetToken(MQLParserREGEX, 0)
}

func (s *LikeExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitLikeExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type LambdaExpressionContext struct {
	*ExpressionContext
}

func NewLambdaExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LambdaExpressionContext {
	var p = new(LambdaExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *LambdaExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LambdaExpressionContext) AllLambdaArgument() []ILambdaArgumentContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*ILambdaArgumentContext)(nil)).Elem())
	var tst = make([]ILambdaArgumentContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(ILambdaArgumentContext)
		}
	}

	return tst
}

func (s *LambdaExpressionContext) LambdaArgument(i int) ILambdaArgumentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ILambdaArgumentContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(ILambdaArgumentContext)
}

func (s *LambdaExpressionContext) ARROW() antlr.TerminalNode {
	return s.GetToken(MQLParserARROW, 0)
}

func (s *LambdaExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *LambdaExpressionContext) LPAREN() antlr.TerminalNode {
	return s.GetToken(MQLParserLPAREN, 0)
}

func (s *LambdaExpressionContext) RPAREN() antlr.TerminalNode {
	return s.GetToken(MQLParserRPAREN, 0)
}

func (s *LambdaExpressionContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *LambdaExpressionContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *LambdaExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitLambdaExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type DocumentExpressionContext struct {
	*ExpressionContext
}

func NewDocumentExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *DocumentExpressionContext {
	var p = new(DocumentExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *DocumentExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DocumentExpressionContext) Document() IDocumentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDocumentContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDocumentContext)
}

func (s *DocumentExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitDocumentExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type ArrayExpressionContext struct {
	*ExpressionContext
}

func NewArrayExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *ArrayExpressionContext {
	var p = new(ArrayExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *ArrayExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ArrayExpressionContext) Array() IArrayContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IArrayContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IArrayContext)
}

func (s *ArrayExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitArrayExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type ConditionalExpressionContext struct {
	*ExpressionContext
}

func NewConditionalExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *ConditionalExpressionContext {
	var p = new(ConditionalExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *ConditionalExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ConditionalExpressionContext) IF() antlr.TerminalNode {
	return s.GetToken(MQLParserIF, 0)
}

func (s *ConditionalExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *ConditionalExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ConditionalExpressionContext) THEN() antlr.TerminalNode {
	return s.GetToken(MQLParserTHEN, 0)
}

func (s *ConditionalExpressionContext) ELSE() antlr.TerminalNode {
	return s.GetToken(MQLParserELSE, 0)
}

func (s *ConditionalExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitConditionalExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type SwitchExpressionContext struct {
	*ExpressionContext
}

func NewSwitchExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *SwitchExpressionContext {
	var p = new(SwitchExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *SwitchExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SwitchExpressionContext) SWITCH() antlr.TerminalNode {
	return s.GetToken(MQLParserSWITCH, 0)
}

func (s *SwitchExpressionContext) AllSwitchCase() []ISwitchCaseContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*ISwitchCaseContext)(nil)).Elem())
	var tst = make([]ISwitchCaseContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(ISwitchCaseContext)
		}
	}

	return tst
}

func (s *SwitchExpressionContext) SwitchCase(i int) ISwitchCaseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ISwitchCaseContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(ISwitchCaseContext)
}

func (s *SwitchExpressionContext) ELSE() antlr.TerminalNode {
	return s.GetToken(MQLParserELSE, 0)
}

func (s *SwitchExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *SwitchExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitSwitchExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type ParenthesisExpressionContext struct {
	*ExpressionContext
}

func NewParenthesisExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *ParenthesisExpressionContext {
	var p = new(ParenthesisExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *ParenthesisExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ParenthesisExpressionContext) LPAREN() antlr.TerminalNode {
	return s.GetToken(MQLParserLPAREN, 0)
}

func (s *ParenthesisExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ParenthesisExpressionContext) RPAREN() antlr.TerminalNode {
	return s.GetToken(MQLParserRPAREN, 0)
}

func (s *ParenthesisExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitParenthesisExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type MultiplicationExpressionContext struct {
	*ExpressionContext
	op antlr.Token
}

func NewMultiplicationExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *MultiplicationExpressionContext {
	var p = new(MultiplicationExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *MultiplicationExpressionContext) GetOp() antlr.Token { return s.op }

func (s *MultiplicationExpressionContext) SetOp(v antlr.Token) { s.op = v }

func (s *MultiplicationExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MultiplicationExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *MultiplicationExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *MultiplicationExpressionContext) MULT() antlr.TerminalNode {
	return s.GetToken(MQLParserMULT, 0)
}

func (s *MultiplicationExpressionContext) DIV() antlr.TerminalNode {
	return s.GetToken(MQLParserDIV, 0)
}

func (s *MultiplicationExpressionContext) MOD() antlr.TerminalNode {
	return s.GetToken(MQLParserMOD, 0)
}

func (s *MultiplicationExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitMultiplicationExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type MemberExpressionContext struct {
	*ExpressionContext
}

func NewMemberExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *MemberExpressionContext {
	var p = new(MemberExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *MemberExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MemberExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *MemberExpressionContext) DOT() antlr.TerminalNode {
	return s.GetToken(MQLParserDOT, 0)
}

func (s *MemberExpressionContext) FieldName() IFieldNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFieldNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFieldNameContext)
}

func (s *MemberExpressionContext) Function() IFunctionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFunctionContext)
}

func (s *MemberExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitMemberExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type OrExpressionContext struct {
	*ExpressionContext
}

func NewOrExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *OrExpressionContext {
	var p = new(OrExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *OrExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *OrExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *OrExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *OrExpressionContext) OR() antlr.TerminalNode {
	return s.GetToken(MQLParserOR, 0)
}

func (s *OrExpressionContext) NOR() antlr.TerminalNode {
	return s.GetToken(MQLParserNOR, 0)
}

func (s *OrExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitOrExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type UnaryMinusExpressionContext struct {
	*ExpressionContext
}

func NewUnaryMinusExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *UnaryMinusExpressionContext {
	var p = new(UnaryMinusExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *UnaryMinusExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *UnaryMinusExpressionContext) MINUS() antlr.TerminalNode {
	return s.GetToken(MQLParserMINUS, 0)
}

func (s *UnaryMinusExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *UnaryMinusExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitUnaryMinusExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type PowerExpressionContext struct {
	*ExpressionContext
}

func NewPowerExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *PowerExpressionContext {
	var p = new(PowerExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *PowerExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PowerExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *PowerExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *PowerExpressionContext) POWER() antlr.TerminalNode {
	return s.GetToken(MQLParserPOWER, 0)
}

func (s *PowerExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitPowerExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type ArrayAccessExpressionContext struct {
	*ExpressionContext
	index IExpressionContext
	step  IExpressionContext
	end   IExpressionContext
}

func NewArrayAccessExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *ArrayAccessExpressionContext {
	var p = new(ArrayAccessExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *ArrayAccessExpressionContext) GetIndex() IExpressionContext { return s.index }

func (s *ArrayAccessExpressionContext) GetStep() IExpressionContext { return s.step }

func (s *ArrayAccessExpressionContext) GetEnd() IExpressionContext { return s.end }

func (s *ArrayAccessExpressionContext) SetIndex(v IExpressionContext) { s.index = v }

func (s *ArrayAccessExpressionContext) SetStep(v IExpressionContext) { s.step = v }

func (s *ArrayAccessExpressionContext) SetEnd(v IExpressionContext) { s.end = v }

func (s *ArrayAccessExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ArrayAccessExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *ArrayAccessExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ArrayAccessExpressionContext) LBRACK() antlr.TerminalNode {
	return s.GetToken(MQLParserLBRACK, 0)
}

func (s *ArrayAccessExpressionContext) RBRACK() antlr.TerminalNode {
	return s.GetToken(MQLParserRBRACK, 0)
}

func (s *ArrayAccessExpressionContext) RANGE() antlr.TerminalNode {
	return s.GetToken(MQLParserRANGE, 0)
}

func (s *ArrayAccessExpressionContext) COLON() antlr.TerminalNode {
	return s.GetToken(MQLParserCOLON, 0)
}

func (s *ArrayAccessExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitArrayAccessExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type InExpressionContext struct {
	*ExpressionContext
}

func NewInExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *InExpressionContext {
	var p = new(InExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *InExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *InExpressionContext) IN() antlr.TerminalNode {
	return s.GetToken(MQLParserIN, 0)
}

func (s *InExpressionContext) Array() IArrayContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IArrayContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IArrayContext)
}

func (s *InExpressionContext) NOT() antlr.TerminalNode {
	return s.GetToken(MQLParserNOT, 0)
}

func (s *InExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitInExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

type RangeExpressionContext struct {
	*ExpressionContext
}

func NewRangeExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *RangeExpressionContext {
	var p = new(RangeExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *RangeExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *RangeExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *RangeExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *RangeExpressionContext) RANGE() antlr.TerminalNode {
	return s.GetToken(MQLParserRANGE, 0)
}

func (s *RangeExpressionContext) COLON() antlr.TerminalNode {
	return s.GetToken(MQLParserCOLON, 0)
}

func (s *RangeExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitRangeExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) Expression() (localctx IExpressionContext) {
	return p.expression(0)
}

func (p *MQLParser) expression(_p int) (localctx IExpressionContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewExpressionContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExpressionContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 24
	p.EnterRecursionRule(localctx, 24, MQLParserRULE_expression, _p)
	var _la int

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(277)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 24, p.GetParserRuleContext()) {
	case 1:
		localctx = NewUnaryMinusExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx

		{
			p.SetState(214)
			p.Match(MQLParserMINUS)
		}
		{
			p.SetState(215)
			p.expression(25)
		}

	case 2:
		localctx = NewNotExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(216)
			p.Match(MQLParserNOT)
		}
		{
			p.SetState(217)
			p.expression(24)
		}

	case 3:
		localctx = NewSwitchExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(218)
			p.Match(MQLParserSWITCH)
		}
		p.SetState(220)
		p.GetErrorHandler().Sync(p)
		_alt = 1
		for ok := true; ok; ok = _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
			switch _alt {
			case 1:
				{
					p.SetState(219)
					p.SwitchCase()
				}

			default:
				panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
			}

			p.SetState(222)
			p.GetErrorHandler().Sync(p)
			_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 19, p.GetParserRuleContext())
		}
		p.SetState(226)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 20, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(224)
				p.Match(MQLParserELSE)
			}
			{
				p.SetState(225)
				p.expression(0)
			}

		}

	case 4:
		localctx = NewConditionalExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(228)
			p.Match(MQLParserIF)
		}
		{
			p.SetState(229)
			p.expression(0)
		}
		{
			p.SetState(230)
			p.Match(MQLParserTHEN)
		}
		{
			p.SetState(231)
			p.expression(0)
		}
		{
			p.SetState(232)
			p.Match(MQLParserELSE)
		}
		{
			p.SetState(233)
			p.expression(10)
		}

	case 5:
		localctx = NewLetExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(235)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(236)
			p.VariableAssignment()
		}
		p.SetState(241)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(237)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(238)
				p.VariableAssignment()
			}

			p.SetState(243)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(244)
			p.Match(MQLParserRBRACE)
		}
		{
			p.SetState(245)
			p.Match(MQLParserARROW)
		}
		{
			p.SetState(246)
			p.expression(9)
		}

	case 6:
		localctx = NewParenthesisExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(248)
			p.Match(MQLParserLPAREN)
		}
		{
			p.SetState(249)
			p.expression(0)
		}
		{
			p.SetState(250)
			p.Match(MQLParserRPAREN)
		}

	case 7:
		localctx = NewLambdaExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		p.SetState(269)
		p.GetErrorHandler().Sync(p)

		switch p.GetTokenStream().LA(1) {
		case MQLParserUNDERSCORE, MQLParserVARIABLE_ID:
			{
				p.SetState(252)
				p.LambdaArgument()
			}
			{
				p.SetState(253)
				p.Match(MQLParserARROW)
			}
			{
				p.SetState(254)
				p.expression(0)
			}

		case MQLParserLPAREN:
			{
				p.SetState(256)
				p.Match(MQLParserLPAREN)
			}
			{
				p.SetState(257)
				p.LambdaArgument()
			}
			p.SetState(262)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)

			for _la == MQLParserCOMMA {
				{
					p.SetState(258)
					p.Match(MQLParserCOMMA)
				}
				{
					p.SetState(259)
					p.LambdaArgument()
				}

				p.SetState(264)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)
			}
			{
				p.SetState(265)
				p.Match(MQLParserRPAREN)
			}
			{
				p.SetState(266)
				p.Match(MQLParserARROW)
			}
			{
				p.SetState(267)
				p.expression(0)
			}

		default:
			panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		}

	case 8:
		localctx = NewFunctionExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(271)
			p.Function()
		}

	case 9:
		localctx = NewFieldExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(272)
			p.FieldName()
		}

	case 10:
		localctx = NewVariableExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(273)
			p.VariableName()
		}

	case 11:
		localctx = NewDocumentExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(274)
			p.Document()
		}

	case 12:
		localctx = NewArrayExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(275)
			p.Array()
		}

	case 13:
		localctx = NewValueExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(276)
			p.Value()
		}

	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(349)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 32, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(347)
			p.GetErrorHandler().Sync(p)
			switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 31, p.GetParserRuleContext()) {
			case 1:
				localctx = NewPowerExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(279)

				if !(p.Precpred(p.GetParserRuleContext(), 26)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 26)", ""))
				}
				{
					p.SetState(280)
					p.Match(MQLParserPOWER)
				}
				{
					p.SetState(281)
					p.expression(26)
				}

			case 2:
				localctx = NewMultiplicationExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(282)

				if !(p.Precpred(p.GetParserRuleContext(), 19)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 19)", ""))
				}
				{
					p.SetState(283)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*MultiplicationExpressionContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<MQLParserDIV)|(1<<MQLParserMOD)|(1<<MQLParserMULT))) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*MultiplicationExpressionContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(284)
					p.expression(20)
				}

			case 3:
				localctx = NewAdditionExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(285)

				if !(p.Precpred(p.GetParserRuleContext(), 18)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 18)", ""))
				}
				{
					p.SetState(286)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*AdditionExpressionContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == MQLParserMINUS || _la == MQLParserPLUS) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*AdditionExpressionContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(287)
					p.expression(19)
				}

			case 4:
				localctx = NewComparisonExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(288)

				if !(p.Precpred(p.GetParserRuleContext(), 17)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 17)", ""))
				}
				{
					p.SetState(289)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*ComparisonExpressionContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<MQLParserEQ)|(1<<MQLParserGT)|(1<<MQLParserGTE)|(1<<MQLParserLT)|(1<<MQLParserLTE)|(1<<MQLParserNEQ))) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*ComparisonExpressionContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(290)
					p.expression(18)
				}

			case 5:
				localctx = NewAndExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(291)

				if !(p.Precpred(p.GetParserRuleContext(), 16)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 16)", ""))
				}
				{
					p.SetState(292)
					p.Match(MQLParserAND)
				}
				{
					p.SetState(293)
					p.expression(17)
				}

			case 6:
				localctx = NewOrExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(294)

				if !(p.Precpred(p.GetParserRuleContext(), 15)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 15)", ""))
				}
				{
					p.SetState(295)
					_la = p.GetTokenStream().LA(1)

					if !(_la == MQLParserNOR || _la == MQLParserOR) {
						p.GetErrorHandler().RecoverInline(p)
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(296)
					p.expression(16)
				}

			case 7:
				localctx = NewConcatExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(297)

				if !(p.Precpred(p.GetParserRuleContext(), 14)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 14)", ""))
				}
				{
					p.SetState(298)
					p.Match(MQLParserCONCAT)
				}
				{
					p.SetState(299)
					p.expression(15)
				}

			case 8:
				localctx = NewNullCoalesceExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(300)

				if !(p.Precpred(p.GetParserRuleContext(), 13)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 13)", ""))
				}
				{
					p.SetState(301)
					p.Match(MQLParserDQUESTION)
				}
				{
					p.SetState(302)
					p.expression(14)
				}

			case 9:
				localctx = NewMemberExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(303)

				if !(p.Precpred(p.GetParserRuleContext(), 23)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 23)", ""))
				}
				{
					p.SetState(304)
					p.Match(MQLParserDOT)
				}
				p.SetState(307)
				p.GetErrorHandler().Sync(p)
				switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 25, p.GetParserRuleContext()) {
				case 1:
					{
						p.SetState(305)
						p.FieldName()
					}

				case 2:
					{
						p.SetState(306)
						p.Function()
					}

				}

			case 10:
				localctx = NewArrayAccessExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(309)

				if !(p.Precpred(p.GetParserRuleContext(), 22)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 22)", ""))
				}
				{
					p.SetState(310)
					p.Match(MQLParserLBRACK)
				}
				p.SetState(327)
				p.GetErrorHandler().Sync(p)
				switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 28, p.GetParserRuleContext()) {
				case 1:
					{
						p.SetState(311)

						var _x = p.expression(0)

						localctx.(*ArrayAccessExpressionContext).index = _x
					}

				case 2:
					{
						p.SetState(312)

						var _x = p.expression(0)

						localctx.(*ArrayAccessExpressionContext).index = _x
					}
					{
						p.SetState(313)
						p.Match(MQLParserRANGE)
					}
					p.SetState(316)
					p.GetErrorHandler().Sync(p)
					_la = p.GetTokenStream().LA(1)

					if _la == MQLParserCOLON {
						{
							p.SetState(314)
							p.Match(MQLParserCOLON)
						}
						{
							p.SetState(315)

							var _x = p.expression(0)

							localctx.(*ArrayAccessExpressionContext).step = _x
						}

					}

				case 3:
					{
						p.SetState(318)
						p.Match(MQLParserRANGE)
					}

					{
						p.SetState(319)

						var _x = p.expression(0)

						localctx.(*ArrayAccessExpressionContext).end = _x
					}

					p.SetState(322)
					p.GetErrorHandler().Sync(p)
					_la = p.GetTokenStream().LA(1)

					if _la == MQLParserCOLON {
						{
							p.SetState(320)
							p.Match(MQLParserCOLON)
						}
						{
							p.SetState(321)

							var _x = p.expression(0)

							localctx.(*ArrayAccessExpressionContext).step = _x
						}

					}

				case 4:
					{
						p.SetState(324)
						p.Match(MQLParserRANGE)
					}
					{
						p.SetState(325)
						p.Match(MQLParserCOLON)
					}
					{
						p.SetState(326)

						var _x = p.expression(0)

						localctx.(*ArrayAccessExpressionContext).step = _x
					}

				}
				{
					p.SetState(329)
					p.Match(MQLParserRBRACK)
				}

			case 11:
				localctx = NewRangeExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(331)

				if !(p.Precpred(p.GetParserRuleContext(), 21)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 21)", ""))
				}
				{
					p.SetState(332)
					p.Match(MQLParserRANGE)
				}
				{
					p.SetState(333)
					p.expression(0)
				}
				p.SetState(336)
				p.GetErrorHandler().Sync(p)

				if p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 29, p.GetParserRuleContext()) == 1 {
					{
						p.SetState(334)
						p.Match(MQLParserCOLON)
					}
					{
						p.SetState(335)
						p.expression(0)
					}

				}

			case 12:
				localctx = NewLikeExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(338)

				if !(p.Precpred(p.GetParserRuleContext(), 20)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 20)", ""))
				}
				{
					p.SetState(339)
					p.Match(MQLParserLIKE)
				}
				{
					p.SetState(340)
					p.Match(MQLParserREGEX)
				}

			case 13:
				localctx = NewInExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(341)

				if !(p.Precpred(p.GetParserRuleContext(), 12)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 12)", ""))
				}
				p.SetState(343)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)

				if _la == MQLParserNOT {
					{
						p.SetState(342)
						p.Match(MQLParserNOT)
					}

				}
				{
					p.SetState(345)
					p.Match(MQLParserIN)
				}
				{
					p.SetState(346)
					p.Array()
				}

			}

		}
		p.SetState(351)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 32, p.GetParserRuleContext())
	}

	return localctx
}

// IArrayContext is an interface to support dynamic dispatch.
type IArrayContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsArrayContext differentiates from other interfaces.
	IsArrayContext()
}

type ArrayContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyArrayContext() *ArrayContext {
	var p = new(ArrayContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_array
	return p
}

func (*ArrayContext) IsArrayContext() {}

func NewArrayContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ArrayContext {
	var p = new(ArrayContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_array

	return p
}

func (s *ArrayContext) GetParser() antlr.Parser { return s.parser }

func (s *ArrayContext) LBRACK() antlr.TerminalNode {
	return s.GetToken(MQLParserLBRACK, 0)
}

func (s *ArrayContext) RBRACK() antlr.TerminalNode {
	return s.GetToken(MQLParserRBRACK, 0)
}

func (s *ArrayContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *ArrayContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ArrayContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *ArrayContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *ArrayContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ArrayContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ArrayContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitArray(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) Array() (localctx IArrayContext) {
	localctx = NewArrayContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 26, MQLParserRULE_array)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(352)
		p.Match(MQLParserLBRACK)
	}
	p.SetState(361)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if (((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<MQLParserLBRACE)|(1<<MQLParserLBRACK)|(1<<MQLParserLPAREN)|(1<<MQLParserMINUS)|(1<<MQLParserUNDERSCORE))) != 0) || (((_la-38)&-(0x1f+1)) == 0 && ((1<<uint((_la-38)))&((1<<(MQLParserFALSE-38))|(1<<(MQLParserIF-38))|(1<<(MQLParserNOT-38))|(1<<(MQLParserNULL-38))|(1<<(MQLParserSWITCH-38))|(1<<(MQLParserTRUE-38)))) != 0) || (((_la-72)&-(0x1f+1)) == 0 && ((1<<uint((_la-72)))&((1<<(MQLParserREGEX-72))|(1<<(MQLParserINT-72))|(1<<(MQLParserDOUBLE-72))|(1<<(MQLParserDECIMAL-72))|(1<<(MQLParserLONG-72))|(1<<(MQLParserBIN-72))|(1<<(MQLParserLONG_BIN-72))|(1<<(MQLParserHEX-72))|(1<<(MQLParserLONG_HEX-72))|(1<<(MQLParserOCT-72))|(1<<(MQLParserLONG_OCT-72))|(1<<(MQLParserOID-72))|(1<<(MQLParserID-72))|(1<<(MQLParserSTRING-72))|(1<<(MQLParserVARIABLE_ID-72))|(1<<(MQLParserDATE_TIME-72)))) != 0) {
		{
			p.SetState(353)
			p.expression(0)
		}
		p.SetState(358)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(354)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(355)
				p.expression(0)
			}

			p.SetState(360)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}
	{
		p.SetState(363)
		p.Match(MQLParserRBRACK)
	}

	return localctx
}

// IDocumentContext is an interface to support dynamic dispatch.
type IDocumentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsDocumentContext differentiates from other interfaces.
	IsDocumentContext()
}

type DocumentContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyDocumentContext() *DocumentContext {
	var p = new(DocumentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_document
	return p
}

func (*DocumentContext) IsDocumentContext() {}

func NewDocumentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DocumentContext {
	var p = new(DocumentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_document

	return p
}

func (s *DocumentContext) GetParser() antlr.Parser { return s.parser }

func (s *DocumentContext) LBRACE() antlr.TerminalNode {
	return s.GetToken(MQLParserLBRACE, 0)
}

func (s *DocumentContext) RBRACE() antlr.TerminalNode {
	return s.GetToken(MQLParserRBRACE, 0)
}

func (s *DocumentContext) AllFieldAssignment() []IFieldAssignmentContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IFieldAssignmentContext)(nil)).Elem())
	var tst = make([]IFieldAssignmentContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IFieldAssignmentContext)
		}
	}

	return tst
}

func (s *DocumentContext) FieldAssignment(i int) IFieldAssignmentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFieldAssignmentContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IFieldAssignmentContext)
}

func (s *DocumentContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *DocumentContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *DocumentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DocumentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DocumentContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitDocument(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) Document() (localctx IDocumentContext) {
	localctx = NewDocumentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 28, MQLParserRULE_document)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(365)
		p.Match(MQLParserLBRACE)
	}
	p.SetState(374)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserID {
		{
			p.SetState(366)
			p.FieldAssignment()
		}
		p.SetState(371)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(367)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(368)
				p.FieldAssignment()
			}

			p.SetState(373)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}
	{
		p.SetState(376)
		p.Match(MQLParserRBRACE)
	}

	return localctx
}

// IFieldAssignmentContext is an interface to support dynamic dispatch.
type IFieldAssignmentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFieldAssignmentContext differentiates from other interfaces.
	IsFieldAssignmentContext()
}

type FieldAssignmentContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFieldAssignmentContext() *FieldAssignmentContext {
	var p = new(FieldAssignmentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_fieldAssignment
	return p
}

func (*FieldAssignmentContext) IsFieldAssignmentContext() {}

func NewFieldAssignmentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FieldAssignmentContext {
	var p = new(FieldAssignmentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_fieldAssignment

	return p
}

func (s *FieldAssignmentContext) GetParser() antlr.Parser { return s.parser }

func (s *FieldAssignmentContext) FieldDeclaration() IFieldDeclarationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFieldDeclarationContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFieldDeclarationContext)
}

func (s *FieldAssignmentContext) COLON() antlr.TerminalNode {
	return s.GetToken(MQLParserCOLON, 0)
}

func (s *FieldAssignmentContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *FieldAssignmentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FieldAssignmentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FieldAssignmentContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFieldAssignment(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) FieldAssignment() (localctx IFieldAssignmentContext) {
	localctx = NewFieldAssignmentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 30, MQLParserRULE_fieldAssignment)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(378)
		p.FieldDeclaration()
	}
	{
		p.SetState(379)
		p.Match(MQLParserCOLON)
	}
	{
		p.SetState(380)
		p.expression(0)
	}

	return localctx
}

// IMultipart_documentContext is an interface to support dynamic dispatch.
type IMultipart_documentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsMultipart_documentContext differentiates from other interfaces.
	IsMultipart_documentContext()
}

type Multipart_documentContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyMultipart_documentContext() *Multipart_documentContext {
	var p = new(Multipart_documentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_multipart_document
	return p
}

func (*Multipart_documentContext) IsMultipart_documentContext() {}

func NewMultipart_documentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Multipart_documentContext {
	var p = new(Multipart_documentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_multipart_document

	return p
}

func (s *Multipart_documentContext) GetParser() antlr.Parser { return s.parser }

func (s *Multipart_documentContext) LBRACE() antlr.TerminalNode {
	return s.GetToken(MQLParserLBRACE, 0)
}

func (s *Multipart_documentContext) RBRACE() antlr.TerminalNode {
	return s.GetToken(MQLParserRBRACE, 0)
}

func (s *Multipart_documentContext) AllMultipartFieldAssignment() []IMultipartFieldAssignmentContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IMultipartFieldAssignmentContext)(nil)).Elem())
	var tst = make([]IMultipartFieldAssignmentContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IMultipartFieldAssignmentContext)
		}
	}

	return tst
}

func (s *Multipart_documentContext) MultipartFieldAssignment(i int) IMultipartFieldAssignmentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMultipartFieldAssignmentContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IMultipartFieldAssignmentContext)
}

func (s *Multipart_documentContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *Multipart_documentContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *Multipart_documentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Multipart_documentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Multipart_documentContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitMultipart_document(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) Multipart_document() (localctx IMultipart_documentContext) {
	localctx = NewMultipart_documentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 32, MQLParserRULE_multipart_document)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(382)
		p.Match(MQLParserLBRACE)
	}
	p.SetState(391)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserID {
		{
			p.SetState(383)
			p.MultipartFieldAssignment()
		}
		p.SetState(388)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(384)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(385)
				p.MultipartFieldAssignment()
			}

			p.SetState(390)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}
	{
		p.SetState(393)
		p.Match(MQLParserRBRACE)
	}

	return localctx
}

// IMultipartFieldAssignmentContext is an interface to support dynamic dispatch.
type IMultipartFieldAssignmentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsMultipartFieldAssignmentContext differentiates from other interfaces.
	IsMultipartFieldAssignmentContext()
}

type MultipartFieldAssignmentContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyMultipartFieldAssignmentContext() *MultipartFieldAssignmentContext {
	var p = new(MultipartFieldAssignmentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_multipartFieldAssignment
	return p
}

func (*MultipartFieldAssignmentContext) IsMultipartFieldAssignmentContext() {}

func NewMultipartFieldAssignmentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *MultipartFieldAssignmentContext {
	var p = new(MultipartFieldAssignmentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_multipartFieldAssignment

	return p
}

func (s *MultipartFieldAssignmentContext) GetParser() antlr.Parser { return s.parser }

func (s *MultipartFieldAssignmentContext) MultipartFieldDeclaration() IMultipartFieldDeclarationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMultipartFieldDeclarationContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMultipartFieldDeclarationContext)
}

func (s *MultipartFieldAssignmentContext) COLON() antlr.TerminalNode {
	return s.GetToken(MQLParserCOLON, 0)
}

func (s *MultipartFieldAssignmentContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *MultipartFieldAssignmentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MultipartFieldAssignmentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *MultipartFieldAssignmentContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitMultipartFieldAssignment(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) MultipartFieldAssignment() (localctx IMultipartFieldAssignmentContext) {
	localctx = NewMultipartFieldAssignmentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 34, MQLParserRULE_multipartFieldAssignment)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(395)
		p.MultipartFieldDeclaration()
	}
	{
		p.SetState(396)
		p.Match(MQLParserCOLON)
	}
	{
		p.SetState(397)
		p.expression(0)
	}

	return localctx
}

// IFunctionContext is an interface to support dynamic dispatch.
type IFunctionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFunctionContext differentiates from other interfaces.
	IsFunctionContext()
}

type FunctionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFunctionContext() *FunctionContext {
	var p = new(FunctionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_function
	return p
}

func (*FunctionContext) IsFunctionContext() {}

func NewFunctionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FunctionContext {
	var p = new(FunctionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_function

	return p
}

func (s *FunctionContext) GetParser() antlr.Parser { return s.parser }

func (s *FunctionContext) FunctionName() IFunctionNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFunctionNameContext)
}

func (s *FunctionContext) LPAREN() antlr.TerminalNode {
	return s.GetToken(MQLParserLPAREN, 0)
}

func (s *FunctionContext) RPAREN() antlr.TerminalNode {
	return s.GetToken(MQLParserRPAREN, 0)
}

func (s *FunctionContext) FunctionArguments() IFunctionArgumentsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionArgumentsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFunctionArgumentsContext)
}

func (s *FunctionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FunctionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFunction(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) Function() (localctx IFunctionContext) {
	localctx = NewFunctionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 36, MQLParserRULE_function)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(399)
		p.FunctionName()
	}
	{
		p.SetState(400)
		p.Match(MQLParserLPAREN)
	}
	p.SetState(402)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if (((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<MQLParserLBRACE)|(1<<MQLParserLBRACK)|(1<<MQLParserLPAREN)|(1<<MQLParserMINUS)|(1<<MQLParserUNDERSCORE))) != 0) || (((_la-38)&-(0x1f+1)) == 0 && ((1<<uint((_la-38)))&((1<<(MQLParserFALSE-38))|(1<<(MQLParserIF-38))|(1<<(MQLParserNOT-38))|(1<<(MQLParserNULL-38))|(1<<(MQLParserSWITCH-38))|(1<<(MQLParserTRUE-38)))) != 0) || (((_la-72)&-(0x1f+1)) == 0 && ((1<<uint((_la-72)))&((1<<(MQLParserREGEX-72))|(1<<(MQLParserINT-72))|(1<<(MQLParserDOUBLE-72))|(1<<(MQLParserDECIMAL-72))|(1<<(MQLParserLONG-72))|(1<<(MQLParserBIN-72))|(1<<(MQLParserLONG_BIN-72))|(1<<(MQLParserHEX-72))|(1<<(MQLParserLONG_HEX-72))|(1<<(MQLParserOCT-72))|(1<<(MQLParserLONG_OCT-72))|(1<<(MQLParserOID-72))|(1<<(MQLParserID-72))|(1<<(MQLParserSTRING-72))|(1<<(MQLParserVARIABLE_ID-72))|(1<<(MQLParserDATE_TIME-72)))) != 0) {
		{
			p.SetState(401)
			p.FunctionArguments()
		}

	}
	{
		p.SetState(404)
		p.Match(MQLParserRPAREN)
	}

	return localctx
}

// IFunctionArgumentsContext is an interface to support dynamic dispatch.
type IFunctionArgumentsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFunctionArgumentsContext differentiates from other interfaces.
	IsFunctionArgumentsContext()
}

type FunctionArgumentsContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFunctionArgumentsContext() *FunctionArgumentsContext {
	var p = new(FunctionArgumentsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_functionArguments
	return p
}

func (*FunctionArgumentsContext) IsFunctionArgumentsContext() {}

func NewFunctionArgumentsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FunctionArgumentsContext {
	var p = new(FunctionArgumentsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_functionArguments

	return p
}

func (s *FunctionArgumentsContext) GetParser() antlr.Parser { return s.parser }

func (s *FunctionArgumentsContext) CopyFrom(ctx *FunctionArgumentsContext) {
	s.BaseParserRuleContext.CopyFrom(ctx.BaseParserRuleContext)
}

func (s *FunctionArgumentsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionArgumentsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type FunctionArrayArgumentsContext struct {
	*FunctionArgumentsContext
}

func NewFunctionArrayArgumentsContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *FunctionArrayArgumentsContext {
	var p = new(FunctionArrayArgumentsContext)

	p.FunctionArgumentsContext = NewEmptyFunctionArgumentsContext()
	p.parser = parser
	p.CopyFrom(ctx.(*FunctionArgumentsContext))

	return p
}

func (s *FunctionArrayArgumentsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionArrayArgumentsContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *FunctionArrayArgumentsContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *FunctionArrayArgumentsContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *FunctionArrayArgumentsContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *FunctionArrayArgumentsContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFunctionArrayArguments(s)

	default:
		return t.VisitChildren(s)
	}
}

type FunctionDocumentArgumentsContext struct {
	*FunctionArgumentsContext
}

func NewFunctionDocumentArgumentsContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *FunctionDocumentArgumentsContext {
	var p = new(FunctionDocumentArgumentsContext)

	p.FunctionArgumentsContext = NewEmptyFunctionArgumentsContext()
	p.parser = parser
	p.CopyFrom(ctx.(*FunctionArgumentsContext))

	return p
}

func (s *FunctionDocumentArgumentsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionDocumentArgumentsContext) AllFunctionNamedArgument() []IFunctionNamedArgumentContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IFunctionNamedArgumentContext)(nil)).Elem())
	var tst = make([]IFunctionNamedArgumentContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IFunctionNamedArgumentContext)
		}
	}

	return tst
}

func (s *FunctionDocumentArgumentsContext) FunctionNamedArgument(i int) IFunctionNamedArgumentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionNamedArgumentContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IFunctionNamedArgumentContext)
}

func (s *FunctionDocumentArgumentsContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *FunctionDocumentArgumentsContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *FunctionDocumentArgumentsContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFunctionDocumentArguments(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) FunctionArguments() (localctx IFunctionArgumentsContext) {
	localctx = NewFunctionArgumentsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 38, MQLParserRULE_functionArguments)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(422)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 42, p.GetParserRuleContext()) {
	case 1:
		localctx = NewFunctionArrayArgumentsContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(406)
			p.expression(0)
		}
		p.SetState(411)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(407)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(408)
				p.expression(0)
			}

			p.SetState(413)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	case 2:
		localctx = NewFunctionDocumentArgumentsContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(414)
			p.FunctionNamedArgument()
		}
		p.SetState(419)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(415)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(416)
				p.FunctionNamedArgument()
			}

			p.SetState(421)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}

	return localctx
}

// IFunctionNamedArgumentContext is an interface to support dynamic dispatch.
type IFunctionNamedArgumentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFunctionNamedArgumentContext differentiates from other interfaces.
	IsFunctionNamedArgumentContext()
}

type FunctionNamedArgumentContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFunctionNamedArgumentContext() *FunctionNamedArgumentContext {
	var p = new(FunctionNamedArgumentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_functionNamedArgument
	return p
}

func (*FunctionNamedArgumentContext) IsFunctionNamedArgumentContext() {}

func NewFunctionNamedArgumentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FunctionNamedArgumentContext {
	var p = new(FunctionNamedArgumentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_functionNamedArgument

	return p
}

func (s *FunctionNamedArgumentContext) GetParser() antlr.Parser { return s.parser }

func (s *FunctionNamedArgumentContext) FunctionArgumentName() IFunctionArgumentNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionArgumentNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFunctionArgumentNameContext)
}

func (s *FunctionNamedArgumentContext) COLON() antlr.TerminalNode {
	return s.GetToken(MQLParserCOLON, 0)
}

func (s *FunctionNamedArgumentContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *FunctionNamedArgumentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionNamedArgumentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FunctionNamedArgumentContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFunctionNamedArgument(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) FunctionNamedArgument() (localctx IFunctionNamedArgumentContext) {
	localctx = NewFunctionNamedArgumentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 40, MQLParserRULE_functionNamedArgument)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(424)
		p.FunctionArgumentName()
	}
	{
		p.SetState(425)
		p.Match(MQLParserCOLON)
	}
	{
		p.SetState(426)
		p.expression(0)
	}

	return localctx
}

// ILambdaArgumentContext is an interface to support dynamic dispatch.
type ILambdaArgumentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsLambdaArgumentContext differentiates from other interfaces.
	IsLambdaArgumentContext()
}

type LambdaArgumentContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyLambdaArgumentContext() *LambdaArgumentContext {
	var p = new(LambdaArgumentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_lambdaArgument
	return p
}

func (*LambdaArgumentContext) IsLambdaArgumentContext() {}

func NewLambdaArgumentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *LambdaArgumentContext {
	var p = new(LambdaArgumentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_lambdaArgument

	return p
}

func (s *LambdaArgumentContext) GetParser() antlr.Parser { return s.parser }

func (s *LambdaArgumentContext) VariableName() IVariableNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IVariableNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IVariableNameContext)
}

func (s *LambdaArgumentContext) UNDERSCORE() antlr.TerminalNode {
	return s.GetToken(MQLParserUNDERSCORE, 0)
}

func (s *LambdaArgumentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LambdaArgumentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *LambdaArgumentContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitLambdaArgument(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) LambdaArgument() (localctx ILambdaArgumentContext) {
	localctx = NewLambdaArgumentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 42, MQLParserRULE_lambdaArgument)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(430)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserVARIABLE_ID:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(428)
			p.VariableName()
		}

	case MQLParserUNDERSCORE:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(429)
			p.Match(MQLParserUNDERSCORE)
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// ISwitchCaseContext is an interface to support dynamic dispatch.
type ISwitchCaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsSwitchCaseContext differentiates from other interfaces.
	IsSwitchCaseContext()
}

type SwitchCaseContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySwitchCaseContext() *SwitchCaseContext {
	var p = new(SwitchCaseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_switchCase
	return p
}

func (*SwitchCaseContext) IsSwitchCaseContext() {}

func NewSwitchCaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SwitchCaseContext {
	var p = new(SwitchCaseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_switchCase

	return p
}

func (s *SwitchCaseContext) GetParser() antlr.Parser { return s.parser }

func (s *SwitchCaseContext) CASE() antlr.TerminalNode {
	return s.GetToken(MQLParserCASE, 0)
}

func (s *SwitchCaseContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *SwitchCaseContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *SwitchCaseContext) THEN() antlr.TerminalNode {
	return s.GetToken(MQLParserTHEN, 0)
}

func (s *SwitchCaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SwitchCaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SwitchCaseContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitSwitchCase(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) SwitchCase() (localctx ISwitchCaseContext) {
	localctx = NewSwitchCaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 44, MQLParserRULE_switchCase)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(432)
		p.Match(MQLParserCASE)
	}
	{
		p.SetState(433)
		p.expression(0)
	}
	{
		p.SetState(434)
		p.Match(MQLParserTHEN)
	}
	{
		p.SetState(435)
		p.expression(0)
	}

	return localctx
}

// IVariableAssignmentContext is an interface to support dynamic dispatch.
type IVariableAssignmentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsVariableAssignmentContext differentiates from other interfaces.
	IsVariableAssignmentContext()
}

type VariableAssignmentContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyVariableAssignmentContext() *VariableAssignmentContext {
	var p = new(VariableAssignmentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_variableAssignment
	return p
}

func (*VariableAssignmentContext) IsVariableAssignmentContext() {}

func NewVariableAssignmentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *VariableAssignmentContext {
	var p = new(VariableAssignmentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_variableAssignment

	return p
}

func (s *VariableAssignmentContext) GetParser() antlr.Parser { return s.parser }

func (s *VariableAssignmentContext) VariableName() IVariableNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IVariableNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IVariableNameContext)
}

func (s *VariableAssignmentContext) COLON() antlr.TerminalNode {
	return s.GetToken(MQLParserCOLON, 0)
}

func (s *VariableAssignmentContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *VariableAssignmentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VariableAssignmentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *VariableAssignmentContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitVariableAssignment(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) VariableAssignment() (localctx IVariableAssignmentContext) {
	localctx = NewVariableAssignmentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 46, MQLParserRULE_variableAssignment)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(437)
		p.VariableName()
	}
	{
		p.SetState(438)
		p.Match(MQLParserCOLON)
	}
	{
		p.SetState(439)
		p.expression(0)
	}

	return localctx
}

// IValueContext is an interface to support dynamic dispatch.
type IValueContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsValueContext differentiates from other interfaces.
	IsValueContext()
}

type ValueContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyValueContext() *ValueContext {
	var p = new(ValueContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_value
	return p
}

func (*ValueContext) IsValueContext() {}

func NewValueContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ValueContext {
	var p = new(ValueContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_value

	return p
}

func (s *ValueContext) GetParser() antlr.Parser { return s.parser }

func (s *ValueContext) CopyFrom(ctx *ValueContext) {
	s.BaseParserRuleContext.CopyFrom(ctx.BaseParserRuleContext)
}

func (s *ValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ValueContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type StringValueContext struct {
	*ValueContext
}

func NewStringValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *StringValueContext {
	var p = new(StringValueContext)

	p.ValueContext = NewEmptyValueContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ValueContext))

	return p
}

func (s *StringValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StringValueContext) STRING() antlr.TerminalNode {
	return s.GetToken(MQLParserSTRING, 0)
}

func (s *StringValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitStringValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type DateTimeValueContext struct {
	*ValueContext
}

func NewDateTimeValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *DateTimeValueContext {
	var p = new(DateTimeValueContext)

	p.ValueContext = NewEmptyValueContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ValueContext))

	return p
}

func (s *DateTimeValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DateTimeValueContext) DATE_TIME() antlr.TerminalNode {
	return s.GetToken(MQLParserDATE_TIME, 0)
}

func (s *DateTimeValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitDateTimeValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type OidValueContext struct {
	*ValueContext
}

func NewOidValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *OidValueContext {
	var p = new(OidValueContext)

	p.ValueContext = NewEmptyValueContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ValueContext))

	return p
}

func (s *OidValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *OidValueContext) OID() antlr.TerminalNode {
	return s.GetToken(MQLParserOID, 0)
}

func (s *OidValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitOidValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type BooleanValueContext struct {
	*ValueContext
}

func NewBooleanValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *BooleanValueContext {
	var p = new(BooleanValueContext)

	p.ValueContext = NewEmptyValueContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ValueContext))

	return p
}

func (s *BooleanValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BooleanValueContext) TRUE() antlr.TerminalNode {
	return s.GetToken(MQLParserTRUE, 0)
}

func (s *BooleanValueContext) FALSE() antlr.TerminalNode {
	return s.GetToken(MQLParserFALSE, 0)
}

func (s *BooleanValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitBooleanValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type NumberValueContext struct {
	*ValueContext
}

func NewNumberValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *NumberValueContext {
	var p = new(NumberValueContext)

	p.ValueContext = NewEmptyValueContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ValueContext))

	return p
}

func (s *NumberValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NumberValueContext) Number() INumberContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*INumberContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(INumberContext)
}

func (s *NumberValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitNumberValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type RegexValueContext struct {
	*ValueContext
}

func NewRegexValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *RegexValueContext {
	var p = new(RegexValueContext)

	p.ValueContext = NewEmptyValueContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ValueContext))

	return p
}

func (s *RegexValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *RegexValueContext) REGEX() antlr.TerminalNode {
	return s.GetToken(MQLParserREGEX, 0)
}

func (s *RegexValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitRegexValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type NullValueContext struct {
	*ValueContext
}

func NewNullValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *NullValueContext {
	var p = new(NullValueContext)

	p.ValueContext = NewEmptyValueContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ValueContext))

	return p
}

func (s *NullValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NullValueContext) NULL() antlr.TerminalNode {
	return s.GetToken(MQLParserNULL, 0)
}

func (s *NullValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitNullValue(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) Value() (localctx IValueContext) {
	localctx = NewValueContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 48, MQLParserRULE_value)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(448)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserINT, MQLParserDOUBLE, MQLParserDECIMAL, MQLParserLONG, MQLParserBIN, MQLParserLONG_BIN, MQLParserHEX, MQLParserLONG_HEX, MQLParserOCT, MQLParserLONG_OCT:
		localctx = NewNumberValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(441)
			p.Number()
		}

	case MQLParserSTRING:
		localctx = NewStringValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(442)
			p.Match(MQLParserSTRING)
		}

	case MQLParserFALSE, MQLParserTRUE:
		localctx = NewBooleanValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(443)
			_la = p.GetTokenStream().LA(1)

			if !(_la == MQLParserFALSE || _la == MQLParserTRUE) {
				p.GetErrorHandler().RecoverInline(p)
			} else {
				p.GetErrorHandler().ReportMatch(p)
				p.Consume()
			}
		}

	case MQLParserNULL:
		localctx = NewNullValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(444)
			p.Match(MQLParserNULL)
		}

	case MQLParserOID:
		localctx = NewOidValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(445)
			p.Match(MQLParserOID)
		}

	case MQLParserDATE_TIME:
		localctx = NewDateTimeValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(446)
			p.Match(MQLParserDATE_TIME)
		}

	case MQLParserREGEX:
		localctx = NewRegexValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(447)
			p.Match(MQLParserREGEX)
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// INumberContext is an interface to support dynamic dispatch.
type INumberContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsNumberContext differentiates from other interfaces.
	IsNumberContext()
}

type NumberContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyNumberContext() *NumberContext {
	var p = new(NumberContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_number
	return p
}

func (*NumberContext) IsNumberContext() {}

func NewNumberContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *NumberContext {
	var p = new(NumberContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_number

	return p
}

func (s *NumberContext) GetParser() antlr.Parser { return s.parser }

func (s *NumberContext) CopyFrom(ctx *NumberContext) {
	s.BaseParserRuleContext.CopyFrom(ctx.BaseParserRuleContext)
}

func (s *NumberContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NumberContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type IntValueContext struct {
	*NumberContext
}

func NewIntValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *IntValueContext {
	var p = new(IntValueContext)

	p.NumberContext = NewEmptyNumberContext()
	p.parser = parser
	p.CopyFrom(ctx.(*NumberContext))

	return p
}

func (s *IntValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *IntValueContext) INT() antlr.TerminalNode {
	return s.GetToken(MQLParserINT, 0)
}

func (s *IntValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitIntValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type OctValueContext struct {
	*NumberContext
}

func NewOctValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *OctValueContext {
	var p = new(OctValueContext)

	p.NumberContext = NewEmptyNumberContext()
	p.parser = parser
	p.CopyFrom(ctx.(*NumberContext))

	return p
}

func (s *OctValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *OctValueContext) OCT() antlr.TerminalNode {
	return s.GetToken(MQLParserOCT, 0)
}

func (s *OctValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitOctValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type DecimalValueContext struct {
	*NumberContext
}

func NewDecimalValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *DecimalValueContext {
	var p = new(DecimalValueContext)

	p.NumberContext = NewEmptyNumberContext()
	p.parser = parser
	p.CopyFrom(ctx.(*NumberContext))

	return p
}

func (s *DecimalValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DecimalValueContext) DECIMAL() antlr.TerminalNode {
	return s.GetToken(MQLParserDECIMAL, 0)
}

func (s *DecimalValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitDecimalValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type HexValueContext struct {
	*NumberContext
}

func NewHexValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *HexValueContext {
	var p = new(HexValueContext)

	p.NumberContext = NewEmptyNumberContext()
	p.parser = parser
	p.CopyFrom(ctx.(*NumberContext))

	return p
}

func (s *HexValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *HexValueContext) HEX() antlr.TerminalNode {
	return s.GetToken(MQLParserHEX, 0)
}

func (s *HexValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitHexValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type LongHexValueContext struct {
	*NumberContext
}

func NewLongHexValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LongHexValueContext {
	var p = new(LongHexValueContext)

	p.NumberContext = NewEmptyNumberContext()
	p.parser = parser
	p.CopyFrom(ctx.(*NumberContext))

	return p
}

func (s *LongHexValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LongHexValueContext) LONG_HEX() antlr.TerminalNode {
	return s.GetToken(MQLParserLONG_HEX, 0)
}

func (s *LongHexValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitLongHexValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type LongOctValueContext struct {
	*NumberContext
}

func NewLongOctValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LongOctValueContext {
	var p = new(LongOctValueContext)

	p.NumberContext = NewEmptyNumberContext()
	p.parser = parser
	p.CopyFrom(ctx.(*NumberContext))

	return p
}

func (s *LongOctValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LongOctValueContext) LONG_OCT() antlr.TerminalNode {
	return s.GetToken(MQLParserLONG_OCT, 0)
}

func (s *LongOctValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitLongOctValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type BinValueContext struct {
	*NumberContext
}

func NewBinValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *BinValueContext {
	var p = new(BinValueContext)

	p.NumberContext = NewEmptyNumberContext()
	p.parser = parser
	p.CopyFrom(ctx.(*NumberContext))

	return p
}

func (s *BinValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BinValueContext) BIN() antlr.TerminalNode {
	return s.GetToken(MQLParserBIN, 0)
}

func (s *BinValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitBinValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type DoubleValueContext struct {
	*NumberContext
}

func NewDoubleValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *DoubleValueContext {
	var p = new(DoubleValueContext)

	p.NumberContext = NewEmptyNumberContext()
	p.parser = parser
	p.CopyFrom(ctx.(*NumberContext))

	return p
}

func (s *DoubleValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DoubleValueContext) DOUBLE() antlr.TerminalNode {
	return s.GetToken(MQLParserDOUBLE, 0)
}

func (s *DoubleValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitDoubleValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type LongBinValueContext struct {
	*NumberContext
}

func NewLongBinValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LongBinValueContext {
	var p = new(LongBinValueContext)

	p.NumberContext = NewEmptyNumberContext()
	p.parser = parser
	p.CopyFrom(ctx.(*NumberContext))

	return p
}

func (s *LongBinValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LongBinValueContext) LONG_BIN() antlr.TerminalNode {
	return s.GetToken(MQLParserLONG_BIN, 0)
}

func (s *LongBinValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitLongBinValue(s)

	default:
		return t.VisitChildren(s)
	}
}

type LongValueContext struct {
	*NumberContext
}

func NewLongValueContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LongValueContext {
	var p = new(LongValueContext)

	p.NumberContext = NewEmptyNumberContext()
	p.parser = parser
	p.CopyFrom(ctx.(*NumberContext))

	return p
}

func (s *LongValueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LongValueContext) LONG() antlr.TerminalNode {
	return s.GetToken(MQLParserLONG, 0)
}

func (s *LongValueContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitLongValue(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) Number() (localctx INumberContext) {
	localctx = NewNumberContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 50, MQLParserRULE_number)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(460)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserINT:
		localctx = NewIntValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(450)
			p.Match(MQLParserINT)
		}

	case MQLParserLONG:
		localctx = NewLongValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(451)
			p.Match(MQLParserLONG)
		}

	case MQLParserDOUBLE:
		localctx = NewDoubleValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(452)
			p.Match(MQLParserDOUBLE)
		}

	case MQLParserDECIMAL:
		localctx = NewDecimalValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(453)
			p.Match(MQLParserDECIMAL)
		}

	case MQLParserBIN:
		localctx = NewBinValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(454)
			p.Match(MQLParserBIN)
		}

	case MQLParserLONG_BIN:
		localctx = NewLongBinValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(455)
			p.Match(MQLParserLONG_BIN)
		}

	case MQLParserHEX:
		localctx = NewHexValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(456)
			p.Match(MQLParserHEX)
		}

	case MQLParserLONG_HEX:
		localctx = NewLongHexValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(457)
			p.Match(MQLParserLONG_HEX)
		}

	case MQLParserOCT:
		localctx = NewOctValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(458)
			p.Match(MQLParserOCT)
		}

	case MQLParserLONG_OCT:
		localctx = NewLongOctValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(459)
			p.Match(MQLParserLONG_OCT)
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// ICollectionNameContext is an interface to support dynamic dispatch.
type ICollectionNameContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsCollectionNameContext differentiates from other interfaces.
	IsCollectionNameContext()
}

type CollectionNameContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyCollectionNameContext() *CollectionNameContext {
	var p = new(CollectionNameContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_collectionName
	return p
}

func (*CollectionNameContext) IsCollectionNameContext() {}

func NewCollectionNameContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *CollectionNameContext {
	var p = new(CollectionNameContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_collectionName

	return p
}

func (s *CollectionNameContext) GetParser() antlr.Parser { return s.parser }

func (s *CollectionNameContext) ID() antlr.TerminalNode {
	return s.GetToken(MQLParserID, 0)
}

func (s *CollectionNameContext) DatabaseName() IDatabaseNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDatabaseNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDatabaseNameContext)
}

func (s *CollectionNameContext) DOT() antlr.TerminalNode {
	return s.GetToken(MQLParserDOT, 0)
}

func (s *CollectionNameContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *CollectionNameContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *CollectionNameContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitCollectionName(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) CollectionName() (localctx ICollectionNameContext) {
	localctx = NewCollectionNameContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 52, MQLParserRULE_collectionName)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(467)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 46, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(462)
			p.Match(MQLParserID)
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(463)
			p.DatabaseName()
		}
		{
			p.SetState(464)
			p.Match(MQLParserDOT)
		}
		{
			p.SetState(465)
			p.Match(MQLParserID)
		}

	}

	return localctx
}

// IDatabaseNameContext is an interface to support dynamic dispatch.
type IDatabaseNameContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsDatabaseNameContext differentiates from other interfaces.
	IsDatabaseNameContext()
}

type DatabaseNameContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyDatabaseNameContext() *DatabaseNameContext {
	var p = new(DatabaseNameContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_databaseName
	return p
}

func (*DatabaseNameContext) IsDatabaseNameContext() {}

func NewDatabaseNameContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DatabaseNameContext {
	var p = new(DatabaseNameContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_databaseName

	return p
}

func (s *DatabaseNameContext) GetParser() antlr.Parser { return s.parser }

func (s *DatabaseNameContext) ID() antlr.TerminalNode {
	return s.GetToken(MQLParserID, 0)
}

func (s *DatabaseNameContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DatabaseNameContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DatabaseNameContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitDatabaseName(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) DatabaseName() (localctx IDatabaseNameContext) {
	localctx = NewDatabaseNameContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 54, MQLParserRULE_databaseName)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(469)
		p.Match(MQLParserID)
	}

	return localctx
}

// IFieldDeclarationContext is an interface to support dynamic dispatch.
type IFieldDeclarationContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFieldDeclarationContext differentiates from other interfaces.
	IsFieldDeclarationContext()
}

type FieldDeclarationContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFieldDeclarationContext() *FieldDeclarationContext {
	var p = new(FieldDeclarationContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_fieldDeclaration
	return p
}

func (*FieldDeclarationContext) IsFieldDeclarationContext() {}

func NewFieldDeclarationContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FieldDeclarationContext {
	var p = new(FieldDeclarationContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_fieldDeclaration

	return p
}

func (s *FieldDeclarationContext) GetParser() antlr.Parser { return s.parser }

func (s *FieldDeclarationContext) ID() antlr.TerminalNode {
	return s.GetToken(MQLParserID, 0)
}

func (s *FieldDeclarationContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FieldDeclarationContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FieldDeclarationContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFieldDeclaration(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) FieldDeclaration() (localctx IFieldDeclarationContext) {
	localctx = NewFieldDeclarationContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 56, MQLParserRULE_fieldDeclaration)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(471)
		p.Match(MQLParserID)
	}

	return localctx
}

// IFieldNameContext is an interface to support dynamic dispatch.
type IFieldNameContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFieldNameContext differentiates from other interfaces.
	IsFieldNameContext()
}

type FieldNameContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFieldNameContext() *FieldNameContext {
	var p = new(FieldNameContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_fieldName
	return p
}

func (*FieldNameContext) IsFieldNameContext() {}

func NewFieldNameContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FieldNameContext {
	var p = new(FieldNameContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_fieldName

	return p
}

func (s *FieldNameContext) GetParser() antlr.Parser { return s.parser }

func (s *FieldNameContext) ID() antlr.TerminalNode {
	return s.GetToken(MQLParserID, 0)
}

func (s *FieldNameContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FieldNameContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FieldNameContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFieldName(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) FieldName() (localctx IFieldNameContext) {
	localctx = NewFieldNameContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 58, MQLParserRULE_fieldName)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(473)
		p.Match(MQLParserID)
	}

	return localctx
}

// IFunctionNameContext is an interface to support dynamic dispatch.
type IFunctionNameContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFunctionNameContext differentiates from other interfaces.
	IsFunctionNameContext()
}

type FunctionNameContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFunctionNameContext() *FunctionNameContext {
	var p = new(FunctionNameContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_functionName
	return p
}

func (*FunctionNameContext) IsFunctionNameContext() {}

func NewFunctionNameContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FunctionNameContext {
	var p = new(FunctionNameContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_functionName

	return p
}

func (s *FunctionNameContext) GetParser() antlr.Parser { return s.parser }

func (s *FunctionNameContext) ID() antlr.TerminalNode {
	return s.GetToken(MQLParserID, 0)
}

func (s *FunctionNameContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionNameContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FunctionNameContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFunctionName(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) FunctionName() (localctx IFunctionNameContext) {
	localctx = NewFunctionNameContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 60, MQLParserRULE_functionName)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(475)
		p.Match(MQLParserID)
	}

	return localctx
}

// IFunctionArgumentNameContext is an interface to support dynamic dispatch.
type IFunctionArgumentNameContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFunctionArgumentNameContext differentiates from other interfaces.
	IsFunctionArgumentNameContext()
}

type FunctionArgumentNameContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFunctionArgumentNameContext() *FunctionArgumentNameContext {
	var p = new(FunctionArgumentNameContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_functionArgumentName
	return p
}

func (*FunctionArgumentNameContext) IsFunctionArgumentNameContext() {}

func NewFunctionArgumentNameContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FunctionArgumentNameContext {
	var p = new(FunctionArgumentNameContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_functionArgumentName

	return p
}

func (s *FunctionArgumentNameContext) GetParser() antlr.Parser { return s.parser }

func (s *FunctionArgumentNameContext) ID() antlr.TerminalNode {
	return s.GetToken(MQLParserID, 0)
}

func (s *FunctionArgumentNameContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionArgumentNameContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FunctionArgumentNameContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFunctionArgumentName(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) FunctionArgumentName() (localctx IFunctionArgumentNameContext) {
	localctx = NewFunctionArgumentNameContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 62, MQLParserRULE_functionArgumentName)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(477)
		p.Match(MQLParserID)
	}

	return localctx
}

// IMultipartFieldDeclarationContext is an interface to support dynamic dispatch.
type IMultipartFieldDeclarationContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsMultipartFieldDeclarationContext differentiates from other interfaces.
	IsMultipartFieldDeclarationContext()
}

type MultipartFieldDeclarationContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyMultipartFieldDeclarationContext() *MultipartFieldDeclarationContext {
	var p = new(MultipartFieldDeclarationContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_multipartFieldDeclaration
	return p
}

func (*MultipartFieldDeclarationContext) IsMultipartFieldDeclarationContext() {}

func NewMultipartFieldDeclarationContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *MultipartFieldDeclarationContext {
	var p = new(MultipartFieldDeclarationContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_multipartFieldDeclaration

	return p
}

func (s *MultipartFieldDeclarationContext) GetParser() antlr.Parser { return s.parser }

func (s *MultipartFieldDeclarationContext) AllFieldDeclaration() []IFieldDeclarationContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IFieldDeclarationContext)(nil)).Elem())
	var tst = make([]IFieldDeclarationContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IFieldDeclarationContext)
		}
	}

	return tst
}

func (s *MultipartFieldDeclarationContext) FieldDeclaration(i int) IFieldDeclarationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFieldDeclarationContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IFieldDeclarationContext)
}

func (s *MultipartFieldDeclarationContext) AllDOT() []antlr.TerminalNode {
	return s.GetTokens(MQLParserDOT)
}

func (s *MultipartFieldDeclarationContext) DOT(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserDOT, i)
}

func (s *MultipartFieldDeclarationContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MultipartFieldDeclarationContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *MultipartFieldDeclarationContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitMultipartFieldDeclaration(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) MultipartFieldDeclaration() (localctx IMultipartFieldDeclarationContext) {
	localctx = NewMultipartFieldDeclarationContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 64, MQLParserRULE_multipartFieldDeclaration)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(479)
		p.FieldDeclaration()
	}
	p.SetState(484)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == MQLParserDOT {
		{
			p.SetState(480)
			p.Match(MQLParserDOT)
		}
		{
			p.SetState(481)
			p.FieldDeclaration()
		}

		p.SetState(486)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}

	return localctx
}

// IMultipartFieldNameContext is an interface to support dynamic dispatch.
type IMultipartFieldNameContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsMultipartFieldNameContext differentiates from other interfaces.
	IsMultipartFieldNameContext()
}

type MultipartFieldNameContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyMultipartFieldNameContext() *MultipartFieldNameContext {
	var p = new(MultipartFieldNameContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_multipartFieldName
	return p
}

func (*MultipartFieldNameContext) IsMultipartFieldNameContext() {}

func NewMultipartFieldNameContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *MultipartFieldNameContext {
	var p = new(MultipartFieldNameContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_multipartFieldName

	return p
}

func (s *MultipartFieldNameContext) GetParser() antlr.Parser { return s.parser }

func (s *MultipartFieldNameContext) AllFieldName() []IFieldNameContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IFieldNameContext)(nil)).Elem())
	var tst = make([]IFieldNameContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IFieldNameContext)
		}
	}

	return tst
}

func (s *MultipartFieldNameContext) FieldName(i int) IFieldNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFieldNameContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IFieldNameContext)
}

func (s *MultipartFieldNameContext) AllDOT() []antlr.TerminalNode {
	return s.GetTokens(MQLParserDOT)
}

func (s *MultipartFieldNameContext) DOT(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserDOT, i)
}

func (s *MultipartFieldNameContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *MultipartFieldNameContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *MultipartFieldNameContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitMultipartFieldName(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) MultipartFieldName() (localctx IMultipartFieldNameContext) {
	localctx = NewMultipartFieldNameContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 66, MQLParserRULE_multipartFieldName)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(487)
		p.FieldName()
	}
	p.SetState(492)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == MQLParserDOT {
		{
			p.SetState(488)
			p.Match(MQLParserDOT)
		}
		{
			p.SetState(489)
			p.FieldName()
		}

		p.SetState(494)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}

	return localctx
}

// IVariableNameContext is an interface to support dynamic dispatch.
type IVariableNameContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsVariableNameContext differentiates from other interfaces.
	IsVariableNameContext()
}

type VariableNameContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyVariableNameContext() *VariableNameContext {
	var p = new(VariableNameContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_variableName
	return p
}

func (*VariableNameContext) IsVariableNameContext() {}

func NewVariableNameContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *VariableNameContext {
	var p = new(VariableNameContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_variableName

	return p
}

func (s *VariableNameContext) GetParser() antlr.Parser { return s.parser }

func (s *VariableNameContext) VARIABLE_ID() antlr.TerminalNode {
	return s.GetToken(MQLParserVARIABLE_ID, 0)
}

func (s *VariableNameContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VariableNameContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *VariableNameContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitVariableName(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) VariableName() (localctx IVariableNameContext) {
	localctx = NewVariableNameContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 68, MQLParserRULE_variableName)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(495)
		p.Match(MQLParserVARIABLE_ID)
	}

	return localctx
}

func (p *MQLParser) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 12:
		var t *ExpressionContext = nil
		if localctx != nil {
			t = localctx.(*ExpressionContext)
		}
		return p.Expression_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *MQLParser) Expression_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 26)

	case 1:
		return p.Precpred(p.GetParserRuleContext(), 19)

	case 2:
		return p.Precpred(p.GetParserRuleContext(), 18)

	case 3:
		return p.Precpred(p.GetParserRuleContext(), 17)

	case 4:
		return p.Precpred(p.GetParserRuleContext(), 16)

	case 5:
		return p.Precpred(p.GetParserRuleContext(), 15)

	case 6:
		return p.Precpred(p.GetParserRuleContext(), 14)

	case 7:
		return p.Precpred(p.GetParserRuleContext(), 13)

	case 8:
		return p.Precpred(p.GetParserRuleContext(), 23)

	case 9:
		return p.Precpred(p.GetParserRuleContext(), 22)

	case 10:
		return p.Precpred(p.GetParserRuleContext(), 21)

	case 11:
		return p.Precpred(p.GetParserRuleContext(), 20)

	case 12:
		return p.Precpred(p.GetParserRuleContext(), 12)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
