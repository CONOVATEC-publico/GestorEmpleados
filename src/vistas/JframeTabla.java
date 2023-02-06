/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import javax.swing.table.DefaultTableModel; //modelo de datos para JTable
import java.util.Vector; //se requiere para hacer filas

/**
 *
 * @author eterr
 */
public class JframeTabla extends javax.swing.JFrame {
    
    //Se debe declarar el modelo de datos del JTable como una variable global
    DefaultTableModel modelo;

    /**
     * Creates new form frmVentana01
     */
    public JframeTabla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablaGestor = new javax.swing.JTable();
        BtnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TablaGestor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaGestor.setRowMargin(1);
        TablaGestor.setSelectionBackground(new java.awt.Color(204, 153, 0));
        TablaGestor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaGestor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaGestor.setShowGrid(true);
        jScrollPane2.setViewportView(TablaGestor);

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestor de Empleados");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnModificar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //Inicializando el modelo de datos
        modelo = new DefaultTableModel(){
            //se requiere evitar la edición de las celdas del JTable
            public boolean isCellEditable(int rowIndex, int mColIndex)
            {
                return false; //permite el retorno falso indicando que no permita editar la celda
            }
        };
        
        //Poniendo columnas al modelo
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("DNI");
        
        //Colocando el modelo en el JTable
        TablaGestor.setModel(modelo);
        
        //Definiendo el ancho de las columnas
        TablaGestor.getColumnModel().getColumn(0).setMaxWidth(150);
        TablaGestor.getColumnModel().getColumn(0).setPreferredWidth(150);
        TablaGestor.getColumnModel().getColumn(1).setMaxWidth(80);
        TablaGestor.getColumnModel().getColumn(1).setPreferredWidth(80);
        TablaGestor.getColumnModel().getColumn(2).setMaxWidth(80);
        TablaGestor.getColumnModel().getColumn(2).setPreferredWidth(80);
          
       
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        // TODO add your handling code here:
        // Llamar al JDialog de DetalleDialogo
        JframeIngresoDatos y = new JframeIngresoDatos(this, true); // Llamar de forna modal
        y.setVisible(true);
        entidades.Integrante z = new entidades.Integrante(y.nombre.getText().toString(), y.edad.getText().toString(), y.dni.getText().toString());
        
        // Verificando si se hizo click en Aceptar
        // Si el RootPane del JDialog no es nulo se hizo click en Aceptar
        if (y.getRootPane() != null)
        {
            // Se debe agregar al GRID del JDialog llamado DetalleDialogo
            // Se debe crear un vector para la fila del JTable
            Vector v = new Vector();
            v.addElement(y.nombre.getText());
            v.addElement(y.edad.getText());
            v.addElement(y.dni.getText());
            
            // Agregar la fila al modelo
            modelo.addRow(v);
        }
        
        
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
        // Botón para editar la fila a seleccionar
    }//GEN-LAST:event_BtnModificarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JframeTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JTable TablaGestor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
