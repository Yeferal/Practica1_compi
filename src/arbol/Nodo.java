
package arbol;

public class Nodo {
    private String path,nombre;

    public Nodo(String path, String nombre) {
        this.path = path;
        this.nombre = nombre;
    }
    
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    
}
