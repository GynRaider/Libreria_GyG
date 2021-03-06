/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_secundarios;

import conexion.conexion;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Calendar;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author GynRaider
 */

public class modificarCliente extends javax.swing.JInternalFrame {
    
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    
    Connection con;
    String codPersona,codCliente,nomCliente,apeCliente,sexCliente,dirCliente,ruCliente,corCliente;
    int docCliente,celCliente;
    Date fechaNac;
    
    public void limpiar(){
        codigoCliente.setText("");
        documentoCliente.setText("");
        celularCliente.setText("");
        nombreCliente.setText("");
        apellidoCliente.setText("");
        direccionCliente.setText("");
        correoCliente.setText("");
    }
    
    public void habilitar(){
        codigoCliente.setEditable(true);
        nombreCliente.setEditable(true);
        apellidoCliente.setEditable(true);
        documentoCliente.setEditable(true);
        rucCliente.setEditable(true);
        celularCliente.setEditable(true);
        direccionCliente.setEditable(true);
        correoCliente.setEditable(true);
        nacimientoCliente.setEnabled(true);
        jCheckBox1.setEnabled(true);
        sexoCliente.setEnabled(true);
        btnGuardad.setEnabled(true);
    }
    
    public void deshabilitar(){
        codigoCliente.setEditable(false);
        nombreCliente.setEditable(false);
        apellidoCliente.setEditable(false);
        documentoCliente.setEditable(false);
        rucCliente.setEditable(false);
        celularCliente.setEditable(false);
        direccionCliente.setEditable(false);
        correoCliente.setEditable(false);
        nacimientoCliente.setEnabled(false);
        jCheckBox1.setEnabled(false);
        sexoCliente.setEnabled(false);
        btnGuardad.setEnabled(false);
    }
    
    public modificarCliente() {
            
        ocultarBarraTitulo() ;
//        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
//         
        initComponents();
        jButton1.setMnemonic(KeyEvent.VK_X);

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        celularCliente = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        direccionCliente = new javax.swing.JTextField();
        correoCliente = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        codigoCliente = new javax.swing.JTextField();
        documentoCliente = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        apellidoCliente = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        rucCliente = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        sexoCliente = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        buscarPor = new javax.swing.JComboBox();
        buscarCliente = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        nacimientoCliente = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        JBT_Limpiar = new javax.swing.JButton();
        btnGuardad = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Telefono :");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        celularCliente.setEditable(false);
        jPanel2.add(celularCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 16, 130, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("Direccion :");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 48, -1, -1));

        direccionCliente.setEditable(false);
        jPanel2.add(direccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 47, 315, -1));

        correoCliente.setEditable(false);
        jPanel2.add(correoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 80, 315, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Correo :");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 78, -1, -1));

        jLabel1.setText("(opcional)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 19, -1, -1));

        jLabel2.setText("(opcional)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 83, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/VL.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 508, 120));

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("ID Cliente :");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Documento Identidad :");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        codigoCliente.setEditable(false);
        jPanel10.add(codigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, -1));

        documentoCliente.setEditable(false);
        jPanel10.add(documentoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 138, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Nombres :");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        nombreCliente.setEditable(false);
        jPanel10.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 408, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Apellidos :");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        apellidoCliente.setEditable(false);
        jPanel10.add(apellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 407, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1.setText("RUC");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel10.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        rucCliente.setEditable(false);
        rucCliente.setEnabled(false);
        jPanel10.add(rucCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 120, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Sexo:");
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        sexoCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        sexoCliente.setSelectedIndex(-1);
        sexoCliente.setToolTipText("");
        jPanel10.add(sexoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 150, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Fecha Nacimiento:");
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        buscarPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar por código", "Buscar por Documento" }));
        jPanel10.add(buscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, -1));
        jPanel10.add(buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 130, 30));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));
        jPanel10.add(nacimientoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 150, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/VL.jpg"))); // NOI18N
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 510, 250));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 510, 240));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel36.setText("DATOS DE CLIENTE");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logout_Icon_32.png"))); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 81, 80));

        JBT_Limpiar.setBackground(new java.awt.Color(153, 153, 153));
        JBT_Limpiar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
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
        jPanel1.add(JBT_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 172, -1, 80));

        btnGuardad.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardad.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnGuardad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Floppy disk.png"))); // NOI18N
        btnGuardad.setText("GUARDAR");
        btnGuardad.setEnabled(false);
        btnGuardad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardadActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 78, -1, 80));

        jCheckBox2.setText("Modificar");
        jCheckBox2.setEnabled(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/VL.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 130, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 120, 380));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/Captura.PNG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            rucCliente.setEnabled(true);
        }else{
            rucCliente.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBT_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_LimpiarActionPerformed
        nombreCliente.setText("");
        apellidoCliente.setText("");
        direccionCliente.setText("");
        correoCliente.setText("");
        celularCliente.setText("");
        documentoCliente.setText("");
    }//GEN-LAST:event_JBT_LimpiarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        con = conexion.conectar();
        
        //Validamos el campo para que se aseguren de insertar un código
        if (buscarCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Ingrese código o documento del cliente");
        } else {
            try {
                CallableStatement buscarcliente;
                //Si seleccionamos el código cliente, ejecutamos el sp para buscar por codigo de cliente
                if (buscarPor.getSelectedIndex() == 0) {
                    buscarcliente = con.prepareCall("Call buscar_porcodcliente(?,?,?,?,?,?,?,?,?,?,?)");
                    buscarcliente.setString(1,buscarCliente.getText());
                    buscarcliente.registerOutParameter(2, java.sql.Types.VARCHAR);
                    buscarcliente.registerOutParameter(3, java.sql.Types.VARCHAR);
                    buscarcliente.registerOutParameter(4, java.sql.Types.VARCHAR);
                    buscarcliente.registerOutParameter(5, java.sql.Types.INTEGER);
                    buscarcliente.registerOutParameter(6, java.sql.Types.VARCHAR);
                    buscarcliente.registerOutParameter(7, java.sql.Types.DATE);
                    buscarcliente.registerOutParameter(8, java.sql.Types.VARCHAR);
                    buscarcliente.registerOutParameter(9, java.sql.Types.INTEGER);
                    buscarcliente.registerOutParameter(10, java.sql.Types.VARCHAR);
                    buscarcliente.registerOutParameter(11, java.sql.Types.VARCHAR);
                    buscarcliente.execute();
                }else{// si seleccionamos el dni, ejecutamos el sp para buscar por dni
                    buscarcliente = con.prepareCall("Call buscar_pordni(?,?,?,?,?,?,?,?,?,?,?)");
                    try {
                        buscarcliente.registerOutParameter(1, java.sql.Types.VARCHAR);
                        buscarcliente.registerOutParameter(2, java.sql.Types.VARCHAR);
                        buscarcliente.registerOutParameter(3, java.sql.Types.VARCHAR);
                        buscarcliente.registerOutParameter(4, java.sql.Types.VARCHAR);
                        buscarcliente.setInt(5, Integer.parseInt(buscarCliente.getText()));
                        buscarcliente.registerOutParameter(6, java.sql.Types.VARCHAR);
                        buscarcliente.registerOutParameter(7, java.sql.Types.DATE);
                        buscarcliente.registerOutParameter(8, java.sql.Types.VARCHAR);
                        buscarcliente.registerOutParameter(9, java.sql.Types.INTEGER);
                        buscarcliente.registerOutParameter(10, java.sql.Types.VARCHAR);
                        buscarcliente.registerOutParameter(11, java.sql.Types.VARCHAR);
                        buscarcliente.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,"Por favor, ingrese los números del DNI "+e);
                    }
                }
                
                //Los registros los guardamos en unas variables que usaremos más tarde
                codCliente = buscarcliente.getString(1);
                codPersona = buscarcliente.getString(2);
                nomCliente = buscarcliente.getString(3);
                apeCliente = buscarcliente.getString(4);
                docCliente = buscarcliente.getInt(5);
                sexCliente = buscarcliente.getString(6);
                fechaNac = buscarcliente.getDate(7);
                dirCliente= buscarcliente.getString(8);
                celCliente = buscarcliente.getInt(9);
                corCliente = buscarcliente.getString(10);
                ruCliente = buscarcliente.getString(11);
                
                //Enviar los datos recogidos hacia los campos del formulario
                if (codPersona == null) {//Si codPersona registra un valor vacío, es que el registro no existe
                    JOptionPane.showMessageDialog(null,"El código o documento ingresado no existe");
                } else {
                    codigoCliente.setText(codCliente);
                    nombreCliente.setText(nomCliente);
                    apellidoCliente.setText(apeCliente);
                    documentoCliente.setText(Integer.toString(docCliente));
                    if (sexCliente.equals("M")) {
                        sexoCliente.setSelectedIndex(0);
                    } else {
                        sexoCliente.setSelectedIndex(1);
                    }
                    nacimientoCliente.setDate(fechaNac);
                    direccionCliente.setText(dirCliente);
                    celularCliente.setText(Integer.toString(celCliente));
                    correoCliente.setText(corCliente);
                    if (ruCliente.equals("Sin ruc")) {
                        jCheckBox1.setSelected(false);
                        jCheckBox1.setEnabled(false);
                        rucCliente.setText("");
                    } else {
                        jCheckBox1.setSelected(true);
                        rucCliente.setEnabled(true);
                        rucCliente.setText(ruCliente);
                    }
                    jCheckBox2.setEnabled(true); //Habilitamos el botón para modificar si deseamos hacerlo
                }

            } catch (SQLException e) {
                if (codPersona != null) {
                    JOptionPane.showMessageDialog(null,"Problema buscando cliente "+e);
                }
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isEnabled() && jCheckBox2.isSelected()) {
            habilitar();
        } else {
            deshabilitar();
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void btnGuardadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardadActionPerformed
        con = conexion.conectar();
        
        //Simplemente llamamos al procedimiento almacenado para actualizar cliente
        try {
            CallableStatement actpersonas,actCliente;
            actpersonas = con.prepareCall("Call actualizar_personas_cliente(?,?,?,?,?,?,?,?,?)");
            actpersonas.setString(1,codPersona);
            actpersonas.setString(2,nombreCliente.getText());
            actpersonas.setString(3,apellidoCliente.getText());
            actpersonas.setInt(4,Integer.parseInt(documentoCliente.getText()));
            if (sexoCliente.getSelectedIndex() == 0) {
                sexCliente = "M";
            } else {
                sexCliente = "F";
            }
            actpersonas.setString(5,sexCliente);
            int dia, mes, año;
            String fecha;
            dia = nacimientoCliente.getCalendar().get(Calendar.DAY_OF_MONTH);
            mes = nacimientoCliente.getCalendar().get(Calendar.MONTH)+1;
            año = nacimientoCliente.getCalendar().get(Calendar.YEAR);
            fecha = año + "-" + mes + "-" + dia;
            actpersonas.setString(6,fecha);
            actpersonas.setString(7,direccionCliente.getText());
            if (celularCliente.getText().isEmpty()) {
                actpersonas.setNull(8,Types.INTEGER);
            } else {
                actpersonas.setInt(8,Integer.parseInt(celularCliente.getText()));
            }
            actpersonas.setString(9,correoCliente.getText());
            actpersonas.execute();
            
            actCliente = con.prepareCall("Call actualizar_cliente(?,?)");
            actCliente.setString(1,codCliente);
            if (jCheckBox1.isSelected()) {
                actCliente.setString(2,rucCliente.getText());
            } else {
                actCliente.setString(2,"Sin ruc");
            }
            actCliente.execute();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnGuardadActionPerformed

public void ocultarBarraTitulo()
{ 
Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane(); 
dimBarra = Barra.getPreferredSize(); 
Barra.setSize(0,0); 
Barra.setPreferredSize(new Dimension(0,0)); 
repaint(); 
}
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_Limpiar;
    private javax.swing.JTextField apellidoCliente;
    private javax.swing.JButton btnGuardad;
    private javax.swing.JTextField buscarCliente;
    private javax.swing.JComboBox buscarPor;
    private javax.swing.JTextField celularCliente;
    private javax.swing.JTextField codigoCliente;
    private javax.swing.JTextField correoCliente;
    private javax.swing.JTextField direccionCliente;
    private javax.swing.JTextField documentoCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser nacimientoCliente;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JTextField rucCliente;
    private javax.swing.JComboBox sexoCliente;
    // End of variables declaration//GEN-END:variables

}