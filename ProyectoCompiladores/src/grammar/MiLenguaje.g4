grammar MiLenguaje;

// Reglas de producción
programa        : declaraciones EOF ;

declaraciones   : declaracion ';' declaraciones
                | /* vacío */ ;

declaracion     : expresion
                | control_flujo
                | impresion ;

control_flujo   : if_stmt
                | while_stmt
                | for_stmt ;

if_stmt         : 'if' '(' expresion ')' '{' declaraciones '}'
                | 'if' '(' expresion ')' '{' declaraciones '}' 'else' '{' declaraciones '}' ;

while_stmt      : 'while' '(' expresion ')' '{' declaraciones '}' ;

for_stmt        : 'for' '(' expresion ';' expresion ';' expresion ')' '{' declaraciones '}' ;

impresion       : 'print' '(' identificador ')' ;

// Expresión
expresion       : identificador '=' expresion
                | identificador
                | numero
                | '(' expresion ')'
                | expresion operador_aditivo expresion
                | expresion operador_multiplicativo expresion
                | expresion operador_relacional expresion
                | '-' expresion ;

// Operadores
operador_aditivo        : '+' | '-' ;
operador_multiplicativo : '*' | '/' ;
operador_relacional     : '<' | '>' | '==' | '!=' | '<=' | '>=' ;

// Definición de número, dígito e identificador
numero          : digito+ ;
digito          : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ;

identificador   : letra (letra | digito)* ;
letra : 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' ;

WS : [ \t\r\n]+ -> skip ;

