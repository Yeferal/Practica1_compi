/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

import archivos.Tupla;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author LENOVO-PC
 */
public class Imprimir extends Thread{
    
    Tupla tupla;
    JTextArea area;
    
    public Imprimir(Tupla tupla,JTextArea area){
        this.tupla = tupla;
        this.area=area;
    }

    @Override
    public void run() {
        recorrer();
    }
    
    public void recorrer(){
        System.out.println("Hilooooo");
        String texto = "";
        for (int k = 0; k < tupla.getRegistros().size()-1; k++) {
                    texto+=area.getText()+tupla.getRegistros().get(k)+"\t\t";
                }
        texto+=texto+=area.getText()+tupla.getRegistros().get(tupla.getRegistros().size()-1)+"\n";
        System.out.println(texto);
        area.setText(area.getText()+texto);
    }
}
