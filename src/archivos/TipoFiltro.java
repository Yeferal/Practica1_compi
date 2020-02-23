/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

/**
 *
 * @author LENOVO-PC
 */
public class TipoFiltro {
    private int tipo;
    private String valorTexto, tipoTexto,columna;
    private int valorNumero;

    public TipoFiltro(int tipo, String valorTexto, String columna) {
        this.tipo = tipo;
        this.valorTexto = valorTexto;
        this.columna = columna;
    }

    
    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getValorTexto() {
        return valorTexto;
    }

    public void setValorTexto(String valorTexto) {
        this.valorTexto = valorTexto;
    }

    
    
    public int getValorNumero() {
        return valorNumero;
    }

    public void setValorNumero(int valorNumero) {
        this.valorNumero = valorNumero;
    }
    
    public boolean isNumeric(){
	try {
		valorNumero=Integer.parseInt(valorTexto);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
    public int getTamanio(){
        return valorTexto.length();
    }
    
    
}
