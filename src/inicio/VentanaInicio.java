
package inicio;


public class VentanaInicio extends javax.swing.JFrame {


    public VentanaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaDatos = new javax.swing.JTextArea();
        panelArchivo = new javax.swing.JPanel();
        scrollArchivo = new javax.swing.JScrollPane();
        panelConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaConsulta = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
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

        javax.swing.GroupLayout panelArchivoLayout = new javax.swing.GroupLayout(panelArchivo);
        panelArchivo.setLayout(panelArchivoLayout);
        panelArchivoLayout.setHorizontalGroup(
            panelArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArchivoLayout.createSequentialGroup()
                .addComponent(scrollArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
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
        jScrollPane1.setViewportView(textAreaConsulta);

        javax.swing.GroupLayout panelConsultaLayout = new javax.swing.GroupLayout(panelConsulta);
        panelConsulta.setLayout(panelConsultaLayout);
        panelConsultaLayout.setHorizontalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );
        panelConsultaLayout.setVerticalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
        );

        getContentPane().add(panelConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 980, 340));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelArchivo;
    private javax.swing.JPanel panelConsulta;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JScrollPane scrollArchivo;
    private javax.swing.JTextArea textAreaConsulta;
    private javax.swing.JTextArea textAreaDatos;
    // End of variables declaration//GEN-END:variables
}
