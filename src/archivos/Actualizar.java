
package archivos;

import analizador.AnalizadorLexico3;
import analizador.AnalizadorSintactico3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Actualizar {
    Tabla tablaOriginal = new Tabla();
    Tabla tablaTemp = new Tabla();
    Tupla tupla;
    Archivo archivo = new Archivo();
    private ArrayList<String> listaColumnasB = new ArrayList<>();
    private ArrayList<String> listaColumnasI = new ArrayList<>();
    private ArrayList<String> listaColumnasL = new ArrayList<>();
    private ArrayList<String> listaColumnasT = new ArrayList<>();
    
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
        analizarCsv(ruta);
        DeterminarTexto();
        reescribir(ruta);
        
    }
    private void setArreglo(String texto []){
        for (int i = 0; i < texto.length; i++) {
            listaColumnasL.add(texto[i]);
        }
        
    }
    
    public void DeterminarTexto(){
        
        for (int i = 0; i < listaColumnasL.size(); i++) {
            listaColumnasT.add(" ");
        }
        for (int i = 0; i < listaColumnasB.size(); i++) {
            for (int j = 0; j < listaColumnasL.size(); j++) {
                if(listaColumnasB.get(i).equals(listaColumnasL.get(j))){
                    recorrerTablaOriginal(j, listaColumnasI.get(i));
                }
            }
        }
        
    }
    
    private void recorrerTablaOriginal(int columna,String texto){
        for (int i = 1; i < tablaOriginal.getTabla().size(); i++) {
            tablaOriginal.getTabla().get(i).getRegistros().set(columna, texto);
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
    private void reescribir(String ruta){
        String cadena = "";
        borrarContenido(ruta);
        for (int i = 0; i < tablaOriginal.getTabla().size(); i++) {
            for (int j = 0; j < tablaOriginal.getTabla().get(i).getRegistros().size(); j++) {
                System.out.println("CELDA: "+tablaOriginal.getTabla().get(i).getRegistros().get(j));
                    if(j==listaColumnasT.size()-1){
                        cadena+=tablaOriginal.getTabla().get(i).getRegistros().get(j);
                    }else{
                        cadena+=tablaOriginal.getTabla().get(i).getRegistros().get(j)+",";
                    }  
            }
            System.out.println("Cadena: "+cadena);
            escribirArchivo(ruta, cadena);
            cadena="";
        }
    }
    
    public void escribirArchivo(String ruta,String texto){
        try {
            PrintWriter salida = new PrintWriter(
            new BufferedWriter(new FileWriter(ruta, true)));
                
            salida.println(texto);
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
