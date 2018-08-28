grammar MQL;

parse: statement (SEMI statement)* SEMI? EOF;

// STATEMENTS
statement:
  query_statement                                                                                   #queryStatement
| INSERT INTO collection_name
    (document | LBRACK document (COMMA document)* RBRACK)                                           #insertStatement
| DELETE (ONE | MANY)? FROM collection_name MATCH expression                                        #deleteStatement
| UPDATE (ONE | MANY)? FROM collection_name
    (MATCH expression)?
    SET multipart_document                                                                          #updateStatement
;

query_statement: FROM collection_name query_stage*;

// QUERY STAGES
query_stage:
  GROUP LBRACE field_assignment (COMMA field_assignment)* RBRACE (BY expression)?      #groupStage
| LIMIT INT                                                                            #limitStage
| LOOKUP LBRACE multipart_field_declaration COLON
    (LBRACE variable_assignment (COMMA variable_assignment)* RBRACE ARROW)?
    query_statement
  RBRACE                                                                               #lookupStage
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
  <assoc=right>expression POWER expression                                                 #powerExpression
| MINUS expression                                                                         #unaryMinusExpression
| NOT expression                                                                           #notExpression
| expression DOT (field_name | function)                                                   #memberExpression
| expression LBRACK (
        start=expression
      | (start=expression)? RANGE (end=expression)? (COLON step=expression)?
    ) RBRACK                                                                               #arrayAccessExpression
| expression RANGE expression (COLON expression)?                                          #rangeExpression
| expression LIKE regex                                                                    #likeExpression
| expression op=(MULT | DIV | MOD) expression                                              #multiplicationExpression
| expression op=(PLUS | MINUS) expression                                                  #additionExpression
| expression op=(EQ | GT | GTE | LT | LTE | NEQ) expression                                #comparisonExpression
| expression AND expression                                                                #andExpression
| expression OR expression                                                                 #orExpression
| expression CONCAT expression                                                             #concatExpression
| expression DQUESTION expression                                                          #nullCoalesceExpression
| expression NOT? IN expression                                                            #inExpression
| SWITCH switch_case+ (ELSE expression)?                                                   #switchExpression
| IF expression THEN expression ELSE expression                                            #conditionalExpression
| LBRACE variable_assignment (COMMA variable_assignment)* RBRACE ARROW expression          #letExpression
| LPAREN expression RPAREN                                                                 #parenthesisExpression
| function                                                                                 #functionCallExpression
| field_name                                                                               #fieldExpression
| variable_name                                                                            #variableReferenceExpression
| document                                                                                 #newDocumentExpression
| LBRACK (expression (COMMA expression)*)? RBRACK                                          #newArrayExpression
| value                                                                                    #valueExpression
;

document:
  LBRACE (field_assignment (COMMA field_assignment)*)? RBRACE
;

field_assignment:
  field_declaration COLON expression
;

multipart_document:
  LBRACE (multipart_field_assignment (COMMA multipart_field_assignment)*)? RBRACE
;

multipart_field_assignment:
  multipart_field_declaration COLON expression
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

switch_case:
  CASE expression THEN expression
;

variable_assignment:
  variable_name COLON expression
;

// VALUES

value:
  number                                                                                   #numberValue
| STRING                                                                                   #stringValue
| (TRUE | FALSE)                                                                           #booleanValue
| NULL                                                                                     #nullValue
| OID                                                                                      #oidValue
| DATE_TIME                                                                                #dateTimeValue
| regex                                                                                    #regexValue
;

number:
  (INT | LONG | DECIMAL | BIN | HEX)
;

regex: REGEX;

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
DELETE:   D E L E T E;
DESC:     D E S C;
ELSE:     E L S E;
FALSE:    F A L S E;
FROM:     F R O M;
GROUP:    G R O U P;
IF:       I F;
IN:       I N;
INDEX:    I N D E X;
INSERT:   I N S E R T;
INTO:     I N T O;
LET:      L E T;
LIKE:     L I K E;
LIMIT:    L I M I T;
LOOKUP:   L O O K U P;
MANY:     M A N Y;
MATCH:    M A T C H;
NOT:      N O T;
NULL:     N U L L;
ONE:      O N E;
OR:       O R;
PROJECT:  P R O J E C T;
SET:      S E T;
SKIP_:    S K I P;
SORT:     S O R T;
STEP:     S T E P;
SWITCH:   S W I T C H;
THEN:     T H E N;
TRUE:     T R U E;
UNWIND:   U N W I N D;
UPDATE:   U P D A T E;
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
