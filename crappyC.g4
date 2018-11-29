

grammar crappyC;

@header {
    import wci.intermediate.TypeSpec;
    //import wci.intermediate.symtabimpl.*;
}

program 
	:	header '{' declarations (function_def)* main_def '}'
	; 
header
	: 'class' IDENTIFIER
	;
declarations :	'variables' '{'(var_dec_list)?'}';
var_dec_list :var_dec ( ',' var_dec)* ;
var_dec 	 : typeId varId;
varId 		 : IDENTIFIER;

main_def
	:	'void' 'main' '{' (stmt_list)? '}'
	;
function_def  
	:	typeId variable '(' (var_dec_list)? ')' '{' (declarations)? (stmt_list)? '}' 
	;
function_call   
	:	variable '(' expr? (','expr)* ')'
	;
stmt 
	: assignment_stmt 
	| if_stmt 
	| for_stmt 
	| while_stmt
	| function_call
	| ret_stmt
	;
stmt_list   
	:	stmt ';'( stmt';')*
	;
assignment_stmt 
	:	 variable '=' expr 
	;
if_stmt 
	:	'if' '(' expr ')' '{' (stmt_list)? '}' ('else' if_stmt)* ('else' '{' (stmt_list)? '}')?
	;
for_stmt    
	:	'for' '(' assignment_stmt ';' expr ';' assignment_stmt ')' '{' (stmt_list)? '}' 
	;
while_stmt  
	:	'while' '(' expr ')' '{' (stmt_list)? '}' 
	;
ret_stmt
	:	'return' expr
	;
expr locals [ TypeSpec type = null ]
	: expr mul_div_op expr 	#mulDivExpr
    | expr add_sub_op expr	#addSubExpr
    | expr rel_op expr		#relExpr
    | expr bool_op expr		#boolExpr
    | number				#numberExpr
    | bool_val				#boolValExpr
    | variable				#varExpr
    | function_call			#funcExpr
    | '(' expr ')'			#parenExpr
    | 'null'				#nullExpr
    ;
variable 
	: IDENTIFIER
	;
number locals [ TypeSpec type = null ]
	: (sign)? INTEGER	#integerConst
	| (sign)? FLOAT		#floatConst
	;
mul_div_op 
	:	MUL_OP | DIV_OP 
	;
add_sub_op 
	:	ADD_OP | SUB_OP 
	;
bool_op 
	:	AND_OP | OR_OP	
	;
rel_op
	: 	EQ_OP | NE_OP | LT_OP | LE_OP | GT_OP | GE_OP 
	;
typeId
	: 'int' 
	| 'float' 
	| 'bool'
	;
bool_val locals [ TypeSpec type = null ]
	: 'true' |'false'
	;
sign   
	: ADD_OP 
	| SUB_OP
	;
	
MUL_OP :	'*'  ;
DIV_OP :	'/'  ;
ADD_OP :	'+'  ;
SUB_OP :	'-'  ;
EQ_OP  :	'==' ;
AND_OP :	'&&' ;
OR_OP  :	'||' ;
NE_OP  : 	'!=' ;
LT_OP  : 	'<'  ;
LE_OP  : 	'<=' ;
GT_OP  : 	'>'  ;
GE_OP  : 	'>=' ;


IDENTIFIER
    :   [a-zA-Z][a-zA-Z0-9]*
    ;
FLOAT
	: INTEGER '.' INTEGER*
	;
INTEGER
    :   [0-9]+
    ;
LINE_COMMENT
	:	'//' .*? '\n' -> skip
	;
COMMENT
	: '/*' .*? '*/' -> skip
	;
NEWLINE 
	: '\r'? '\n' -> skip	
	;
WS      
	: [ \t]+ -> skip	
	; 