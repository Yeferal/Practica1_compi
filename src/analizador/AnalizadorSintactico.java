
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Feb 12 01:51:20 CST 2020
//----------------------------------------------------

package analizador;

import java_cup.runtime.Symbol;
import java.util.LinkedList;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Feb 12 01:51:20 CST 2020
  */
public class AnalizadorSintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintactico() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\002\004\000\002\002\004\000\002\010" +
    "\002\000\002\003\012\000\002\003\003\000\002\003\003" +
    "\000\002\003\003\000\002\011\002\000\002\004\015\000" +
    "\002\012\002\000\002\005\014\000\002\006\005\000\002" +
    "\006\005\000\002\007\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\004\011\004\001\002\000\012\004\015\006" +
    "\007\007\014\014\012\001\002\000\004\002\006\001\002" +
    "\000\004\002\001\001\002\000\004\005\047\001\002\000" +
    "\004\002\ufffb\001\002\000\004\002\000\001\002\000\006" +
    "\004\044\007\043\001\002\000\004\002\ufffd\001\002\000" +
    "\004\005\026\001\002\000\004\005\017\001\002\000\004" +
    "\002\ufffc\001\002\000\004\015\020\001\002\000\004\013" +
    "\021\001\002\000\004\020\022\001\002\000\004\013\uffff" +
    "\001\002\000\004\013\024\001\002\000\004\012\025\001" +
    "\002\000\004\002\ufffe\001\002\000\004\015\027\001\002" +
    "\000\004\013\030\001\002\000\004\020\031\001\002\000" +
    "\004\013\ufff8\001\002\000\004\013\033\001\002\000\004" +
    "\014\034\001\002\000\004\020\040\001\002\000\004\013" +
    "\036\001\002\000\004\012\037\001\002\000\004\002\ufff7" +
    "\001\002\000\004\014\041\001\002\000\004\020\042\001" +
    "\002\000\004\013\ufff4\001\002\000\004\012\046\001\002" +
    "\000\004\012\045\001\002\000\004\002\ufff6\001\002\000" +
    "\004\002\ufff5\001\002\000\004\015\050\001\002\000\004" +
    "\013\051\001\002\000\004\020\052\001\002\000\004\013" +
    "\ufffa\001\002\000\004\013\054\001\002\000\004\014\034" +
    "\001\002\000\004\013\056\001\002\000\004\014\057\001" +
    "\002\000\004\012\060\001\002\000\004\002\ufff9\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\004\002\004\001\001\000\012\003\010\004" +
    "\012\005\015\006\007\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\022\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\012\031\001\001\000\002\001\001\000\004\007\034\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\011\052\001\001\000\002" +
    "\001\001\000\004\007\054\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalizadorSintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public static LinkedList<Error> tablaErrorLexico = new LinkedList<Error>();
    
    public void syntaxError(Symbol s){
    String lexema = s.value.toString();
    int fila = s.right;
    int columna = s.left;
    
    System.out.println("====== Error Sinstactico =====");
    System.out.println("Lexema: "+lexema);
    System.out.println("Fila: "+fila);
    System.out.println("Columna: "+columna);

    } 

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintactico$actions {



  private final AnalizadorSintactico parser;

  /** Constructor */
  CUP$AnalizadorSintactico$actions(AnalizadorSintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action(
    int                        CUP$AnalizadorSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
    java.util.Stack            CUP$AnalizadorSintactico$stack,
    int                        CUP$AnalizadorSintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintactico$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // PATHS ::= DIAGONAL PALABRA DIAGONAL PALABRA 
            {
              String RESULT =null;
		int rutaPathleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int rutaPathright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Object rutaPath = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		  System.out.println("ruta Encontrada: "+rutaPath); RESULT = (String) rutaPath; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("PATHS",5, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // TIPO_CERRAR ::= DIAGONAL CARPETA MAYOR 
            {
              String RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_CERRAR",4, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TIPO_CERRAR ::= DIAGONAL PROYECTO MAYOR 
            {
              String RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_CERRAR",4, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // TIPO_CARPETA ::= CARPETA NOMBRE IGUAL COMILLAS PALABRA NT$2 COMILLAS PATHS COMILLAS MAYOR 
            {
              String RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (String) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-4)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).value;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_CARPETA",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-9)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NT$2 ::= 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
 System.out.println("palabra carpeta: "+a); 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("NT$2",8, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TIPO_ARCHIVO ::= ARCHIVO NOMBRE IGUAL COMILLAS PALABRA NT$1 COMILLAS PATHS COMILLAS DIAGONAL MAYOR 
            {
              String RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (String) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-6)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-6)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-6)).value;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_ARCHIVO",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-10)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NT$1 ::= 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
 System.out.println("palabra archivo: "+a); 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("NT$1",7, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // TIPO_ENTRADA ::= TIPO_CERRAR 
            {
              String RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_ENTRADA",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // TIPO_ENTRADA ::= TIPO_CARPETA 
            {
              String RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_ENTRADA",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // TIPO_ENTRADA ::= TIPO_ARCHIVO 
            {
              String RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_ENTRADA",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // TIPO_ENTRADA ::= PROYECTO NOMBRE IGUAL COMILLAS PALABRA NT$0 COMILLAS MAYOR 
            {
              String RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (String) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).value;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_ENTRADA",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-7)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // NT$0 ::= 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
 System.out.println("palabra proyecto: "+a); 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("NT$0",6, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= MENOR TIPO_ENTRADA 
            {
              String RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintactico$parser.done_parsing();
          return CUP$AnalizadorSintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

