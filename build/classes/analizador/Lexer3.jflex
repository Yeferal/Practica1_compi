package analizador;
import java_cup.runtime.*;
import java.util.LinkedList;

%%
%{
    //coidgo de usuario en sintaxis java

    //public static LinkedList<Error> tablaErrorLexico = new LinkedList<Error>();
%}

    //directivas
%public 
%class AnalizadorLexico3
%cupsym Simbolos2
%cup
%char
%column
%full
%ignorecase
%line
%unicode

    //expreciones regulares
Linea           = [\n]
Aa              = [ÂÃ�]
Caracteres      = [\"_@+*#.~`!$%"^"&()={}"[" "]"\|;:"'"<>/?"-"]
Letra           = [a-zA-Z]
Palabra         = {Letra} {Letra}*
Digito          = [0-9]
Numero          = {Digito} {Digito}*
Espacio         = [ \t\r" "]+
Texto           = ({Caracteres}|{Palabra}|{Numero}|{Espacio}|{Aa})+
%%



<YYINITIAL> {
    {Espacio}    {return new Symbol(Simbolos3.TEXTO , yycolumn, yyline, yytext());}
    {Linea}      {/*System.out.println("Linea");*/ return new Symbol(Simbolos3.LINEA , yycolumn, yyline, yytext());}
    ","          {/*System.out.println("Coma");*/ return new Symbol(Simbolos3.COMA , yycolumn, yyline, yytext());}
    {Texto}      {/*System.out.println("Texto");*/ return new Symbol(Simbolos3.TEXTO , yycolumn, yyline, yytext());}
    .            {/*System.out.println("error: "+"Columna: "+yycolumn+" linea: "+ yyline);*/ return new Symbol(Simbolos3.ERROR , yycolumn, yyline, yytext());}
                 
    
}
