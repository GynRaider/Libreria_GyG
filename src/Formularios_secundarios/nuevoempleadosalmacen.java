/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_secundarios;

import Atxy2k.CustomTextField.RestrictedTextField;
import conexion.conexion;
import java.awt.Dimension;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author GynRaider
 */
public class nuevoempleadosalmacen extends javax.swing.JInternalFrame {
private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null; 
    /**
     * Creates new form nuevoempleados
     */
    public nuevoempleadosalmacen() {
          ocultarBarraTitulo() ;
        initComponents();
        
        
         RestrictedTextField nc = new RestrictedTextField(nombreEmpleado); 
           nc.setLimit(20);
           
           RestrictedTextField ac = new RestrictedTextField(apellidoEmpleado); 
           ac.setLimit(20);
            RestrictedTextField dc = new RestrictedTextField(docEmpleado); 
           dc.setLimit(8);
           dc.setOnlyNums(true);
           
           RestrictedTextField cd = new RestrictedTextField(celularEmpleado); 
           cd.setLimit(9);
           cd.setOnlyNums(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTF_Codigo = new javax.swing.JTextField();
        nombreEmpleado = new javax.swing.JTextField();
        apellidoEmpleado = new javax.swing.JTextField();
        sexoEmpleado = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        docEmpleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        celularEmpleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        usuarioEmpleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tipoEmpleado = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        JBT_Limpiar = new javax.swing.JButton();
        btnGuardad = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("SISTEMA DE INGRESO DE EMPLEADOS DEL ALMACEN");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Empleado :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sexo :");

        JTF_Codigo.setEditable(false);
        JTF_Codigo.setText("Autogenerado");
        JTF_Codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nombreEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        apellidoEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sexoEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sexoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        sexoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMENINO", "OTROS" }));
        sexoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoEmpleadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Documento de Identidad : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Celular : ");

        jLabel8.setText("Nombre de usuario:");

        jLabel9.setText("Tipo:");

        tipoEmpleado.setEditable(false);
        tipoEmpleado.setText("Empleado de Almacén");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(docEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                    .addComponent(apellidoEmpleado)
                    .addComponent(nombreEmpleado))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sexoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(usuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(celularEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(docEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(usuarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sexoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(celularEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logout_Icon_32.png"))); // NOI18N
        jButton3.setText("Cerrar");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        JBT_Limpiar.setBackground(new java.awt.Color(153, 153, 153));
        JBT_Limpiar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        JBT_Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        JBT_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Paint tools.png"))); // NOI18N
        JBT_Limpiar.setText("LIMPIAR");
        JBT_Limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBT_Limpiar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JBT_Limpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBT_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_LimpiarActionPerformed(evt);
            }
        });

        btnGuardad.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardad.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnGuardad.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Floppy disk.png"))); // NOI18N
        btnGuardad.setText("GUARDAR");
        btnGuardad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnGuardad)
                .addGap(29, 29, 29)
                .addComponent(JBT_Limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBT_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(btnGuardad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardadActionPerformed
        String
                nombre = docEmpleado.getText(),
                apellido = apellidoEmpleado.getText(),
                usuario = usuarioEmpleado.getText(),
                sexo = sexoEmpleado.getSelectedItem().toString(),
                documento = docEmpleado.getText(),
                celular = celularEmpleado.getText();
        
        Connection cnn;
        
        cnn = conexion.conectar();
        
        if (nombre.equals("")||apellido.equals("")||usuario.equals("")||sexo.equals("")||documento.equals("")||celular.equals("")) {
            JOptionPane.showMessageDialog(null,"Por favor, complete todos los campos.");
        } else {
            try {
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM empleado_almacen WHERE documento='"+documento+"'");
                rs.last();
                
                int encontrado = rs.getRow();

                if (encontrado==1) {
                    JOptionPane.showMessageDialog(null,"Documento ya existente. Consulte la base de datos.");
                    st.close();
                    rs.close();
                } else {
                    try {
                        CallableStatement cst = cnn.prepareCall("CALL insertar_empleado_almacen(?,?,?,?,?,?)");
                        cst.setString(1,nombre);
                        cst.setString(2,apellido);
                        cst.setString(3,usuario);
                        cst.setString(4,sexo);
                        cst.setInt(5,Integer.parseInt(documento));
                        cst.setInt(6,Integer.parseInt(celular));
                        cst.execute();
                        JOptionPane.showMessageDialog(null,"Nuevo encargado de almacén ingresado.");

                        try {
                            Statement st2 = cnn.createStatement();
                            ResultSet rs2 = st2.executeQuery("SELECT * FROM empleado_almacen WHERE documento='"+documento+"'");
                            rs2.last();
                        
                            int encontrado2 = rs2.getRow();
                            
                            if (encontrado2 == 1) {
                                CallableStatement cst2 = cnn.prepareCall("CALL insertar_cuentaUsuario(?,?,?)");
                                cst2.setString(1,usuario);
                                cst2.setString(2,rs2.getString("id_empleadoalmacen"));
                                cst2.setString(3,tipoEmpleado.getText());
                                cst2.execute();
                                
                                JOptionPane.showMessageDialog(null,rs2.getString("id_empleadoalmacen"));
                                st2.close();
                                rs2.close();
                            } else {
                                JOptionPane.showMessageDialog(null,"Corrige esta mierda!");
                            }
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null,e);
                        }                        
                        rs.close();
                        st.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,e);
                    }   
                }
                
                cnn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_btnGuardadActionPerformed

    private void JBT_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_LimpiarActionPerformed
        docEmpleado.setText("");
        apellidoEmpleado.setText("");
        docEmpleado.setText("");
        celularEmpleado.setText("");
    }//GEN-LAST:event_JBT_LimpiarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sexoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_Limpiar;
    private javax.swing.JTextField JTF_Codigo;
    private javax.swing.JTextField apellidoEmpleado;
    private javax.swing.JButton btnGuardad;
    private javax.swing.JTextField celularEmpleado;
    private javax.swing.JTextField docEmpleado;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nombreEmpleado;
    private javax.swing.JComboBox sexoEmpleado;
    private javax.swing.JTextField tipoEmpleado;
    private javax.swing.JTextField usuarioEmpleado;
    // End of variables declaration//GEN-END:variables
public void ocultarBarraTitulo()
{ 
Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane(); 
dimBarra = Barra.getPreferredSize(); 
Barra.setSize(0,0); 
Barra.setPreferredSize(new Dimension(0,0)); 
repaint(); 
}

}
