
package archivos;

import java.util.ArrayList;

public class Tabla {
    private ArrayList<Tupla> tabla = new ArrayList<>();
    private int tipo;
    
    public ArrayList<Tupla> getTabla() {
        return tabla;
    }
    public void agregarTupla(Tupla tupla){
        tabla.add(tupla);
    }
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
