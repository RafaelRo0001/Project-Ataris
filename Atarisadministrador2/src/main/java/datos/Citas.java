/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Rosas
 */
public class Citas extends javax.swing.JFrame {
    private final datosJDBC R;
//tablaCitas
    /**
     * Creates new form Admin
     */
    public Citas() {
        setTitle("Citas");
        initComponents();
        R= new datosJDBC();
        listar3();
        this.setLocationRelativeTo(null);
    }

      private void listar3(){
        tablaCitas.setModel(R.getDatos3());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCitaId = new javax.swing.JTextField();
        txtCitaHora = new javax.swing.JTextField();
        txtCitaClienteID = new javax.swing.JTextField();
        txtCitaFecha = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        comboBoxCitas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setText("ID Cita:");

        jLabel21.setText("Fecha:");

        txtCitaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCitaHoraActionPerformed(evt);
            }
        });

        txtCitaClienteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCitaClienteIDActionPerformed(evt);
            }
        });

        txtCitaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCitaFechaActionPerformed(evt);
            }
        });

        jLabel22.setText("Hora:");

        jLabel23.setText("Cliente ID:");

        comboBoxCitas.setBackground(new java.awt.Color(102, 255, 204));
        comboBoxCitas.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        comboBoxCitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrar", "Baja", "Limpiar", "Buscar Cliente", "Buscar Empleado", "Clientes", "Empleados", "Menu", " " }));
        comboBoxCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCitasActionPerformed(evt);
            }
        });

        jLabel1.setText("Emp ID:");

        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCitasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCitas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel1))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCitaId, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(txtCitaHora)
                            .addComponent(txtCitaClienteID)
                            .addComponent(txtCitaFecha)
                            .addComponent(txtEmpId))
                        .addGap(56, 56, 56)
                        .addComponent(comboBoxCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCitaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtCitaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCitaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCitaClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel13.setText("CITAS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCitaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCitaHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCitaHoraActionPerformed

    private void txtCitaClienteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCitaClienteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCitaClienteIDActionPerformed

    private void txtCitaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCitaFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCitaFechaActionPerformed

    private void comboBoxCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCitasActionPerformed
       //Registrar  Baja  Limpiar  Buscar Regresar
        String op;
        op = comboBoxCitas.getSelectedItem().toString();
        
        
        switch (op) {
        case "Registrar":
          Boolean guardar = true;
        String mensaje = "";
        Integer ciid = Integer.parseInt(txtCitaId.getText());
        String fe= txtCitaFecha.getText();
        String ciho = txtCitaHora.getText();
        Integer cicli = Integer.parseInt(txtCitaClienteID.getText());
        Integer ciemp = Integer.parseInt(txtEmpId.getText());
        
        if (ciid == 0) {
            guardar = false;
            mensaje += "Escribe el numero de cita\n";
        }
        if (fe.length() == 0) {
            guardar = false;
            mensaje += "Escribe la Fecha";
        }
        if (guardar) {
            datosJDBC control = new datosJDBC();
            control.insertCitas(ciid, fe, ciho, cicli, ciemp);
             listar3();
            
        }

                    break;
                    
                case "Baja":
              datosJDBC sql = new datosJDBC();
        Integer cii = Integer.parseInt(txtCitaId.getText());
        sql.eliminarCitas(cii);
        listar3();
                    break;
                case "Limpiar":  
                    txtCitaId.setText("");
        txtCitaFecha.setText("");
       txtCitaHora.setText("");
       txtCitaClienteID.setText("");
       txtEmpId.setText("");
                    break;
        // Buscar Cliente   Buscar Empleado            
                case "Buscar Cliente":
             datosJDBC  bc = new datosJDBC();
        Integer cli = Integer.parseInt(txtCitaClienteID.getText());
        bc.buscarCodclien(cli); 
                    break;
                
                    case "Buscar Empleado":
             datosJDBC b= new datosJDBC();
              Integer emp = Integer.parseInt(txtEmpId.getText());
              b.buscarCodigoEmpleado(emp);
                    break;
            //Clientes Empleado Menu        
                case "Menu": 
                      AdminMain  am= new AdminMain ();
      am.setVisible(true);
      dispose();
                    break;
               case "Clientes":
              Clientes  c= new Clientes();
              c.setVisible(true);
             dispose();
            break;
        case "Empleados":
              Emp1  e= new Emp1();
              e.setVisible(true);
              dispose();
            break;
        }
    }//GEN-LAST:event_comboBoxCitasActionPerformed

    private void tablaCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCitasMouseClicked
        int seleccion = tablaCitas.rowAtPoint(evt.getPoint());
        txtCitaId.setText(String.valueOf(tablaCitas.getValueAt(seleccion, 0)));
        txtCitaFecha.setText(String.valueOf(tablaCitas.getValueAt(seleccion, 1)));
        txtCitaHora.setText(String.valueOf(tablaCitas.getValueAt(seleccion, 2)));
        txtCitaClienteID.setText(String.valueOf(tablaCitas.getValueAt(seleccion, 3)));
        txtEmpId.setText(String.valueOf(tablaCitas.getValueAt(seleccion, 4)));
        
    }//GEN-LAST:event_tablaCitasMouseClicked

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
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxCitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTextField txtCitaClienteID;
    private javax.swing.JTextField txtCitaFecha;
    private javax.swing.JTextField txtCitaHora;
    private javax.swing.JTextField txtCitaId;
    private javax.swing.JTextField txtEmpId;
    // End of variables declaration//GEN-END:variables
}
