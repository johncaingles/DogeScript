grammar DogeScript;



/* CFG */
//start with main
start : FuncStarter VoidKeyword MainKeyword OpenParenthesis CloseParenthesis OpenBrace VarDecStarter DATATYPE VarIdentifier Terminator CloseBrace EndOfFile ;  

     
  
// a single or mutliple codeblock  
CODEBLOCK : ALL_POSSIBLE CODEBLOCK
          | ALL_POSSIBLE
          ;

// all possible code blocks
ALL_POSSIBLE : VARIABLE_DECLARATION
             | ASSIGNMENT_STATEMENT
             | CONDITIONAL_STATEMENT
             | LOOP_STATEMENT
             | FUNCTION_CALL
             ;
             
//single all possible 
SINGLE_ALL_POSSIBLE : VARIABLE_DECLARATION
             | ASSIGNMENT_STATEMENT
             | CONDITIONAL_STATEMENT
             | LOOP_STATEMENT
             | FUNCTION_CALL
             ;
  
// used mainly for counter controlled loops
AFTERTHOUGHT_STATEMENT : ASSIGNMENT_STATEMENT
                        | FUNCTION_CALL
                        ;
  
// TODO: FUNCTION_DECLARATION
FUNCTION_DECLARATION : FuncStarter DATATYPE VarIdentifier OpenParenthesis FUNCTION_DECLARATION_PARAMETERS CloseParenthesis 
                       OpenBrace CODEBLOCK CloseBrace
                       ;
  
FUNCTION_DECLARATION_PARAMETERS : DATATYPE VarIdentifier
                                | DATATYPE VarIdentifier Comma FUNCTION_DECLARATION_PARAMETERS
                                ;
  
// TODO: a function with a void return type
  

VARIABLE_DECLARATION : VarDecStarter DATATYPE VARIABLE_INSTANCE Terminator
                     | VarDecStarter DATATYPE VarIdentifier AssOp RETURNS_VALUE Terminator
                     ;
 
//CONSTANT_DECLARATION : ConDecStarter ConstantVarIdentifier AssignOp LITERAL
//                     ;
  
// TODO: LITERAL
LITERAL : IntLit
        | FloatLit
//        | StringLit
//        | CharLit
//        | BoolLit
        ;

DATATYPE : IntDataType
//         | CharDataType
//         | BoolDataType
//         | StringDataType
         ;
         
// VarIdentifier : ([a-zA-Z][a-zA-Z0-9]*); 

VARIABLE_INSTANCE : VarIdentifier Comma VARIABLE_INSTANCE
				  | VarIdentifier
                  ; 
 

// TODO: RETURNS_VALUE  
RETURNS_VALUE : LITERAL
              | EXPRESSION
              | FUNCTION_CALL
              | VarIdentifier
              | NullKeyword
              ;
  
// TODO: EXPRESSION
EXPRESSION : //return result
    LOWPRIOR 
    Terminator
    ;

LOWPRIOR :
    HIGHPRIOR
    (AddOp HIGHPRIOR  
    | SubOp HIGHPRIOR)*
    | HIGHPRIOR  
    ;

HIGHPRIOR :
    SIGNINT
    (MulOp SIGNINT
    |DivOp SIGNINT
    |ModOp SIGNINT)*
    |SIGNINT
    ;
    
SIGNINT :
    '-' TOPPRIOR
    //{System.out.println("signed(-): " + $res);}
    //| '+' temp = topPrior {$res = $temp.res;}
    //{System.out.println("signed(+): " + $res);}
    | TOPPRIOR
    //{System.out.println("unsigned: " + $res);}
    ;
    
TOPPRIOR:
    IntLit
    //{System.out.println("returned from bottom: " + $res);}
    | OpenParenthesis EXPRESSION CloseParenthesis
    ;
  
  
ASSIGNMENT_STATEMENT : VarIdentifier AssOp VarIdentifier Terminator // this production can be removed because it is part of RETURNS_VALUE
                     | VarIdentifier AssOp RETURNS_VALUE Terminator
                     ;

CONDITIONAL_STATEMENT : START_CONDITION
                      | START_CONDITION END_CONDITION
                      | START_CONDITION CONTINUE_CONDITION 
                      | START_CONDITION CONTINUE_CONDITION END_CONDITION
                      ;
  
  //TODO: SINGLE_ALL_POSSIBLE
  
START_CONDITION : IfKeyword OpenParenthesis CONDITION CloseParenthesis SINGLE_ALL_POSSIBLE
                | IfKeyword OpenParenthesis CONDITION CloseParenthesis OpenBrace SINGLE_ALL_POSSIBLE CloseBrace
                | IfKeyword OpenParenthesis CONDITION CloseParenthesis OpenBrace CODEBLOCK CloseBrace
                ;
                

END_CONDITION : ElseKeyword OpenParenthesis CONDITION CloseParenthesis SINGLE_ALL_POSSIBLE
              | ElseKeyword OpenParenthesis CONDITION CloseParenthesis OpenBrace SINGLE_ALL_POSSIBLE CloseBrace
              | ElseKeyword OpenParenthesis CONDITION CloseParenthesis OpenBrace CODEBLOCK CloseBrace
              ;

CONTINUE_CONDITION : ElseIfKeyword OpenParenthesis CONDITION CloseParenthesis SINGLE_ALL_POSSIBLE
                   | ElseIfKeyword OpenParenthesis CONDITION CloseParenthesis SINGLE_ALL_POSSIBLE CloseBrace
                   | ElseIfKeyword OpenParenthesis CONDITION CloseParenthesis OpenBrace CODEBLOCK CloseBrace
                   ;

CONDITION  : VarIdentifier COMPARISON VarIdentifier 
           | VarIdentifier COMPARISON EXPRESSION
           | EXPRESSION COMPARISON VarIdentifier
           | OpenParenthesis CONDITION CloseParenthesis
           | VarIdentifier COMPARISON VarIdentifier LOGICAL_OPERATOR CONDITION
           | VarIdentifier COMPARISON EXPRESSION LOGICAL_OPERATOR CONDITION
           | EXPRESSION COMPARISON VarIdentifier LOGICAL_OPERATOR CONDITION
           ;

COMPARISON : EquaOp
           | GreaterThanOp
           | LessThanOp
           | GreaterThanEqualTo
           | LessThanEqualTo
           | NotEqualToOp
           ;

LOGICAL_OPERATOR : AndOp
                 | OrOp
                 ;
 
  
// LOOP_STATEMENT
LOOP_STATEMENT : EVENT_LOOP_STATEMENT
               | COUNT_LOOP_STATEMENT
               | REPEATUNTIL_LOOP_STATEMENT
               ;

EVENT_LOOP_STATEMENT : EventLoopKeyword OpenParenthesis CONDITION CloseParenthesis OpenBrace CODEBLOCK CloseBrace
                     ;

COUNT_LOOP_STATEMENT : CountLoopKeyword OpenParenthesis VARIABLE_DECLARATION Terminator CONDITION Terminator AFTERTHOUGHT_STATEMENT  CloseParenthesis OpenBrace CODEBLOCK CloseBrace
                     | CountLoopKeyword OpenParenthesis ASSIGNMENT_STATEMENT Terminator CONDITION Terminator AFTERTHOUGHT_STATEMENT  CloseParenthesis OpenBrace CODEBLOCK CloseBrace
                     ;

REPEATUNTIL_LOOP_STATEMENT : RepeatUntilLoopKeyword OpenBrace CODEBLOCK CloseBrace EventLoopKeyword OpenParenthesis CONDITION CloseParenthesis Terminator
                           ;
 
  
FUNCTION_CALL : VarIdentifier OpenParenthesis FUNCTION_CALL_PARAMETERS CloseParenthesis Terminator ;
  
//TODO FUNCTION_CALL_PARAMETERS
FUNCTION_CALL_PARAMETERS : RETURNS_VALUE
                         | RETURNS_VALUE Comma FUNCTION_CALL_PARAMETERS
                         ;
 
 
 /* Lexical Specs */
//white space
WS: [ \t\r\n]+ -> skip;
// Datatypes
IntDataType : 'int' ;
CharDataType : 'char' ;
BoolDataType : 'boolean' ;
StringDataType : 'string' ;


// Delimiters so fancy
Terminator : 'wow' ;
VarDecStarter : 'such' ;
FuncStarter : 'much' ;
ConstantStarter : 'very' ;

AssOp : 'as' ;

// comment block : very cmt [A-Za-z0-9 ]⁺ very cmt

IfKeyword : 'rily' ;
ElseKeyword : 'but' ;
ElseIfKeyword : 'but rily' ;

// TODO loops
 EventLoopKeyword : 'sex' ;
 CountLoopKeyword : 'sex' ;
 RepeatUntilLoopKeyword : 'sex' ;

//extra
VoidKeyword : 'void' ; 
MainKeyword : 'main' ;
Comma : ',' ;
NullKeyword: 'null' ;

//boolean priority
BoolLit : 'yiz' 
        | 'nu' ;

//operators
AddOp : '+' ;
SubOp : '-' ;
MulOp : '*' ;
DivOp : '/' ;
ModOp : '%' ;

// Conditions
EquaOp : 'is' ;
GreaterThanOp : '>' ;
LessThanOp : '<' ;
GreaterThanEqualTo : '>=' ;
LessThanEqualTo : '<=' ;
NotEqualToOp : '!=' ;
AndOp : 'and' ;
OrOp : 'or' ;



// Increment
IncrementOp : '++' ;
DecrementOp : '--' ;

// Grouping symbols
OpenBrace : '{' ;
CloseBrace : '}' ;
OpenParenthesis : '(' ;
CloseParenthesis : ')' ;



// Literals
IntLit : [0-9]+ ;
FloatLit : [0-9]+.[0-9]+ ;
//StringLit : '"'[A-Za-z0-9]*'"' ;
//CharLit : '\''[A-Za-z0-9]'\'' ;

// Naming rules
Array : '['[0-9]+']' ; // sketchy
//ConstantVarIdentfier : [A-Z0-9]+ ;
VarIdentifier : ([a-zA-Z][a-zA-Z0-9]*);
//FuncIdentifier : [a-zA-Z][a-zA-Z0-9]* ;


//end of file
EndOfFile: '$' ; 
