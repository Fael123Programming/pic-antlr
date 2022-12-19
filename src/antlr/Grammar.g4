grammar Grammar;

@header {
    package antlr;
}

// Data types.
INT             : '-'?[0-9]+ ;
FLOAT           : '-'?[0-9]+('.'[0-9]+)? ;
BOOL            : (
    'True' | 
    'False'
);
STR             : (
    '\''(ESC_SEQ1        | 
    ~('\'' | '\\'))*'\'' | 
    '"'(ESC_SEQ2 | ~('"' | 
    '\\'))*'"'
);
ESC_SEQ1        : '\\\'' ;
ESC_SEQ2        : '\\"'  ;
// Arithmetic operators from lower to higher precedence.
ARIT_OP1           : (
    '+' |  
    '-'
); 
ARIT_OP2           : (
    '*' | 
    '/' | 
    '%' | 
    '//'
);
ARIT_OP3           : '**' ;
// Relational operators.
REL_OP             :  (
    '<'  | 
    '<=' | 
    '>'  | 
    '>=' | 
    '==' | 
    '!='
);
// Logic operators.
LOG_OP             : (
    'and' | 
    'or'  | 
    'not'
);
// Comments.
COMM            : (
    '#'~('\n' | '\r')*('\n' | EOF) |
    '\'\'\''~('\'')*'\'\'\''       |
    '"""'~('"')*'"""'
) { skip(); } ;
// Elements the parser should ignore.
WS: (' ' | '\r' | '\t' | '\n') { skip(); } ;
// Identifiers of variables, functions and modules.
ID              : (
    [a-z] | 
    [A-Z] | 
    '_'   
) (
    [a-z] | 
    [A-Z] | 
    '_'   | 
    [0-9]
)*;
// Variable or literal declaration.
rvalue          : 
    INT         | 
    FLOAT       | 
    BOOL        |    
    STR         |
    list        |
    tuple       |
    arithExp    |
    relExp      |
    functionCall
;
dec             : 
    ID '=' rvalue
;
// Arithmetic expression.
arithFac               : 
    INT     |
    FLOAT   |
    ID      |
    '(' arithExp ')'
;
arithExp               : 
    arithExp ARIT_OP1 arithTerm  |
    arithTerm
;    
arithTerm :
    arithTerm ARIT_OP2 expoExp |
    expoExp
;
expoExp :
    expoExp ARIT_OP3 arithFac |
    arithFac
;
// Relational expression.
relExp :
    relExp LOG_OP relTerm |
    relTerm |
    BOOL
;
relTerm :
    arithExp REL_OP arithExp |
    '(' relExp ')'
;
// Flow control.
// Conditionals.
conditInit : 
    'if' relExp ':' stmts conditMid  conditEnd
;
conditMid :
    'elif' relExp ':' stmts conditMid |    
;
conditEnd :
    'else' ':' stmts |
;
// For loop.
forLoop :
    'for' ID 'in' iter ':' stmts
;
// Main parse rule.
prog: stmts EOF
    ;
// Statements
stmts: stmt+    # Statements
    ;
stmt:
    'pass'          |
    dec             |
    forLoop         |
    conditInit      |
    functionCall
;
// Iterable.
iter:
    STR  |
    list |
    tuple |
    ID
;
list:
    '[' rvalue ']' |
    '[]'
;
tuple:
    '(' rvalue ')' |
    '()'
;
// Function call.
functionCall:
    ID '(' rvalue ')'
;