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
public class Emp1 extends javax.swing.JFrame {

   private final datosJDBC CP;
    /**
     * Creates new form Admin
     */
    public Emp1() {
        setTitle("Empleados");
        initComponents();
        CP= new datosJDBC();
        listar();
        
        this.setLocationRelativeTo(null);
    }
    private void listar(){
        tablaEmp.setModel(CP.getDatos());
       
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
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtEmpCod = new javax.swing.JTextField();
        txtEmpNombre = new javax.swing.JTextField();
        txtEmpApePa = new javax.swing.JTextField();
        txtEmpMa = new javax.swing.JTextField();
        txtEmpDni = new javax.swing.JTextField();
        txtEmpFecha = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtEmpSalario = new javax.swing.JTextField();
        txtEmpEdad = new javax.swing.JTextField();
        txtEmpDirec = new javax.swing.JTextField();
        comboBoxEmp = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmp = new javax.swing.JTable();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Codigo:");

        jLabel15.setText("Nombre:");

        jLabel16.setText("Ape Pat:");

        jLabel17.setText("Ape Mat.");

        jLabel18.setText("Curp:");

        jLabel19.setText("Fecha:");

        txtEmpCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpCodActionPerformed(evt);
            }
        });

        txtEmpApePa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpApePaActionPerformed(evt);
            }
        });

        jLabel23.setText("Edad:");

        jLabel24.setText("Salario:");

        jLabel25.setText("Dirección:");

        comboBoxEmp.setBackground(new java.awt.Color(204, 204, 255));
        comboBoxEmp.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        comboBoxEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrar", "Baja", "Limpiar", "Buscar", "Clientes", "Citas", "Menu" }));
        comboBoxEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmpMa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpDni, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpApePa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpCod, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17)
                    .addComponent(jLabel14))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19)
                        .addGap(28, 28, 28)
                        .addComponent(txtEmpFecha)))
                .addGap(18, 18, 18)
                .addComponent(comboBoxEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEmpCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtEmpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtEmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtEmpSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpApePa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel23)
                    .addComponent(txtEmpEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtEmpMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtEmpDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtEmpDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel12.setText("EMPLEADOS");

        tablaEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmp);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
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

    private void txtEmpApePaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpApePaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpApePaActionPerformed

    private void txtEmpCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpCodActionPerformed

    private void comboBoxEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEmpActionPerformed
        // comboBoxEmp  
        
        //Registrar  Baja  Limpiar  Buscar Regresar
        String op;
        op = comboBoxEmp .getSelectedItem().toString();
        
        
        switch (op) {
            
           
        case "Registrar":
        Boolean guardar = true;
        String mensaje = "";
        Integer id = Integer.parseInt(txtEmpCod.getText());
        String nombre = txtEmpNombre.getText();
        String pat = txtEmpApePa.getText();
        String mat = txtEmpMa.getText();
        String dni = txtEmpDni.getText();
        String fecha = txtEmpFecha.getText();
        Float sueldo = Float.parseFloat(txtEmpSalario.getText());
        Double ed= Double.parseDouble(txtEmpEdad.getText());
        String dir = txtEmpDirec.getText();
        if (nombre.length() == 0) {
            guardar = false;
            mensaje += "Escriba el nombre\n";
        }
        if (sueldo == 0) {
            guardar = false;
            mensaje += "Escriba el salario, por favor\n";
        }
        if (guardar) {
            datosJDBC contrl = new datosJDBC();
            contrl.insertEmpleados(id, nombre, pat, mat, dni, fecha, sueldo, ed, dir);
            listar();
        } else {
            JOptionPane.showMessageDialog(null, mensaje);
        }

                    break;
                    
                case "Baja":
               datosJDBC sql = new datosJDBC();
     sql.eliminarEmpleado(Integer.parseInt(txtEmpCod.getText()));
     listar();
                    break;
                case "Limpiar":  
              txtEmpCod.setText("");
        txtEmpNombre.setText("");
        txtEmpApePa.setText("");
        txtEmpMa.setText("");
        txtEmpDni.setText("");
        txtEmpFecha.setText("");
        txtEmpSalario.setText("");
        txtEmpEdad.setText("");
        txtEmpDirec.setText("");
                    break;
                    
                case "Buscar":
              datosJDBC b= new datosJDBC();
              Integer emp = Integer.parseInt(txtEmpCod.getText());
              b.buscarCodigoEmpleado(emp);
                         
                    break;
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
               case "Citas":
            Citas  cit= new Citas();
      cit.setVisible(true);
      dispose();
            break;
                    
        }
    }//GEN-LAST:event_comboBoxEmpActionPerformed

    private void tablaEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpMouseClicked
        int seleccion = tablaEmp.rowAtPoint(evt.getPoint());
        txtEmpCod.setText(String.valueOf(tablaEmp.getValueAt(seleccion, 0)));
        txtEmpNombre.setText(String.valueOf(tablaEmp.getValueAt(seleccion, 1)));
        txtEmpApePa.setText(String.valueOf(tablaEmp.getValueAt(seleccion, 2)));
        txtEmpMa.setText(String.valueOf(tablaEmp.getValueAt(seleccion, 3)));
        txtEmpDni.setText(String.valueOf(tablaEmp.getValueAt(seleccion, 4)));
        txtEmpFecha.setText(String.valueOf(tablaEmp.getValueAt(seleccion, 5)));
        txtEmpSalario.setText(String.valueOf(tablaEmp.getValueAt(seleccion, 6)));
        txtEmpEdad.setText(String.valueOf(tablaEmp.getValueAt(seleccion, 7)));
        txtEmpDirec.setText(String.valueOf(tablaEmp.getValueAt(seleccion, 8)));
    }//GEN-LAST:event_tablaEmpMouseClicked

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
            java.util.logging.Logger.getLogger(Emp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Emp1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxEmp;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEmp;
    private javax.swing.JTextField txtEmpApePa;
    private javax.swing.JTextField txtEmpCod;
    private javax.swing.JTextField txtEmpDirec;
    private javax.swing.JTextField txtEmpDni;
    private javax.swing.JTextField txtEmpEdad;
    private javax.swing.JTextField txtEmpFecha;
    private javax.swing.JTextField txtEmpMa;
    private javax.swing.JTextField txtEmpNombre;
    private javax.swing.JTextField txtEmpSalario;
    // End of variables declaration//GEN-END:variables
}