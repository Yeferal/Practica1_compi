
package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Insercion {
    
    Tupla tupla = new Tupla();
    private ArrayList<String> listaColumnasB = new ArrayList<>();
    private ArrayList<String> listaColumnasI = new ArrayList<>();
    private ArrayList<String> listaColumnasL = new ArrayList<>();
    private ArrayList<String> listaColumnasT = new ArrayList<>();

    public ArrayList<String> getListaColumnasT() {
        return listaColumnasT;
    }

    public void setListaColumnasT(ArrayList<String> listaColumnasT) {
        this.listaColumnasT = listaColumnasT;
    }
    
    public void escribirArchivo(String ruta,String texto){
        try {
            PrintWriter salida = new PrintWriter(
            new BufferedWriter(new FileWriter(ruta, true)));
                
            salida.print("\n"+texto);
            salida.close();
            System.out.println("Escribe");
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
    public void insertarLine(String ruta,ArrayList<String> listaColumnasB,ArrayList<String> listaColumnasI){
        String texto = "";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        this.listaColumnasB = listaColumnasB;
        this.listaColumnasI = listaColumnasI;

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
        setLinea(ruta);
    }
    
    public void DeterminarTexto(){
        
        for (int i = 0; i < listaColumnasL.size(); i++) {
            listaColumnasT.add(" ");
        }
        for (int i = 0; i < listaColumnasB.size(); i++) {
            for (int j = 0; j < listaColumnasL.size(); j++) {
                if(listaColumnasB.get(i).equals(listaColumnasL.get(j))){
                    listaColumnasT.set(j, listaColumnasI.get(i));
                }
            }
        }
    }
    private void setArreglo(String texto []){
        for (int i = 0; i < texto.length; i++) {
            listaColumnasL.add(texto[i]);
        }
        DeterminarTexto();
    }
    public void setLinea(String ruta){
        String cadena = "";
        for (int i = 0; i < listaColumnasT.size(); i++) {
            
            if(i==listaColumnasT.size()-1){
                cadena+=listaColumnasT.get(i);
            }else{
                cadena+=listaColumnasT.get(i)+",";
            }
        }
        escribirArchivo(ruta, cadena);
    }
}
