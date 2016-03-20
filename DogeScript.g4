grammar DogeScript;

/* CFG */
//start with main
start : main_function EndOfFile;
	  
main_function : FuncStarter VoidKeyword MainKeyword OpenParenthesis CloseParenthesis OpenBrace codeblock CloseBrace;

codeblock : all_possible codeblock
          | all_possible
          ;
      
// all possible code blocks
all_possible : variable_declaration
             | assignment_statement
             | conditional_statement
//             | loop_statement
             | function_call
             ;
             
//single all possible 
single_all_possible : variable_declaration
             | assignment_statement
             | conditional_statement
             | loop_statement
             | function_call
             ;
  
// used mainly for counter controlled loops
afterthought_statement : assignment_statement
                        | function_call
                        ;
  
// TODO: function_declaration
function_declaration : FuncStarter datatype VarIdentifier OpenParenthesis function_declaration_paramaters CloseParenthesis 
                       OpenBrace codeblock CloseBrace
                       ;
  
function_declaration_paramaters : datatype VarIdentifier
                         | datatype VarIdentifier Comma function_declaration_paramaters
                         ;
  
// TODO: a function with a void return type
  

variable_declaration : VarDecStarter datatype variable_instance Terminator
                     | VarDecStarter datatype VarIdentifier AssOp returns_value Terminator
                     ;
 
//CONSTANT_DECLARATION : ConDecStarter ConstantVarIdentifier AssignOp literal
//                     ;
  
// TODO: literal
literal : IntLit
        | FloatLit
        | StringLit
        | CharLit
        | BoolLit
        ;
datatype : IntDataType
         | CharDataType
         | BoolDataType
         | StringDataType
         ;
         
// VarIdentifier : ([a-zA-Z][a-zA-Z0-9]*); 

variable_instance : VarIdentifier Comma variable_instance
				  | VarIdentifier
                  ; 
 

// TODO: returns_value  
returns_value : literal
               | expression
              | function_call
              | VarIdentifier
              | NullKeyword
              ;
  
// TODO: expression
expression : //return result
    low_prior
    {System.out.println("in expression");}
    ;

low_prior :
    high_prior 
    (AddOp high_prior  
	|SubOp high_prior)*
   	| high_prior  
    ;

high_prior :
    signint
    (MulOp signint
    |DivOp signint
    |ModOp signint)*
    | signint
    ;
    
signint :
    '-' top_prior
    //{System.out.println("signed(-): " + $res);}
    //| '+' temp = topPrior {$res = $temp.res;}
    //{System.out.println("signed(+): " + $res);}
    | top_prior
    //{System.out.println("unsigned: " + $res);}
    ;
    
top_prior:
    IntLit
    //{System.out.println("returned from bottom: " + $res);}
    | OpenParenthesis expression CloseParenthesis
    ;
  
  
assignment_statement : VarIdentifier AssOp VarIdentifier Terminator // this production can be removed because it is part of returns_value
                     | VarIdentifier AssOp returns_value Terminator
                     ;

conditional_statement : start_condition
                      | start_condition end_condition
                      | start_condition continue_condition 
                     | start_condition continue_condition end_condition
                     ;
  
  //TODO: single_all_possible
  
start_condition : IfKeyword OpenParenthesis condition CloseParenthesis single_all_possible
                | IfKeyword OpenParenthesis condition CloseParenthesis OpenBrace single_all_possible CloseBrace
               | IfKeyword OpenParenthesis condition CloseParenthesis OpenBrace codeblock CloseBrace
                ;
                
// to be changed - no need for condition on else statement
end_condition : ElseKeyword OpenParenthesis condition CloseParenthesis single_all_possible
              | ElseKeyword OpenParenthesis condition CloseParenthesis OpenBrace single_all_possible CloseBrace
              | ElseKeyword OpenParenthesis condition CloseParenthesis OpenBrace codeblock CloseBrace
              | ElseKeyword single_all_possible
              ;

continue_condition : ElseIfKeyword OpenParenthesis condition CloseParenthesis single_all_possible
                   | ElseIfKeyword OpenParenthesis condition CloseParenthesis single_all_possible CloseBrace
                   | ElseIfKeyword OpenParenthesis condition CloseParenthesis OpenBrace codeblock CloseBrace
                   ;

condition  : VarIdentifier comparison VarIdentifier 
           | VarIdentifier comparison expression
           | expression comparison VarIdentifier
           | OpenParenthesis condition CloseParenthesis
           | VarIdentifier comparison VarIdentifier logical_operator condition
           | VarIdentifier comparison expression logical_operator condition
           | expression comparison VarIdentifier logical_operator condition
           ;

comparison : EquaOp
           | GreaterThanOp
           | LessThanOp
           | GreaterThanEqualTo
           | LessThanEqualTo
           | NotEqualToOp
           ;

logical_operator : AndOp
                 | OrOp
                 ;
 
  
// loop_statement
loop_statement : event_loop_statement
               | count_loop_statement
               | repeatuntil_loop_statement
               ;

event_loop_statement : EventLoopKeyword OpenParenthesis condition CloseParenthesis OpenBrace codeblock CloseBrace
                     ;

count_loop_statement : CountLoopKeyword OpenParenthesis variable_declaration Terminator condition Terminator afterthought_statement  CloseParenthesis OpenBrace codeblock CloseBrace
                     | CountLoopKeyword OpenParenthesis assignment_statement Terminator condition Terminator afterthought_statement  CloseParenthesis OpenBrace codeblock CloseBrace
                     ;

repeatuntil_loop_statement : RepeatUntilLoopKeyword OpenBrace codeblock CloseBrace EventLoopKeyword OpenParenthesis condition CloseParenthesis Terminator
                           ;
 
  
function_call : VarIdentifier OpenParenthesis function_call_parameters CloseParenthesis Terminator ;
  
//TODO function_call_parameters
function_call_parameters : returns_value
                         | returns_value Comma function_call_parameters
                         ;

 /* Lexical Specs */
//white space
WS: [ |\t |\r |\n]+ -> skip;
//WS: [ \n\t\r]+ -> channel(HIDDEN);

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
FloatLit : [0-9]+['\.'][0-9]+ ;
StringLit : '"'[A-Za-z0-9]*'"' ;
CharLit : '\''[A-Za-z0-9]'\'' ;

// Naming rules
Array : '['[0-9]+']' ; // sketchy
//ConstantVarIdentfier : [A-Z0-9]+ ;
VarIdentifier : [a-zA-Z][a-zA-Z0-9]*;
//FuncIdentifier : [a-zA-Z][a-zA-Z0-9]* ;


//end of file
EndOfFile: '$' ; 
 