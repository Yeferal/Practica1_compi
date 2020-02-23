
package archivos;

import java.util.ArrayList;

public class Filtrar {
    
    Tabla tablaEntra = null;
    Tabla tablaSale = new Tabla();
    private ArrayList<String> listaColumnasL = null;
    SeleccionColumna seleccion = new SeleccionColumna();
    
    public void limpiar(){
        
    }
    public Tabla filtrarColumnas(TipoFiltro tipoFiltro,Tabla tabla,String ruta){
        tablaEntra = tabla;
        tablaSale.getTabla().clear();
        seleccion.insertarLine(ruta);
        listaColumnasL = seleccion.getListaColumnasL();
        System.out.println(tabla.getTabla().size());
        System.out.println(tablaSale.getTabla().size());
        System.out.println(tablaEntra.getTabla().size());
        System.out.println(listaColumnasL.size());
        switch(tipoFiltro.getTipo()){
            case 1:
                iguales(tipoFiltro);
                return tablaSale;
            case 2:
                mayor(tipoFiltro);
                return tablaSale;
            case 3:
                menor(tipoFiltro);
                return tablaSale;
            case 4:
                mayorIgual(tipoFiltro);
                return tablaSale;
            case 5:
                menotIgual(tipoFiltro);
                return tablaSale;
            case 6:
                diferente(tipoFiltro);
                return tablaSale;
                default:
                    System.out.println("es NULLLLLLLLLLLLLLLLLO");
                    tablaSale=null;
                    return tablaSale;
        }
    }
    
    private void iguales(TipoFiltro tipoFiltro){
        System.out.println("es iuaaaaaaaaaaaaaaaaaal");
        for (int i = 0; i < listaColumnasL.size(); i++) {
            System.out.println(listaColumnasL.get(i));
            if(listaColumnasL.get(i).equals(tipoFiltro.getColumna())){
                tablaSale.agregarTupla(tablaEntra.getTabla().get(0));
                for (int j = 1; j < tablaEntra.getTabla().size(); j++) {
                    if(isNumeric(tablaEntra.getTabla().get(j).getRegistros().get(i)) && convertirNumero(tablaEntra.getTabla().get(j).getRegistros().get(i))==tipoFiltro.getValorNumero()){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }else if(tablaEntra.getTabla().get(j).getRegistros().get(i).equals(tipoFiltro.getValorTexto())){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }
                }
                break;
            }
            
        }
    }
    
    private void mayor(TipoFiltro tipoFiltro){
        for (int i = 0; i < listaColumnasL.size(); i++) {
            if(listaColumnasL.get(i).equals(tipoFiltro.getColumna())){
                tablaSale.agregarTupla(tablaEntra.getTabla().get(0));
                for (int j = 1; j < tablaEntra.getTabla().size(); j++) {
                    if(isNumeric(tablaEntra.getTabla().get(j).getRegistros().get(i)) && convertirNumero(tablaEntra.getTabla().get(j).getRegistros().get(i)) > tipoFiltro.getValorNumero()){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }else if(tablaEntra.getTabla().get(j).getRegistros().get(i).length()> tipoFiltro.getTamanio()){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }
                }
                break;
            }
            
        }
    }
    private void menor(TipoFiltro tipoFiltro){
        for (int i = 0; i < listaColumnasL.size(); i++) {
            if(listaColumnasL.get(i).equals(tipoFiltro.getColumna())){
                tablaSale.agregarTupla(tablaEntra.getTabla().get(0));
                for (int j = 1; j < tablaEntra.getTabla().size(); j++) {
                    if(isNumeric(tablaEntra.getTabla().get(j).getRegistros().get(i)) && convertirNumero(tablaEntra.getTabla().get(j).getRegistros().get(i)) < tipoFiltro.getValorNumero()){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }else if(tablaEntra.getTabla().get(j).getRegistros().get(i).length()< tipoFiltro.getTamanio()){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }
                }
                break;
            }
            
        }
    }
    private void mayorIgual(TipoFiltro tipoFiltro){
        for (int i = 0; i < listaColumnasL.size(); i++) {
            if(listaColumnasL.get(i).equals(tipoFiltro.getColumna())){
                tablaSale.agregarTupla(tablaEntra.getTabla().get(0));
                for (int j = 1; j < tablaEntra.getTabla().size(); j++) {
                    if(isNumeric(tablaEntra.getTabla().get(j).getRegistros().get(i)) && convertirNumero(tablaEntra.getTabla().get(j).getRegistros().get(i))>=tipoFiltro.getValorNumero()){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }else if(tablaEntra.getTabla().get(j).getRegistros().get(i).length()> tipoFiltro.getTamanio() || tablaEntra.getTabla().get(j).getRegistros().get(i).length()==tipoFiltro.getTamanio()){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }
                }
                break;
            }
            
        }
    }
    private void menotIgual(TipoFiltro tipoFiltro){
        for (int i = 0; i < listaColumnasL.size(); i++) {
            if(listaColumnasL.get(i).equals(tipoFiltro.getColumna())){
                tablaSale.agregarTupla(tablaEntra.getTabla().get(0));
                for (int j = 1; j < tablaEntra.getTabla().size(); j++) {
                    if(isNumeric(tablaEntra.getTabla().get(j).getRegistros().get(i)) && convertirNumero(tablaEntra.getTabla().get(j).getRegistros().get(i))<=tipoFiltro.getValorNumero()){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }else if(tablaEntra.getTabla().get(j).getRegistros().get(i).length()< tipoFiltro.getTamanio() || tablaEntra.getTabla().get(j).getRegistros().get(i).length()==tipoFiltro.getTamanio()){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }
                }
                break;
            }
            
        }
    }
    private void diferente(TipoFiltro tipoFiltro){
        for (int i = 0; i < listaColumnasL.size(); i++) {
            if(listaColumnasL.get(i).equals(tipoFiltro.getColumna())){
                tablaSale.agregarTupla(tablaEntra.getTabla().get(0));
                for (int j = 1; j < tablaEntra.getTabla().size(); j++) {
                    if(isNumeric(tablaEntra.getTabla().get(j).getRegistros().get(i)) && convertirNumero(tablaEntra.getTabla().get(j).getRegistros().get(i))!=tipoFiltro.getValorNumero()){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }else if(!tablaEntra.getTabla().get(j).getRegistros().get(i).equals(tipoFiltro.getValorTexto())){
                        tablaSale.agregarTupla(tablaEntra.getTabla().get(j));
                    }
                }
                break;
            }
            
        }
    }
    public boolean isNumeric(String dato){
	try {
		Integer.parseInt(dato);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
    public int convertirNumero(String dato){
	try {
		
		return Integer.parseInt(dato);
	} catch (NumberFormatException nfe){
		return 0;
	}
    }
    
}
