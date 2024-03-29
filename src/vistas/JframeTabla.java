/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import entidades.Area;
import entidades.Integrante;
import entidades.Lider;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel; //modelo de datos para JTable
import java.util.Vector; //se requiere para hacer filas
import javax.swing.JOptionPane;
import main.Test;

/**
 *
 * @author eterr
 */
public class JframeTabla extends javax.swing.JFrame {
    Area m = new Area("Desarrollo de Software");
    private Lider lider;
    //Se debe declarar el modelo de datos del JTable como una variable global
    DefaultTableModel modelo;

    /**
     * Creates new form frmVentana01
     */
    public JframeTabla() {
        initComponents();
    }
    
    public JframeTabla(Lider lider) {
        initComponents();
        this.lider=lider;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Txt_nombre = new javax.swing.JTextField();
        Txt_edad = new javax.swing.JTextField();
        Txt_dni = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BuscarjButton = new javax.swing.JButton();
        TextoBuscarjTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TablaGestor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        TablaGestor.setSelectionBackground(new java.awt.Color(204, 153, 0));
        TablaGestor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaGestor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaGestor.setShowGrid(true);
        jScrollPane2.setViewportView(TablaGestor);

        BtnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestor de Empleados");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre Completo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DNI:");

        Txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Txt_edad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Txt_edad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_edad.setText("0");

        Txt_dni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Txt_dni.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        BtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnLimpiar.setText("Limpiar Tabla");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BuscarjButton.setText("Buscar");
        BuscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoBuscarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BuscarjButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnAgregar)
                        .addGap(26, 26, 26)
                        .addComponent(BtnModificar)
                        .addGap(26, 26, 26)
                        .addComponent(BtnEliminar)
                        .addGap(26, 26, 26)
                        .addComponent(BtnLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuscarjButton)
                            .addComponent(TextoBuscarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))))
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
        TablaGestor.getColumnModel().getColumn(2).setMaxWidth(90);
        TablaGestor.getColumnModel().getColumn(2).setPreferredWidth(90);
          
       
        String []data = new String[3];
        data[0] = lider.getNombre();
        data[1] = lider.getEdad();
        data[2] = lider.getDni();
        modelo.addRow(data);
        
        for(Integrante i: lider.getArea().getIntegrantes()){
            data[0] = i.getNombre();
            data[1] = i.getEdad();
            data[2] = i.getDni();
            modelo.addRow(data);
        }
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        // TODO add your handling code here:
        // Llamar al JDialog de DetalleDialogo
        // JframeIngresoDatos y = new JframeIngresoDatos(this, true); // Llamar de forna modal
        // y.setVisible(true);
        
        
        // Validar los datos antes de ingresar al JTable
        try
        {
            // Se debe ingresar el nombre completo
            if (Txt_nombre.getText().trim().length() == 0)
            {
                JOptionPane.showMessageDialog(this,"Debe ingresar el nombre completo.");
                return; // con este código si el mensaje sale ya no se continuan con las líneas de abajo.
            }
            
            // Edad debe ser mayor a cero
            if (Integer.parseInt(Txt_edad.getText()) <= 0)
            {
                JOptionPane.showMessageDialog(this,"Edad debe ser mayor a cero.");
                return; // con este código si el mensaje sale ya no se continuan con las líneas de abajo.
            }
            
            // DNI debe ser un valor de 8 dígitos
            if (Txt_dni.getText().trim().length() != 8)
            {
                JOptionPane.showMessageDialog(this,"DNI debe ser un valor de 8 dígitos.");
                return; // con este código si el mensaje sale ya no se continuan con las líneas de abajo.
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"La información ingresada no es válida.");
        }
        
        String []data = new String[3];
        data[0] = Txt_nombre.getText();
        data[1] = Txt_edad.getText();
        data[2] = Txt_dni.getText();
        modelo.addRow(data);
        
        
        
        Integrante z = new Integrante(Txt_nombre.getText().toString(), Txt_edad.getText().toString(), Txt_dni.getText().toString());
        // System.out.println("--->"+z.toString());
        m.guardarIntegrante(z);
        Txt_nombre.setText("");
        Txt_edad.setText("");
        Txt_dni.setText("");
        
        m.mostrarIntegrantes();
        // Verificando si se hizo click en Aceptar
        // Si el RootPane del JDialog no es nulo se hizo click en Aceptar
        //if (y.getRootPane() != null)
        //{
            // Se debe agregar al GRID del JDialog llamado JframeIngresoDatos
            // Se debe crear un vector para la fila del JTable
        //    Vector v = new Vector();
        //    v.addElement(z.getNombre());
        //    v.addElement(z.getEdad());
        //    v.addElement(z.getDni());
            
            // Agregar la fila al modelo
        //    modelo.addRow(v);
        //}
        
        
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
        // Botón para editar la fila a seleccionar
        // En primer lugar hay que validar la selección de la fila
        if (TablaGestor.getSelectedRow() == -1) {
            return; // En este caso, si no se ha seleccionado la fila, entonces no se continúa.
        }
        
        // Hay que mostrar el JDialog de JframeIngresoDatos
        //JframeIngresoDatos y = new JframeIngresoDatos(this,true);
        //y.setVisible(true);
        
        int fila = TablaGestor.getSelectedRow();
        modelo.setValueAt(Txt_nombre.getText(), fila, 0);
        modelo.setValueAt(Txt_edad.getText(), fila, 1);
        modelo.setValueAt(Txt_dni.getText(), fila, 2);
        
                         
            
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        int fila = TablaGestor.getSelectedRow();
        modelo.removeRow(fila);
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
        
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BuscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarjButtonActionPerformed
        // TODO add your handling code here:
        // String name = JOptionPane.showInputDialog("Type your name please");
        String buscar = TextoBuscarjTextField.getText();

        // limpiando datos actuales
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }

        // obteniendo y agregando los resultados del filtro
        String[] data = new String[3];
        for(Integrante i: lider.getArea().getIntegrantes(buscar)){
            data[0] = i.getNombre();
            data[1] = i.getEdad();
            data[2] = i.getDni();
            modelo.addRow(data);
        }

    }//GEN-LAST:event_BuscarjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        // Instanciar la clase JframeTabla a la clase main
        JframeTabla window = new JframeTabla();
        window.setTitle("Ventana utilizando JOptionPane");
        window.setVisible(true);
        
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
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BuscarjButton;
    private javax.swing.JTable TablaGestor;
    private javax.swing.JTextField TextoBuscarjTextField;
    private javax.swing.JTextField Txt_dni;
    private javax.swing.JTextField Txt_edad;
    private javax.swing.JTextField Txt_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
