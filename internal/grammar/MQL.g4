grammar MQL;

// EOF
fullStatement: statement EOF;
fullPipeline: pipeline EOF;

// STATEMENTS
statement:
  queryStatement
| showCollectionsStatement
| showDatabasesStatement
| useDatabaseStatement
;

queryStatement: FROM collectionName pipeline;

pipeline:
  queryStage*
;

showCollectionsStatement:
  SHOW FULL? COLLECTIONS (IN databaseName)? (MATCH expression)?
;

showDatabasesStatement: 
  SHOW FULL? DATABASES (MATCH expression)?
;

useDatabaseStatement: USE databaseName;

// QUERY STAGES
queryStage:
  GROUP LBRACE fieldAssignment (COMMA fieldAssignment)* RBRACE (BY expression)?         #groupStage
| LIMIT INT                                                                             #limitStage
| LOOKUP LBRACE multipartFieldDeclaration COLON
    (LBRACE variableAssignment (COMMA variableAssignment)* RBRACE ARROW)?
    queryStatement
  RBRACE                                                                                #lookupStage
| MATCH expression                                                                      #matchStage
| PROJECT LBRACE projectItem (COMMA projectItem)* RBRACE                                #projectStage
| SKIP_ INT                                                                             #skipStage
| SORT sortField (COMMA sortField)*                                                     #sortStage
| UNWIND multipartFieldName (WITH LPAREN unwindOption+ RPAREN)?                         #unwindStage
;

projectItem:
  EXCLUDE multipartFieldDeclaration #excludeProjectItem
| multipartFieldDeclaration         #includeProjectItem
| fieldDeclaration COLON expression #assignProjectItem
;

sortField:
  multipartFieldName (ASC | DESC)?
;

unwindOption:
  INDEX multipartFieldDeclaration
| PRESERVE_NULL_AND_EMPTY
;

// EXPRESSIONS
expression:
  <assoc=right>expression POWER expression                                                 #powerExpression
| MINUS expression                                                                         #unaryMinusExpression
| NOT expression                                                                           #notExpression
| expression DOT (fieldName | function)                                                    #memberExpression
| expression LBRACK (
        index=expression
      | (index=expression)? RANGE (end=expression)? (COLON step=expression)?
    ) RBRACK                                                                               #arrayAccessExpression
| expression RANGE expression (COLON expression)?                                          #rangeExpression
| expression LIKE REGEX                                                                    #likeExpression
| expression op=(MULT | DIV | MOD) expression                                              #multiplicationExpression
| expression op=(PLUS | MINUS) expression                                                  #additionExpression
| expression op=(EQ | GT | GTE | LT | LTE | NEQ) expression                                #comparisonExpression
| expression AND expression                                                                #andExpression
| expression (OR | NOR) expression                                                         #orExpression
| expression CONCAT expression                                                             #concatExpression
| expression DQUESTION expression                                                          #nullCoalesceExpression
| expression NOT? IN array                                                                 #inExpression
| SWITCH switchCase+ (ELSE expression)?                                                    #switchExpression
| IF expression THEN expression ELSE expression                                            #conditionalExpression
| LBRACE variableAssignment (COMMA variableAssignment)* RBRACE ARROW expression            #letExpression
| LPAREN expression RPAREN                                                                 #parenthesisExpression
| function                                                                                 #functionExpression
| fieldName                                                                                #fieldExpression
| variableName                                                                             #variableExpression
| document                                                                                 #documentExpression
| array                                                                                    #arrayExpression
| value                                                                                    #valueExpression
;

array:
  LBRACK (expression (COMMA expression)*)? RBRACK;

document:
  LBRACE (fieldAssignment (COMMA fieldAssignment)*)? RBRACE
;

fieldAssignment:
  fieldDeclaration COLON expression
;

multipart_document:
  LBRACE (multipartFieldAssignment (COMMA multipartFieldAssignment)*)? RBRACE
;

multipartFieldAssignment:
  multipartFieldDeclaration COLON expression
;

function:
  functionName LPAREN functionArguments? RPAREN
;

functionArguments:
  expression (COMMA expression)*                        #functionArrayArguments
| functionNamedArgument (COMMA functionNamedArgument)*  #functionDocumentArguments
;

functionNamedArgument:
  functionArgumentName COLON expression
;

lambdaArgument:
  variableName
| UNDERSCORE
;

lambdaExpression:
  lambdaArgument ARROW expression
| LPAREN lambdaArgument (COMMA lambdaArgument)* RPAREN ARROW expression
;

switchCase:
  CASE expression THEN expression
;

variableAssignment:
  variableName COLON expression
;

// VALUES

value:
  number                                                                                   #numberValue
| STRING                                                                                   #stringValue
| (TRUE | FALSE)                                                                           #booleanValue
| NULL                                                                                     #nullValue
| OID                                                                                      #oidValue
| DATE_TIME                                                                                #dateTimeValue
| REGEX                                                                                    #regexValue
;

number:
  INT #intValue
| LONG #longValue
| DOUBLE #doubleValue
| DECIMAL #decimalValue
| BIN #binValue
| LONG_BIN #longBinValue
| HEX #hexValue
| LONG_HEX #longHexValue
| OCT #octValue
| LONG_OCT #longOctValue
;

// NAMING
collectionName:
  ID
| databaseName DOT ID
;

databaseName: ID;

fieldDeclaration: ID;

fieldName: ID;

functionName: ID;

functionArgumentName: ID;

multipartFieldDeclaration: fieldDeclaration (DOT fieldDeclaration)*;

multipartFieldName: fieldName (DOT fieldName)*;

variableName: VARIABLE_ID;

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
COLLECTIONS: C O L L E C T I O N S;
DATABASES: D A T A B A S E S;
DELETE:   D E L E T E;
DESC:     D E S C;
ELSE:     E L S E;
FALSE:    F A L S E;
FROM:     F R O M;
FULL:     F U L L;
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
NOR:      N O R;
NOT:      N O T;
NULL:     N U L L;
ONE:      O N E;
OR:       O R;
PROJECT:  P R O J E C T;
SET:      S E T;
SHOW: S H O W;
SKIP_:    S K I P;
SORT:     S O R T;
STEP:     S T E P;
SWITCH:   S W I T C H;
THEN:     T H E N;
TRUE:     T R U E;
UNWIND:   U N W I N D;
UPDATE:   U P D A T E;
USE:      U S E;
WITH:     W I T H;

PRESERVE_NULL_AND_EMPTY: P R E S E R V E '_' N U L L '_' A N D '_' E M P T Y;


// TYPES
REGEX: '/' ('\\''/' | ~('/'))* '/' [a-zA-Z]*;

INT: MINUS? DEC_DIGIT DEC_DIGIT_OR_SEPARATOR*;
DOUBLE:
  INT F
| INT? '.' INT F?
| INT? '.' INT EXPONENT_NUM_PART F?
| INT '.' EXPONENT_NUM_PART F?
| INT EXPONENT_NUM_PART F?
;
DECIMAL:
  INT M
| INT? '.' INT M
| INT? '.' INT EXPONENT_NUM_PART M
| INT '.' EXPONENT_NUM_PART M
| INT EXPONENT_NUM_PART M
;
LONG: INT L;

BIN: '0' B BIN_DIGIT BIN_DIGIT_OR_SEPARATOR*;
LONG_BIN: BIN L;
HEX: '0' X HEX_DIGIT HEX_DIGIT_OR_SEPARATOR*;
LONG_HEX: HEX L;
OCT: '0' O OCT_DIGIT OCT_DIGIT_OR_SEPARATOR*;
LONG_OCT: OCT L;

fragment BIN_DIGIT:             [01];
fragment BIN_DIGIT_OR_SEPARATOR: BIN_DIGIT | UNDERSCORE;
fragment DEC_DIGIT:             [0-9];
fragment DEC_DIGIT_OR_SEPARATOR: DEC_DIGIT | UNDERSCORE;
fragment EXPONENT_NUM_PART:     E ('+'|'-')? DEC_DIGIT DEC_DIGIT_OR_SEPARATOR*;
fragment HEX_DIGIT:             [0-9a-fA-F];
fragment HEX_DIGIT_OR_SEPARATOR: HEX_DIGIT | UNDERSCORE;
fragment HEX_DIGIT_4: HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;
fragment OCT_DIGIT: [0-7];
fragment OCT_DIGIT_OR_SEPARATOR: OCT_DIGIT | UNDERSCORE;

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
