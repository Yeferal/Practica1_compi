
package arbol;

public class Nodo {
    private String path,nombre,tipoDato,texto;

    public Nodo(String path, String nombre,String tipoDato) {
        this.path = path;
        this.nombre = nombre;
        this.tipoDato = tipoDato;
    }
    
    public String getTextoDato(){
        switch(tipoDato){
            case "PROYECTO":
                return "<PROYECTO nombre=\""+nombre+"\">\n";
            case "ARCHIVO":
                return "<ARCHIVO nombre=\""+nombre+"\" ubicacion=\""+path+"\"/>\n";
            case "CARPETA":
                return "<CARPETA nombre=\""+nombre+"\">\n";    
            default:
                return "\n";
        }
    }
    
    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
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
