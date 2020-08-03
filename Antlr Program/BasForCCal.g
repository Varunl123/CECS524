grammar BasForCCal;
@header { 
    package basforccal;
    import java.util.HashMap;
}

@lexer::header{ 
    package basforccal;
}
@members{
HashMap memory =new HashMap();
HashMap m=new HashMap();
	String type;
	String programName;
	void checkName(String endName){
		if(programName.equals(endName)==false){
			System.err.println("Names doesn't match!");
		}
		else{
			System.out.println("End program "+endName);
		}	
	}
}


program: start programbody end procedureprogram;
start:'PROGRAM' ID{programName=$ID.text; System.out.println("checking program " + $ID.text);}; 


programbody: statement* prog;
statement
	:	i |c |f;

i:'INT' idlist{type="INT";};
c:'CHAR' idlist{type="CHAR";} ;
f:'FLOAT' idlist {type="FLOAT";} ;
idlist:getid(','getid)*;
getid:ID{ if(memory.containsKey($ID.text))
		    System.err.println("Error:"+$ID.text+"already defined");
		    else
		    	memory.put($ID.text,type);};
		    	

		    	
		    	
prog:stat*;
stat: expression | if_statement | while_loop | for_loop | call ;
expression:term (('+' | '-' | '*' | '/' | '%' |'<' |'<=' |'>' |'>=' |'<>'|'=' ) term)*;
term:Number | CHAR | INT | '(' expression ')'| ID | ID'()' | ID'('fidlist')';

fidlist	:	name(','name)*;
name	:	ID | INT| CHAR|ID'()';




	 

if_statement: 'IF' stat 'THEN' prog 'ENDIF';
while_loop:'WHILE' stat 'DO' prog 'ENDDO';
for_loop:	'FOR' stat 'TO' expression 'LOOP' prog 'ENDLOOP';
call	:	'CALL' d ;
d	:	ID | ID '(' pidlist ')';

pidlist	:	pgetid(','pgetid)*;
pgetid	:	ID{if(!memory.containsKey($ID.text))
			System.err.println("Error:"+$ID.text+" not defined ");
		   };
 

end	:	 'END' ID{checkName($ID.text);}'.';

	
	
	
procedureprogram:newstatement*;

newstatement:'PROCEDURE' ID next |  'PROCEDURE' ID '(' plist ')' next | fundef ;
fundef	:	'INT' define | 'FLOAT' define | 'CHAR' define ;
define	:	 'FUNCTION' functioncall next;
functioncall:	ID '()' | ID '('functionlist')';
next	:	declaringbody begin s endsub;
begin	:	'BEGIN'; 
endsub	:	'END' ID;
s	:	prog;


declaringbody
	:	st*;
	st: in |ch |fl;
in	:	'INT' plist{type="INT";};
ch:'CHAR' plist{type="CHAR";} ;
fl:'FLOAT' plist {type="FLOAT";} ;
plist:getidlist(','getidlist)*;
functionlist
	:	getlist(','getlist)*;
getlist	:	ID{if(memory.containsKey($ID.text))System.err.println("Error: "+$ID.text+" already defined");
			else
			m.put($ID.text,type);};
getidlist
	:	ID{if(!m.containsKey($ID.text))
			m.put($ID.text,type);};
	



ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;
Number	:	('0'..'9')+ ('.' ('0'..'9')+)?;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
