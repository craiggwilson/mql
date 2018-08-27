grammar MQL;

parse: statement (SEMI statement)* SEMI? EOF;

statement:
  pipeline
;

pipeline: FROM collection_name stage*;

// STAGES
stage:
  GROUP LBRACE field_assignment (COMMA field_assignment)* RBRACE (BY expression)?      #groupStage
| LIMIT INT                                                                            #limitStage
| LOOKUP multipart_field_declaration COLON
    LPAREN
      (LET variable_assignment (COMMA variable_assignment)* ARROW)?
      statement
    RPAREN                                                                             #lookupStage
| MATCH expression                                                                     #matchStage
| PROJECT LBRACE project_item (COMMA project_item)* RBRACE                             #projectStage
| SKIP_ INT                                                                            #skipStage
| SORT sort_field (COMMA sort_field)*                                                  #sortStage
| UNWIND multipart_field_name (WITH unwind_option+)?                                   #unwindStage
;

project_item:
  EXCLUDE? multipart_field_declaration
| multipart_field_declaration COLON expression
;

sort_field:
  multipart_field_name (ASC | DESC)?
;

unwind_option:
  INDEX multipart_field_declaration
| PRESERVE_NULL_AND_EMPTY
;


// EXPRESSIONS
expression:
  <assoc=right>expression POWER expression                              #powerExpression
| MINUS expression                                                      #unaryMinusExpression
| NOT expression                                                        #notExpression
| expression DOT (field_name | function)                                #memberExpression
| expression LBRACK (
        start=expression
      | (start=expression)? RANGE (end=expression)? (COLON step=expression)?
    ) RBRACK                                                            #arrayAccessExpression
| expression RANGE expression (COLON expression)?                       #rangeExpression
| expression LIKE regex                                                 #likeExpression
| expression op=(MULT | DIV | MOD) expression                           #multiplicationExpression
| expression op=(PLUS | MINUS) expression                               #additionExpression
| expression op=(EQ | GT | GTE | LT | LTE | NEQ) expression             #comparisonExpression
| expression AND expression                                             #andExpression
| expression OR expression                                              #orExpression
| expression CONCAT expression                                          #concatExpression
| expression DQUESTION expression                                       #nullCoalesceExpression
| expression NOT? IN expression                                         #inExpression
| SWITCH switch_case+ (ELSE expression)?                                #switchExpression
| IF expression THEN expression ELSE expression                         #conditionalExpression
| LET variable_assignment (COMMA variable_assignment)* ARROW expression #letExpression
| LBRACE (field_assignment (COMMA field_assignment)*)? RBRACE           #newDocumentExpression
| LBRACK (expression (COMMA expression)*)? RBRACK                       #newArrayExpression
| LPAREN expression RPAREN                                              #parenthesisExpression
| function                                                              #functionCallExpression
| variable_name                                                         #variableReferenceExpression
| field_name                                                            #fieldExpression
| number                                                                #numberExpression
| STRING                                                                #stringExpression
| (TRUE | FALSE)                                                        #booleanExpression
| NULL                                                                  #nullExpression
| OID                                                                   #oidExpression
| DATE_TIME                                                             #dateTimeExpression
| regex                                                                 #regexExpression
;

field_assignment:
  field_declaration COLON expression
;

function:
  function_name LPAREN (function_argument (COMMA function_argument)*)? RPAREN
;

function_argument:
  expression
| function_argument_name COLON expression
| lambda_expression;

lambda_argument:
  variable_name
| UNDERSCORE
;

lambda_expression:
  lambda_argument ARROW expression
| LPAREN lambda_argument (COMMA lambda_argument)* RPAREN ARROW expression
;

number:
  (INT | LONG | DECIMAL | BIN | HEX)
;

regex: REGEX;

switch_case:
  CASE expression THEN expression
;

variable_assignment:
  variable_name COLON expression
;

// NAMING
collection_name:
  ID
| database_name DOT ID
;

database_name: ID;

field_declaration: STRING | field_name;

multipart_field_declaration: field_declaration (DOT field_declaration)*;

field_name: ID;

function_name: ID;

function_argument_name: ID;

multipart_field_name: field_name (DOT field_name)*;

variable_name: VARIABLE_ID;

// LEXER
ARROW:      '=>';
COLON:      ':';
COMMA:      ',';
CONCAT:     '||';
DIV:        '/';
DOT:        '.';
DQUESTION:  '??';
EQ:         '=';
GT:         '>';
GTE:        '>=';
LBRACE:     '{';
LBRACK:     '[';
LPAREN:     '(';
LT:         '<';
LTE:        '<=';
MINUS:      '-';
MOD:        '%';
POWER:      '**';
MULT:       '*';
NEQ:        '!=';
EXCLUDE:    '!';
PLUS:       '+';
RANGE:      '..';
RBRACE:     '}';
RBRACK:     ']';
RPAREN:     ')';
SEMI:       ';';
UNDERSCORE: '_';

// KEYWORDS
AND:      A N D;
ASC:      A S C;
BY:       B Y;
CASE:     C A S E;
DESC:     D E S C;
ELSE:     E L S E;
FALSE:    F A L S E;
FROM:     F R O M;
GROUP:    G R O U P;
IF:       I F;
IN:       I N;
INDEX:    I N D E X;
LET:      L E T;
LIKE:     L I K E;
LIMIT:    L I M I T;
LOOKUP:   L O O K U P;
MATCH:    M A T C H;
NOT:      N O T;
NULL:     N U L L;
OR:       O R;
PROJECT:  P R O J E C T;
SKIP_:    S K I P;
SORT:     S O R T;
STEP:     S T E P;
SWITCH:   S W I T C H;
THEN:     T H E N;
TRUE:     T R U E;
UNWIND:   U N W I N D;
WITH:     W I T H;

PRESERVE_NULL_AND_EMPTY: P R E S E R V E '_' N U L L '_' A N D '_' E M P T Y;


// TYPES
REGEX: '/' ('\\''/' | ~('/'))* '/' [a-zA-Z]*;

INT: DEC_DIGIT DEC_DIGIT_OR_SEPARATOR*;
DECIMAL:
  INT M
| INT? '.' INT M?
| INT? '.' INT EXPONENT_NUM_PART M?
| INT '.' EXPONENT_NUM_PART M?
| INT EXPONENT_NUM_PART M?
;
LONG: INT L;

BIN: '0' B BIN_DIGIT BIN_DIGIT_OR_SEPARATOR* L?;
HEX: '0' X HEX_DIGIT HEX_DIGIT_OR_SEPARATOR* L?;

fragment BIN_DIGIT:             [01];
fragment BIN_DIGIT_OR_SEPARATOR: BIN_DIGIT | UNDERSCORE;
fragment DEC_DIGIT:             [0-9];
fragment EXPONENT_NUM_PART:     E ('+'|'-')? DEC_DIGIT DEC_DIGIT_OR_SEPARATOR*;
fragment HEX_DIGIT:             [0-9a-fA-F];
fragment HEX_DIGIT_OR_SEPARATOR: HEX_DIGIT | UNDERSCORE;
fragment DEC_DIGIT_OR_SEPARATOR: DEC_DIGIT | UNDERSCORE;
fragment HEX_DIGIT_4: HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;

OID:
  O I D '"' HEX_DIGIT_4 HEX_DIGIT_4 HEX_DIGIT_4 HEX_DIGIT_4 HEX_DIGIT_4 HEX_DIGIT_4 '"'
| O I D '\'' HEX_DIGIT_4 HEX_DIGIT_4 HEX_DIGIT_4 HEX_DIGIT_4 HEX_DIGIT_4 HEX_DIGIT_4 '\'';

ID: UNQUOTED_ID | QUOTED_ID;
fragment UNQUOTED_ID: [_a-zA-Z] [_a-zA-Z0-9]*;
fragment QUOTED_ID: '`' ('\\'. | '``' | ~('`' | '\\'))* '`';

STRING: DQ_STRING | SQ_STRING;
fragment DQ_STRING: '"' ('\\'. | '""' | ~('"' | '\\'))* '"';
fragment SQ_STRING: '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'';

VARIABLE_ID: '$' [a-z][_a-zA-Z0-9]*;
WS: ( ' ' | '\t' | '\r' | '\n' )+ -> skip;

// RFC 3339
DATE_TIME:
  D T '"' FULL_DATE T FULL_TIME '"'
| D T '\'' FULL_DATE T FULL_TIME '\'';

fragment DATE_FULLYEAR: DEC_DIGIT DEC_DIGIT DEC_DIGIT DEC_DIGIT;
fragment DATE_MONTH: DEC_DIGIT DEC_DIGIT;
fragment DATE_MDAY: DEC_DIGIT DEC_DIGIT;
fragment TIME_HOUR: DEC_DIGIT DEC_DIGIT;
fragment TIME_MINUTE: DEC_DIGIT DEC_DIGIT;
fragment TIME_SECOND: DEC_DIGIT DEC_DIGIT;
fragment TIME_SECOND_FRACTION: '.' DEC_DIGIT+;
fragment TIME_NUM_OFFSET: ('+' | '-') TIME_HOUR COLON TIME_MINUTE;
fragment TIME_OFFSET: Z | TIME_NUM_OFFSET;
fragment PARTIAL_TIME: TIME_HOUR ':' TIME_MINUTE ':' TIME_SECOND TIME_SECOND_FRACTION?;
fragment FULL_DATE: DATE_FULLYEAR '-' DATE_MONTH '-' DATE_MDAY;
fragment FULL_TIME: PARTIAL_TIME TIME_OFFSET;

// CASE-INSENSITIVE LETTERS
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');
