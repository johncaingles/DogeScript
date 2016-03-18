grammar Expression;

/* CFG */
start returns [int res]: //return final result    
    	result = expr {$res = $result.res;}
    	ExprEnd
    	;
    
expr returns [int res]: //return result
		e = lowPrior {$res = $e.res;}
		;

lowPrior returns [int res]:
		lp = highPrior 	{$res = $lp.res;}
		(AddOp temp = highPrior {$res += $temp.res;}
		| SubOp temp = highPrior {$res -= $temp.res;})*
		| lp = highPrior {$res = $lp.res;}
		;

highPrior returns [int res]:
		hp = signInt	{$res = $hp.res;}
		(MulOp temp = signInt {$res *= $temp.res;}
		|DivOp temp = signInt {$res /= $temp.res;}
		|ModOp temp = signInt {$res %= $temp.res;})*
		| hp = signInt {$res = $hp.res;}
		;
		
signInt returns [int res]:
		'-' temp = topPrior {$res = $temp.res *-1;}
		{System.out.println("signed(-): " + $res);}
		//| '+' temp = topPrior {$res = $temp.res;}
		//{System.out.println("signed(+): " + $res);}
		| temp = topPrior {$res = $temp.res;}
		{System.out.println("unsigned: " + $res);}
		;
		
topPrior returns [int res]:
		r = IntLit {$res = Integer.parseInt($r.text);}
		{System.out.println("returned from bottom: " + $res);}
		| OpenOp rec = expr CloseOp {$res = $rec.res;}
		;
		
/* Lexical Specs */

//integer literal
IntLit :[0-9]+;

//operators
AddOp : '+' ;
SubOp : '-' ;
MulOp : '*' ;
DivOp : '/' ;
ModOp : '%' ;

//parentheses
OpenOp : '(' ;
CloseOp : ')' ;

//terminator
ExprEnd: '$' ;