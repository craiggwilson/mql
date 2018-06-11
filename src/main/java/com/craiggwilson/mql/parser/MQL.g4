grammar MQL;

parse: statement (SEMI statement)* SEMI? EOF;

statement:
  pipeline
;

pipeline: FROM collection_name stage+;

// STAGES
stage:
  group_stage
| limit_stage
| lookup_stage
| match_stage
| project_stage
| skip_stage
| sort_stage
| unwind_stage
;

group_stage:
  GROUP field_assignment (COMMA field_assignment)* BY expression (COMMA expression)*
;

limit_stage:
  LIMIT INT
;

lookup_stage:
  LOOKUP
  (LET variable_assignment (COMMA variable_assignment)* )?
  multipart_field_name ASSIGN LPAREN pipeline RPAREN
;

match_stage:
  MATCH expression
;

project_stage:
  PROJECT field_assignment (COMMA field_assignment)*
;

skip_stage:
  SKIP_ INT
;

sort_stage:
  SORT sort_field (COMMA sort_field)*
;

sort_field:
  multipart_field_name (ASC | DESC)?
;

unwind_stage:
  UNWIND multipart_field_name (WITH unwind_option+)?
;

unwind_option:
  INDEX multipart_field_name
| PRESERVE_NULL_AND_EMPTY
;


// EXPRESSIONS
expression:
  <assoc=right>expression CARET expression                              #powerExpression
| MINUS expression                                                      #unaryMinusExpression
| (NOT | NOT_SYMBOL) expression                                         #notExpression
| expression op=(MULT | DIV | MOD) expression                           #multiplicationExpression
| expression op=(PLUS | MINUS) expression                               #additionExpression
| expression op=(EQ | GT | GTE | LT | LTE | NEQ) expression             #comparisonExpression
| expression (AND | AND_SYMBOL) expression                              #andExpression
| expression (OR | OR_SYMBOL) expression                                #orExpression
| expression LBRACK (
        expression
      | expression COLON expression?
      | expression? COLON expression
    ) RBRACK                                                            #arrayExpression
| expression RANGE expression                                           #rangeExpression
| expression DOT (id | function)                                        #memberExpression
| SWITCH (CASE expression THEN expression)+ (ELSE expression)?          #switchExpression
| IF expression THEN expression ELSE expression                         #conditionalExpression
| LET variable_assignment (COMMA variable_assignment)* IN expression    #letExpression
| LBRACE (field_assignment (COMMA field_assignment)*)? RBRACE           #documentExpression
| LBRACK (expression (COMMA expression)*)? RBRACK                       #arrayExpression
| LPAREN expression RPAREN                                              #parenthesisExpression
| function                                                              #functionCallExpression
| variable_name                                                         #variableReferenceExpression
| id                                                                    #fieldExpression
| INT                                                                   #numberExpression
| DECIMAL                                                               #decimalExpression
| STRING                                                                #stringExpression
| (TRUE | FALSE)                                                        #boolExpression
| NULL                                                                  #nullExpression
;

field_assignment:
  (multipart_field_name ASSIGN)? expression
;

function:
  function_name LPAREN (function_argument (COMMA function_argument)*)? RPAREN
;

function_argument:
  expression
| lambda_expression
| id ASSIGN function_argument;

lambda_argument:
  variable_name
| UNDERSCORE
;

lambda_expression:
  lambda_argument (COMMA lambda_argument)* ARROW expression
;

variable_assignment:
  (variable_name ASSIGN)? expression
;

// NAMING
collection_name:
  (QUOTED_ID | UNQUOTED_ID)
| database_name DOT (QUOTED_ID | UNQUOTED_ID)
;

database_name: (QUOTED_ID | UNQUOTED_ID);

multipart_field_name: id (DOT id)*;

id:
  QUOTED_ID
| UNQUOTED_ID
;

function_name:
  UNQUOTED_ID
;

variable_name: DOLLAR (QUOTED_ID | UNQUOTED_ID);

/////////////
// LEXER
/////////////

AND_SYMBOL: '&&';
ARROW:      '=>';
ASSIGN:     ':=';
CARET:      '^';
COLON:      ':';
COMMA:      ',';
DIV:        '/';
DOLLAR:     '$';
DOT:        '.';
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
MULT:       '*';
NEQ:        '!=';
NOT_SYMBOL: '!';
OR_SYMBOL:  '||';
PIPE:       '|';
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
LIMIT:    L I M I T;
LOOKUP:   L O O K U P;
MATCH:    M A T C H;
NOT:      N O T;
NULL:     N U L L;
OR:       O R;
PROJECT:  P R O J E C T;
SKIP_:    S K I P;
SORT:     S O R T;
STARTING: S T A R T I N G;
SWITCH:   S W I T C H;
THEN:     T H E N;
TRUE:     T R U E;
UNWIND:   U N W I N D;
WITH:     W I T H;

PRESERVE_NULL_AND_EMPTY: P R E S E R V E '_' N U L L '_' A N D '_' E M P T Y;


// TYPES
INT: DEC_DIGIT+;
DECIMAL:
  (DEC_DIGIT+)? '.' DEC_DIGIT+
| (DEC_DIGIT+)? '.' (DEC_DIGIT+ EXPONENT_NUM_PART)
| DEC_DIGIT+ '.' EXPONENT_NUM_PART
| DEC_DIGIT+ EXPONENT_NUM_PART
;

BIN: '0' B BIN_DIGIT+;
HEX: '0' X HEX_DIGIT+;

STRING: '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'';
QUOTED_ID: '`' ('\\'. | '\'\'' | ~('`' | '\\'))* '`';
UNQUOTED_ID: [_a-zA-Z]+;
WS: ( ' ' | '\t' | '\r' | '\n' )+ -> skip;

fragment BIN_DIGIT:             [01];
fragment DEC_DIGIT:             [0-9];
fragment EXPONENT_NUM_PART:     E '-'? DEC_DIGIT+;
fragment HEX_DIGIT:             [0-9a-fA-F];


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
