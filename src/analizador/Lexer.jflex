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
%class AnalizadorLexico
%cupsym Simbolos
%cup
%char
%column
%full
%ignorecase
%line
%unicode

    //expreciones regulares
Caracteres      = [-_@+*#.]
Letra           = [a-zA-Z]
Palabra         = {Letra} {Letra}*
Digito          = [0-9]
Numero          = {Digito} {Digito}*
Espacio         = [ , \t, \r, \n]+
//Ruta            = ({Palabra} {\})*{Palabra}{.csv}
%%


/*proyecto      = <PROYECTO nombre="identificador">
proyectoend     = </PROYECTO>
ruta            = [/identificador]+.csv
archivo         = <ARCHIVO nombre="identificador" ubicacion="ruta"/>
carpeta         = <CARPETA nombre="identificador">
carpetaend      = </CARPETA>
identificador   = [a-zA-Z]+
*/


PROYECTO   {return new Symbol(Simbolos.PROYECTO , yycolumn, yyline, yytext());}
nombre     {return new Symbol(Simbolos.NOMBRE , yycolumn, yyline, yytext());}
ARCHIVO    {return new Symbol(Simbolos.ARCHIVO , yycolumn, yyline, yytext());}
CARPETA    {return new Symbol(Simbolos.CARPETA , yycolumn, yyline, yytext());}
ubicacion  {return new Symbol(Simbolos.UBICACION , yycolumn, yyline, yytext());}

<YYINITIAL> {
    "<"          {System.out.println("menor que"); return new Symbol(Simbolos.MENOR , yycolumn, yyline, yytext());}
    ">"          {System.out.println("mayor que"); return new Symbol(Simbolos.MAYOR , yycolumn, yyline, yytext());}
    "\""         {System.out.println("comillas"); return new Symbol(Simbolos.COMILLAS , yycolumn, yyline, yytext());}
    "/"          {System.out.println("diagonal"); return new Symbol(Simbolos.DIAGONAL , yycolumn, yyline, yytext());}
    "="          {System.out.println("igual"); return new Symbol(Simbolos.IGUAL , yycolumn, yyline, yytext());}

    {Numero}     {System.out.println("numero"); return new Symbol(Simbolos.NUMERO , yycolumn, yyline, yytext());}
    {Caracteres} {System.out.println("caracter"); return new Symbol(Simbolos.CARACTERES , yycolumn, yyline, yytext());}
    {Palabra}    {System.out.println("palabra"); return new Symbol(Simbolos.PALABRA , yycolumn, yyline, yytext());}
    //{Ruta}       {System.out.println("ruta"); return new Symbol(Simbolos.Ruta , yycolumn, yyline, yytext());}
    .            {System.out.println("error: "+"Columna: "+yycolumn+" linea: "+ yyline);
                 Error datos = new Error(yytext(),"Error Lexico","Simbolo invalido",yyline,yycolumn);
                 tablaErrorLexico.add(datos);}
    
}

