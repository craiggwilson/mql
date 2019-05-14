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
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 89, 481,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 4, 13,
	9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4, 18, 9,
	18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23, 9, 23,
	4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9, 28, 4,
	29, 9, 29, 4, 30, 9, 30, 4, 31, 9, 31, 4, 32, 9, 32, 4, 33, 9, 33, 4, 34,
	9, 34, 4, 35, 9, 35, 3, 2, 3, 2, 3, 2, 3, 2, 5, 2, 75, 10, 2, 3, 3, 3,
	3, 3, 3, 3, 3, 3, 4, 7, 4, 82, 10, 4, 12, 4, 14, 4, 85, 11, 4, 3, 5, 3,
	5, 3, 5, 3, 5, 5, 5, 91, 10, 5, 3, 5, 3, 5, 5, 5, 95, 10, 5, 3, 6, 3, 6,
	3, 6, 3, 6, 5, 6, 101, 10, 6, 3, 7, 3, 7, 3, 7, 3, 8, 3, 8, 3, 8, 3, 8,
	3, 8, 7, 8, 111, 10, 8, 12, 8, 14, 8, 114, 11, 8, 3, 8, 3, 8, 3, 8, 5,
	8, 119, 10, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3,
	8, 7, 8, 131, 10, 8, 12, 8, 14, 8, 134, 11, 8, 3, 8, 3, 8, 3, 8, 5, 8,
	139, 10, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8,
	7, 8, 151, 10, 8, 12, 8, 14, 8, 154, 11, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3,
	8, 3, 8, 3, 8, 3, 8, 7, 8, 164, 10, 8, 12, 8, 14, 8, 167, 11, 8, 3, 8,
	3, 8, 3, 8, 3, 8, 3, 8, 6, 8, 174, 10, 8, 13, 8, 14, 8, 175, 3, 8, 3, 8,
	5, 8, 180, 10, 8, 5, 8, 182, 10, 8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9,
	3, 9, 5, 9, 191, 10, 9, 3, 10, 3, 10, 5, 10, 195, 10, 10, 3, 11, 3, 11,
	3, 11, 5, 11, 200, 10, 11, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	12, 6, 12, 209, 10, 12, 13, 12, 14, 12, 210, 3, 12, 3, 12, 5, 12, 215,
	10, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12,
	3, 12, 3, 12, 7, 12, 228, 10, 12, 12, 12, 14, 12, 231, 11, 12, 3, 12, 3,
	12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12,
	3, 12, 3, 12, 5, 12, 247, 10, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12,
	3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3,
	12, 3, 12, 5, 12, 277, 10, 12, 3, 12, 3, 12, 3, 12, 3, 12, 5, 12, 283,
	10, 12, 3, 12, 3, 12, 5, 12, 287, 10, 12, 3, 12, 3, 12, 5, 12, 291, 10,
	12, 5, 12, 293, 10, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 5, 12,
	301, 10, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 5, 12, 308, 10, 12, 3,
	12, 3, 12, 7, 12, 312, 10, 12, 12, 12, 14, 12, 315, 11, 12, 3, 13, 3, 13,
	3, 13, 3, 13, 7, 13, 321, 10, 13, 12, 13, 14, 13, 324, 11, 13, 5, 13, 326,
	10, 13, 3, 13, 3, 13, 3, 14, 3, 14, 3, 14, 3, 14, 7, 14, 334, 10, 14, 12,
	14, 14, 14, 337, 11, 14, 5, 14, 339, 10, 14, 3, 14, 3, 14, 3, 15, 3, 15,
	3, 15, 3, 15, 3, 16, 3, 16, 3, 16, 3, 16, 7, 16, 351, 10, 16, 12, 16, 14,
	16, 354, 11, 16, 5, 16, 356, 10, 16, 3, 16, 3, 16, 3, 17, 3, 17, 3, 17,
	3, 17, 3, 18, 3, 18, 3, 18, 5, 18, 367, 10, 18, 3, 18, 3, 18, 3, 19, 3,
	19, 3, 19, 7, 19, 374, 10, 19, 12, 19, 14, 19, 377, 11, 19, 3, 19, 3, 19,
	3, 19, 7, 19, 382, 10, 19, 12, 19, 14, 19, 385, 11, 19, 5, 19, 387, 10,
	19, 3, 20, 3, 20, 3, 20, 3, 20, 3, 21, 3, 21, 5, 21, 395, 10, 21, 3, 22,
	3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 3, 22, 7, 22, 405, 10, 22, 12,
	22, 14, 22, 408, 11, 22, 3, 22, 3, 22, 3, 22, 3, 22, 5, 22, 414, 10, 22,
	3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 24, 3, 24, 3, 24, 3, 24, 3, 25, 3,
	25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 5, 25, 432, 10, 25, 3, 26, 3, 26,
	3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 3, 26, 5, 26, 444, 10,
	26, 3, 27, 3, 27, 3, 27, 3, 27, 3, 27, 5, 27, 451, 10, 27, 3, 28, 3, 28,
	3, 29, 3, 29, 3, 30, 3, 30, 3, 31, 3, 31, 3, 32, 3, 32, 3, 33, 3, 33, 3,
	33, 7, 33, 466, 10, 33, 12, 33, 14, 33, 469, 11, 33, 3, 34, 3, 34, 3, 34,
	7, 34, 474, 10, 34, 12, 34, 14, 34, 477, 11, 34, 3, 35, 3, 35, 3, 35, 2,
	3, 22, 36, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32,
	34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68,
	2, 8, 4, 2, 32, 32, 38, 38, 5, 2, 7, 7, 19, 19, 21, 21, 4, 2, 18, 18, 24,
	24, 5, 2, 10, 12, 16, 17, 22, 22, 4, 2, 54, 54, 58, 58, 4, 2, 40, 40, 67,
	67, 2, 537, 2, 74, 3, 2, 2, 2, 4, 76, 3, 2, 2, 2, 6, 83, 3, 2, 2, 2, 8,
	86, 3, 2, 2, 2, 10, 96, 3, 2, 2, 2, 12, 102, 3, 2, 2, 2, 14, 181, 3, 2,
	2, 2, 16, 190, 3, 2, 2, 2, 18, 192, 3, 2, 2, 2, 20, 199, 3, 2, 2, 2, 22,
	246, 3, 2, 2, 2, 24, 316, 3, 2, 2, 2, 26, 329, 3, 2, 2, 2, 28, 342, 3,
	2, 2, 2, 30, 346, 3, 2, 2, 2, 32, 359, 3, 2, 2, 2, 34, 363, 3, 2, 2, 2,
	36, 386, 3, 2, 2, 2, 38, 388, 3, 2, 2, 2, 40, 394, 3, 2, 2, 2, 42, 413,
	3, 2, 2, 2, 44, 415, 3, 2, 2, 2, 46, 420, 3, 2, 2, 2, 48, 431, 3, 2, 2,
	2, 50, 443, 3, 2, 2, 2, 52, 450, 3, 2, 2, 2, 54, 452, 3, 2, 2, 2, 56, 454,
	3, 2, 2, 2, 58, 456, 3, 2, 2, 2, 60, 458, 3, 2, 2, 2, 62, 460, 3, 2, 2,
	2, 64, 462, 3, 2, 2, 2, 66, 470, 3, 2, 2, 2, 68, 478, 3, 2, 2, 2, 70, 75,
	5, 4, 3, 2, 71, 75, 5, 8, 5, 2, 72, 75, 5, 10, 6, 2, 73, 75, 5, 12, 7,
	2, 74, 70, 3, 2, 2, 2, 74, 71, 3, 2, 2, 2, 74, 72, 3, 2, 2, 2, 74, 73,
	3, 2, 2, 2, 75, 3, 3, 2, 2, 2, 76, 77, 7, 41, 2, 2, 77, 78, 5, 52, 27,
	2, 78, 79, 5, 6, 4, 2, 79, 5, 3, 2, 2, 2, 80, 82, 5, 14, 8, 2, 81, 80,
	3, 2, 2, 2, 82, 85, 3, 2, 2, 2, 83, 81, 3, 2, 2, 2, 83, 84, 3, 2, 2, 2,
	84, 7, 3, 2, 2, 2, 85, 83, 3, 2, 2, 2, 86, 87, 7, 61, 2, 2, 87, 90, 7,
	35, 2, 2, 88, 89, 7, 44, 2, 2, 89, 91, 5, 54, 28, 2, 90, 88, 3, 2, 2, 2,
	90, 91, 3, 2, 2, 2, 91, 94, 3, 2, 2, 2, 92, 93, 7, 53, 2, 2, 93, 95, 5,
	22, 12, 2, 94, 92, 3, 2, 2, 2, 94, 95, 3, 2, 2, 2, 95, 9, 3, 2, 2, 2, 96,
	97, 7, 61, 2, 2, 97, 100, 7, 36, 2, 2, 98, 99, 7, 53, 2, 2, 99, 101, 5,
	22, 12, 2, 100, 98, 3, 2, 2, 2, 100, 101, 3, 2, 2, 2, 101, 11, 3, 2, 2,
	2, 102, 103, 7, 70, 2, 2, 103, 104, 5, 54, 28, 2, 104, 13, 3, 2, 2, 2,
	105, 106, 7, 42, 2, 2, 106, 107, 7, 13, 2, 2, 107, 112, 5, 28, 15, 2, 108,
	109, 7, 5, 2, 2, 109, 111, 5, 28, 15, 2, 110, 108, 3, 2, 2, 2, 111, 114,
	3, 2, 2, 2, 112, 110, 3, 2, 2, 2, 112, 113, 3, 2, 2, 2, 113, 115, 3, 2,
	2, 2, 114, 112, 3, 2, 2, 2, 115, 118, 7, 26, 2, 2, 116, 117, 7, 33, 2,
	2, 117, 119, 5, 22, 12, 2, 118, 116, 3, 2, 2, 2, 118, 119, 3, 2, 2, 2,
	119, 182, 3, 2, 2, 2, 120, 121, 7, 50, 2, 2, 121, 182, 7, 74, 2, 2, 122,
	123, 7, 51, 2, 2, 123, 124, 7, 13, 2, 2, 124, 125, 5, 64, 33, 2, 125, 138,
	7, 4, 2, 2, 126, 127, 7, 13, 2, 2, 127, 132, 5, 46, 24, 2, 128, 129, 7,
	5, 2, 2, 129, 131, 5, 46, 24, 2, 130, 128, 3, 2, 2, 2, 131, 134, 3, 2,
	2, 2, 132, 130, 3, 2, 2, 2, 132, 133, 3, 2, 2, 2, 133, 135, 3, 2, 2, 2,
	134, 132, 3, 2, 2, 2, 135, 136, 7, 26, 2, 2, 136, 137, 7, 3, 2, 2, 137,
	139, 3, 2, 2, 2, 138, 126, 3, 2, 2, 2, 138, 139, 3, 2, 2, 2, 139, 140,
	3, 2, 2, 2, 140, 141, 5, 4, 3, 2, 141, 142, 7, 26, 2, 2, 142, 182, 3, 2,
	2, 2, 143, 144, 7, 53, 2, 2, 144, 182, 5, 22, 12, 2, 145, 146, 7, 59, 2,
	2, 146, 147, 7, 13, 2, 2, 147, 152, 5, 16, 9, 2, 148, 149, 7, 5, 2, 2,
	149, 151, 5, 16, 9, 2, 150, 148, 3, 2, 2, 2, 151, 154, 3, 2, 2, 2, 152,
	150, 3, 2, 2, 2, 152, 153, 3, 2, 2, 2, 153, 155, 3, 2, 2, 2, 154, 152,
	3, 2, 2, 2, 155, 156, 7, 26, 2, 2, 156, 182, 3, 2, 2, 2, 157, 158, 7, 62,
	2, 2, 158, 182, 7, 74, 2, 2, 159, 160, 7, 63, 2, 2, 160, 165, 5, 18, 10,
	2, 161, 162, 7, 5, 2, 2, 162, 164, 5, 18, 10, 2, 163, 161, 3, 2, 2, 2,
	164, 167, 3, 2, 2, 2, 165, 163, 3, 2, 2, 2, 165, 166, 3, 2, 2, 2, 166,
	182, 3, 2, 2, 2, 167, 165, 3, 2, 2, 2, 168, 169, 7, 68, 2, 2, 169, 179,
	5, 66, 34, 2, 170, 171, 7, 71, 2, 2, 171, 173, 7, 15, 2, 2, 172, 174, 5,
	20, 11, 2, 173, 172, 3, 2, 2, 2, 174, 175, 3, 2, 2, 2, 175, 173, 3, 2,
	2, 2, 175, 176, 3, 2, 2, 2, 176, 177, 3, 2, 2, 2, 177, 178, 7, 28, 2, 2,
	178, 180, 3, 2, 2, 2, 179, 170, 3, 2, 2, 2, 179, 180, 3, 2, 2, 2, 180,
	182, 3, 2, 2, 2, 181, 105, 3, 2, 2, 2, 181, 120, 3, 2, 2, 2, 181, 122,
	3, 2, 2, 2, 181, 143, 3, 2, 2, 2, 181, 145, 3, 2, 2, 2, 181, 157, 3, 2,
	2, 2, 181, 159, 3, 2, 2, 2, 181, 168, 3, 2, 2, 2, 182, 15, 3, 2, 2, 2,
	183, 184, 7, 23, 2, 2, 184, 191, 5, 64, 33, 2, 185, 191, 5, 64, 33, 2,
	186, 187, 5, 56, 29, 2, 187, 188, 7, 4, 2, 2, 188, 189, 5, 22, 12, 2, 189,
	191, 3, 2, 2, 2, 190, 183, 3, 2, 2, 2, 190, 185, 3, 2, 2, 2, 190, 186,
	3, 2, 2, 2, 191, 17, 3, 2, 2, 2, 192, 194, 5, 66, 34, 2, 193, 195, 9, 2,
	2, 2, 194, 193, 3, 2, 2, 2, 194, 195, 3, 2, 2, 2, 195, 19, 3, 2, 2, 2,
	196, 197, 7, 45, 2, 2, 197, 200, 5, 64, 33, 2, 198, 200, 7, 72, 2, 2, 199,
	196, 3, 2, 2, 2, 199, 198, 3, 2, 2, 2, 200, 21, 3, 2, 2, 2, 201, 202, 8,
	12, 1, 2, 202, 203, 7, 18, 2, 2, 203, 247, 5, 22, 12, 26, 204, 205, 7,
	55, 2, 2, 205, 247, 5, 22, 12, 25, 206, 208, 7, 65, 2, 2, 207, 209, 5,
	44, 23, 2, 208, 207, 3, 2, 2, 2, 209, 210, 3, 2, 2, 2, 210, 208, 3, 2,
	2, 2, 210, 211, 3, 2, 2, 2, 211, 214, 3, 2, 2, 2, 212, 213, 7, 39, 2, 2,
	213, 215, 5, 22, 12, 2, 214, 212, 3, 2, 2, 2, 214, 215, 3, 2, 2, 2, 215,
	247, 3, 2, 2, 2, 216, 217, 7, 43, 2, 2, 217, 218, 5, 22, 12, 2, 218, 219,
	7, 66, 2, 2, 219, 220, 5, 22, 12, 2, 220, 221, 7, 39, 2, 2, 221, 222, 5,
	22, 12, 11, 222, 247, 3, 2, 2, 2, 223, 224, 7, 13, 2, 2, 224, 229, 5, 46,
	24, 2, 225, 226, 7, 5, 2, 2, 226, 228, 5, 46, 24, 2, 227, 225, 3, 2, 2,
	2, 228, 231, 3, 2, 2, 2, 229, 227, 3, 2, 2, 2, 229, 230, 3, 2, 2, 2, 230,
	232, 3, 2, 2, 2, 231, 229, 3, 2, 2, 2, 232, 233, 7, 26, 2, 2, 233, 234,
	7, 3, 2, 2, 234, 235, 5, 22, 12, 10, 235, 247, 3, 2, 2, 2, 236, 237, 7,
	15, 2, 2, 237, 238, 5, 22, 12, 2, 238, 239, 7, 28, 2, 2, 239, 247, 3, 2,
	2, 2, 240, 247, 5, 34, 18, 2, 241, 247, 5, 58, 30, 2, 242, 247, 5, 68,
	35, 2, 243, 247, 5, 26, 14, 2, 244, 247, 5, 24, 13, 2, 245, 247, 5, 48,
	25, 2, 246, 201, 3, 2, 2, 2, 246, 204, 3, 2, 2, 2, 246, 206, 3, 2, 2, 2,
	246, 216, 3, 2, 2, 2, 246, 223, 3, 2, 2, 2, 246, 236, 3, 2, 2, 2, 246,
	240, 3, 2, 2, 2, 246, 241, 3, 2, 2, 2, 246, 242, 3, 2, 2, 2, 246, 243,
	3, 2, 2, 2, 246, 244, 3, 2, 2, 2, 246, 245, 3, 2, 2, 2, 247, 313, 3, 2,
	2, 2, 248, 249, 12, 27, 2, 2, 249, 250, 7, 20, 2, 2, 250, 312, 5, 22, 12,
	27, 251, 252, 12, 20, 2, 2, 252, 253, 9, 3, 2, 2, 253, 312, 5, 22, 12,
	21, 254, 255, 12, 19, 2, 2, 255, 256, 9, 4, 2, 2, 256, 312, 5, 22, 12,
	20, 257, 258, 12, 18, 2, 2, 258, 259, 9, 5, 2, 2, 259, 312, 5, 22, 12,
	19, 260, 261, 12, 17, 2, 2, 261, 262, 7, 31, 2, 2, 262, 312, 5, 22, 12,
	18, 263, 264, 12, 16, 2, 2, 264, 265, 9, 6, 2, 2, 265, 312, 5, 22, 12,
	17, 266, 267, 12, 15, 2, 2, 267, 268, 7, 6, 2, 2, 268, 312, 5, 22, 12,
	16, 269, 270, 12, 14, 2, 2, 270, 271, 7, 9, 2, 2, 271, 312, 5, 22, 12,
	15, 272, 273, 12, 24, 2, 2, 273, 276, 7, 8, 2, 2, 274, 277, 5, 58, 30,
	2, 275, 277, 5, 34, 18, 2, 276, 274, 3, 2, 2, 2, 276, 275, 3, 2, 2, 2,
	277, 312, 3, 2, 2, 2, 278, 279, 12, 23, 2, 2, 279, 292, 7, 14, 2, 2, 280,
	293, 5, 22, 12, 2, 281, 283, 5, 22, 12, 2, 282, 281, 3, 2, 2, 2, 282, 283,
	3, 2, 2, 2, 283, 284, 3, 2, 2, 2, 284, 286, 7, 25, 2, 2, 285, 287, 5, 22,
	12, 2, 286, 285, 3, 2, 2, 2, 286, 287, 3, 2, 2, 2, 287, 290, 3, 2, 2, 2,
	288, 289, 7, 4, 2, 2, 289, 291, 5, 22, 12, 2, 290, 288, 3, 2, 2, 2, 290,
	291, 3, 2, 2, 2, 291, 293, 3, 2, 2, 2, 292, 280, 3, 2, 2, 2, 292, 282,
	3, 2, 2, 2, 293, 294, 3, 2, 2, 2, 294, 312, 7, 27, 2, 2, 295, 296, 12,
	22, 2, 2, 296, 297, 7, 25, 2, 2, 297, 300, 5, 22, 12, 2, 298, 299, 7, 4,
	2, 2, 299, 301, 5, 22, 12, 2, 300, 298, 3, 2, 2, 2, 300, 301, 3, 2, 2,
	2, 301, 312, 3, 2, 2, 2, 302, 303, 12, 21, 2, 2, 303, 304, 7, 49, 2, 2,
	304, 312, 7, 73, 2, 2, 305, 307, 12, 13, 2, 2, 306, 308, 7, 55, 2, 2, 307,
	306, 3, 2, 2, 2, 307, 308, 3, 2, 2, 2, 308, 309, 3, 2, 2, 2, 309, 310,
	7, 44, 2, 2, 310, 312, 5, 24, 13, 2, 311, 248, 3, 2, 2, 2, 311, 251, 3,
	2, 2, 2, 311, 254, 3, 2, 2, 2, 311, 257, 3, 2, 2, 2, 311, 260, 3, 2, 2,
	2, 311, 263, 3, 2, 2, 2, 311, 266, 3, 2, 2, 2, 311, 269, 3, 2, 2, 2, 311,
	272, 3, 2, 2, 2, 311, 278, 3, 2, 2, 2, 311, 295, 3, 2, 2, 2, 311, 302,
	3, 2, 2, 2, 311, 305, 3, 2, 2, 2, 312, 315, 3, 2, 2, 2, 313, 311, 3, 2,
	2, 2, 313, 314, 3, 2, 2, 2, 314, 23, 3, 2, 2, 2, 315, 313, 3, 2, 2, 2,
	316, 325, 7, 14, 2, 2, 317, 322, 5, 22, 12, 2, 318, 319, 7, 5, 2, 2, 319,
	321, 5, 22, 12, 2, 320, 318, 3, 2, 2, 2, 321, 324, 3, 2, 2, 2, 322, 320,
	3, 2, 2, 2, 322, 323, 3, 2, 2, 2, 323, 326, 3, 2, 2, 2, 324, 322, 3, 2,
	2, 2, 325, 317, 3, 2, 2, 2, 325, 326, 3, 2, 2, 2, 326, 327, 3, 2, 2, 2,
	327, 328, 7, 27, 2, 2, 328, 25, 3, 2, 2, 2, 329, 338, 7, 13, 2, 2, 330,
	335, 5, 28, 15, 2, 331, 332, 7, 5, 2, 2, 332, 334, 5, 28, 15, 2, 333, 331,
	3, 2, 2, 2, 334, 337, 3, 2, 2, 2, 335, 333, 3, 2, 2, 2, 335, 336, 3, 2,
	2, 2, 336, 339, 3, 2, 2, 2, 337, 335, 3, 2, 2, 2, 338, 330, 3, 2, 2, 2,
	338, 339, 3, 2, 2, 2, 339, 340, 3, 2, 2, 2, 340, 341, 7, 26, 2, 2, 341,
	27, 3, 2, 2, 2, 342, 343, 5, 56, 29, 2, 343, 344, 7, 4, 2, 2, 344, 345,
	5, 22, 12, 2, 345, 29, 3, 2, 2, 2, 346, 355, 7, 13, 2, 2, 347, 352, 5,
	32, 17, 2, 348, 349, 7, 5, 2, 2, 349, 351, 5, 32, 17, 2, 350, 348, 3, 2,
	2, 2, 351, 354, 3, 2, 2, 2, 352, 350, 3, 2, 2, 2, 352, 353, 3, 2, 2, 2,
	353, 356, 3, 2, 2, 2, 354, 352, 3, 2, 2, 2, 355, 347, 3, 2, 2, 2, 355,
	356, 3, 2, 2, 2, 356, 357, 3, 2, 2, 2, 357, 358, 7, 26, 2, 2, 358, 31,
	3, 2, 2, 2, 359, 360, 5, 64, 33, 2, 360, 361, 7, 4, 2, 2, 361, 362, 5,
	22, 12, 2, 362, 33, 3, 2, 2, 2, 363, 364, 5, 60, 31, 2, 364, 366, 7, 15,
	2, 2, 365, 367, 5, 36, 19, 2, 366, 365, 3, 2, 2, 2, 366, 367, 3, 2, 2,
	2, 367, 368, 3, 2, 2, 2, 368, 369, 7, 28, 2, 2, 369, 35, 3, 2, 2, 2, 370,
	375, 5, 22, 12, 2, 371, 372, 7, 5, 2, 2, 372, 374, 5, 22, 12, 2, 373, 371,
	3, 2, 2, 2, 374, 377, 3, 2, 2, 2, 375, 373, 3, 2, 2, 2, 375, 376, 3, 2,
	2, 2, 376, 387, 3, 2, 2, 2, 377, 375, 3, 2, 2, 2, 378, 383, 5, 38, 20,
	2, 379, 380, 7, 5, 2, 2, 380, 382, 5, 38, 20, 2, 381, 379, 3, 2, 2, 2,
	382, 385, 3, 2, 2, 2, 383, 381, 3, 2, 2, 2, 383, 384, 3, 2, 2, 2, 384,
	387, 3, 2, 2, 2, 385, 383, 3, 2, 2, 2, 386, 370, 3, 2, 2, 2, 386, 378,
	3, 2, 2, 2, 387, 37, 3, 2, 2, 2, 388, 389, 5, 62, 32, 2, 389, 390, 7, 4,
	2, 2, 390, 391, 5, 22, 12, 2, 391, 39, 3, 2, 2, 2, 392, 395, 5, 68, 35,
	2, 393, 395, 7, 30, 2, 2, 394, 392, 3, 2, 2, 2, 394, 393, 3, 2, 2, 2, 395,
	41, 3, 2, 2, 2, 396, 397, 5, 40, 21, 2, 397, 398, 7, 3, 2, 2, 398, 399,
	5, 22, 12, 2, 399, 414, 3, 2, 2, 2, 400, 401, 7, 15, 2, 2, 401, 406, 5,
	40, 21, 2, 402, 403, 7, 5, 2, 2, 403, 405, 5, 40, 21, 2, 404, 402, 3, 2,
	2, 2, 405, 408, 3, 2, 2, 2, 406, 404, 3, 2, 2, 2, 406, 407, 3, 2, 2, 2,
	407, 409, 3, 2, 2, 2, 408, 406, 3, 2, 2, 2, 409, 410, 7, 28, 2, 2, 410,
	411, 7, 3, 2, 2, 411, 412, 5, 22, 12, 2, 412, 414, 3, 2, 2, 2, 413, 396,
	3, 2, 2, 2, 413, 400, 3, 2, 2, 2, 414, 43, 3, 2, 2, 2, 415, 416, 7, 34,
	2, 2, 416, 417, 5, 22, 12, 2, 417, 418, 7, 66, 2, 2, 418, 419, 5, 22, 12,
	2, 419, 45, 3, 2, 2, 2, 420, 421, 5, 68, 35, 2, 421, 422, 7, 4, 2, 2, 422,
	423, 5, 22, 12, 2, 423, 47, 3, 2, 2, 2, 424, 432, 5, 50, 26, 2, 425, 432,
	7, 86, 2, 2, 426, 432, 9, 7, 2, 2, 427, 432, 7, 56, 2, 2, 428, 432, 7,
	84, 2, 2, 429, 432, 7, 89, 2, 2, 430, 432, 7, 73, 2, 2, 431, 424, 3, 2,
	2, 2, 431, 425, 3, 2, 2, 2, 431, 426, 3, 2, 2, 2, 431, 427, 3, 2, 2, 2,
	431, 428, 3, 2, 2, 2, 431, 429, 3, 2, 2, 2, 431, 430, 3, 2, 2, 2, 432,
	49, 3, 2, 2, 2, 433, 444, 7, 74, 2, 2, 434, 444, 7, 77, 2, 2, 435, 444,
	7, 75, 2, 2, 436, 444, 7, 76, 2, 2, 437, 444, 7, 78, 2, 2, 438, 444, 7,
	79, 2, 2, 439, 444, 7, 80, 2, 2, 440, 444, 7, 81, 2, 2, 441, 444, 7, 82,
	2, 2, 442, 444, 7, 83, 2, 2, 443, 433, 3, 2, 2, 2, 443, 434, 3, 2, 2, 2,
	443, 435, 3, 2, 2, 2, 443, 436, 3, 2, 2, 2, 443, 437, 3, 2, 2, 2, 443,
	438, 3, 2, 2, 2, 443, 439, 3, 2, 2, 2, 443, 440, 3, 2, 2, 2, 443, 441,
	3, 2, 2, 2, 443, 442, 3, 2, 2, 2, 444, 51, 3, 2, 2, 2, 445, 451, 7, 85,
	2, 2, 446, 447, 5, 54, 28, 2, 447, 448, 7, 8, 2, 2, 448, 449, 7, 85, 2,
	2, 449, 451, 3, 2, 2, 2, 450, 445, 3, 2, 2, 2, 450, 446, 3, 2, 2, 2, 451,
	53, 3, 2, 2, 2, 452, 453, 7, 85, 2, 2, 453, 55, 3, 2, 2, 2, 454, 455, 7,
	85, 2, 2, 455, 57, 3, 2, 2, 2, 456, 457, 7, 85, 2, 2, 457, 59, 3, 2, 2,
	2, 458, 459, 7, 85, 2, 2, 459, 61, 3, 2, 2, 2, 460, 461, 7, 85, 2, 2, 461,
	63, 3, 2, 2, 2, 462, 467, 5, 56, 29, 2, 463, 464, 7, 8, 2, 2, 464, 466,
	5, 56, 29, 2, 465, 463, 3, 2, 2, 2, 466, 469, 3, 2, 2, 2, 467, 465, 3,
	2, 2, 2, 467, 468, 3, 2, 2, 2, 468, 65, 3, 2, 2, 2, 469, 467, 3, 2, 2,
	2, 470, 475, 5, 58, 30, 2, 471, 472, 7, 8, 2, 2, 472, 474, 5, 58, 30, 2,
	473, 471, 3, 2, 2, 2, 474, 477, 3, 2, 2, 2, 475, 473, 3, 2, 2, 2, 475,
	476, 3, 2, 2, 2, 476, 67, 3, 2, 2, 2, 477, 475, 3, 2, 2, 2, 478, 479, 7,
	87, 2, 2, 479, 69, 3, 2, 2, 2, 50, 74, 83, 90, 94, 100, 112, 118, 132,
	138, 152, 165, 175, 179, 181, 190, 194, 199, 210, 214, 229, 246, 276, 282,
	286, 290, 292, 300, 307, 311, 313, 322, 325, 335, 338, 352, 355, 366, 375,
	383, 386, 394, 406, 413, 431, 443, 450, 467, 475,
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
	"DATABASES", "DELETE", "DESC", "ELSE", "FALSE", "FROM", "GROUP", "IF",
	"IN", "INDEX", "INSERT", "INTO", "LET", "LIKE", "LIMIT", "LOOKUP", "MANY",
	"MATCH", "NOR", "NOT", "NULL", "ONE", "OR", "PROJECT", "SET", "SHOW", "SKIP_",
	"SORT", "STEP", "SWITCH", "THEN", "TRUE", "UNWIND", "UPDATE", "USE", "WITH",
	"PRESERVE_NULL_AND_EMPTY", "REGEX", "INT", "DOUBLE", "DECIMAL", "LONG",
	"BIN", "LONG_BIN", "HEX", "LONG_HEX", "OCT", "LONG_OCT", "OID", "ID", "STRING",
	"VARIABLE_ID", "WS", "DATE_TIME",
}

var ruleNames = []string{
	"statement", "queryStatement", "pipeline", "showCollectionsStatement",
	"showDatabasesStatement", "useDatabaseStatement", "queryStage", "projectItem",
	"sortField", "unwindOption", "expression", "array", "document", "fieldAssignment",
	"multipart_document", "multipartFieldAssignment", "function", "functionArguments",
	"functionNamedArgument", "lambdaArgument", "lambdaExpression", "switchCase",
	"variableAssignment", "value", "number", "collectionName", "databaseName",
	"fieldDeclaration", "fieldName", "functionName", "functionArgumentName",
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
	MQLParserGROUP                   = 40
	MQLParserIF                      = 41
	MQLParserIN                      = 42
	MQLParserINDEX                   = 43
	MQLParserINSERT                  = 44
	MQLParserINTO                    = 45
	MQLParserLET                     = 46
	MQLParserLIKE                    = 47
	MQLParserLIMIT                   = 48
	MQLParserLOOKUP                  = 49
	MQLParserMANY                    = 50
	MQLParserMATCH                   = 51
	MQLParserNOR                     = 52
	MQLParserNOT                     = 53
	MQLParserNULL                    = 54
	MQLParserONE                     = 55
	MQLParserOR                      = 56
	MQLParserPROJECT                 = 57
	MQLParserSET                     = 58
	MQLParserSHOW                    = 59
	MQLParserSKIP_                   = 60
	MQLParserSORT                    = 61
	MQLParserSTEP                    = 62
	MQLParserSWITCH                  = 63
	MQLParserTHEN                    = 64
	MQLParserTRUE                    = 65
	MQLParserUNWIND                  = 66
	MQLParserUPDATE                  = 67
	MQLParserUSE                     = 68
	MQLParserWITH                    = 69
	MQLParserPRESERVE_NULL_AND_EMPTY = 70
	MQLParserREGEX                   = 71
	MQLParserINT                     = 72
	MQLParserDOUBLE                  = 73
	MQLParserDECIMAL                 = 74
	MQLParserLONG                    = 75
	MQLParserBIN                     = 76
	MQLParserLONG_BIN                = 77
	MQLParserHEX                     = 78
	MQLParserLONG_HEX                = 79
	MQLParserOCT                     = 80
	MQLParserLONG_OCT                = 81
	MQLParserOID                     = 82
	MQLParserID                      = 83
	MQLParserSTRING                  = 84
	MQLParserVARIABLE_ID             = 85
	MQLParserWS                      = 86
	MQLParserDATE_TIME               = 87
)

// MQLParser rules.
const (
	MQLParserRULE_statement                 = 0
	MQLParserRULE_queryStatement            = 1
	MQLParserRULE_pipeline                  = 2
	MQLParserRULE_showCollectionsStatement  = 3
	MQLParserRULE_showDatabasesStatement    = 4
	MQLParserRULE_useDatabaseStatement      = 5
	MQLParserRULE_queryStage                = 6
	MQLParserRULE_projectItem               = 7
	MQLParserRULE_sortField                 = 8
	MQLParserRULE_unwindOption              = 9
	MQLParserRULE_expression                = 10
	MQLParserRULE_array                     = 11
	MQLParserRULE_document                  = 12
	MQLParserRULE_fieldAssignment           = 13
	MQLParserRULE_multipart_document        = 14
	MQLParserRULE_multipartFieldAssignment  = 15
	MQLParserRULE_function                  = 16
	MQLParserRULE_functionArguments         = 17
	MQLParserRULE_functionNamedArgument     = 18
	MQLParserRULE_lambdaArgument            = 19
	MQLParserRULE_lambdaExpression          = 20
	MQLParserRULE_switchCase                = 21
	MQLParserRULE_variableAssignment        = 22
	MQLParserRULE_value                     = 23
	MQLParserRULE_number                    = 24
	MQLParserRULE_collectionName            = 25
	MQLParserRULE_databaseName              = 26
	MQLParserRULE_fieldDeclaration          = 27
	MQLParserRULE_fieldName                 = 28
	MQLParserRULE_functionName              = 29
	MQLParserRULE_functionArgumentName      = 30
	MQLParserRULE_multipartFieldDeclaration = 31
	MQLParserRULE_multipartFieldName        = 32
	MQLParserRULE_variableName              = 33
)

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
	p.EnterRule(localctx, 0, MQLParserRULE_statement)

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

	p.SetState(72)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 0, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(68)
			p.QueryStatement()
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(69)
			p.ShowCollectionsStatement()
		}

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(70)
			p.ShowDatabasesStatement()
		}

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(71)
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
	p.EnterRule(localctx, 2, MQLParserRULE_queryStatement)

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
		p.SetState(74)
		p.Match(MQLParserFROM)
	}
	{
		p.SetState(75)
		p.CollectionName()
	}
	{
		p.SetState(76)
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
	p.EnterRule(localctx, 4, MQLParserRULE_pipeline)
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
	p.SetState(81)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for ((_la-40)&-(0x1f+1)) == 0 && ((1<<uint((_la-40)))&((1<<(MQLParserGROUP-40))|(1<<(MQLParserLIMIT-40))|(1<<(MQLParserLOOKUP-40))|(1<<(MQLParserMATCH-40))|(1<<(MQLParserPROJECT-40))|(1<<(MQLParserSKIP_-40))|(1<<(MQLParserSORT-40))|(1<<(MQLParserUNWIND-40)))) != 0 {
		{
			p.SetState(78)
			p.QueryStage()
		}

		p.SetState(83)
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
	p.EnterRule(localctx, 6, MQLParserRULE_showCollectionsStatement)
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
		p.SetState(84)
		p.Match(MQLParserSHOW)
	}
	{
		p.SetState(85)
		p.Match(MQLParserCOLLECTIONS)
	}
	p.SetState(88)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserIN {
		{
			p.SetState(86)
			p.Match(MQLParserIN)
		}
		{
			p.SetState(87)
			p.DatabaseName()
		}

	}
	p.SetState(92)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserMATCH {
		{
			p.SetState(90)
			p.Match(MQLParserMATCH)
		}
		{
			p.SetState(91)
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
	p.EnterRule(localctx, 8, MQLParserRULE_showDatabasesStatement)
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
		p.SetState(94)
		p.Match(MQLParserSHOW)
	}
	{
		p.SetState(95)
		p.Match(MQLParserDATABASES)
	}
	p.SetState(98)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserMATCH {
		{
			p.SetState(96)
			p.Match(MQLParserMATCH)
		}
		{
			p.SetState(97)
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
	p.EnterRule(localctx, 10, MQLParserRULE_useDatabaseStatement)

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
		p.SetState(100)
		p.Match(MQLParserUSE)
	}
	{
		p.SetState(101)
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
	p.EnterRule(localctx, 12, MQLParserRULE_queryStage)
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

	p.SetState(179)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserGROUP:
		localctx = NewGroupStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(103)
			p.Match(MQLParserGROUP)
		}
		{
			p.SetState(104)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(105)
			p.FieldAssignment()
		}
		p.SetState(110)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(106)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(107)
				p.FieldAssignment()
			}

			p.SetState(112)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(113)
			p.Match(MQLParserRBRACE)
		}
		p.SetState(116)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		if _la == MQLParserBY {
			{
				p.SetState(114)
				p.Match(MQLParserBY)
			}
			{
				p.SetState(115)
				p.expression(0)
			}

		}

	case MQLParserLIMIT:
		localctx = NewLimitStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(118)
			p.Match(MQLParserLIMIT)
		}
		{
			p.SetState(119)
			p.Match(MQLParserINT)
		}

	case MQLParserLOOKUP:
		localctx = NewLookupStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(120)
			p.Match(MQLParserLOOKUP)
		}
		{
			p.SetState(121)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(122)
			p.MultipartFieldDeclaration()
		}
		{
			p.SetState(123)
			p.Match(MQLParserCOLON)
		}
		p.SetState(136)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		if _la == MQLParserLBRACE {
			{
				p.SetState(124)
				p.Match(MQLParserLBRACE)
			}
			{
				p.SetState(125)
				p.VariableAssignment()
			}
			p.SetState(130)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)

			for _la == MQLParserCOMMA {
				{
					p.SetState(126)
					p.Match(MQLParserCOMMA)
				}
				{
					p.SetState(127)
					p.VariableAssignment()
				}

				p.SetState(132)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)
			}
			{
				p.SetState(133)
				p.Match(MQLParserRBRACE)
			}
			{
				p.SetState(134)
				p.Match(MQLParserARROW)
			}

		}
		{
			p.SetState(138)
			p.QueryStatement()
		}
		{
			p.SetState(139)
			p.Match(MQLParserRBRACE)
		}

	case MQLParserMATCH:
		localctx = NewMatchStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(141)
			p.Match(MQLParserMATCH)
		}
		{
			p.SetState(142)
			p.expression(0)
		}

	case MQLParserPROJECT:
		localctx = NewProjectStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(143)
			p.Match(MQLParserPROJECT)
		}
		{
			p.SetState(144)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(145)
			p.ProjectItem()
		}
		p.SetState(150)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(146)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(147)
				p.ProjectItem()
			}

			p.SetState(152)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(153)
			p.Match(MQLParserRBRACE)
		}

	case MQLParserSKIP_:
		localctx = NewSkipStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(155)
			p.Match(MQLParserSKIP_)
		}
		{
			p.SetState(156)
			p.Match(MQLParserINT)
		}

	case MQLParserSORT:
		localctx = NewSortStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(157)
			p.Match(MQLParserSORT)
		}
		{
			p.SetState(158)
			p.SortField()
		}
		p.SetState(163)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(159)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(160)
				p.SortField()
			}

			p.SetState(165)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	case MQLParserUNWIND:
		localctx = NewUnwindStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(166)
			p.Match(MQLParserUNWIND)
		}
		{
			p.SetState(167)
			p.MultipartFieldName()
		}
		p.SetState(177)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		if _la == MQLParserWITH {
			{
				p.SetState(168)
				p.Match(MQLParserWITH)
			}
			{
				p.SetState(169)
				p.Match(MQLParserLPAREN)
			}
			p.SetState(171)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)

			for ok := true; ok; ok = _la == MQLParserINDEX || _la == MQLParserPRESERVE_NULL_AND_EMPTY {
				{
					p.SetState(170)
					p.UnwindOption()
				}

				p.SetState(173)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)
			}
			{
				p.SetState(175)
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
	p.EnterRule(localctx, 14, MQLParserRULE_projectItem)

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

	p.SetState(188)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 14, p.GetParserRuleContext()) {
	case 1:
		localctx = NewExcludeProjectItemContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(181)
			p.Match(MQLParserEXCLUDE)
		}
		{
			p.SetState(182)
			p.MultipartFieldDeclaration()
		}

	case 2:
		localctx = NewIncludeProjectItemContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(183)
			p.MultipartFieldDeclaration()
		}

	case 3:
		localctx = NewAssignProjectItemContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(184)
			p.FieldDeclaration()
		}
		{
			p.SetState(185)
			p.Match(MQLParserCOLON)
		}
		{
			p.SetState(186)
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
	p.EnterRule(localctx, 16, MQLParserRULE_sortField)
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
		p.SetState(190)
		p.MultipartFieldName()
	}
	p.SetState(192)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserASC || _la == MQLParserDESC {
		{
			p.SetState(191)
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
	p.EnterRule(localctx, 18, MQLParserRULE_unwindOption)

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

	p.SetState(197)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserINDEX:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(194)
			p.Match(MQLParserINDEX)
		}
		{
			p.SetState(195)
			p.MultipartFieldDeclaration()
		}

	case MQLParserPRESERVE_NULL_AND_EMPTY:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(196)
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
	end   IExpressionContext
	step  IExpressionContext
}

func NewArrayAccessExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *ArrayAccessExpressionContext {
	var p = new(ArrayAccessExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *ArrayAccessExpressionContext) GetIndex() IExpressionContext { return s.index }

func (s *ArrayAccessExpressionContext) GetEnd() IExpressionContext { return s.end }

func (s *ArrayAccessExpressionContext) GetStep() IExpressionContext { return s.step }

func (s *ArrayAccessExpressionContext) SetIndex(v IExpressionContext) { s.index = v }

func (s *ArrayAccessExpressionContext) SetEnd(v IExpressionContext) { s.end = v }

func (s *ArrayAccessExpressionContext) SetStep(v IExpressionContext) { s.step = v }

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
	_startState := 20
	p.EnterRecursionRule(localctx, 20, MQLParserRULE_expression, _p)
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
	p.SetState(244)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 20, p.GetParserRuleContext()) {
	case 1:
		localctx = NewUnaryMinusExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx

		{
			p.SetState(200)
			p.Match(MQLParserMINUS)
		}
		{
			p.SetState(201)
			p.expression(24)
		}

	case 2:
		localctx = NewNotExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(202)
			p.Match(MQLParserNOT)
		}
		{
			p.SetState(203)
			p.expression(23)
		}

	case 3:
		localctx = NewSwitchExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(204)
			p.Match(MQLParserSWITCH)
		}
		p.SetState(206)
		p.GetErrorHandler().Sync(p)
		_alt = 1
		for ok := true; ok; ok = _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
			switch _alt {
			case 1:
				{
					p.SetState(205)
					p.SwitchCase()
				}

			default:
				panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
			}

			p.SetState(208)
			p.GetErrorHandler().Sync(p)
			_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 17, p.GetParserRuleContext())
		}
		p.SetState(212)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 18, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(210)
				p.Match(MQLParserELSE)
			}
			{
				p.SetState(211)
				p.expression(0)
			}

		}

	case 4:
		localctx = NewConditionalExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(214)
			p.Match(MQLParserIF)
		}
		{
			p.SetState(215)
			p.expression(0)
		}
		{
			p.SetState(216)
			p.Match(MQLParserTHEN)
		}
		{
			p.SetState(217)
			p.expression(0)
		}
		{
			p.SetState(218)
			p.Match(MQLParserELSE)
		}
		{
			p.SetState(219)
			p.expression(9)
		}

	case 5:
		localctx = NewLetExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(221)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(222)
			p.VariableAssignment()
		}
		p.SetState(227)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(223)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(224)
				p.VariableAssignment()
			}

			p.SetState(229)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(230)
			p.Match(MQLParserRBRACE)
		}
		{
			p.SetState(231)
			p.Match(MQLParserARROW)
		}
		{
			p.SetState(232)
			p.expression(8)
		}

	case 6:
		localctx = NewParenthesisExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(234)
			p.Match(MQLParserLPAREN)
		}
		{
			p.SetState(235)
			p.expression(0)
		}
		{
			p.SetState(236)
			p.Match(MQLParserRPAREN)
		}

	case 7:
		localctx = NewFunctionExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(238)
			p.Function()
		}

	case 8:
		localctx = NewFieldExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(239)
			p.FieldName()
		}

	case 9:
		localctx = NewVariableExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(240)
			p.VariableName()
		}

	case 10:
		localctx = NewDocumentExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(241)
			p.Document()
		}

	case 11:
		localctx = NewArrayExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(242)
			p.Array()
		}

	case 12:
		localctx = NewValueExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(243)
			p.Value()
		}

	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(311)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 29, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(309)
			p.GetErrorHandler().Sync(p)
			switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 28, p.GetParserRuleContext()) {
			case 1:
				localctx = NewPowerExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(246)

				if !(p.Precpred(p.GetParserRuleContext(), 25)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 25)", ""))
				}
				{
					p.SetState(247)
					p.Match(MQLParserPOWER)
				}
				{
					p.SetState(248)
					p.expression(25)
				}

			case 2:
				localctx = NewMultiplicationExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(249)

				if !(p.Precpred(p.GetParserRuleContext(), 18)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 18)", ""))
				}
				{
					p.SetState(250)

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
					p.SetState(251)
					p.expression(19)
				}

			case 3:
				localctx = NewAdditionExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(252)

				if !(p.Precpred(p.GetParserRuleContext(), 17)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 17)", ""))
				}
				{
					p.SetState(253)

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
					p.SetState(254)
					p.expression(18)
				}

			case 4:
				localctx = NewComparisonExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(255)

				if !(p.Precpred(p.GetParserRuleContext(), 16)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 16)", ""))
				}
				{
					p.SetState(256)

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
					p.SetState(257)
					p.expression(17)
				}

			case 5:
				localctx = NewAndExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(258)

				if !(p.Precpred(p.GetParserRuleContext(), 15)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 15)", ""))
				}
				{
					p.SetState(259)
					p.Match(MQLParserAND)
				}
				{
					p.SetState(260)
					p.expression(16)
				}

			case 6:
				localctx = NewOrExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(261)

				if !(p.Precpred(p.GetParserRuleContext(), 14)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 14)", ""))
				}
				{
					p.SetState(262)
					_la = p.GetTokenStream().LA(1)

					if !(_la == MQLParserNOR || _la == MQLParserOR) {
						p.GetErrorHandler().RecoverInline(p)
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(263)
					p.expression(15)
				}

			case 7:
				localctx = NewConcatExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(264)

				if !(p.Precpred(p.GetParserRuleContext(), 13)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 13)", ""))
				}
				{
					p.SetState(265)
					p.Match(MQLParserCONCAT)
				}
				{
					p.SetState(266)
					p.expression(14)
				}

			case 8:
				localctx = NewNullCoalesceExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(267)

				if !(p.Precpred(p.GetParserRuleContext(), 12)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 12)", ""))
				}
				{
					p.SetState(268)
					p.Match(MQLParserDQUESTION)
				}
				{
					p.SetState(269)
					p.expression(13)
				}

			case 9:
				localctx = NewMemberExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(270)

				if !(p.Precpred(p.GetParserRuleContext(), 22)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 22)", ""))
				}
				{
					p.SetState(271)
					p.Match(MQLParserDOT)
				}
				p.SetState(274)
				p.GetErrorHandler().Sync(p)
				switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 21, p.GetParserRuleContext()) {
				case 1:
					{
						p.SetState(272)
						p.FieldName()
					}

				case 2:
					{
						p.SetState(273)
						p.Function()
					}

				}

			case 10:
				localctx = NewArrayAccessExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(276)

				if !(p.Precpred(p.GetParserRuleContext(), 21)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 21)", ""))
				}
				{
					p.SetState(277)
					p.Match(MQLParserLBRACK)
				}
				p.SetState(290)
				p.GetErrorHandler().Sync(p)
				switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 25, p.GetParserRuleContext()) {
				case 1:
					{
						p.SetState(278)

						var _x = p.expression(0)

						localctx.(*ArrayAccessExpressionContext).index = _x
					}

				case 2:
					p.SetState(280)
					p.GetErrorHandler().Sync(p)
					_la = p.GetTokenStream().LA(1)

					if (((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<MQLParserLBRACE)|(1<<MQLParserLBRACK)|(1<<MQLParserLPAREN)|(1<<MQLParserMINUS))) != 0) || (((_la-38)&-(0x1f+1)) == 0 && ((1<<uint((_la-38)))&((1<<(MQLParserFALSE-38))|(1<<(MQLParserIF-38))|(1<<(MQLParserNOT-38))|(1<<(MQLParserNULL-38))|(1<<(MQLParserSWITCH-38))|(1<<(MQLParserTRUE-38)))) != 0) || (((_la-71)&-(0x1f+1)) == 0 && ((1<<uint((_la-71)))&((1<<(MQLParserREGEX-71))|(1<<(MQLParserINT-71))|(1<<(MQLParserDOUBLE-71))|(1<<(MQLParserDECIMAL-71))|(1<<(MQLParserLONG-71))|(1<<(MQLParserBIN-71))|(1<<(MQLParserLONG_BIN-71))|(1<<(MQLParserHEX-71))|(1<<(MQLParserLONG_HEX-71))|(1<<(MQLParserOCT-71))|(1<<(MQLParserLONG_OCT-71))|(1<<(MQLParserOID-71))|(1<<(MQLParserID-71))|(1<<(MQLParserSTRING-71))|(1<<(MQLParserVARIABLE_ID-71))|(1<<(MQLParserDATE_TIME-71)))) != 0) {
						{
							p.SetState(279)

							var _x = p.expression(0)

							localctx.(*ArrayAccessExpressionContext).index = _x
						}

					}
					{
						p.SetState(282)
						p.Match(MQLParserRANGE)
					}
					p.SetState(284)
					p.GetErrorHandler().Sync(p)
					_la = p.GetTokenStream().LA(1)

					if (((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<MQLParserLBRACE)|(1<<MQLParserLBRACK)|(1<<MQLParserLPAREN)|(1<<MQLParserMINUS))) != 0) || (((_la-38)&-(0x1f+1)) == 0 && ((1<<uint((_la-38)))&((1<<(MQLParserFALSE-38))|(1<<(MQLParserIF-38))|(1<<(MQLParserNOT-38))|(1<<(MQLParserNULL-38))|(1<<(MQLParserSWITCH-38))|(1<<(MQLParserTRUE-38)))) != 0) || (((_la-71)&-(0x1f+1)) == 0 && ((1<<uint((_la-71)))&((1<<(MQLParserREGEX-71))|(1<<(MQLParserINT-71))|(1<<(MQLParserDOUBLE-71))|(1<<(MQLParserDECIMAL-71))|(1<<(MQLParserLONG-71))|(1<<(MQLParserBIN-71))|(1<<(MQLParserLONG_BIN-71))|(1<<(MQLParserHEX-71))|(1<<(MQLParserLONG_HEX-71))|(1<<(MQLParserOCT-71))|(1<<(MQLParserLONG_OCT-71))|(1<<(MQLParserOID-71))|(1<<(MQLParserID-71))|(1<<(MQLParserSTRING-71))|(1<<(MQLParserVARIABLE_ID-71))|(1<<(MQLParserDATE_TIME-71)))) != 0) {
						{
							p.SetState(283)

							var _x = p.expression(0)

							localctx.(*ArrayAccessExpressionContext).end = _x
						}

					}
					p.SetState(288)
					p.GetErrorHandler().Sync(p)
					_la = p.GetTokenStream().LA(1)

					if _la == MQLParserCOLON {
						{
							p.SetState(286)
							p.Match(MQLParserCOLON)
						}
						{
							p.SetState(287)

							var _x = p.expression(0)

							localctx.(*ArrayAccessExpressionContext).step = _x
						}

					}

				}
				{
					p.SetState(292)
					p.Match(MQLParserRBRACK)
				}

			case 11:
				localctx = NewRangeExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(293)

				if !(p.Precpred(p.GetParserRuleContext(), 20)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 20)", ""))
				}
				{
					p.SetState(294)
					p.Match(MQLParserRANGE)
				}
				{
					p.SetState(295)
					p.expression(0)
				}
				p.SetState(298)
				p.GetErrorHandler().Sync(p)

				if p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 26, p.GetParserRuleContext()) == 1 {
					{
						p.SetState(296)
						p.Match(MQLParserCOLON)
					}
					{
						p.SetState(297)
						p.expression(0)
					}

				}

			case 12:
				localctx = NewLikeExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(300)

				if !(p.Precpred(p.GetParserRuleContext(), 19)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 19)", ""))
				}
				{
					p.SetState(301)
					p.Match(MQLParserLIKE)
				}
				{
					p.SetState(302)
					p.Match(MQLParserREGEX)
				}

			case 13:
				localctx = NewInExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(303)

				if !(p.Precpred(p.GetParserRuleContext(), 11)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 11)", ""))
				}
				p.SetState(305)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)

				if _la == MQLParserNOT {
					{
						p.SetState(304)
						p.Match(MQLParserNOT)
					}

				}
				{
					p.SetState(307)
					p.Match(MQLParserIN)
				}
				{
					p.SetState(308)
					p.Array()
				}

			}

		}
		p.SetState(313)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 29, p.GetParserRuleContext())
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
	p.EnterRule(localctx, 22, MQLParserRULE_array)
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
		p.SetState(314)
		p.Match(MQLParserLBRACK)
	}
	p.SetState(323)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if (((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<MQLParserLBRACE)|(1<<MQLParserLBRACK)|(1<<MQLParserLPAREN)|(1<<MQLParserMINUS))) != 0) || (((_la-38)&-(0x1f+1)) == 0 && ((1<<uint((_la-38)))&((1<<(MQLParserFALSE-38))|(1<<(MQLParserIF-38))|(1<<(MQLParserNOT-38))|(1<<(MQLParserNULL-38))|(1<<(MQLParserSWITCH-38))|(1<<(MQLParserTRUE-38)))) != 0) || (((_la-71)&-(0x1f+1)) == 0 && ((1<<uint((_la-71)))&((1<<(MQLParserREGEX-71))|(1<<(MQLParserINT-71))|(1<<(MQLParserDOUBLE-71))|(1<<(MQLParserDECIMAL-71))|(1<<(MQLParserLONG-71))|(1<<(MQLParserBIN-71))|(1<<(MQLParserLONG_BIN-71))|(1<<(MQLParserHEX-71))|(1<<(MQLParserLONG_HEX-71))|(1<<(MQLParserOCT-71))|(1<<(MQLParserLONG_OCT-71))|(1<<(MQLParserOID-71))|(1<<(MQLParserID-71))|(1<<(MQLParserSTRING-71))|(1<<(MQLParserVARIABLE_ID-71))|(1<<(MQLParserDATE_TIME-71)))) != 0) {
		{
			p.SetState(315)
			p.expression(0)
		}
		p.SetState(320)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(316)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(317)
				p.expression(0)
			}

			p.SetState(322)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}
	{
		p.SetState(325)
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
	p.EnterRule(localctx, 24, MQLParserRULE_document)
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
		p.SetState(327)
		p.Match(MQLParserLBRACE)
	}
	p.SetState(336)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserID {
		{
			p.SetState(328)
			p.FieldAssignment()
		}
		p.SetState(333)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(329)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(330)
				p.FieldAssignment()
			}

			p.SetState(335)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}
	{
		p.SetState(338)
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
	p.EnterRule(localctx, 26, MQLParserRULE_fieldAssignment)

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
		p.SetState(340)
		p.FieldDeclaration()
	}
	{
		p.SetState(341)
		p.Match(MQLParserCOLON)
	}
	{
		p.SetState(342)
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
	p.EnterRule(localctx, 28, MQLParserRULE_multipart_document)
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
		p.SetState(344)
		p.Match(MQLParserLBRACE)
	}
	p.SetState(353)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserID {
		{
			p.SetState(345)
			p.MultipartFieldAssignment()
		}
		p.SetState(350)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(346)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(347)
				p.MultipartFieldAssignment()
			}

			p.SetState(352)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}
	{
		p.SetState(355)
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
	p.EnterRule(localctx, 30, MQLParserRULE_multipartFieldAssignment)

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
		p.SetState(357)
		p.MultipartFieldDeclaration()
	}
	{
		p.SetState(358)
		p.Match(MQLParserCOLON)
	}
	{
		p.SetState(359)
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
	p.EnterRule(localctx, 32, MQLParserRULE_function)
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
		p.SetState(361)
		p.FunctionName()
	}
	{
		p.SetState(362)
		p.Match(MQLParserLPAREN)
	}
	p.SetState(364)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if (((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<MQLParserLBRACE)|(1<<MQLParserLBRACK)|(1<<MQLParserLPAREN)|(1<<MQLParserMINUS))) != 0) || (((_la-38)&-(0x1f+1)) == 0 && ((1<<uint((_la-38)))&((1<<(MQLParserFALSE-38))|(1<<(MQLParserIF-38))|(1<<(MQLParserNOT-38))|(1<<(MQLParserNULL-38))|(1<<(MQLParserSWITCH-38))|(1<<(MQLParserTRUE-38)))) != 0) || (((_la-71)&-(0x1f+1)) == 0 && ((1<<uint((_la-71)))&((1<<(MQLParserREGEX-71))|(1<<(MQLParserINT-71))|(1<<(MQLParserDOUBLE-71))|(1<<(MQLParserDECIMAL-71))|(1<<(MQLParserLONG-71))|(1<<(MQLParserBIN-71))|(1<<(MQLParserLONG_BIN-71))|(1<<(MQLParserHEX-71))|(1<<(MQLParserLONG_HEX-71))|(1<<(MQLParserOCT-71))|(1<<(MQLParserLONG_OCT-71))|(1<<(MQLParserOID-71))|(1<<(MQLParserID-71))|(1<<(MQLParserSTRING-71))|(1<<(MQLParserVARIABLE_ID-71))|(1<<(MQLParserDATE_TIME-71)))) != 0) {
		{
			p.SetState(363)
			p.FunctionArguments()
		}

	}
	{
		p.SetState(366)
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
	p.EnterRule(localctx, 34, MQLParserRULE_functionArguments)
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

	p.SetState(384)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 39, p.GetParserRuleContext()) {
	case 1:
		localctx = NewFunctionArrayArgumentsContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(368)
			p.expression(0)
		}
		p.SetState(373)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(369)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(370)
				p.expression(0)
			}

			p.SetState(375)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	case 2:
		localctx = NewFunctionDocumentArgumentsContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(376)
			p.FunctionNamedArgument()
		}
		p.SetState(381)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(377)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(378)
				p.FunctionNamedArgument()
			}

			p.SetState(383)
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
	p.EnterRule(localctx, 36, MQLParserRULE_functionNamedArgument)

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
		p.SetState(386)
		p.FunctionArgumentName()
	}
	{
		p.SetState(387)
		p.Match(MQLParserCOLON)
	}
	{
		p.SetState(388)
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
	p.EnterRule(localctx, 38, MQLParserRULE_lambdaArgument)

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

	p.SetState(392)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserVARIABLE_ID:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(390)
			p.VariableName()
		}

	case MQLParserUNDERSCORE:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(391)
			p.Match(MQLParserUNDERSCORE)
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// ILambdaExpressionContext is an interface to support dynamic dispatch.
type ILambdaExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsLambdaExpressionContext differentiates from other interfaces.
	IsLambdaExpressionContext()
}

type LambdaExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyLambdaExpressionContext() *LambdaExpressionContext {
	var p = new(LambdaExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_lambdaExpression
	return p
}

func (*LambdaExpressionContext) IsLambdaExpressionContext() {}

func NewLambdaExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *LambdaExpressionContext {
	var p = new(LambdaExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_lambdaExpression

	return p
}

func (s *LambdaExpressionContext) GetParser() antlr.Parser { return s.parser }

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

func (s *LambdaExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LambdaExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *LambdaExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitLambdaExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) LambdaExpression() (localctx ILambdaExpressionContext) {
	localctx = NewLambdaExpressionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 40, MQLParserRULE_lambdaExpression)
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

	p.SetState(411)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserUNDERSCORE, MQLParserVARIABLE_ID:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(394)
			p.LambdaArgument()
		}
		{
			p.SetState(395)
			p.Match(MQLParserARROW)
		}
		{
			p.SetState(396)
			p.expression(0)
		}

	case MQLParserLPAREN:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(398)
			p.Match(MQLParserLPAREN)
		}
		{
			p.SetState(399)
			p.LambdaArgument()
		}
		p.SetState(404)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(400)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(401)
				p.LambdaArgument()
			}

			p.SetState(406)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(407)
			p.Match(MQLParserRPAREN)
		}
		{
			p.SetState(408)
			p.Match(MQLParserARROW)
		}
		{
			p.SetState(409)
			p.expression(0)
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
	p.EnterRule(localctx, 42, MQLParserRULE_switchCase)

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
		p.SetState(413)
		p.Match(MQLParserCASE)
	}
	{
		p.SetState(414)
		p.expression(0)
	}
	{
		p.SetState(415)
		p.Match(MQLParserTHEN)
	}
	{
		p.SetState(416)
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
	p.EnterRule(localctx, 44, MQLParserRULE_variableAssignment)

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
		p.SetState(418)
		p.VariableName()
	}
	{
		p.SetState(419)
		p.Match(MQLParserCOLON)
	}
	{
		p.SetState(420)
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
	p.EnterRule(localctx, 46, MQLParserRULE_value)
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

	p.SetState(429)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserINT, MQLParserDOUBLE, MQLParserDECIMAL, MQLParserLONG, MQLParserBIN, MQLParserLONG_BIN, MQLParserHEX, MQLParserLONG_HEX, MQLParserOCT, MQLParserLONG_OCT:
		localctx = NewNumberValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(422)
			p.Number()
		}

	case MQLParserSTRING:
		localctx = NewStringValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(423)
			p.Match(MQLParserSTRING)
		}

	case MQLParserFALSE, MQLParserTRUE:
		localctx = NewBooleanValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(424)
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
			p.SetState(425)
			p.Match(MQLParserNULL)
		}

	case MQLParserOID:
		localctx = NewOidValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(426)
			p.Match(MQLParserOID)
		}

	case MQLParserDATE_TIME:
		localctx = NewDateTimeValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(427)
			p.Match(MQLParserDATE_TIME)
		}

	case MQLParserREGEX:
		localctx = NewRegexValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(428)
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
	p.EnterRule(localctx, 48, MQLParserRULE_number)

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

	p.SetState(441)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserINT:
		localctx = NewIntValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(431)
			p.Match(MQLParserINT)
		}

	case MQLParserLONG:
		localctx = NewLongValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(432)
			p.Match(MQLParserLONG)
		}

	case MQLParserDOUBLE:
		localctx = NewDoubleValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(433)
			p.Match(MQLParserDOUBLE)
		}

	case MQLParserDECIMAL:
		localctx = NewDecimalValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(434)
			p.Match(MQLParserDECIMAL)
		}

	case MQLParserBIN:
		localctx = NewBinValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(435)
			p.Match(MQLParserBIN)
		}

	case MQLParserLONG_BIN:
		localctx = NewLongBinValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(436)
			p.Match(MQLParserLONG_BIN)
		}

	case MQLParserHEX:
		localctx = NewHexValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(437)
			p.Match(MQLParserHEX)
		}

	case MQLParserLONG_HEX:
		localctx = NewLongHexValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(438)
			p.Match(MQLParserLONG_HEX)
		}

	case MQLParserOCT:
		localctx = NewOctValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(439)
			p.Match(MQLParserOCT)
		}

	case MQLParserLONG_OCT:
		localctx = NewLongOctValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(440)
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
	p.EnterRule(localctx, 50, MQLParserRULE_collectionName)

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
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 45, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(443)
			p.Match(MQLParserID)
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(444)
			p.DatabaseName()
		}
		{
			p.SetState(445)
			p.Match(MQLParserDOT)
		}
		{
			p.SetState(446)
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
	p.EnterRule(localctx, 52, MQLParserRULE_databaseName)

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
		p.SetState(450)
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
	p.EnterRule(localctx, 54, MQLParserRULE_fieldDeclaration)

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
		p.SetState(452)
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
	p.EnterRule(localctx, 56, MQLParserRULE_fieldName)

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
		p.SetState(454)
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
	p.EnterRule(localctx, 58, MQLParserRULE_functionName)

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
		p.SetState(456)
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
	p.EnterRule(localctx, 60, MQLParserRULE_functionArgumentName)

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
		p.SetState(458)
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
	p.EnterRule(localctx, 62, MQLParserRULE_multipartFieldDeclaration)
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
		p.SetState(460)
		p.FieldDeclaration()
	}
	p.SetState(465)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == MQLParserDOT {
		{
			p.SetState(461)
			p.Match(MQLParserDOT)
		}
		{
			p.SetState(462)
			p.FieldDeclaration()
		}

		p.SetState(467)
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
	p.EnterRule(localctx, 64, MQLParserRULE_multipartFieldName)
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
		p.SetState(468)
		p.FieldName()
	}
	p.SetState(473)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == MQLParserDOT {
		{
			p.SetState(469)
			p.Match(MQLParserDOT)
		}
		{
			p.SetState(470)
			p.FieldName()
		}

		p.SetState(475)
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
	p.EnterRule(localctx, 66, MQLParserRULE_variableName)

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
		p.SetState(476)
		p.Match(MQLParserVARIABLE_ID)
	}

	return localctx
}

func (p *MQLParser) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 10:
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
		return p.Precpred(p.GetParserRuleContext(), 25)

	case 1:
		return p.Precpred(p.GetParserRuleContext(), 18)

	case 2:
		return p.Precpred(p.GetParserRuleContext(), 17)

	case 3:
		return p.Precpred(p.GetParserRuleContext(), 16)

	case 4:
		return p.Precpred(p.GetParserRuleContext(), 15)

	case 5:
		return p.Precpred(p.GetParserRuleContext(), 14)

	case 6:
		return p.Precpred(p.GetParserRuleContext(), 13)

	case 7:
		return p.Precpred(p.GetParserRuleContext(), 12)

	case 8:
		return p.Precpred(p.GetParserRuleContext(), 22)

	case 9:
		return p.Precpred(p.GetParserRuleContext(), 21)

	case 10:
		return p.Precpred(p.GetParserRuleContext(), 20)

	case 11:
		return p.Precpred(p.GetParserRuleContext(), 19)

	case 12:
		return p.Precpred(p.GetParserRuleContext(), 11)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
