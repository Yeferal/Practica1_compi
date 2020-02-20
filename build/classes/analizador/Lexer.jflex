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
%class AnalizadorLexico
%cupsym Simbolos
%cup
%char
%column
%full
//%ignorecase
%line
%unicode

    //expreciones regulares


Caracteres      = [-_@+*#]
Letra           = [a-zA-Z]
Palabra         = {Letra} {Letra}*
//Ruta            = ([Palabra | \\])+
Digito          = [0-9]
Numero          = {Digito} {Digito}*
Espacio         = [ \t\r\n]+

%%


/*proyecto      = <PROYECTO nombre="identificador">
proyectoend     = </PROYECTO>
ruta            = [/identificador]+.csv
archivo         = <ARCHIVO nombre="identificador" ubicacion="ruta"/>
carpeta         = <CARPETA nombre="identificador">
carpetaend      = </CARPETA>
identificador   = [a-zA-Z]+
*/


PROYECTO   {System.out.println("proyecto"); return new Symbol(Simbolos.PROYECTO , yycolumn, yyline, yytext());}
nombre     {System.out.println("nombre"); return new Symbol(Simbolos.NOMBRE , yycolumn, yyline, yytext());}
ARCHIVO    {System.out.println("archivo"); return new Symbol(Simbolos.ARCHIVO , yycolumn, yyline, yytext());}
CARPETA    {System.out.println("carpeta"); return new Symbol(Simbolos.CARPETA , yycolumn, yyline, yytext());}
ubicacion  {System.out.println("ubicacion"); return new Symbol(Simbolos.UBICACION , yycolumn, yyline, yytext());}


<YYINITIAL> {
    {Espacio}    {/*Ignore*/}
    ".csv"        {System.out.println(".csv"); return new Symbol(Simbolos.CSV , yycolumn, yyline, yytext());}
    ".."          {System.out.println("Punto"); return new Symbol(Simbolos.PUNTO , yycolumn, yyline, yytext());}   
    /*{Ruta}       {System.out.println("ruta"); return new Symbol(Simbolos.RUTA , yycolumn, yyline, yytext());} */ 
    "<"           {System.out.println("menor que"); return new Symbol(Simbolos.MENOR , yycolumn, yyline, yytext());}
    ">"          {System.out.println("mayor que"); return new Symbol(Simbolos.MAYOR , yycolumn, yyline, yytext());}
    "\""         {System.out.println("comillas"); return new Symbol(Simbolos.COMILLAS , yycolumn, yyline, yytext());}
    "/"          {System.out.println("diagonal"); return new Symbol(Simbolos.DIAGONAL , yycolumn, yyline, yytext());}
    "="          {System.out.println("igual"); return new Symbol(Simbolos.IGUAL , yycolumn, yyline, yytext());}
    ({Letra}":"|"*""\\"|"\\")(("\\"|{Palabra}|{Caracteres}|{Numero}))+         {System.out.println("ruta"); return new Symbol(Simbolos.RUTA , yycolumn, yyline, yytext());}
    {Numero}     {System.out.println("numero"); return new Symbol(Simbolos.NUMERO , yycolumn, yyline, yytext());}
    {Caracteres} {System.out.println("caracter"); return new Symbol(Simbolos.CARACTERES , yycolumn, yyline, yytext());}
    {Palabra}    {System.out.println("palabra"); return new Symbol(Simbolos.PALABRA , yycolumn, yyline, yytext());}
    
    .            {System.out.println("error: "+"Columna: "+yycolumn+" linea: "+ yyline);
                 /*Error datos = new Error(yytext(),"Error Lexico","Simbolo invalido",yyline,yycolumn);
                 tablaErrorLexico.add(datos);*/}
    
}

