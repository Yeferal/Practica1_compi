package analizador;
import java_cup.runtime.*;
import java.util.LinkedList;

%%
%{
    //coidgo de usuario en sintaxis java

    public static LinkedList<Error> tablaErrorLexico = new LinkedList<Error>();
%}

    //directivas
%public 
%class AnalizadorLexico2
%cupsym Simbolos2
%cup
%char
%column
%full
%ignorecase
%line
%unicode

    //expreciones regulares
Coma            = [,]
Caracteres      = [-_@+*#.]
Letra           = [a-zA-Z]
Palabra         = {Letra} {Letra}*
Digito          = [0-9]
Numero          = {Digito} {Digito}*
Espacio         = [ \t\r\n]+
Texto           = ({Caracteres}|{Palabra}|{Numero}|{Espacio})+
%%


/*proyecto      = <PROYECTO nombre="identificador">
proyectoend     = </PROYECTO>
ruta            = [/identificador]+.csv
archivo         = <ARCHIVO nombre="identificador" ubicacion="ruta"/>
carpeta         = <CARPETA nombre="identificador">
carpetaend      = </CARPETA>
identificador   = [a-zA-Z]+
*/


<YYINITIAL> {
    {Espacio}    {/*Ignore*/}
    ","          {System.out.println("Coma"); return new Symbol(Simbolos2.COMA , yycolumn, yyline, yytext());}
    {Texto}      {System.out.println("Texto"); return new Symbol(Simbolos2.TEXTO , yycolumn, yyline, yytext());}
    .            {System.out.println("error: "+"Columna: "+yycolumn+" linea: "+ yyline);
                 Error datos = new Error(yytext(),"Error Lexico","Simbolo invalido",yyline,yycolumn);
                 tablaErrorLexico.add(datos);}
    
}
