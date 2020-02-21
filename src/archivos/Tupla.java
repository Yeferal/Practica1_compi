
package archivos;

import java.util.ArrayList;

public class Tupla {
     private ArrayList<String> registros = new ArrayList<>();

    public ArrayList<String> getRegistros() {
        return registros;
    }
     
    public void agregarContenido(String texto){
        registros.add(texto);
        /*for (int i = 0; i < registros.size(); i++) {
            System.out.println(registros.get(i));
        }*/
    }
    public void limpiarTupla(){
        registros.clear();
    }
}
