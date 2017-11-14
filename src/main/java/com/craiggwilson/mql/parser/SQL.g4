grammar sql;

parse: statement (SEMI statement)* SEMI? EOF;

statement:
  select_statement
;

select_statement:
  SELECT select_item (COMMA select_item)*
  from_specification?
;

select_item:
  STAR
| expression (AS? alias_name)?
;

from_specification:
  FROM multipart_identifier alias_name?
  join_specification*
;

join_specification:
  JOIN alias_name IN multipart_identifier
;

// EXPRESSIONS
expression:
  <assoc=right>expression CARET expression                              #powerExpression
| MINUS expression                                                      #unaryMinusExpression
| (NOT | NOT_SYMBOL) expression                                         #notExpression
| expression op=(STAR | DIV | MOD) expression                           #multiplicationExpression
| expression op=(PLUS | MINUS) expression                               #additionExpression
| expression op=(EQ | GT | GTE | LT | LTE | NEQ) expression             #comparisonExpression
| expression AND expression                                             #andExpression
| expression OR expression                                              #orExpression
| expression LBRACK INT RBRACK                                          #arrayElementExpression
| expression LBRACK STRING RBRACK                                       #memberStringExpression
| expression DOT expression                                             #memberExpression
| LBRACE (field_assignment (COMMA field_assignment)*)? RBRACE           #documentExpression
| LBRACK (expression (COMMA expression)*)? RBRACK                       #arrayExpression
| function_name LPAREN (expression (COMMA expression)*)? RPAREN         #functionCallExpression
| field_name                                                            #fieldExpression
| INT                                                                   #numberExpression
| DECIMAL                                                               #decimalExpression
| STRING                                                                #stringExpression
| (TRUE | FALSE)                                                        #boolExpression
| NULL                                                                  #nullExpression
| LPAREN expression RPAREN                                              #parenthesisExpression
;

field_assignment:
  field_name ASSIGN expression
;


// NAMING
alias_name: ID;
collection_name: (database_name DOT)? ID;
multipart_identifier: ID (DOT ID | LBRACK STRING RBRACK)*;
database_name: ID;
field_name: ID;
function_name: ID;

/////////////
// LEXER
/////////////

ASSIGN:     ':';
CARET:      '^';
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
NEQ:        '!=';
NOT_SYMBOL: '!';
PLUS:       '+';
RBRACE:     '}';
RBRACK:     ']';
RPAREN:     ')';
SEMI:       ';';
STAR:       '*';

// KEYWORDS
AND:      A N D;
AS:       A S;
ASC:      A S C;
BY:       B Y;
DESC:     D E S C;
FALSE:    F A L S E;
FROM:     F R O M;
GROUP:    G R O U P;
IN:       I N;
JOIN:     J O I N;
LIMIT:    L I M I T;
NOT:      N O T;
NULL:     N U L L;
OR:       O R;
SELECT:   S E L E C T;
TRUE:     T R U E;
WITH:     W I T H;


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

STRING:
  ('\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'')
| ('"' ('\\'. | '""' | ~('"' | '\\'))* '"')
;
ID: [$_a-zA-Z]+;
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
