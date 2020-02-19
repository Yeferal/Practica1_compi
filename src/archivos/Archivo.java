
package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    
    
    public void crearIde(String nombre,String ruta){
        File file = new File(ruta+"\\"+nombre+".csv");
        
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("<PROYECTO nombre=\""+nombre+"\">\n");
            bw.write("</PROYECTO>");
            bw.close();
        } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String leerArchivo(String ruta){
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
         while((linea=br.readLine())!=null)
            texto+=linea;
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
        try {
            PrintWriter salida = new PrintWriter(
            new BufferedWriter(new FileWriter(ruta, true)));
            salida.println(texto);
            salida.close();
        } catch (IOException e) {

        }
    }
}
