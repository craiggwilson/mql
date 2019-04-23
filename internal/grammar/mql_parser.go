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
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 83, 426,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 4, 13,
	9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4, 18, 9,
	18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23, 9, 23,
	4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9, 28, 3,
	2, 3, 2, 3, 2, 7, 2, 60, 10, 2, 12, 2, 14, 2, 63, 11, 2, 3, 3, 3, 3, 3,
	3, 3, 3, 3, 3, 7, 3, 70, 10, 3, 12, 3, 14, 3, 73, 11, 3, 3, 3, 3, 3, 3,
	3, 5, 3, 78, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
	3, 3, 3, 7, 3, 90, 10, 3, 12, 3, 14, 3, 93, 11, 3, 3, 3, 3, 3, 3, 3, 5,
	3, 98, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
	3, 7, 3, 110, 10, 3, 12, 3, 14, 3, 113, 11, 3, 3, 3, 3, 3, 3, 3, 3, 3,
	3, 3, 3, 3, 3, 3, 3, 3, 7, 3, 123, 10, 3, 12, 3, 14, 3, 126, 11, 3, 3,
	3, 3, 3, 3, 3, 3, 3, 6, 3, 132, 10, 3, 13, 3, 14, 3, 133, 5, 3, 136, 10,
	3, 5, 3, 138, 10, 3, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 5, 4, 147,
	10, 4, 3, 5, 3, 5, 5, 5, 151, 10, 5, 3, 6, 3, 6, 3, 6, 5, 6, 156, 10, 6,
	3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 6, 7, 165, 10, 7, 13, 7, 14,
	7, 166, 3, 7, 3, 7, 5, 7, 171, 10, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3,
	7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 7, 7, 184, 10, 7, 12, 7, 14, 7, 187, 11,
	7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3,
	7, 3, 7, 3, 7, 3, 7, 3, 7, 7, 7, 205, 10, 7, 12, 7, 14, 7, 208, 11, 7,
	5, 7, 210, 10, 7, 3, 7, 3, 7, 5, 7, 214, 10, 7, 3, 7, 3, 7, 3, 7, 3, 7,
	3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7,
	3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 5, 7, 242,
	10, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 5, 7, 250, 10, 7, 3, 7, 3, 7,
	3, 7, 3, 7, 5, 7, 256, 10, 7, 3, 7, 3, 7, 5, 7, 260, 10, 7, 3, 7, 3, 7,
	5, 7, 264, 10, 7, 5, 7, 266, 10, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7,
	5, 7, 274, 10, 7, 3, 7, 3, 7, 3, 7, 7, 7, 279, 10, 7, 12, 7, 14, 7, 282,
	11, 7, 3, 8, 3, 8, 3, 8, 3, 8, 7, 8, 288, 10, 8, 12, 8, 14, 8, 291, 11,
	8, 5, 8, 293, 10, 8, 3, 8, 3, 8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 10, 3, 10,
	3, 10, 3, 10, 7, 10, 305, 10, 10, 12, 10, 14, 10, 308, 11, 10, 5, 10, 310,
	10, 10, 3, 10, 3, 10, 3, 11, 3, 11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 12,
	3, 12, 3, 12, 7, 12, 323, 10, 12, 12, 12, 14, 12, 326, 11, 12, 5, 12, 328,
	10, 12, 3, 12, 3, 12, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 5, 13,
	338, 10, 13, 3, 14, 3, 14, 5, 14, 342, 10, 14, 3, 15, 3, 15, 3, 15, 3,
	15, 3, 15, 3, 15, 3, 15, 3, 15, 7, 15, 352, 10, 15, 12, 15, 14, 15, 355,
	11, 15, 3, 15, 3, 15, 3, 15, 3, 15, 5, 15, 361, 10, 15, 3, 16, 3, 16, 3,
	16, 3, 16, 3, 16, 3, 17, 3, 17, 3, 17, 3, 17, 3, 18, 3, 18, 3, 18, 3, 18,
	3, 18, 3, 18, 3, 18, 5, 18, 379, 10, 18, 3, 19, 3, 19, 3, 19, 3, 19, 3,
	19, 3, 19, 3, 19, 3, 19, 5, 19, 389, 10, 19, 3, 20, 3, 20, 3, 20, 3, 20,
	3, 20, 5, 20, 396, 10, 20, 3, 21, 3, 21, 3, 22, 3, 22, 3, 23, 3, 23, 3,
	24, 3, 24, 3, 25, 3, 25, 3, 26, 3, 26, 3, 26, 7, 26, 411, 10, 26, 12, 26,
	14, 26, 414, 11, 26, 3, 27, 3, 27, 3, 27, 7, 27, 419, 10, 27, 12, 27, 14,
	27, 422, 11, 27, 3, 28, 3, 28, 3, 28, 2, 3, 12, 29, 2, 4, 6, 8, 10, 12,
	14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48,
	50, 52, 54, 2, 8, 4, 2, 32, 32, 36, 36, 5, 2, 7, 7, 19, 19, 21, 21, 4,
	2, 18, 18, 24, 24, 5, 2, 10, 12, 16, 17, 22, 22, 4, 2, 52, 52, 56, 56,
	4, 2, 38, 38, 64, 64, 2, 481, 2, 56, 3, 2, 2, 2, 4, 137, 3, 2, 2, 2, 6,
	146, 3, 2, 2, 2, 8, 148, 3, 2, 2, 2, 10, 155, 3, 2, 2, 2, 12, 213, 3, 2,
	2, 2, 14, 283, 3, 2, 2, 2, 16, 296, 3, 2, 2, 2, 18, 300, 3, 2, 2, 2, 20,
	313, 3, 2, 2, 2, 22, 317, 3, 2, 2, 2, 24, 337, 3, 2, 2, 2, 26, 341, 3,
	2, 2, 2, 28, 360, 3, 2, 2, 2, 30, 362, 3, 2, 2, 2, 32, 367, 3, 2, 2, 2,
	34, 378, 3, 2, 2, 2, 36, 388, 3, 2, 2, 2, 38, 395, 3, 2, 2, 2, 40, 397,
	3, 2, 2, 2, 42, 399, 3, 2, 2, 2, 44, 401, 3, 2, 2, 2, 46, 403, 3, 2, 2,
	2, 48, 405, 3, 2, 2, 2, 50, 407, 3, 2, 2, 2, 52, 415, 3, 2, 2, 2, 54, 423,
	3, 2, 2, 2, 56, 57, 7, 39, 2, 2, 57, 61, 5, 38, 20, 2, 58, 60, 5, 4, 3,
	2, 59, 58, 3, 2, 2, 2, 60, 63, 3, 2, 2, 2, 61, 59, 3, 2, 2, 2, 61, 62,
	3, 2, 2, 2, 62, 3, 3, 2, 2, 2, 63, 61, 3, 2, 2, 2, 64, 65, 7, 40, 2, 2,
	65, 66, 7, 13, 2, 2, 66, 71, 5, 16, 9, 2, 67, 68, 7, 5, 2, 2, 68, 70, 5,
	16, 9, 2, 69, 67, 3, 2, 2, 2, 70, 73, 3, 2, 2, 2, 71, 69, 3, 2, 2, 2, 71,
	72, 3, 2, 2, 2, 72, 74, 3, 2, 2, 2, 73, 71, 3, 2, 2, 2, 74, 77, 7, 26,
	2, 2, 75, 76, 7, 33, 2, 2, 76, 78, 5, 12, 7, 2, 77, 75, 3, 2, 2, 2, 77,
	78, 3, 2, 2, 2, 78, 138, 3, 2, 2, 2, 79, 80, 7, 48, 2, 2, 80, 138, 7, 70,
	2, 2, 81, 82, 7, 49, 2, 2, 82, 83, 7, 13, 2, 2, 83, 84, 5, 50, 26, 2, 84,
	97, 7, 4, 2, 2, 85, 86, 7, 13, 2, 2, 86, 91, 5, 32, 17, 2, 87, 88, 7, 5,
	2, 2, 88, 90, 5, 32, 17, 2, 89, 87, 3, 2, 2, 2, 90, 93, 3, 2, 2, 2, 91,
	89, 3, 2, 2, 2, 91, 92, 3, 2, 2, 2, 92, 94, 3, 2, 2, 2, 93, 91, 3, 2, 2,
	2, 94, 95, 7, 26, 2, 2, 95, 96, 7, 3, 2, 2, 96, 98, 3, 2, 2, 2, 97, 85,
	3, 2, 2, 2, 97, 98, 3, 2, 2, 2, 98, 99, 3, 2, 2, 2, 99, 100, 5, 2, 2, 2,
	100, 101, 7, 26, 2, 2, 101, 138, 3, 2, 2, 2, 102, 103, 7, 51, 2, 2, 103,
	138, 5, 12, 7, 2, 104, 105, 7, 57, 2, 2, 105, 106, 7, 13, 2, 2, 106, 111,
	5, 6, 4, 2, 107, 108, 7, 5, 2, 2, 108, 110, 5, 6, 4, 2, 109, 107, 3, 2,
	2, 2, 110, 113, 3, 2, 2, 2, 111, 109, 3, 2, 2, 2, 111, 112, 3, 2, 2, 2,
	112, 114, 3, 2, 2, 2, 113, 111, 3, 2, 2, 2, 114, 115, 7, 26, 2, 2, 115,
	138, 3, 2, 2, 2, 116, 117, 7, 59, 2, 2, 117, 138, 7, 70, 2, 2, 118, 119,
	7, 60, 2, 2, 119, 124, 5, 8, 5, 2, 120, 121, 7, 5, 2, 2, 121, 123, 5, 8,
	5, 2, 122, 120, 3, 2, 2, 2, 123, 126, 3, 2, 2, 2, 124, 122, 3, 2, 2, 2,
	124, 125, 3, 2, 2, 2, 125, 138, 3, 2, 2, 2, 126, 124, 3, 2, 2, 2, 127,
	128, 7, 65, 2, 2, 128, 135, 5, 52, 27, 2, 129, 131, 7, 67, 2, 2, 130, 132,
	5, 10, 6, 2, 131, 130, 3, 2, 2, 2, 132, 133, 3, 2, 2, 2, 133, 131, 3, 2,
	2, 2, 133, 134, 3, 2, 2, 2, 134, 136, 3, 2, 2, 2, 135, 129, 3, 2, 2, 2,
	135, 136, 3, 2, 2, 2, 136, 138, 3, 2, 2, 2, 137, 64, 3, 2, 2, 2, 137, 79,
	3, 2, 2, 2, 137, 81, 3, 2, 2, 2, 137, 102, 3, 2, 2, 2, 137, 104, 3, 2,
	2, 2, 137, 116, 3, 2, 2, 2, 137, 118, 3, 2, 2, 2, 137, 127, 3, 2, 2, 2,
	138, 5, 3, 2, 2, 2, 139, 140, 7, 23, 2, 2, 140, 147, 5, 50, 26, 2, 141,
	147, 5, 50, 26, 2, 142, 143, 5, 42, 22, 2, 143, 144, 7, 4, 2, 2, 144, 145,
	5, 12, 7, 2, 145, 147, 3, 2, 2, 2, 146, 139, 3, 2, 2, 2, 146, 141, 3, 2,
	2, 2, 146, 142, 3, 2, 2, 2, 147, 7, 3, 2, 2, 2, 148, 150, 5, 52, 27, 2,
	149, 151, 9, 2, 2, 2, 150, 149, 3, 2, 2, 2, 150, 151, 3, 2, 2, 2, 151,
	9, 3, 2, 2, 2, 152, 153, 7, 43, 2, 2, 153, 156, 5, 50, 26, 2, 154, 156,
	7, 68, 2, 2, 155, 152, 3, 2, 2, 2, 155, 154, 3, 2, 2, 2, 156, 11, 3, 2,
	2, 2, 157, 158, 8, 7, 1, 2, 158, 159, 7, 18, 2, 2, 159, 214, 5, 12, 7,
	26, 160, 161, 7, 53, 2, 2, 161, 214, 5, 12, 7, 25, 162, 164, 7, 62, 2,
	2, 163, 165, 5, 30, 16, 2, 164, 163, 3, 2, 2, 2, 165, 166, 3, 2, 2, 2,
	166, 164, 3, 2, 2, 2, 166, 167, 3, 2, 2, 2, 167, 170, 3, 2, 2, 2, 168,
	169, 7, 37, 2, 2, 169, 171, 5, 12, 7, 2, 170, 168, 3, 2, 2, 2, 170, 171,
	3, 2, 2, 2, 171, 214, 3, 2, 2, 2, 172, 173, 7, 41, 2, 2, 173, 174, 5, 12,
	7, 2, 174, 175, 7, 63, 2, 2, 175, 176, 5, 12, 7, 2, 176, 177, 7, 37, 2,
	2, 177, 178, 5, 12, 7, 11, 178, 214, 3, 2, 2, 2, 179, 180, 7, 13, 2, 2,
	180, 185, 5, 32, 17, 2, 181, 182, 7, 5, 2, 2, 182, 184, 5, 32, 17, 2, 183,
	181, 3, 2, 2, 2, 184, 187, 3, 2, 2, 2, 185, 183, 3, 2, 2, 2, 185, 186,
	3, 2, 2, 2, 186, 188, 3, 2, 2, 2, 187, 185, 3, 2, 2, 2, 188, 189, 7, 26,
	2, 2, 189, 190, 7, 3, 2, 2, 190, 191, 5, 12, 7, 10, 191, 214, 3, 2, 2,
	2, 192, 193, 7, 15, 2, 2, 193, 194, 5, 12, 7, 2, 194, 195, 7, 28, 2, 2,
	195, 214, 3, 2, 2, 2, 196, 214, 5, 22, 12, 2, 197, 214, 5, 44, 23, 2, 198,
	214, 5, 54, 28, 2, 199, 214, 5, 14, 8, 2, 200, 209, 7, 14, 2, 2, 201, 206,
	5, 12, 7, 2, 202, 203, 7, 5, 2, 2, 203, 205, 5, 12, 7, 2, 204, 202, 3,
	2, 2, 2, 205, 208, 3, 2, 2, 2, 206, 204, 3, 2, 2, 2, 206, 207, 3, 2, 2,
	2, 207, 210, 3, 2, 2, 2, 208, 206, 3, 2, 2, 2, 209, 201, 3, 2, 2, 2, 209,
	210, 3, 2, 2, 2, 210, 211, 3, 2, 2, 2, 211, 214, 7, 27, 2, 2, 212, 214,
	5, 34, 18, 2, 213, 157, 3, 2, 2, 2, 213, 160, 3, 2, 2, 2, 213, 162, 3,
	2, 2, 2, 213, 172, 3, 2, 2, 2, 213, 179, 3, 2, 2, 2, 213, 192, 3, 2, 2,
	2, 213, 196, 3, 2, 2, 2, 213, 197, 3, 2, 2, 2, 213, 198, 3, 2, 2, 2, 213,
	199, 3, 2, 2, 2, 213, 200, 3, 2, 2, 2, 213, 212, 3, 2, 2, 2, 214, 280,
	3, 2, 2, 2, 215, 216, 12, 27, 2, 2, 216, 217, 7, 20, 2, 2, 217, 279, 5,
	12, 7, 27, 218, 219, 12, 20, 2, 2, 219, 220, 9, 3, 2, 2, 220, 279, 5, 12,
	7, 21, 221, 222, 12, 19, 2, 2, 222, 223, 9, 4, 2, 2, 223, 279, 5, 12, 7,
	20, 224, 225, 12, 18, 2, 2, 225, 226, 9, 5, 2, 2, 226, 279, 5, 12, 7, 19,
	227, 228, 12, 17, 2, 2, 228, 229, 7, 31, 2, 2, 229, 279, 5, 12, 7, 18,
	230, 231, 12, 16, 2, 2, 231, 232, 9, 6, 2, 2, 232, 279, 5, 12, 7, 17, 233,
	234, 12, 15, 2, 2, 234, 235, 7, 6, 2, 2, 235, 279, 5, 12, 7, 16, 236, 237,
	12, 14, 2, 2, 237, 238, 7, 9, 2, 2, 238, 279, 5, 12, 7, 15, 239, 241, 12,
	13, 2, 2, 240, 242, 7, 53, 2, 2, 241, 240, 3, 2, 2, 2, 241, 242, 3, 2,
	2, 2, 242, 243, 3, 2, 2, 2, 243, 244, 7, 42, 2, 2, 244, 279, 5, 12, 7,
	14, 245, 246, 12, 24, 2, 2, 246, 249, 7, 8, 2, 2, 247, 250, 5, 44, 23,
	2, 248, 250, 5, 22, 12, 2, 249, 247, 3, 2, 2, 2, 249, 248, 3, 2, 2, 2,
	250, 279, 3, 2, 2, 2, 251, 252, 12, 23, 2, 2, 252, 265, 7, 14, 2, 2, 253,
	266, 5, 12, 7, 2, 254, 256, 5, 12, 7, 2, 255, 254, 3, 2, 2, 2, 255, 256,
	3, 2, 2, 2, 256, 257, 3, 2, 2, 2, 257, 259, 7, 25, 2, 2, 258, 260, 5, 12,
	7, 2, 259, 258, 3, 2, 2, 2, 259, 260, 3, 2, 2, 2, 260, 263, 3, 2, 2, 2,
	261, 262, 7, 4, 2, 2, 262, 264, 5, 12, 7, 2, 263, 261, 3, 2, 2, 2, 263,
	264, 3, 2, 2, 2, 264, 266, 3, 2, 2, 2, 265, 253, 3, 2, 2, 2, 265, 255,
	3, 2, 2, 2, 266, 267, 3, 2, 2, 2, 267, 279, 7, 27, 2, 2, 268, 269, 12,
	22, 2, 2, 269, 270, 7, 25, 2, 2, 270, 273, 5, 12, 7, 2, 271, 272, 7, 4,
	2, 2, 272, 274, 5, 12, 7, 2, 273, 271, 3, 2, 2, 2, 273, 274, 3, 2, 2, 2,
	274, 279, 3, 2, 2, 2, 275, 276, 12, 21, 2, 2, 276, 277, 7, 47, 2, 2, 277,
	279, 7, 69, 2, 2, 278, 215, 3, 2, 2, 2, 278, 218, 3, 2, 2, 2, 278, 221,
	3, 2, 2, 2, 278, 224, 3, 2, 2, 2, 278, 227, 3, 2, 2, 2, 278, 230, 3, 2,
	2, 2, 278, 233, 3, 2, 2, 2, 278, 236, 3, 2, 2, 2, 278, 239, 3, 2, 2, 2,
	278, 245, 3, 2, 2, 2, 278, 251, 3, 2, 2, 2, 278, 268, 3, 2, 2, 2, 278,
	275, 3, 2, 2, 2, 279, 282, 3, 2, 2, 2, 280, 278, 3, 2, 2, 2, 280, 281,
	3, 2, 2, 2, 281, 13, 3, 2, 2, 2, 282, 280, 3, 2, 2, 2, 283, 292, 7, 13,
	2, 2, 284, 289, 5, 16, 9, 2, 285, 286, 7, 5, 2, 2, 286, 288, 5, 16, 9,
	2, 287, 285, 3, 2, 2, 2, 288, 291, 3, 2, 2, 2, 289, 287, 3, 2, 2, 2, 289,
	290, 3, 2, 2, 2, 290, 293, 3, 2, 2, 2, 291, 289, 3, 2, 2, 2, 292, 284,
	3, 2, 2, 2, 292, 293, 3, 2, 2, 2, 293, 294, 3, 2, 2, 2, 294, 295, 7, 26,
	2, 2, 295, 15, 3, 2, 2, 2, 296, 297, 5, 42, 22, 2, 297, 298, 7, 4, 2, 2,
	298, 299, 5, 12, 7, 2, 299, 17, 3, 2, 2, 2, 300, 309, 7, 13, 2, 2, 301,
	306, 5, 20, 11, 2, 302, 303, 7, 5, 2, 2, 303, 305, 5, 20, 11, 2, 304, 302,
	3, 2, 2, 2, 305, 308, 3, 2, 2, 2, 306, 304, 3, 2, 2, 2, 306, 307, 3, 2,
	2, 2, 307, 310, 3, 2, 2, 2, 308, 306, 3, 2, 2, 2, 309, 301, 3, 2, 2, 2,
	309, 310, 3, 2, 2, 2, 310, 311, 3, 2, 2, 2, 311, 312, 7, 26, 2, 2, 312,
	19, 3, 2, 2, 2, 313, 314, 5, 50, 26, 2, 314, 315, 7, 4, 2, 2, 315, 316,
	5, 12, 7, 2, 316, 21, 3, 2, 2, 2, 317, 318, 5, 46, 24, 2, 318, 327, 7,
	15, 2, 2, 319, 324, 5, 24, 13, 2, 320, 321, 7, 5, 2, 2, 321, 323, 5, 24,
	13, 2, 322, 320, 3, 2, 2, 2, 323, 326, 3, 2, 2, 2, 324, 322, 3, 2, 2, 2,
	324, 325, 3, 2, 2, 2, 325, 328, 3, 2, 2, 2, 326, 324, 3, 2, 2, 2, 327,
	319, 3, 2, 2, 2, 327, 328, 3, 2, 2, 2, 328, 329, 3, 2, 2, 2, 329, 330,
	7, 28, 2, 2, 330, 23, 3, 2, 2, 2, 331, 338, 5, 12, 7, 2, 332, 333, 5, 48,
	25, 2, 333, 334, 7, 4, 2, 2, 334, 335, 5, 12, 7, 2, 335, 338, 3, 2, 2,
	2, 336, 338, 5, 28, 15, 2, 337, 331, 3, 2, 2, 2, 337, 332, 3, 2, 2, 2,
	337, 336, 3, 2, 2, 2, 338, 25, 3, 2, 2, 2, 339, 342, 5, 54, 28, 2, 340,
	342, 7, 30, 2, 2, 341, 339, 3, 2, 2, 2, 341, 340, 3, 2, 2, 2, 342, 27,
	3, 2, 2, 2, 343, 344, 5, 26, 14, 2, 344, 345, 7, 3, 2, 2, 345, 346, 5,
	12, 7, 2, 346, 361, 3, 2, 2, 2, 347, 348, 7, 15, 2, 2, 348, 353, 5, 26,
	14, 2, 349, 350, 7, 5, 2, 2, 350, 352, 5, 26, 14, 2, 351, 349, 3, 2, 2,
	2, 352, 355, 3, 2, 2, 2, 353, 351, 3, 2, 2, 2, 353, 354, 3, 2, 2, 2, 354,
	356, 3, 2, 2, 2, 355, 353, 3, 2, 2, 2, 356, 357, 7, 28, 2, 2, 357, 358,
	7, 3, 2, 2, 358, 359, 5, 12, 7, 2, 359, 361, 3, 2, 2, 2, 360, 343, 3, 2,
	2, 2, 360, 347, 3, 2, 2, 2, 361, 29, 3, 2, 2, 2, 362, 363, 7, 34, 2, 2,
	363, 364, 5, 12, 7, 2, 364, 365, 7, 63, 2, 2, 365, 366, 5, 12, 7, 2, 366,
	31, 3, 2, 2, 2, 367, 368, 5, 54, 28, 2, 368, 369, 7, 4, 2, 2, 369, 370,
	5, 12, 7, 2, 370, 33, 3, 2, 2, 2, 371, 379, 5, 36, 19, 2, 372, 379, 7,
	80, 2, 2, 373, 379, 9, 7, 2, 2, 374, 379, 7, 54, 2, 2, 375, 379, 7, 78,
	2, 2, 376, 379, 7, 83, 2, 2, 377, 379, 7, 69, 2, 2, 378, 371, 3, 2, 2,
	2, 378, 372, 3, 2, 2, 2, 378, 373, 3, 2, 2, 2, 378, 374, 3, 2, 2, 2, 378,
	375, 3, 2, 2, 2, 378, 376, 3, 2, 2, 2, 378, 377, 3, 2, 2, 2, 379, 35, 3,
	2, 2, 2, 380, 389, 7, 70, 2, 2, 381, 389, 7, 73, 2, 2, 382, 389, 7, 71,
	2, 2, 383, 389, 7, 72, 2, 2, 384, 389, 7, 74, 2, 2, 385, 389, 7, 75, 2,
	2, 386, 389, 7, 76, 2, 2, 387, 389, 7, 77, 2, 2, 388, 380, 3, 2, 2, 2,
	388, 381, 3, 2, 2, 2, 388, 382, 3, 2, 2, 2, 388, 383, 3, 2, 2, 2, 388,
	384, 3, 2, 2, 2, 388, 385, 3, 2, 2, 2, 388, 386, 3, 2, 2, 2, 388, 387,
	3, 2, 2, 2, 389, 37, 3, 2, 2, 2, 390, 396, 7, 79, 2, 2, 391, 392, 5, 40,
	21, 2, 392, 393, 7, 8, 2, 2, 393, 394, 7, 79, 2, 2, 394, 396, 3, 2, 2,
	2, 395, 390, 3, 2, 2, 2, 395, 391, 3, 2, 2, 2, 396, 39, 3, 2, 2, 2, 397,
	398, 7, 79, 2, 2, 398, 41, 3, 2, 2, 2, 399, 400, 7, 79, 2, 2, 400, 43,
	3, 2, 2, 2, 401, 402, 7, 79, 2, 2, 402, 45, 3, 2, 2, 2, 403, 404, 7, 79,
	2, 2, 404, 47, 3, 2, 2, 2, 405, 406, 7, 79, 2, 2, 406, 49, 3, 2, 2, 2,
	407, 412, 5, 42, 22, 2, 408, 409, 7, 8, 2, 2, 409, 411, 5, 42, 22, 2, 410,
	408, 3, 2, 2, 2, 411, 414, 3, 2, 2, 2, 412, 410, 3, 2, 2, 2, 412, 413,
	3, 2, 2, 2, 413, 51, 3, 2, 2, 2, 414, 412, 3, 2, 2, 2, 415, 420, 5, 44,
	23, 2, 416, 417, 7, 8, 2, 2, 417, 419, 5, 44, 23, 2, 418, 416, 3, 2, 2,
	2, 419, 422, 3, 2, 2, 2, 420, 418, 3, 2, 2, 2, 420, 421, 3, 2, 2, 2, 421,
	53, 3, 2, 2, 2, 422, 420, 3, 2, 2, 2, 423, 424, 7, 81, 2, 2, 424, 55, 3,
	2, 2, 2, 45, 61, 71, 77, 91, 97, 111, 124, 133, 135, 137, 146, 150, 155,
	166, 170, 185, 206, 209, 213, 241, 249, 255, 259, 263, 265, 273, 278, 280,
	289, 292, 306, 309, 324, 327, 337, 341, 353, 360, 378, 388, 395, 412, 420,
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
	"RPAREN", "SEMI", "UNDERSCORE", "AND", "ASC", "BY", "CASE", "DELETE", "DESC",
	"ELSE", "FALSE", "FROM", "GROUP", "IF", "IN", "INDEX", "INSERT", "INTO",
	"LET", "LIKE", "LIMIT", "LOOKUP", "MANY", "MATCH", "NOR", "NOT", "NULL",
	"ONE", "OR", "PROJECT", "SET", "SKIP_", "SORT", "STEP", "SWITCH", "THEN",
	"TRUE", "UNWIND", "UPDATE", "WITH", "PRESERVE_NULL_AND_EMPTY", "REGEX",
	"INT", "DOUBLE", "DECIMAL", "LONG", "BIN", "LONG_BIN", "HEX", "LONG_HEX",
	"OID", "ID", "STRING", "VARIABLE_ID", "WS", "DATE_TIME",
}

var ruleNames = []string{
	"queryStatement", "queryStage", "projectItem", "sortField", "unwindOption",
	"expression", "document", "fieldAssignment", "multipart_document", "multipartFieldAssignment",
	"function", "functionArgument", "lambdaArgument", "lambdaExpression", "switchCase",
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
	MQLParserDELETE                  = 33
	MQLParserDESC                    = 34
	MQLParserELSE                    = 35
	MQLParserFALSE                   = 36
	MQLParserFROM                    = 37
	MQLParserGROUP                   = 38
	MQLParserIF                      = 39
	MQLParserIN                      = 40
	MQLParserINDEX                   = 41
	MQLParserINSERT                  = 42
	MQLParserINTO                    = 43
	MQLParserLET                     = 44
	MQLParserLIKE                    = 45
	MQLParserLIMIT                   = 46
	MQLParserLOOKUP                  = 47
	MQLParserMANY                    = 48
	MQLParserMATCH                   = 49
	MQLParserNOR                     = 50
	MQLParserNOT                     = 51
	MQLParserNULL                    = 52
	MQLParserONE                     = 53
	MQLParserOR                      = 54
	MQLParserPROJECT                 = 55
	MQLParserSET                     = 56
	MQLParserSKIP_                   = 57
	MQLParserSORT                    = 58
	MQLParserSTEP                    = 59
	MQLParserSWITCH                  = 60
	MQLParserTHEN                    = 61
	MQLParserTRUE                    = 62
	MQLParserUNWIND                  = 63
	MQLParserUPDATE                  = 64
	MQLParserWITH                    = 65
	MQLParserPRESERVE_NULL_AND_EMPTY = 66
	MQLParserREGEX                   = 67
	MQLParserINT                     = 68
	MQLParserDOUBLE                  = 69
	MQLParserDECIMAL                 = 70
	MQLParserLONG                    = 71
	MQLParserBIN                     = 72
	MQLParserLONG_BIN                = 73
	MQLParserHEX                     = 74
	MQLParserLONG_HEX                = 75
	MQLParserOID                     = 76
	MQLParserID                      = 77
	MQLParserSTRING                  = 78
	MQLParserVARIABLE_ID             = 79
	MQLParserWS                      = 80
	MQLParserDATE_TIME               = 81
)

// MQLParser rules.
const (
	MQLParserRULE_queryStatement            = 0
	MQLParserRULE_queryStage                = 1
	MQLParserRULE_projectItem               = 2
	MQLParserRULE_sortField                 = 3
	MQLParserRULE_unwindOption              = 4
	MQLParserRULE_expression                = 5
	MQLParserRULE_document                  = 6
	MQLParserRULE_fieldAssignment           = 7
	MQLParserRULE_multipart_document        = 8
	MQLParserRULE_multipartFieldAssignment  = 9
	MQLParserRULE_function                  = 10
	MQLParserRULE_functionArgument          = 11
	MQLParserRULE_lambdaArgument            = 12
	MQLParserRULE_lambdaExpression          = 13
	MQLParserRULE_switchCase                = 14
	MQLParserRULE_variableAssignment        = 15
	MQLParserRULE_value                     = 16
	MQLParserRULE_number                    = 17
	MQLParserRULE_collectionName            = 18
	MQLParserRULE_databaseName              = 19
	MQLParserRULE_fieldDeclaration          = 20
	MQLParserRULE_fieldName                 = 21
	MQLParserRULE_functionName              = 22
	MQLParserRULE_functionArgumentName      = 23
	MQLParserRULE_multipartFieldDeclaration = 24
	MQLParserRULE_multipartFieldName        = 25
	MQLParserRULE_variableName              = 26
)

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

func (s *QueryStatementContext) AllQueryStage() []IQueryStageContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IQueryStageContext)(nil)).Elem())
	var tst = make([]IQueryStageContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IQueryStageContext)
		}
	}

	return tst
}

func (s *QueryStatementContext) QueryStage(i int) IQueryStageContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IQueryStageContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IQueryStageContext)
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
	p.EnterRule(localctx, 0, MQLParserRULE_queryStatement)
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
		p.SetState(54)
		p.Match(MQLParserFROM)
	}
	{
		p.SetState(55)
		p.CollectionName()
	}
	p.SetState(59)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for ((_la-38)&-(0x1f+1)) == 0 && ((1<<uint((_la-38)))&((1<<(MQLParserGROUP-38))|(1<<(MQLParserLIMIT-38))|(1<<(MQLParserLOOKUP-38))|(1<<(MQLParserMATCH-38))|(1<<(MQLParserPROJECT-38))|(1<<(MQLParserSKIP_-38))|(1<<(MQLParserSORT-38))|(1<<(MQLParserUNWIND-38)))) != 0 {
		{
			p.SetState(56)
			p.QueryStage()
		}

		p.SetState(61)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
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
	p.EnterRule(localctx, 2, MQLParserRULE_queryStage)
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

	p.SetState(135)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserGROUP:
		localctx = NewGroupStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(62)
			p.Match(MQLParserGROUP)
		}
		{
			p.SetState(63)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(64)
			p.FieldAssignment()
		}
		p.SetState(69)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(65)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(66)
				p.FieldAssignment()
			}

			p.SetState(71)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(72)
			p.Match(MQLParserRBRACE)
		}
		p.SetState(75)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		if _la == MQLParserBY {
			{
				p.SetState(73)
				p.Match(MQLParserBY)
			}
			{
				p.SetState(74)
				p.expression(0)
			}

		}

	case MQLParserLIMIT:
		localctx = NewLimitStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(77)
			p.Match(MQLParserLIMIT)
		}
		{
			p.SetState(78)
			p.Match(MQLParserINT)
		}

	case MQLParserLOOKUP:
		localctx = NewLookupStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(79)
			p.Match(MQLParserLOOKUP)
		}
		{
			p.SetState(80)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(81)
			p.MultipartFieldDeclaration()
		}
		{
			p.SetState(82)
			p.Match(MQLParserCOLON)
		}
		p.SetState(95)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		if _la == MQLParserLBRACE {
			{
				p.SetState(83)
				p.Match(MQLParserLBRACE)
			}
			{
				p.SetState(84)
				p.VariableAssignment()
			}
			p.SetState(89)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)

			for _la == MQLParserCOMMA {
				{
					p.SetState(85)
					p.Match(MQLParserCOMMA)
				}
				{
					p.SetState(86)
					p.VariableAssignment()
				}

				p.SetState(91)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)
			}
			{
				p.SetState(92)
				p.Match(MQLParserRBRACE)
			}
			{
				p.SetState(93)
				p.Match(MQLParserARROW)
			}

		}
		{
			p.SetState(97)
			p.QueryStatement()
		}
		{
			p.SetState(98)
			p.Match(MQLParserRBRACE)
		}

	case MQLParserMATCH:
		localctx = NewMatchStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(100)
			p.Match(MQLParserMATCH)
		}
		{
			p.SetState(101)
			p.expression(0)
		}

	case MQLParserPROJECT:
		localctx = NewProjectStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(102)
			p.Match(MQLParserPROJECT)
		}
		{
			p.SetState(103)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(104)
			p.ProjectItem()
		}
		p.SetState(109)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(105)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(106)
				p.ProjectItem()
			}

			p.SetState(111)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(112)
			p.Match(MQLParserRBRACE)
		}

	case MQLParserSKIP_:
		localctx = NewSkipStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(114)
			p.Match(MQLParserSKIP_)
		}
		{
			p.SetState(115)
			p.Match(MQLParserINT)
		}

	case MQLParserSORT:
		localctx = NewSortStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(116)
			p.Match(MQLParserSORT)
		}
		{
			p.SetState(117)
			p.SortField()
		}
		p.SetState(122)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(118)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(119)
				p.SortField()
			}

			p.SetState(124)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	case MQLParserUNWIND:
		localctx = NewUnwindStageContext(p, localctx)
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(125)
			p.Match(MQLParserUNWIND)
		}
		{
			p.SetState(126)
			p.MultipartFieldName()
		}
		p.SetState(133)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		if _la == MQLParserWITH {
			{
				p.SetState(127)
				p.Match(MQLParserWITH)
			}
			p.SetState(129)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)

			for ok := true; ok; ok = _la == MQLParserINDEX || _la == MQLParserPRESERVE_NULL_AND_EMPTY {
				{
					p.SetState(128)
					p.UnwindOption()
				}

				p.SetState(131)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)
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
	p.EnterRule(localctx, 4, MQLParserRULE_projectItem)

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

	p.SetState(144)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 10, p.GetParserRuleContext()) {
	case 1:
		localctx = NewExcludeProjectItemContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(137)
			p.Match(MQLParserEXCLUDE)
		}
		{
			p.SetState(138)
			p.MultipartFieldDeclaration()
		}

	case 2:
		localctx = NewIncludeProjectItemContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(139)
			p.MultipartFieldDeclaration()
		}

	case 3:
		localctx = NewAssignProjectItemContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(140)
			p.FieldDeclaration()
		}
		{
			p.SetState(141)
			p.Match(MQLParserCOLON)
		}
		{
			p.SetState(142)
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
	p.EnterRule(localctx, 6, MQLParserRULE_sortField)
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
		p.SetState(146)
		p.MultipartFieldName()
	}
	p.SetState(148)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserASC || _la == MQLParserDESC {
		{
			p.SetState(147)
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
	p.EnterRule(localctx, 8, MQLParserRULE_unwindOption)

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

	p.SetState(153)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserINDEX:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(150)
			p.Match(MQLParserINDEX)
		}
		{
			p.SetState(151)
			p.MultipartFieldDeclaration()
		}

	case MQLParserPRESERVE_NULL_AND_EMPTY:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(152)
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

type NewDocumentExpressionContext struct {
	*ExpressionContext
}

func NewNewDocumentExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *NewDocumentExpressionContext {
	var p = new(NewDocumentExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *NewDocumentExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NewDocumentExpressionContext) Document() IDocumentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDocumentContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDocumentContext)
}

func (s *NewDocumentExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitNewDocumentExpression(s)

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

type FunctionCallExpressionContext struct {
	*ExpressionContext
}

func NewFunctionCallExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *FunctionCallExpressionContext {
	var p = new(FunctionCallExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *FunctionCallExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionCallExpressionContext) Function() IFunctionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFunctionContext)
}

func (s *FunctionCallExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFunctionCallExpression(s)

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

type NewArrayExpressionContext struct {
	*ExpressionContext
}

func NewNewArrayExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *NewArrayExpressionContext {
	var p = new(NewArrayExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *NewArrayExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NewArrayExpressionContext) LBRACK() antlr.TerminalNode {
	return s.GetToken(MQLParserLBRACK, 0)
}

func (s *NewArrayExpressionContext) RBRACK() antlr.TerminalNode {
	return s.GetToken(MQLParserRBRACK, 0)
}

func (s *NewArrayExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *NewArrayExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *NewArrayExpressionContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *NewArrayExpressionContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
}

func (s *NewArrayExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitNewArrayExpression(s)

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

func (s *InExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *InExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *InExpressionContext) IN() antlr.TerminalNode {
	return s.GetToken(MQLParserIN, 0)
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

type ArrayAccessExpressionContext struct {
	*ExpressionContext
	st   IExpressionContext
	end  IExpressionContext
	step IExpressionContext
}

func NewArrayAccessExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *ArrayAccessExpressionContext {
	var p = new(ArrayAccessExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *ArrayAccessExpressionContext) GetSt() IExpressionContext { return s.st }

func (s *ArrayAccessExpressionContext) GetEnd() IExpressionContext { return s.end }

func (s *ArrayAccessExpressionContext) GetStep() IExpressionContext { return s.step }

func (s *ArrayAccessExpressionContext) SetSt(v IExpressionContext) { s.st = v }

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

type VariableReferenceExpressionContext struct {
	*ExpressionContext
}

func NewVariableReferenceExpressionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *VariableReferenceExpressionContext {
	var p = new(VariableReferenceExpressionContext)

	p.ExpressionContext = NewEmptyExpressionContext()
	p.parser = parser
	p.CopyFrom(ctx.(*ExpressionContext))

	return p
}

func (s *VariableReferenceExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VariableReferenceExpressionContext) VariableName() IVariableNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IVariableNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IVariableNameContext)
}

func (s *VariableReferenceExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitVariableReferenceExpression(s)

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
	_startState := 10
	p.EnterRecursionRule(localctx, 10, MQLParserRULE_expression, _p)
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
	p.SetState(211)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 18, p.GetParserRuleContext()) {
	case 1:
		localctx = NewUnaryMinusExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx

		{
			p.SetState(156)
			p.Match(MQLParserMINUS)
		}
		{
			p.SetState(157)
			p.expression(24)
		}

	case 2:
		localctx = NewNotExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(158)
			p.Match(MQLParserNOT)
		}
		{
			p.SetState(159)
			p.expression(23)
		}

	case 3:
		localctx = NewSwitchExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(160)
			p.Match(MQLParserSWITCH)
		}
		p.SetState(162)
		p.GetErrorHandler().Sync(p)
		_alt = 1
		for ok := true; ok; ok = _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
			switch _alt {
			case 1:
				{
					p.SetState(161)
					p.SwitchCase()
				}

			default:
				panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
			}

			p.SetState(164)
			p.GetErrorHandler().Sync(p)
			_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 13, p.GetParserRuleContext())
		}
		p.SetState(168)
		p.GetErrorHandler().Sync(p)

		if p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 14, p.GetParserRuleContext()) == 1 {
			{
				p.SetState(166)
				p.Match(MQLParserELSE)
			}
			{
				p.SetState(167)
				p.expression(0)
			}

		}

	case 4:
		localctx = NewConditionalExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(170)
			p.Match(MQLParserIF)
		}
		{
			p.SetState(171)
			p.expression(0)
		}
		{
			p.SetState(172)
			p.Match(MQLParserTHEN)
		}
		{
			p.SetState(173)
			p.expression(0)
		}
		{
			p.SetState(174)
			p.Match(MQLParserELSE)
		}
		{
			p.SetState(175)
			p.expression(9)
		}

	case 5:
		localctx = NewLetExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(177)
			p.Match(MQLParserLBRACE)
		}
		{
			p.SetState(178)
			p.VariableAssignment()
		}
		p.SetState(183)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(179)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(180)
				p.VariableAssignment()
			}

			p.SetState(185)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(186)
			p.Match(MQLParserRBRACE)
		}
		{
			p.SetState(187)
			p.Match(MQLParserARROW)
		}
		{
			p.SetState(188)
			p.expression(8)
		}

	case 6:
		localctx = NewParenthesisExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(190)
			p.Match(MQLParserLPAREN)
		}
		{
			p.SetState(191)
			p.expression(0)
		}
		{
			p.SetState(192)
			p.Match(MQLParserRPAREN)
		}

	case 7:
		localctx = NewFunctionCallExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(194)
			p.Function()
		}

	case 8:
		localctx = NewFieldExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(195)
			p.FieldName()
		}

	case 9:
		localctx = NewVariableReferenceExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(196)
			p.VariableName()
		}

	case 10:
		localctx = NewNewDocumentExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(197)
			p.Document()
		}

	case 11:
		localctx = NewNewArrayExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(198)
			p.Match(MQLParserLBRACK)
		}
		p.SetState(207)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		if (((_la-11)&-(0x1f+1)) == 0 && ((1<<uint((_la-11)))&((1<<(MQLParserLBRACE-11))|(1<<(MQLParserLBRACK-11))|(1<<(MQLParserLPAREN-11))|(1<<(MQLParserMINUS-11))|(1<<(MQLParserFALSE-11))|(1<<(MQLParserIF-11)))) != 0) || (((_la-51)&-(0x1f+1)) == 0 && ((1<<uint((_la-51)))&((1<<(MQLParserNOT-51))|(1<<(MQLParserNULL-51))|(1<<(MQLParserSWITCH-51))|(1<<(MQLParserTRUE-51))|(1<<(MQLParserREGEX-51))|(1<<(MQLParserINT-51))|(1<<(MQLParserDOUBLE-51))|(1<<(MQLParserDECIMAL-51))|(1<<(MQLParserLONG-51))|(1<<(MQLParserBIN-51))|(1<<(MQLParserLONG_BIN-51))|(1<<(MQLParserHEX-51))|(1<<(MQLParserLONG_HEX-51))|(1<<(MQLParserOID-51))|(1<<(MQLParserID-51))|(1<<(MQLParserSTRING-51))|(1<<(MQLParserVARIABLE_ID-51))|(1<<(MQLParserDATE_TIME-51)))) != 0) {
			{
				p.SetState(199)
				p.expression(0)
			}
			p.SetState(204)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)

			for _la == MQLParserCOMMA {
				{
					p.SetState(200)
					p.Match(MQLParserCOMMA)
				}
				{
					p.SetState(201)
					p.expression(0)
				}

				p.SetState(206)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)
			}

		}
		{
			p.SetState(209)
			p.Match(MQLParserRBRACK)
		}

	case 12:
		localctx = NewValueExpressionContext(p, localctx)
		p.SetParserRuleContext(localctx)
		_prevctx = localctx
		{
			p.SetState(210)
			p.Value()
		}

	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(278)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 27, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(276)
			p.GetErrorHandler().Sync(p)
			switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 26, p.GetParserRuleContext()) {
			case 1:
				localctx = NewPowerExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(213)

				if !(p.Precpred(p.GetParserRuleContext(), 25)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 25)", ""))
				}
				{
					p.SetState(214)
					p.Match(MQLParserPOWER)
				}
				{
					p.SetState(215)
					p.expression(25)
				}

			case 2:
				localctx = NewMultiplicationExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(216)

				if !(p.Precpred(p.GetParserRuleContext(), 18)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 18)", ""))
				}
				{
					p.SetState(217)

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
					p.SetState(218)
					p.expression(19)
				}

			case 3:
				localctx = NewAdditionExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(219)

				if !(p.Precpred(p.GetParserRuleContext(), 17)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 17)", ""))
				}
				{
					p.SetState(220)

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
					p.SetState(221)
					p.expression(18)
				}

			case 4:
				localctx = NewComparisonExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(222)

				if !(p.Precpred(p.GetParserRuleContext(), 16)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 16)", ""))
				}
				{
					p.SetState(223)

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
					p.SetState(224)
					p.expression(17)
				}

			case 5:
				localctx = NewAndExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(225)

				if !(p.Precpred(p.GetParserRuleContext(), 15)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 15)", ""))
				}
				{
					p.SetState(226)
					p.Match(MQLParserAND)
				}
				{
					p.SetState(227)
					p.expression(16)
				}

			case 6:
				localctx = NewOrExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(228)

				if !(p.Precpred(p.GetParserRuleContext(), 14)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 14)", ""))
				}
				{
					p.SetState(229)
					_la = p.GetTokenStream().LA(1)

					if !(_la == MQLParserNOR || _la == MQLParserOR) {
						p.GetErrorHandler().RecoverInline(p)
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(230)
					p.expression(15)
				}

			case 7:
				localctx = NewConcatExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(231)

				if !(p.Precpred(p.GetParserRuleContext(), 13)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 13)", ""))
				}
				{
					p.SetState(232)
					p.Match(MQLParserCONCAT)
				}
				{
					p.SetState(233)
					p.expression(14)
				}

			case 8:
				localctx = NewNullCoalesceExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(234)

				if !(p.Precpred(p.GetParserRuleContext(), 12)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 12)", ""))
				}
				{
					p.SetState(235)
					p.Match(MQLParserDQUESTION)
				}
				{
					p.SetState(236)
					p.expression(13)
				}

			case 9:
				localctx = NewInExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(237)

				if !(p.Precpred(p.GetParserRuleContext(), 11)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 11)", ""))
				}
				p.SetState(239)
				p.GetErrorHandler().Sync(p)
				_la = p.GetTokenStream().LA(1)

				if _la == MQLParserNOT {
					{
						p.SetState(238)
						p.Match(MQLParserNOT)
					}

				}
				{
					p.SetState(241)
					p.Match(MQLParserIN)
				}
				{
					p.SetState(242)
					p.expression(12)
				}

			case 10:
				localctx = NewMemberExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(243)

				if !(p.Precpred(p.GetParserRuleContext(), 22)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 22)", ""))
				}
				{
					p.SetState(244)
					p.Match(MQLParserDOT)
				}
				p.SetState(247)
				p.GetErrorHandler().Sync(p)
				switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 20, p.GetParserRuleContext()) {
				case 1:
					{
						p.SetState(245)
						p.FieldName()
					}

				case 2:
					{
						p.SetState(246)
						p.Function()
					}

				}

			case 11:
				localctx = NewArrayAccessExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(249)

				if !(p.Precpred(p.GetParserRuleContext(), 21)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 21)", ""))
				}
				{
					p.SetState(250)
					p.Match(MQLParserLBRACK)
				}
				p.SetState(263)
				p.GetErrorHandler().Sync(p)
				switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 24, p.GetParserRuleContext()) {
				case 1:
					{
						p.SetState(251)

						var _x = p.expression(0)

						localctx.(*ArrayAccessExpressionContext).st = _x
					}

				case 2:
					p.SetState(253)
					p.GetErrorHandler().Sync(p)
					_la = p.GetTokenStream().LA(1)

					if (((_la-11)&-(0x1f+1)) == 0 && ((1<<uint((_la-11)))&((1<<(MQLParserLBRACE-11))|(1<<(MQLParserLBRACK-11))|(1<<(MQLParserLPAREN-11))|(1<<(MQLParserMINUS-11))|(1<<(MQLParserFALSE-11))|(1<<(MQLParserIF-11)))) != 0) || (((_la-51)&-(0x1f+1)) == 0 && ((1<<uint((_la-51)))&((1<<(MQLParserNOT-51))|(1<<(MQLParserNULL-51))|(1<<(MQLParserSWITCH-51))|(1<<(MQLParserTRUE-51))|(1<<(MQLParserREGEX-51))|(1<<(MQLParserINT-51))|(1<<(MQLParserDOUBLE-51))|(1<<(MQLParserDECIMAL-51))|(1<<(MQLParserLONG-51))|(1<<(MQLParserBIN-51))|(1<<(MQLParserLONG_BIN-51))|(1<<(MQLParserHEX-51))|(1<<(MQLParserLONG_HEX-51))|(1<<(MQLParserOID-51))|(1<<(MQLParserID-51))|(1<<(MQLParserSTRING-51))|(1<<(MQLParserVARIABLE_ID-51))|(1<<(MQLParserDATE_TIME-51)))) != 0) {
						{
							p.SetState(252)

							var _x = p.expression(0)

							localctx.(*ArrayAccessExpressionContext).st = _x
						}

					}
					{
						p.SetState(255)
						p.Match(MQLParserRANGE)
					}
					p.SetState(257)
					p.GetErrorHandler().Sync(p)
					_la = p.GetTokenStream().LA(1)

					if (((_la-11)&-(0x1f+1)) == 0 && ((1<<uint((_la-11)))&((1<<(MQLParserLBRACE-11))|(1<<(MQLParserLBRACK-11))|(1<<(MQLParserLPAREN-11))|(1<<(MQLParserMINUS-11))|(1<<(MQLParserFALSE-11))|(1<<(MQLParserIF-11)))) != 0) || (((_la-51)&-(0x1f+1)) == 0 && ((1<<uint((_la-51)))&((1<<(MQLParserNOT-51))|(1<<(MQLParserNULL-51))|(1<<(MQLParserSWITCH-51))|(1<<(MQLParserTRUE-51))|(1<<(MQLParserREGEX-51))|(1<<(MQLParserINT-51))|(1<<(MQLParserDOUBLE-51))|(1<<(MQLParserDECIMAL-51))|(1<<(MQLParserLONG-51))|(1<<(MQLParserBIN-51))|(1<<(MQLParserLONG_BIN-51))|(1<<(MQLParserHEX-51))|(1<<(MQLParserLONG_HEX-51))|(1<<(MQLParserOID-51))|(1<<(MQLParserID-51))|(1<<(MQLParserSTRING-51))|(1<<(MQLParserVARIABLE_ID-51))|(1<<(MQLParserDATE_TIME-51)))) != 0) {
						{
							p.SetState(256)

							var _x = p.expression(0)

							localctx.(*ArrayAccessExpressionContext).end = _x
						}

					}
					p.SetState(261)
					p.GetErrorHandler().Sync(p)
					_la = p.GetTokenStream().LA(1)

					if _la == MQLParserCOLON {
						{
							p.SetState(259)
							p.Match(MQLParserCOLON)
						}
						{
							p.SetState(260)

							var _x = p.expression(0)

							localctx.(*ArrayAccessExpressionContext).step = _x
						}

					}

				}
				{
					p.SetState(265)
					p.Match(MQLParserRBRACK)
				}

			case 12:
				localctx = NewRangeExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(266)

				if !(p.Precpred(p.GetParserRuleContext(), 20)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 20)", ""))
				}
				{
					p.SetState(267)
					p.Match(MQLParserRANGE)
				}
				{
					p.SetState(268)
					p.expression(0)
				}
				p.SetState(271)
				p.GetErrorHandler().Sync(p)

				if p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 25, p.GetParserRuleContext()) == 1 {
					{
						p.SetState(269)
						p.Match(MQLParserCOLON)
					}
					{
						p.SetState(270)
						p.expression(0)
					}

				}

			case 13:
				localctx = NewLikeExpressionContext(p, NewExpressionContext(p, _parentctx, _parentState))
				p.PushNewRecursionContext(localctx, _startState, MQLParserRULE_expression)
				p.SetState(273)

				if !(p.Precpred(p.GetParserRuleContext(), 19)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 19)", ""))
				}
				{
					p.SetState(274)
					p.Match(MQLParserLIKE)
				}
				{
					p.SetState(275)
					p.Match(MQLParserREGEX)
				}

			}

		}
		p.SetState(280)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 27, p.GetParserRuleContext())
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
	p.EnterRule(localctx, 12, MQLParserRULE_document)
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
		p.SetState(281)
		p.Match(MQLParserLBRACE)
	}
	p.SetState(290)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserID {
		{
			p.SetState(282)
			p.FieldAssignment()
		}
		p.SetState(287)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(283)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(284)
				p.FieldAssignment()
			}

			p.SetState(289)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}
	{
		p.SetState(292)
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
	p.EnterRule(localctx, 14, MQLParserRULE_fieldAssignment)

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
		p.SetState(294)
		p.FieldDeclaration()
	}
	{
		p.SetState(295)
		p.Match(MQLParserCOLON)
	}
	{
		p.SetState(296)
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
	p.EnterRule(localctx, 16, MQLParserRULE_multipart_document)
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
		p.SetState(298)
		p.Match(MQLParserLBRACE)
	}
	p.SetState(307)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if _la == MQLParserID {
		{
			p.SetState(299)
			p.MultipartFieldAssignment()
		}
		p.SetState(304)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(300)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(301)
				p.MultipartFieldAssignment()
			}

			p.SetState(306)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}
	{
		p.SetState(309)
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
	p.EnterRule(localctx, 18, MQLParserRULE_multipartFieldAssignment)

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
		p.SetState(311)
		p.MultipartFieldDeclaration()
	}
	{
		p.SetState(312)
		p.Match(MQLParserCOLON)
	}
	{
		p.SetState(313)
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

func (s *FunctionContext) AllFunctionArgument() []IFunctionArgumentContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IFunctionArgumentContext)(nil)).Elem())
	var tst = make([]IFunctionArgumentContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IFunctionArgumentContext)
		}
	}

	return tst
}

func (s *FunctionContext) FunctionArgument(i int) IFunctionArgumentContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionArgumentContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IFunctionArgumentContext)
}

func (s *FunctionContext) AllCOMMA() []antlr.TerminalNode {
	return s.GetTokens(MQLParserCOMMA)
}

func (s *FunctionContext) COMMA(i int) antlr.TerminalNode {
	return s.GetToken(MQLParserCOMMA, i)
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
	p.EnterRule(localctx, 20, MQLParserRULE_function)
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
		p.SetState(315)
		p.FunctionName()
	}
	{
		p.SetState(316)
		p.Match(MQLParserLPAREN)
	}
	p.SetState(325)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	if (((_la-11)&-(0x1f+1)) == 0 && ((1<<uint((_la-11)))&((1<<(MQLParserLBRACE-11))|(1<<(MQLParserLBRACK-11))|(1<<(MQLParserLPAREN-11))|(1<<(MQLParserMINUS-11))|(1<<(MQLParserUNDERSCORE-11))|(1<<(MQLParserFALSE-11))|(1<<(MQLParserIF-11)))) != 0) || (((_la-51)&-(0x1f+1)) == 0 && ((1<<uint((_la-51)))&((1<<(MQLParserNOT-51))|(1<<(MQLParserNULL-51))|(1<<(MQLParserSWITCH-51))|(1<<(MQLParserTRUE-51))|(1<<(MQLParserREGEX-51))|(1<<(MQLParserINT-51))|(1<<(MQLParserDOUBLE-51))|(1<<(MQLParserDECIMAL-51))|(1<<(MQLParserLONG-51))|(1<<(MQLParserBIN-51))|(1<<(MQLParserLONG_BIN-51))|(1<<(MQLParserHEX-51))|(1<<(MQLParserLONG_HEX-51))|(1<<(MQLParserOID-51))|(1<<(MQLParserID-51))|(1<<(MQLParserSTRING-51))|(1<<(MQLParserVARIABLE_ID-51))|(1<<(MQLParserDATE_TIME-51)))) != 0) {
		{
			p.SetState(317)
			p.FunctionArgument()
		}
		p.SetState(322)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(318)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(319)
				p.FunctionArgument()
			}

			p.SetState(324)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}

	}
	{
		p.SetState(327)
		p.Match(MQLParserRPAREN)
	}

	return localctx
}

// IFunctionArgumentContext is an interface to support dynamic dispatch.
type IFunctionArgumentContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFunctionArgumentContext differentiates from other interfaces.
	IsFunctionArgumentContext()
}

type FunctionArgumentContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFunctionArgumentContext() *FunctionArgumentContext {
	var p = new(FunctionArgumentContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = MQLParserRULE_functionArgument
	return p
}

func (*FunctionArgumentContext) IsFunctionArgumentContext() {}

func NewFunctionArgumentContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FunctionArgumentContext {
	var p = new(FunctionArgumentContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = MQLParserRULE_functionArgument

	return p
}

func (s *FunctionArgumentContext) GetParser() antlr.Parser { return s.parser }

func (s *FunctionArgumentContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *FunctionArgumentContext) FunctionArgumentName() IFunctionArgumentNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFunctionArgumentNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFunctionArgumentNameContext)
}

func (s *FunctionArgumentContext) COLON() antlr.TerminalNode {
	return s.GetToken(MQLParserCOLON, 0)
}

func (s *FunctionArgumentContext) LambdaExpression() ILambdaExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ILambdaExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ILambdaExpressionContext)
}

func (s *FunctionArgumentContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FunctionArgumentContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FunctionArgumentContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case MQLVisitor:
		return t.VisitFunctionArgument(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *MQLParser) FunctionArgument() (localctx IFunctionArgumentContext) {
	localctx = NewFunctionArgumentContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 22, MQLParserRULE_functionArgument)

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

	p.SetState(335)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 34, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(329)
			p.expression(0)
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(330)
			p.FunctionArgumentName()
		}
		{
			p.SetState(331)
			p.Match(MQLParserCOLON)
		}
		{
			p.SetState(332)
			p.expression(0)
		}

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(334)
			p.LambdaExpression()
		}

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
	p.EnterRule(localctx, 24, MQLParserRULE_lambdaArgument)

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

	p.SetState(339)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserVARIABLE_ID:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(337)
			p.VariableName()
		}

	case MQLParserUNDERSCORE:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(338)
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
	p.EnterRule(localctx, 26, MQLParserRULE_lambdaExpression)
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

	p.SetState(358)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserUNDERSCORE, MQLParserVARIABLE_ID:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(341)
			p.LambdaArgument()
		}
		{
			p.SetState(342)
			p.Match(MQLParserARROW)
		}
		{
			p.SetState(343)
			p.expression(0)
		}

	case MQLParserLPAREN:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(345)
			p.Match(MQLParserLPAREN)
		}
		{
			p.SetState(346)
			p.LambdaArgument()
		}
		p.SetState(351)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)

		for _la == MQLParserCOMMA {
			{
				p.SetState(347)
				p.Match(MQLParserCOMMA)
			}
			{
				p.SetState(348)
				p.LambdaArgument()
			}

			p.SetState(353)
			p.GetErrorHandler().Sync(p)
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(354)
			p.Match(MQLParserRPAREN)
		}
		{
			p.SetState(355)
			p.Match(MQLParserARROW)
		}
		{
			p.SetState(356)
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
	p.EnterRule(localctx, 28, MQLParserRULE_switchCase)

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
		p.SetState(360)
		p.Match(MQLParserCASE)
	}
	{
		p.SetState(361)
		p.expression(0)
	}
	{
		p.SetState(362)
		p.Match(MQLParserTHEN)
	}
	{
		p.SetState(363)
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
	p.EnterRule(localctx, 30, MQLParserRULE_variableAssignment)

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
		p.VariableName()
	}
	{
		p.SetState(366)
		p.Match(MQLParserCOLON)
	}
	{
		p.SetState(367)
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
	p.EnterRule(localctx, 32, MQLParserRULE_value)
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

	p.SetState(376)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserINT, MQLParserDOUBLE, MQLParserDECIMAL, MQLParserLONG, MQLParserBIN, MQLParserLONG_BIN, MQLParserHEX, MQLParserLONG_HEX:
		localctx = NewNumberValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(369)
			p.Number()
		}

	case MQLParserSTRING:
		localctx = NewStringValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(370)
			p.Match(MQLParserSTRING)
		}

	case MQLParserFALSE, MQLParserTRUE:
		localctx = NewBooleanValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(371)
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
			p.SetState(372)
			p.Match(MQLParserNULL)
		}

	case MQLParserOID:
		localctx = NewOidValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(373)
			p.Match(MQLParserOID)
		}

	case MQLParserDATE_TIME:
		localctx = NewDateTimeValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(374)
			p.Match(MQLParserDATE_TIME)
		}

	case MQLParserREGEX:
		localctx = NewRegexValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(375)
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
	p.EnterRule(localctx, 34, MQLParserRULE_number)

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

	p.SetState(386)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case MQLParserINT:
		localctx = NewIntValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(378)
			p.Match(MQLParserINT)
		}

	case MQLParserLONG:
		localctx = NewLongValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(379)
			p.Match(MQLParserLONG)
		}

	case MQLParserDOUBLE:
		localctx = NewDoubleValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(380)
			p.Match(MQLParserDOUBLE)
		}

	case MQLParserDECIMAL:
		localctx = NewDecimalValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(381)
			p.Match(MQLParserDECIMAL)
		}

	case MQLParserBIN:
		localctx = NewBinValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(382)
			p.Match(MQLParserBIN)
		}

	case MQLParserLONG_BIN:
		localctx = NewLongBinValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(383)
			p.Match(MQLParserLONG_BIN)
		}

	case MQLParserHEX:
		localctx = NewHexValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(384)
			p.Match(MQLParserHEX)
		}

	case MQLParserLONG_HEX:
		localctx = NewLongHexValueContext(p, localctx)
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(385)
			p.Match(MQLParserLONG_HEX)
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
	p.EnterRule(localctx, 36, MQLParserRULE_collectionName)

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

	p.SetState(393)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 40, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(388)
			p.Match(MQLParserID)
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(389)
			p.DatabaseName()
		}
		{
			p.SetState(390)
			p.Match(MQLParserDOT)
		}
		{
			p.SetState(391)
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
	p.EnterRule(localctx, 38, MQLParserRULE_databaseName)

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
	p.EnterRule(localctx, 40, MQLParserRULE_fieldDeclaration)

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
		p.SetState(397)
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
	p.EnterRule(localctx, 42, MQLParserRULE_fieldName)

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
	p.EnterRule(localctx, 44, MQLParserRULE_functionName)

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
		p.SetState(401)
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
	p.EnterRule(localctx, 46, MQLParserRULE_functionArgumentName)

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
		p.SetState(403)
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
	p.EnterRule(localctx, 48, MQLParserRULE_multipartFieldDeclaration)
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
		p.SetState(405)
		p.FieldDeclaration()
	}
	p.SetState(410)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == MQLParserDOT {
		{
			p.SetState(406)
			p.Match(MQLParserDOT)
		}
		{
			p.SetState(407)
			p.FieldDeclaration()
		}

		p.SetState(412)
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
	p.EnterRule(localctx, 50, MQLParserRULE_multipartFieldName)
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
		p.SetState(413)
		p.FieldName()
	}
	p.SetState(418)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == MQLParserDOT {
		{
			p.SetState(414)
			p.Match(MQLParserDOT)
		}
		{
			p.SetState(415)
			p.FieldName()
		}

		p.SetState(420)
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
	p.EnterRule(localctx, 52, MQLParserRULE_variableName)

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
		p.SetState(421)
		p.Match(MQLParserVARIABLE_ID)
	}

	return localctx
}

func (p *MQLParser) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 5:
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
		return p.Precpred(p.GetParserRuleContext(), 11)

	case 9:
		return p.Precpred(p.GetParserRuleContext(), 22)

	case 10:
		return p.Precpred(p.GetParserRuleContext(), 21)

	case 11:
		return p.Precpred(p.GetParserRuleContext(), 20)

	case 12:
		return p.Precpred(p.GetParserRuleContext(), 19)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
