
package archivos;

import analizador.AnalizadorLexico3;
import analizador.AnalizadorSintactico3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class SeleccionColumna {
    
    private ArrayList<String> listaColumnas = new ArrayList<>();
    private ArrayList<Integer> numeroColumna = new ArrayList<>();
    private ArrayList<String> listaColumnasL = new ArrayList<>();
    private Tabla tablaOriginal = new Tabla();
    private Tabla tablaTemp = new Tabla();
    private Tupla tupla;
    private Archivo archivo = new Archivo();

    public Tabla getTablaTemp() {
        return tablaTemp;
    }
    
    
    public void listarTabla(String ruta,ArrayList<String> listaColumnas){
        this.listaColumnas = listaColumnas;
        
        analizarCsv(ruta);
        insertarLine(ruta);
        agregarTuplas();
        agregarTuplaTabla();
    }
    
    public void agregarTuplas(){
        System.out.println("listaCc: "+this.listaColumnas.size());
        for (int i = 0; i < listaColumnas.size(); i++) {
            for (int j = 0; j < listaColumnasL.size(); j++) {
                if(listaColumnas.get(i).equals(listaColumnasL.get(j))){
                    numeroColumna.add(j);
                    System.out.println("Columnas Encontrada: ");
                }
            }
        }
    }
    
    public void agregarTuplaTabla(){
        for (int i = 0; i < tablaOriginal.getTabla().size(); i++) {
            tupla = new Tupla();
            for (int k = 0; k < numeroColumna.size(); k++) {
                tupla.agregarContenido(tablaOriginal.getTabla().get(i).getRegistros().get(numeroColumna.get(k)));
                System.out.println("fffff: "+tablaOriginal.getTabla().get(i).getRegistros().get(numeroColumna.get(k)));
            }
            tablaTemp.agregarTupla(tupla);
        }
    }
    private void analizarCsv(String ruta){

        AnalizadorLexico3 lexico = new AnalizadorLexico3(new StringReader(archivo.leerCSV(ruta)));
        AnalizadorSintactico3 sintactico = new AnalizadorSintactico3(lexico);
        try {
            sintactico.parse();
            tablaOriginal = sintactico.getTabla();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    
    }
    private void setArreglo(String texto []){
        for (int i = 0; i < texto.length; i++) {
            listaColumnasL.add(texto[i]);
        }
        
    }
    
    public void insertarLine(String ruta){
        String texto = "";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (ruta);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
        if((linea=br.readLine())!=null){
            texto=linea;
            String signo = Pattern.quote(",");
            String columnas [] = texto.split(signo);
            setArreglo(columnas);
        }else{
         texto = "";
        }
            
        }     
              
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }  
    }
    
    
    
}
