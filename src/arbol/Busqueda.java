
package arbol;

import java.util.Enumeration;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class Busqueda {
    
    private Nodo nodoBandera;
    private DefaultMutableTreeNode nodoPadre;

    public DefaultMutableTreeNode getNodoPadre() {
        return nodoPadre;
    }
    
    public void insertarNodo(TreeNode treeActual,String nombre){
        TreeNode nodo = treeActual;
        nodoPadre = null;
        nodoBandera = null;
        recorrer(nodo,nombre);
    }
    
    private void recorrer( TreeNode treenodo,String nombre){
        System.out.println("Actual: "+treenodo.toString());
        TreeNode nodo = treenodo;
        Nodo nodoObjeto =null;
        if(nodo.getChildCount()>=0){
            for (Enumeration e=nodo.children(); e.hasMoreElements();) {
                TreeNode n = (TreeNode)e.nextElement();
                DefaultMutableTreeNode nodoP = (DefaultMutableTreeNode) n;
                nodoObjeto = (Nodo) nodoP.getUserObject();
                System.out.println("entra");
                if(isNodoBuscar(nodoObjeto, nombre)){
                    System.out.println("Lo encontro");
                    nodoPadre = nodoP;
                    break;
                }
                if(n.getAllowsChildren()){
                    
                    recorrer(n,nombre);
                    
                }
            }
        }
    }
    private boolean isNodoBuscar(Nodo nodo,String nombre){
        
        if(nodo.getNombre().equals(nombre)){
            nodoBandera = nodo;
            return true;
        }
        return false;
    }
    
}
