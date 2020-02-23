
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Feb 23 04:23:01 CST 2020
//----------------------------------------------------

package analizador;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import inicio.VentanaInicio;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import arbol.Nodo;
import java.util.ArrayList;
import javax.swing.tree.MutableTreeNode;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Feb 23 04:23:01 CST 2020
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
    "\000\027\000\002\002\004\000\002\002\004\000\002\002" +
    "\004\000\002\002\003\000\002\002\004\000\002\011\003" +
    "\000\002\011\003\000\002\003\004\000\002\003\004\000" +
    "\002\003\004\000\002\012\002\000\002\013\002\000\002" +
    "\010\013\000\002\014\002\000\002\015\002\000\002\016" +
    "\002\000\002\004\023\000\002\017\002\000\002\020\002" +
    "\000\002\005\013\000\002\006\003\000\002\021\002\000" +
    "\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\067\000\006\003\004\004\005\001\002\000\022\002" +
    "\ufffe\003\004\004\005\006\021\007\027\014\026\024\030" +
    "\025\022\001\002\000\004\005\011\001\002\000\004\002" +
    "\007\001\002\000\004\002\001\001\002\000\004\002\000" +
    "\001\002\000\004\015\012\001\002\000\004\013\013\001" +
    "\002\000\004\020\014\001\002\000\004\013\ufff7\001\002" +
    "\000\004\013\016\001\002\000\004\012\017\001\002\000" +
    "\014\006\ufff6\007\ufff6\014\ufff6\024\ufff6\025\ufff6\001\002" +
    "\000\014\006\021\007\027\014\026\024\030\025\022\001" +
    "\002\000\004\005\047\001\002\000\004\002\uffed\001\002" +
    "\000\004\002\ufffb\001\002\000\004\002\ufffc\001\002\000" +
    "\004\002\ufff5\001\002\000\006\024\030\025\022\001\002" +
    "\000\004\005\034\001\002\000\014\006\uffec\007\uffec\014" +
    "\uffec\024\uffec\025\uffec\001\002\000\014\006\021\007\027" +
    "\014\026\024\030\025\022\001\002\000\004\002\uffeb\001" +
    "\002\000\004\002\ufff9\001\002\000\004\015\035\001\002" +
    "\000\004\013\036\001\002\000\004\020\037\001\002\000" +
    "\004\013\ufff0\001\002\000\004\013\041\001\002\000\004" +
    "\012\042\001\002\000\014\006\uffef\007\uffef\014\uffef\024" +
    "\uffef\025\uffef\001\002\000\014\006\021\007\027\014\026" +
    "\024\030\025\022\001\002\000\004\002\uffee\001\002\000" +
    "\004\002\ufff8\001\002\000\004\002\ufffa\001\002\000\004" +
    "\015\050\001\002\000\004\013\051\001\002\000\004\020" +
    "\052\001\002\000\004\013\ufff4\001\002\000\004\013\054" +
    "\001\002\000\004\010\055\001\002\000\004\015\056\001" +
    "\002\000\004\013\057\001\002\000\004\021\060\001\002" +
    "\000\004\022\061\001\002\000\004\013\ufff3\001\002\000" +
    "\004\013\063\001\002\000\004\014\064\001\002\000\004" +
    "\012\065\001\002\000\014\006\ufff2\007\ufff2\014\ufff2\024" +
    "\ufff2\025\ufff2\001\002\000\014\006\021\007\027\014\026" +
    "\024\030\025\022\001\002\000\004\002\ufff1\001\002\000" +
    "\004\002\uffff\001\002\000\004\002\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\067\000\004\002\005\001\001\000\012\002\067\003" +
    "\022\006\023\011\070\001\001\000\004\010\007\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\012\014\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\013\017\001\001\000\010\003\022\006\023\011\024" +
    "\001\001\000\004\004\045\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\006\044\001\001\000\004\005\032\001\001\000\004\021" +
    "\030\001\001\000\010\003\022\006\023\011\031\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\017\037\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\020\042\001" +
    "\001\000\010\003\022\006\023\011\043\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\014\052" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\015\061\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\016\065\001\001\000\010" +
    "\003\022\006\023\011\066\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

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




    DefaultMutableTreeNode root;

    VentanaInicio ventana;
    public void setVentana(VentanaInicio ventana){
        this.ventana=ventana;
    }
    public DefaultMutableTreeNode getArbol(){
        return this.root;
    }

    public void setArbol(DefaultMutableTreeNode root){    
    this.root = root;
    }
    
    public void escribirErrores(Error lista){
            ventana.areaError.setText(ventana.areaError.getText()+lista.toString()+"\n");
        
    }
    private Symbol s;
    public void syntaxError(Symbol s){
        this.s = s;
    }
    public Symbol getS(Symbol s){
        return this.s = s;
    }

    public void setAccion(String tipo,String mensaje,String accion){
            System.out.println(tipo+"         "+mensaje);
        }

    public void syntax_error(Symbol s){
            if(s!=null){
                Error e = new Error((String) s.value, "Sintactico", "Error Sintaxis token: " + s.right + " " + s.left + " " + s.value, s.right, s.left);
            
                escribirErrores(e);
                setAccion("ERROR","Error Sintaxis token: " + s.right + " " + s.left + " " + s.value, "");
            }
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintactico$actions {


    DefaultMutableTreeNode root;
    ArrayList<DefaultMutableTreeNode> listaNodos;
    public DefaultMutableTreeNode getArbol(){
        return this.root;
    }

    

    

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
          case 22: // TIPO_CERRAR ::= CARPETA_CIERRE NT$7 SEGUIDO 
            {
              Object RESULT =null;
              // propagate RESULT from NT$7
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_CERRAR",4, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // NT$7 ::= 
            {
              Object RESULT =null;

    if(listaNodos!=null){
        System.out.println("Tamanio1 "+listaNodos.size());
    DefaultMutableTreeNode nodoUltimo = listaNodos.get(listaNodos.size()-1);
    listaNodos.remove(listaNodos.size()-1);
    System.out.println("Tamanio2 "+listaNodos.size());
    DefaultMutableTreeNode nodoPenultimo = listaNodos.get(listaNodos.size()-1);
    listaNodos.remove(listaNodos.size()-1);
    System.out.println("Tamanio3 "+listaNodos.size());
    nodoPenultimo.add(nodoUltimo);
    listaNodos.add(nodoPenultimo);
    }
    


              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("NT$7",15, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // TIPO_CERRAR ::= PROYECTO_CIERRE 
            {
              Object RESULT =null;
		   
    if(listaNodos!=null){
    System.out.println("Tamanio antes final "+listaNodos.size());
    DefaultMutableTreeNode arbolFinal = listaNodos.get(0);
    listaNodos.remove(listaNodos.size()-1);
    root = arbolFinal;
    System.out.println("Tamanio final "+listaNodos.size());
    parser.setArbol(root);
    RESULT = root; 
    }
    


              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_CERRAR",4, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // TIPO_CARPETA ::= NOMBRE IGUAL COMILLAS PALABRA NT$5 COMILLAS MAYOR NT$6 SEGUIDO 
            {
              Object RESULT =null;
              // propagate RESULT from NT$6
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).value;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_CARPETA",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-8)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // NT$6 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).value;

    if(listaNodos!=null){
    System.out.println("Tamanio "+listaNodos.size());
    Nodo nodo = new Nodo("",(String) a,"CARPETA");
    //DefaultMutableTreeNode nodoCarpeta = listaNodos.get(listaNodos.size()-1);
    DefaultMutableTreeNode nodoCarpeta = new DefaultMutableTreeNode((String) a);
    //listaNodos.remove(listaNodos.size()-1);
    nodoCarpeta.setUserObject(nodo);
    listaNodos.add(nodoCarpeta);
    }
    

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("NT$6",14, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // NT$5 ::= 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
 System.out.println("palabra carpeta: "+a); 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("NT$5",13, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // TIPO_ARCHIVO ::= NOMBRE IGUAL COMILLAS PALABRA NT$2 COMILLAS UBICACION IGUAL COMILLAS RUTA CSV NT$3 COMILLAS DIAGONAL MAYOR NT$4 SEGUIDO 
            {
              Object RESULT =null;
              // propagate RESULT from NT$4
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-13)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-13)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-13)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-7)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-7)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-7)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-6)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-6)).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-6)).value;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_ARCHIVO",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-16)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // NT$4 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-11)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-11)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-11)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-4)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-4)).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-4)).value;

    if(listaNodos!=null){
        System.out.println("Tamanio "+listaNodos.size());
    Nodo nodo = new Nodo((String) b+v,(String) a,"ARCHIVO");
    DefaultMutableTreeNode nodoArchivo = listaNodos.get(listaNodos.size()-1);
    DefaultMutableTreeNode nodoArchivoTemp= new DefaultMutableTreeNode();
    nodoArchivoTemp.setUserObject(nodo);
    listaNodos.remove(listaNodos.size()-1);
    nodoArchivo.add(nodoArchivoTemp);
    listaNodos.add(nodoArchivo);
    //root.add(nodoArchivoTemp);
    }
    

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("NT$4",12, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // NT$3 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-6)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-7)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-7)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-7)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
System.out.println("ruta DE ARCHIVO: "+b+v); 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("NT$3",11, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NT$2 ::= 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
 System.out.println("palabra archivo: "+a); 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("NT$2",10, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // TIPO_PROYECTO ::= NOMBRE IGUAL COMILLAS PALABRA NT$0 COMILLAS MAYOR NT$1 SEGUIDO 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-5)).value;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_PROYECTO",6, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-8)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // NT$1 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).value;

    Nodo raiz = new Nodo("",(String) a,"PROYECTO");
    root = new DefaultMutableTreeNode(raiz);
    listaNodos = new ArrayList<>();
    listaNodos.add(root);
    System.out.println("Tamanio "+listaNodos.size());

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("NT$1",9, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NT$0 ::= 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
 System.out.println("palabra proyecto: "+a);
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("NT$0",8, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // TIPO_ENTRADA ::= DIAGONAL TIPO_CERRAR 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_ENTRADA",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // TIPO_ENTRADA ::= CARPETA TIPO_CARPETA 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_ENTRADA",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // TIPO_ENTRADA ::= ARCHIVO TIPO_ARCHIVO 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("TIPO_ENTRADA",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SEGUIDO ::= TIPO_ENTRADA 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("SEGUIDO",7, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SEGUIDO ::= TIPO_CERRAR 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("SEGUIDO",7, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INICIO ::= error SEGUIDO 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		parser.syntax_error((Symbol)e);
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= error 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		parser.syntax_error((Symbol)e);
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= error INICIO 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		parser.syntax_error((Symbol)e);
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= PROYECTO TIPO_PROYECTO 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
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

