
package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Eliminar {
 
    Tupla tupla = new Tupla();
    
    public String leerCSV(String ruta){
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
            System.out.println("Linea: " + texto);
            escribirArchivo(ruta, texto);
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
        return texto;
    }
    
    public void escribirArchivo(String ruta,String texto){
        borrarContenido(ruta);
        System.out.println("Borra");
        try {
            PrintWriter salida = new PrintWriter(
            new BufferedWriter(new FileWriter(ruta, true)));
                
            salida.print(texto);
            salida.close();
            System.out.println("Escribe");
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    private void borrarContenido(String ruta){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(ruta));
            bw.write("");
            bw.close();
        } catch (IOException ex) {
         
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                
            }
        }
    }
}
