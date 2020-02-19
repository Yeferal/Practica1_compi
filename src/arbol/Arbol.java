
package arbol;

import java.util.Enumeration;
import java.util.Iterator;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class Arbol {
    
    private static String textoArchivoIde;

    public String getTextoArchivoIde() {
        return textoArchivoIde;
    }
    public void setCadenaTexto(String texto){
        textoArchivoIde += texto;
    }
    
    public void insertarTextoModelo(JTree treeActual,String pathIde){
        textoArchivoIde = "";
        TreeNode nodo = (TreeNode) treeActual.getModel().getRoot();
        
        DefaultMutableTreeNode nodoProyecto = (DefaultMutableTreeNode) nodo;
        Nodo nodoPr = (Nodo) nodoProyecto.getUserObject();
        isProyecto(nodoPr);
        recorrer(nodo, 1);
        setCadenaTexto("</PROYECTO>");
    }
    
    private void recorrer( TreeNode treenodo, int saltos){
        System.out.println("Actual: "+treenodo.toString());
        TreeNode nodo = treenodo;
        Nodo nodoObjeto =null;
        if(nodo.getChildCount()>=0){
            for (Enumeration e=nodo.children(); e.hasMoreElements();) {
                TreeNode n = (TreeNode)e.nextElement();
                DefaultMutableTreeNode nodoP = (DefaultMutableTreeNode) n;
                nodoObjeto = (Nodo) nodoP.getUserObject();
                verificarTipoNodo(nodoObjeto,saltos);
                if(n.getAllowsChildren()){
                    saltos++;
                    
                    recorrer(n,saltos);
                    saltos--;
                    verificarTipoCierre(nodoObjeto, saltos);
                    
                }
            }
        }
    }
    
    private void verificarTipoNodo(Nodo nodoTmp,int numero){
        switch(nodoTmp.getTipoDato()){
            case "PROYECTO":
                generarTabulaciones(numero);
                isProyecto(nodoTmp);
                break;
            case "ARCHIVO":
                generarTabulaciones(numero);
                isArchivo(nodoTmp);
                break;
            case "CARPETA":
                generarTabulaciones(numero);
                isCarpeta(nodoTmp);
                break;   
            default:
                
        }
    }
    
    private void verificarTipoCierre(Nodo nodoTmp,int numero){
        switch(nodoTmp.getTipoDato()){
            case "ARCHIVO":
                break;
            case "CARPETA":
                generarTabulaciones(numero);
                setCadenaTexto("</CARPETA>\n");
                break;   
            default:
                
        }
    }
    
    private void generarTabulaciones(int numero){
        for (int i = 0; i < numero; i++) {
            setCadenaTexto("\t");
        }
    }
    
    private void isCarpeta(Nodo nodoCarpeta){
        setCadenaTexto(nodoCarpeta.getTextoDato());
    }
    private void isArchivo(Nodo nodoArchivo){
        setCadenaTexto(nodoArchivo.getTextoDato());
    }
    private void isProyecto(Nodo nodoProyecto){
        setCadenaTexto(nodoProyecto.getTextoDato());
    }
    
    
}
