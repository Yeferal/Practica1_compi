
package archivos;

import java.util.ArrayList;

public class Tabla {
    private ArrayList<Tupla> tabla = new ArrayList<>();

    public ArrayList<Tupla> getTabla() {
        return tabla;
    }
    public void agregarTupla(Tupla tupla){
        tabla.add(tupla);
    }
    
    
}
