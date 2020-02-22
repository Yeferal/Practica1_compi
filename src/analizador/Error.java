/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;


/**
 *
 * @author LENOVO-PC
 */
public class Error {
    String lexema, tipo,descripcion;
    int linea,columna;
    
    public Error(String lexema, String tipo, String descripcion, int linea, int columna) {
        this.lexema = lexema;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.linea = linea;
        this.columna = columna;
    }

    public String getLexema() {
        return lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }
    public String toString(){
        return "Error: "+tipo+" "+descripcion+"--------->"+"Linea: "+linea+" Columna: "+columna;
    }
    
    
}
