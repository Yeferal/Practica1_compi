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
Caracteres      = [-_@+#]
Letra           = [a-zA-Z]
Palabra         = {Letra} {Letra}*
Digito          = [0-9]
Numero          = {Digito} {Digito}*
Espacio         = [ \t\r\n]+
Texto           = ({Palabra}|{Numero})+
%%

SELECCIONAR      {System.out.println("SELECCIONAR"); return new Symbol(Simbolos2.SELECCIONAR, yycolumn, yyline, yytext());}
FILTRAR         {System.out.println("FILTRAR"); return new Symbol(Simbolos2.FILTRAR, yycolumn, yyline, yytext());}
INSERTAR        {System.out.println("INSERTAR"); return new Symbol(Simbolos2.INSERTAR, yycolumn, yyline, yytext());}
ACTUALIZAR      {System.out.println("ACTUALIZAR"); return new Symbol(Simbolos2.ACTUALIZAR, yycolumn, yyline, yytext());}
ASIGNAR         {System.out.println("Seleccionar"); return new Symbol(Simbolos2.ASIGNAR, yycolumn, yyline, yytext());}
ELIMINAR        {System.out.println("ELIMINAR"); return new Symbol(Simbolos2.ELIMINAR, yycolumn, yyline, yytext());}
VALORES         {System.out.println("VALORES"); return new Symbol(Simbolos2.VALORES, yycolumn, yyline, yytext());}
EN              {System.out.println("EN"); return new Symbol(Simbolos2.EN, yycolumn, yyline, yytext());}
AND             {System.out.println("AND"); return new Symbol(Simbolos2.AND, yycolumn, yyline, yytext());}
OR              {System.out.println("OR"); return new Symbol(Simbolos2.OR, yycolumn, yyline, yytext());}

<YYINITIAL> {
    {Espacio}    {/*Ignore*/}
    {Texto}("."{Texto})+ {System.out.println("PATH_ARCHIVO"); return new Symbol(Simbolos2.PATH_ARCHIVO , yycolumn, yyline, yytext());}
    ","         {System.out.println("Coma"); return new Symbol(Simbolos2.COMA , yycolumn, yyline, yytext());}
    ";"         {System.out.println("punto y Coma"); return new Symbol(Simbolos2.PUNTO_COMA , yycolumn, yyline, yytext());}
    "."         {System.out.println("punto"); return new Symbol(Simbolos2.PUNTO , yycolumn, yyline, yytext());}
    "="         {System.out.println("igual"); return new Symbol(Simbolos2.IGUAL , yycolumn, yyline, yytext());}
    "\""        {System.out.println("comillas"); return new Symbol(Simbolos2.COMILLAS , yycolumn, yyline, yytext());}
    "*"         {System.out.println("asterisco"); return new Symbol(Simbolos2.ASTERISCO , yycolumn, yyline, yytext());}
    "("         {System.out.println("parentecis a"); return new Symbol(Simbolos2.PARENTECIS_A , yycolumn, yyline, yytext());}
    ")"         {System.out.println("parentecis c"); return new Symbol(Simbolos2.PARENTECIS_C , yycolumn, yyline, yytext());}
    "<"         {System.out.println("menor"); return new Symbol(Simbolos2.MENOR , yycolumn, yyline, yytext());}
    ">"         {System.out.println("mayor"); return new Symbol(Simbolos2.MAYOR , yycolumn, yyline, yytext());}
    "<="        {System.out.println("menor igual"); return new Symbol(Simbolos2.MENOR_IGUAL , yycolumn, yyline, yytext());}
    ">="        {System.out.println("mayor igual"); return new Symbol(Simbolos2.MAYOR_IGUAL , yycolumn, yyline, yytext());}
    "<>"        {System.out.println("diferente"); return new Symbol(Simbolos2.DIFERENTE , yycolumn, yyline, yytext());}
    {Texto}     {System.out.println("Texto"); return new Symbol(Simbolos2.TEXTO , yycolumn, yyline, yytext());}
    .           {System.out.println("error: "+"Columna: "+yycolumn+" linea: "+ yyline);
                Error datos = new Error(yytext(),"Error Lexico","Simbolo invalido",yyline,yycolumn);
                tablaErrorLexico.add(datos);}
    
}
