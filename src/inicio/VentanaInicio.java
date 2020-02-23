
package inicio;

import analizador.AnalizadorLexico;
import analizador.AnalizadorLexico2;
import analizador.AnalizadorSintactico;
import analizador.AnalizadorSintactico2;
import analizador.AnalizadorLexico3;
import analizador.AnalizadorSintactico3;
import arbol.Arbol;
import arbol.Busqueda;
import arbol.Nodo;
import archivos.Archivo;
import archivos.Tabla;
import analizador.Error;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;


public class VentanaInicio extends javax.swing.JFrame {

    String pathIde = "";
    Archivo archivo = new Archivo();
    
    public VentanaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        agregarPopJtree();
        treeArbol.setModel(null);
        String te = "1.adfadf.3";
        String sepa = Pattern.quote(".");
        String [] a = te.split(sepa);
        System.out.println("Ultimo: "+a[a.length-1]);
        
                
        //treeArbol.setModel(arbol);
        //Archivo ar = new Archivo();
        //ar.crearIde("Prueba", "E:\\LENOVO-PC\\Documents\\NetBeansProjects\\Inicio\\src");
        
    }
    
    public String getTextoCsv(String texto){
        if(texto.length()>=4 && texto.substring(texto.length()-4,texto.length() ).equals(".csv")){
            return texto;
        }else{
            return texto+".csv";
        }
    }
  
    private boolean isCsv(String texto){
        if(texto.length()>=4 && texto.substring(texto.length()-4,texto.length() ).equals(".csv")){
            return true;
        }else{
            return false;
        }
    }
    
    private void insertarTablaTexto(ArrayList<Tabla> lista){
        System.out.println("ta1: "+lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("ta2: "+lista.get(i).getTabla().size());
            for (int j = 0; j < lista.get(i).getTabla().size(); j++) {
                System.out.println("ta3: "+lista.get(i).getTabla().get(j).getRegistros().size());
                for (int k = 0; k < lista.get(i).getTabla().get(j).getRegistros().size()-1; k++) {
                    textAreaDatos.setText(textAreaDatos.getText()+lista.get(i).getTabla().get(j).getRegistros().get(k)+"\t\t");
                }
                textAreaDatos.setText(textAreaDatos.getText()+lista.get(i).getTabla().get(j).getRegistros().get(lista.get(i).getTabla().get(j).getRegistros().size()-1)+"\n");
            }
            textAreaDatos.setText(textAreaDatos.getText()+"\n\nSE AGREGO LA CONSULTA HECHA");
        }
        
    }
    
    private void crearArchivo(){
        DefaultMutableTreeNode nodoSelecionado = (DefaultMutableTreeNode) treeArbol.getLastSelectedPathComponent();
                Nodo nodoS = (Nodo) nodoSelecionado.getUserObject();
                if(nodoS.getTipoDato().equals("CARPETA") || nodoS.getTipoDato().equals("PROYECTO")){
                    if (nodoSelecionado != null) {
                    DefaultTreeModel modeloActual = (DefaultTreeModel) treeArbol.getModel();
                    
                    JFileChooser fileChoser = new JFileChooser();
                    fileChoser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                    fileChoser.showOpenDialog(this);
                    File file = fileChoser.getSelectedFile();
                    
                    String nombreCarpeta = JOptionPane.showInputDialog("Escriba el nombre del Archivo");
                    String pathArchivo = file.getPath();
                        if(isCsv(pathArchivo)){
                            Nodo nodoTemp = new Nodo(getTextoCsv(pathArchivo), nombreCarpeta,"ARCHIVO");

                            modeloActual.insertNodeInto(new DefaultMutableTreeNode(nodoTemp), nodoSelecionado, modeloActual.getChildCount(nodoSelecionado));
                            modeloActual.reload();
                            treeArbol.setModel(modeloActual);
                            Arbol ar = new Arbol();
                            ar.insertarTextoModelo(treeArbol, "");
                            textAreaDatos.setText(ar.getTextoArchivoIde());
                            modificarIde(ar.getTextoArchivoIde());
                        }else{
                            JOptionPane.showMessageDialog(null, "El archivo no es de tipo CSV");
                        }
                    
                    
                    }else{
                        JOptionPane.showMessageDialog(null, "No selecciono el archivo o carpeta");
                    }
                }else{
                        DefaultTreeModel modeloActual = (DefaultTreeModel) treeArbol.getModel();
                    
                        String nombreCarpeta = JOptionPane.showInputDialog("Escriba el nombre del Archivo");
                        String pathArchivo = JOptionPane.showInputDialog("Escriba el la direccion del archivo csv");
                        Nodo nodoTemp = new Nodo(getTextoCsv(pathArchivo), nombreCarpeta,"ARCHIVO");
                        System.out.println("Padre: "+nodoSelecionado.getParent().toString());
                        modeloActual.insertNodeInto(new DefaultMutableTreeNode(nodoTemp), (MutableTreeNode) nodoSelecionado.getParent(), modeloActual.getChildCount(nodoSelecionado));
                        modeloActual.reload();
                        treeArbol.setModel(modeloActual);
                        Arbol ar = new Arbol();
                        ar.insertarTextoModelo(treeArbol, "");
                        textAreaDatos.setText(ar.getTextoArchivoIde());
                        modificarIde(ar.getTextoArchivoIde());
                    }
    }
    
    private void agregarPopJtree(){
        JPopupMenu menu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Agregar Carpeta");
        JMenuItem menuItem2 = new JMenuItem("Agregar archivo");
        JMenuItem menuItem3 = new JMenuItem("Eliminar");
        JMenuItem menuItem4 = new JMenuItem("Abrir Archivo");
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);
        treeArbol.setComponentPopupMenu(menu);
        //CREAR carpeta
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                DefaultMutableTreeNode nodoSelecionado = (DefaultMutableTreeNode) treeArbol.getLastSelectedPathComponent();
                Nodo nodoS = (Nodo) nodoSelecionado.getUserObject();
                if(nodoS.getTipoDato().equals("CARPETA") || nodoS.getTipoDato().equals("PROYECTO")){
                    if (nodoSelecionado != null) {
                    DefaultTreeModel modeloActual = (DefaultTreeModel) treeArbol.getModel();
                    
                    String nombreCarpeta = JOptionPane.showInputDialog("Escriba el nombre de la Carpeta");
                    Nodo nodoTemp = new Nodo("", nombreCarpeta,"CARPETA");
                    
                    modeloActual.insertNodeInto(new DefaultMutableTreeNode(nodoTemp), nodoSelecionado, modeloActual.getChildCount(nodoSelecionado));
                    modeloActual.reload();
                    treeArbol.setModel(modeloActual);
                    Arbol ar = new Arbol();
                    ar.insertarTextoModelo(treeArbol, "");
                    textAreaDatos.setText(ar.getTextoArchivoIde());
                    modificarIde(ar.getTextoArchivoIde());
                }else{
                    JOptionPane.showMessageDialog(null, "No selecciono el archivo o carpeta");
                }
                }else{
                    JOptionPane.showMessageDialog(null, "El archivo seleccionado es un Archivo no una carpeta");
                }
                
                
            }
        });
        //crear archivo
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearArchivo();
            }
        });
        
        menuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultMutableTreeNode nodoSelecionado = (DefaultMutableTreeNode) treeArbol.getLastSelectedPathComponent();
                if (nodoSelecionado != null) {
                    DefaultTreeModel modeloActual = (DefaultTreeModel) treeArbol.getModel();
                    
                    modeloActual.removeNodeFromParent(nodoSelecionado);
                    modeloActual.reload();
                    treeArbol.setModel(modeloActual);
                    Arbol ar = new Arbol();
                    ar.insertarTextoModelo(treeArbol, "");
                    textAreaDatos.setText(ar.getTextoArchivoIde());
                    modificarIde(ar.getTextoArchivoIde());
                }else{
                    JOptionPane.showMessageDialog(null, "No selecciono el archivo o carpeta");
                }
            }
        });
        
        menuItem4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultMutableTreeNode nodoSelecionado = (DefaultMutableTreeNode) treeArbol.getLastSelectedPathComponent();
                
                if (nodoSelecionado != null) {
                    DefaultTreeModel modeloActual = (DefaultTreeModel) treeArbol.getModel();
                    System.out.println("Pathsss: "+nodoSelecionado);
                    DefaultMutableTreeNode nodoOb = nodoSelecionado;
                    Nodo nodoArch = (Nodo) nodoOb.getUserObject();
                    

                    if(nodoArch.getTipoDato().equals("ARCHIVO")){
                        abrirProyecto(nodoArch);
                        AnalizadorLexico3 lexico = new AnalizadorLexico3(new StringReader(archivo.leerCSV(nodoArch.getPath())));
                        AnalizadorSintactico3 sintactico = new AnalizadorSintactico3(lexico);
                        sintactico.setVentana(VentanaInicio.this);
                        try {
                            sintactico.parse();
                            excribirArea(sintactico.getTabla());
                            escribirErrores(sintactico.getListaErrores());
                        }catch(Exception s){
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "La seleccion no es un archivo");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No selecciono el archivo o carpeta");
                }
            }
        });
        
    }
    private void excribirArea(Tabla tabla){
        
        textAreaDatos.setText("");
        for (int j = 0; j < tabla.getTabla().size(); j++) {
                
                for (int k = 0; k < tabla.getTabla().get(j).getRegistros().size()-1; k++) {
                    textAreaDatos.setText(textAreaDatos.getText()+tabla.getTabla().get(j).getRegistros().get(k)+"\t\t");
                }
                textAreaDatos.setText(textAreaDatos.getText()+tabla.getTabla().get(j).getRegistros().get(tabla.getTabla().get(j).getRegistros().size()-1)+"\n");
        }
        
    }
    public void escribirErrores(ArrayList<Error> lista){
        areaError.setText("");
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            areaError.setText(areaError.getText()+lista.get(i).toString()+"\n");
        }
    }
    
    private void modificarIde(String texto){
        
        archivo.escribirArchivo(pathIde, texto);       
    }
    private void abrirProyecto(Nodo nodo){
        textAreaDatos.setText(archivo.leerCSV(nodo.getPath()));
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaDatos = new javax.swing.JTextArea();
        panelArchivo = new javax.swing.JPanel();
        scrollArchivo = new javax.swing.JScrollPane();
        treeArbol = new javax.swing.JTree();
        panelConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaConsulta = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaError = new javax.swing.JTextArea();
        labelErrores = new javax.swing.JLabel();
        labelConsulta = new javax.swing.JLabel();
        botonIns = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAbrirProyecto = new javax.swing.JMenuItem();
        menuCreaProyecto = new javax.swing.JMenuItem();
        menuCerrarProyecto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaDatos.setColumns(20);
        textAreaDatos.setRows(5);
        jScrollPane2.setViewportView(textAreaDatos);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 0, 990, 450));

        scrollArchivo.setViewportView(treeArbol);

        javax.swing.GroupLayout panelArchivoLayout = new javax.swing.GroupLayout(panelArchivo);
        panelArchivo.setLayout(panelArchivoLayout);
        panelArchivoLayout.setHorizontalGroup(
            panelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArchivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelArchivoLayout.setVerticalGroup(
            panelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArchivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
        );

        getContentPane().add(panelArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 810));

        textAreaConsulta.setColumns(20);
        textAreaConsulta.setRows(5);
        textAreaConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaConsultaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textAreaConsulta);

        areaError.setColumns(20);
        areaError.setRows(5);
        jScrollPane3.setViewportView(areaError);

        labelErrores.setText("ERRORES");

        labelConsulta.setText("Consultas");

        javax.swing.GroupLayout panelConsultaLayout = new javax.swing.GroupLayout(panelConsulta);
        panelConsulta.setLayout(panelConsultaLayout);
        panelConsultaLayout.setHorizontalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelConsulta)
                    .addComponent(labelErrores))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelConsultaLayout.setVerticalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelConsulta)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 980, 340));

        botonIns.setText("jButton1");
        botonIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsActionPerformed(evt);
            }
        });
        getContentPane().add(botonIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 620, -1, -1));

        jMenu1.setText("Archivo");

        menuAbrirProyecto.setText("Abrir Proyecto");
        menuAbrirProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirProyectoActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrirProyecto);

        menuCreaProyecto.setText("Crear Proyecto");
        menuCreaProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCreaProyectoActionPerformed(evt);
            }
        });
        jMenu1.add(menuCreaProyecto);

        menuCerrarProyecto.setText("Cerrar Proyecto");
        menuCerrarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarProyectoActionPerformed(evt);
            }
        });
        jMenu1.add(menuCerrarProyecto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsActionPerformed
        String texto = textAreaConsulta.getText();
        
        if(texto.substring(texto.length()-1,texto.length()).equals(";")){
           AnalizadorLexico2 lexico = new AnalizadorLexico2(new StringReader(texto));
        
        AnalizadorSintactico2 sintactico = new AnalizadorSintactico2(lexico);
        sintactico.setVentana(this);
        sintactico.setArbol((TreeNode) treeArbol.getModel().getRoot());
        try {
            sintactico.parse();
            insertarTablaTexto(sintactico.getLista());
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        }else{
            textAreaConsulta.setText(textAreaConsulta.getText()+"");
        }
    }//GEN-LAST:event_botonInsActionPerformed

    private void menuCreaProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCreaProyectoActionPerformed
        String nombreProyecto = JOptionPane.showInputDialog("Escriba el nombre del Proyecto");
        
        JFileChooser fileChoser = new JFileChooser();
        fileChoser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChoser.showOpenDialog(this);
        File file = fileChoser.getSelectedFile();
        if(!file.getPath().isEmpty()){
            pathIde = file.getPath();
            archivo.crearIde(nombreProyecto, pathIde);
            pathIde+="\\"+nombreProyecto+".ide";
            System.out.println(pathIde);
            treeArbol.setModel(null);
            AnalizadorLexico lexico = new AnalizadorLexico(new StringReader(archivo.leerArchivo(pathIde)));
            AnalizadorSintactico sintactico = new AnalizadorSintactico(lexico);

            try {
                sintactico.parse();

                DefaultMutableTreeNode roots = sintactico.getArbol();
                DefaultTreeModel arbol = new  DefaultTreeModel(roots);
                treeArbol.setModel(arbol);

            } catch (Exception e) {
                e.printStackTrace();
            }
            
            }
        
        
    }//GEN-LAST:event_menuCreaProyectoActionPerformed

    private void menuAbrirProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirProyectoActionPerformed
        JFileChooser fileChoser = new JFileChooser();
        fileChoser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChoser.showOpenDialog(this);
        File file = fileChoser.getSelectedFile();
        
        if(!file.getPath().isEmpty()){
            pathIde = file.getPath();
            System.out.println("pATH: "+file.getPath());
        
            if(pathIde.substring(pathIde.length()-4,pathIde.length() ).equals(".ide") || pathIde.substring(pathIde.length()-4,pathIde.length() ).equals(".IDE")){
                treeArbol.setModel(null);
                AnalizadorLexico lexico = new AnalizadorLexico(new StringReader(archivo.leerArchivo(pathIde)));
                lexico.setVentana(this);
                AnalizadorSintactico sintactico = new AnalizadorSintactico(lexico);
                sintactico.setVentana(this);
                
            try {
                sintactico.parse();

                DefaultMutableTreeNode roots = sintactico.getArbol();
                DefaultTreeModel arbol = new  DefaultTreeModel(roots);
                treeArbol.setModel(arbol);

                DefaultTreeModel noa =  (DefaultTreeModel) treeArbol.getModel();
                
                Busqueda bus = new Busqueda();
                if(treeArbol!=null){
                    bus.insertarNodo((TreeNode) treeArbol.getModel().getRoot(), "achivo");
                }
                
                //System.out.println("Path: "+noa.getChildCount("[pro,achivo]"));
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            }else{
                JOptionPane.showMessageDialog(null, "El archivo no es tipo IDE");
            }
        }
        
        
    }//GEN-LAST:event_menuAbrirProyectoActionPerformed

    private void menuCerrarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarProyectoActionPerformed
        pathIde="";
        treeArbol.setModel(null);
    }//GEN-LAST:event_menuCerrarProyectoActionPerformed

    private void textAreaConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaConsultaKeyTyped
        char cajaCodigo = evt.getKeyChar();
        if(cajaCodigo==KeyEvent.VK_ENTER){
            botonIns.doClick();
        }
    }//GEN-LAST:event_textAreaConsultaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea areaError;
    private javax.swing.JButton botonIns;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelConsulta;
    private javax.swing.JLabel labelErrores;
    private javax.swing.JMenuItem menuAbrirProyecto;
    private javax.swing.JMenuItem menuCerrarProyecto;
    private javax.swing.JMenuItem menuCreaProyecto;
    private javax.swing.JPanel panelArchivo;
    private javax.swing.JPanel panelConsulta;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JScrollPane scrollArchivo;
    private javax.swing.JTextArea textAreaConsulta;
    public javax.swing.JTextArea textAreaDatos;
    private javax.swing.JTree treeArbol;
    // End of variables declaration//GEN-END:variables
}
