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
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author GynRaider
 */
public class nuevoempleadoventa extends javax.swing.JInternalFrame {
private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null; 
    /**
     * Creates new form nuevoempleadoventa
     */
    Connection cnn;
//    public String usuario, contrasena;
    public String cadena;
    
    public String getCadenaAlfanumAleatoria(int longitud) {
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud) {
            char c = (char) r.nextInt(255);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')) {
                cadenaAleatoria += c;
                i++;
            }
        }
        return cadenaAleatoria;
    }
    
    public void limpiar(){
        jCheckBox1.setSelected(false);
        docEmpleado.setText("");
        nombreEmpleado.setText("");
        apellidoEmpleado.setText("");
        direccionEmpleado.setText("");
        correoEmpleado.setText("");
        celularEmpleado.setText("");
        tipoEmpleado.setSelectedIndex(-1);
        nacimientoEmpleado.setDate(null);
        inicioLaboral.setDate(null);
        jSpinner1.setValue(0);
        jCheckBox2.setSelected(false);
        inicioLaboral.setEnabled(true);
        jLabel18.setVisible(false);
        jSpinner1.setVisible(false);
        jTabbedPane1.setSelectedIndex(0);
        jTabbedPane1.setEnabled(false);
    }
        
    public nuevoempleadoventa() {
        initComponents();
        
        jLabel18.setVisible(false);
        jSpinner1.setVisible(false);
            
        ocultarBarraTitulo();
        
         RestrictedTextField nc = new RestrictedTextField(nombreEmpleado); 
           nc.setLimit(20);
           
           RestrictedTextField ac = new RestrictedTextField(apellidoEmpleado); 
           ac.setLimit(20);
           
           RestrictedTextField rc = new RestrictedTextField(celularEmpleado); 
           rc.setLimit(9);
           rc.setOnlyNums(true);
           RestrictedTextField cc = new RestrictedTextField(direccionEmpleado); 
           cc.setLimit(50);
           
            RestrictedTextField rt = new RestrictedTextField(correoEmpleado); 
           rt.setLimit(50);
           
           RestrictedTextField dc = new RestrictedTextField(docEmpleado); 
           dc.setLimit(8);
           dc.setOnlyNums(true);
        
        
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
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        JBT_Limpiar = new javax.swing.JButton();
        btnGuardad = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        jLabel8 = new javax.swing.JLabel();
        direccionEmpleado = new javax.swing.JTextField();
        correoEmpleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tipoEmpleado = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        nacimientoEmpleado = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        celularEmpleado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        inicioLaboral = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        fechaRegistro = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("INGRESO DE EMPLEADOS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 6, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 21, -1, -1));

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
        jPanel3.add(JBT_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 14, -1, 76));

        btnGuardad.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardad.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
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
        jPanel3.add(btnGuardad, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 15, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mchael\\Documents\\NetBeansProjects\\Libreria_GyG\\src\\fondo\\VL.jpg")); // NOI18N
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 340, 100));

        jTabbedPane1.setEnabled(false);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Código:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombres:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Apellidos:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Sexo :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        JTF_Codigo.setEditable(false);
        JTF_Codigo.setText("Autogenerado");
        JTF_Codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(JTF_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 115, -1));

        nombreEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(nombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 360, -1));

        apellidoEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(apellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 360, -1));

        sexoEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sexoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMENINO" }));
        jPanel2.add(sexoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 125, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Documento de Identidad : ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));
        jPanel2.add(docEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 100, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Celular : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Correo :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        jPanel2.add(direccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 360, -1));
        jPanel2.add(correoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 360, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Direccion:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        tipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Personal de ventas", "Personal de almacén" }));
        tipoEmpleado.setSelectedIndex(-1);
        tipoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(tipoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 170, -1));

        jCheckBox1.setText("Acceso al sistema");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));
        jPanel2.add(nacimientoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 120, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Fecha  Nacimiento");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));
        jPanel2.add(celularEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 130, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Puesto del almacén");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 50, -1));
        jPanel2.add(inicioLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 127, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Fecha de inicio laboral");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 30));

        jCheckBox2.setText("Por especificar");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mchael\\Documents\\NetBeansProjects\\Libreria_GyG\\src\\fondo\\VL.jpg")); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 400));

        jTabbedPane1.addTab("Nuevo Empleado", jPanel2);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Código Usuario:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Usuario:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 159, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Contraseña:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 199, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Fecha de registro:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 240, -1, -1));

        jTextField1.setText("Autogenerado");
        jTextField1.setEnabled(false);
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 117, 98, -1));

        user.setEnabled(false);
        jPanel4.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 156, 98, -1));

        pass.setEnabled(false);
        jPanel4.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 196, 98, -1));

        fechaRegistro.setEnabled(false);
        jPanel4.add(fechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 234, 151, -1));

        jLabel12.setText("El usuario deberá cambiar  su contraseña la próxima vez");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 284, -1, -1));

        jLabel17.setText("que inicie sesión en el sistema");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 304, -1, -1));

        jCheckBox3.setText("Personalizar usuario");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 155, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mchael\\Documents\\NetBeansProjects\\Libreria_GyG\\src\\fondo\\VL.jpg")); // NOI18N
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 400));

        jTabbedPane1.addTab("Datos de Acceso", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 520, 420));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/Captura.PNG"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JBT_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_LimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_JBT_LimpiarActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            String finalizar="";
            
            Calendar c2 = new GregorianCalendar();
            fechaRegistro.setCalendar(c2);
                
            cadena = getCadenaAlfanumAleatoria(8);
            jTabbedPane1.setEnabled(true);
            user.setText(cadena);
            pass.setText(cadena);
                
            do {
                try{
                    cnn = conexion.conectar();
                    Statement st5 = cnn.createStatement();
                    ResultSet rs5 = st5.executeQuery("Select * from usuarios where usuario = '"+cadena+"'");
                    rs5.last();
                    int encontrado = rs5.getRow();

                    if (encontrado == 1) {
                        cadena = getCadenaAlfanumAleatoria(8);
                        jTabbedPane1.setEnabled(true);
                        user.setText(cadena);
                        pass.setText(cadena);
                        finalizar = "existe";
                        JOptionPane.showMessageDialog(null,"existe");
                    }else{
                        finalizar = "no existe";
                    }

                    st5.close();
                    rs5.close();
                    cnn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,ex);
                }
            } while (finalizar.equals("existe"));
                            
        } else {
            jTabbedPane1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnGuardadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardadActionPerformed
        int
                dni,
                celular,
                dia, mes, año,
                sexofail = sexoEmpleado.getSelectedIndex(),
                empleadofail = tipoEmpleado.getSelectedIndex(),
                numAlmacen = (Integer)jSpinner1.getValue(),
                accesoSistema;

        String
                nombre = nombreEmpleado.getText(),
                apellido = apellidoEmpleado.getText(),
                sexo="",
                direccion = direccionEmpleado.getText(),
                email = correoEmpleado.getText(),
                fecha, fechaInicio,
                validar="";
        
        if (tipoEmpleado.getSelectedIndex() == 0 && numAlmacen == 0) {
            validar = "error";
        }
        
        
        if (nombre.equals("") || apellido.equals("") || direccion.equals("") || email.equals("") || sexofail == -1 || nacimientoEmpleado.getDate()==null || docEmpleado.getText().equals("") || celularEmpleado.getText().equals("") || empleadofail == -1 || validar.equals("error")) {
            JOptionPane.showMessageDialog(null,"Complete todos los campos");
        } else {
            
            if (!jCheckBox2.isSelected() && inicioLaboral.getDate() == null) {
                JOptionPane.showMessageDialog(null,"Complete todos los campos");
            } else {
                cnn=conexion.conectar();
                dia = nacimientoEmpleado.getCalendar().get(Calendar.DAY_OF_MONTH);
                mes = nacimientoEmpleado.getCalendar().get(Calendar.MONTH);
                año = nacimientoEmpleado.getCalendar().get(Calendar.YEAR);
                fecha = año + "-" + mes + "-" + dia;

                if(sexoEmpleado.getSelectedIndex() == 0){
                    sexo = "M";
                }
                if(sexoEmpleado.getSelectedIndex() == 1){
                    sexo = "F";
                }

                dni = Integer.parseInt(docEmpleado.getText());
                celular = Integer.parseInt(celularEmpleado.getText());

                if (jCheckBox1.isSelected()) {
                    accesoSistema = 1;
                } else {
                    accesoSistema = 0;
                }

                try {
                    Statement st = cnn.createStatement();
                    ResultSet rs = st.executeQuery("Select * from personas where DNI = "+dni);
                    rs.last();

                    int found = rs.getRow();

                    if (found == 1) {
                        JOptionPane.showMessageDialog(null,"El documento ya existe en la base de datos");
                    } else {
                        try {
                            //Insertar registro a la tabla personas
                            cnn = conexion.conectar();

                            CallableStatement cst = cnn.prepareCall("Call insertar_personas(?,?,?,?,?,?,?,?,?)");
                            cst.setString(1,nombre);
                            cst.setString(2,apellido);
                            cst.setInt(3,dni);
                            cst.setString(4,sexo);
                            cst.setString(5,fecha);
                            cst.setString(6,direccion);
                            cst.setInt(7,celular);
                            cst.setString(8,email); 
                            cst.setInt(9,accesoSistema);
                            cst.execute();

                            Statement st2 = cnn.createStatement();
                            ResultSet rs2 = st2.executeQuery("Select * from personas where DNI = "+dni);
                            rs2.last();

                            int encontrado = rs2.getRow();

                            if (encontrado == 1) {
                                String codPersona = rs2.getString("codPersona");

                                try {
                                    //Insertar en la tabla empleado
                                    if (jCheckBox2.isSelected()) {
                                        fechaInicio = "0000-00-00";
                                    } else {
                                        dia = inicioLaboral.getCalendar().get(Calendar.DAY_OF_MONTH);
                                        mes = inicioLaboral.getCalendar().get(Calendar.MONTH);
                                        año = inicioLaboral.getCalendar().get(Calendar.YEAR);
                                        fechaInicio = año + "-" + mes + "-" + dia;
                                    }

                                    CallableStatement empleado = cnn.prepareCall("Call insertar_empleado(?,?,?)");
                                    empleado.setString(1,codPersona);
                                    empleado.setString(2,"Sin correo de empresa");
                                    empleado.setString(3,fechaInicio);
                                    empleado.execute();

                                    empleado.close();
                                    
                                    //insertar en la tabla usuarios si tiene permiso
                                    if (jCheckBox1.isSelected()) {
                                        String 
                                                usuario = user.getText(),
                                                contrasena = pass.getText(),
                                                tipo =  tipoEmpleado.getSelectedItem().toString(),
                                                fRegistro;
                                        
                                        dia = fechaRegistro.getCalendar().get(Calendar.DAY_OF_MONTH);
                                        mes = fechaRegistro.getCalendar().get(Calendar.MONTH);
                                        año = fechaRegistro.getCalendar().get(Calendar.YEAR);
                                        fRegistro = año + "-" + mes + "-" + dia;
                                        
                                        CallableStatement usu = cnn.prepareCall("Call insertar_usuarios(?,?,?,?,?)");
                                        usu.setString(1,codPersona);
                                        usu.setString(2,usuario);
                                        usu.setString(3,contrasena);
                                        usu.setString(4,tipo);
                                        usu.setString(5,fRegistro);
                                        usu.execute();
                                        
                                        usu.close();
                                    }
                                    
                                } catch (SQLException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                }

                                try {
                                    Statement st3 = cnn.createStatement();
                                    ResultSet rs3 = st3.executeQuery("Select * from empleado where codPersona = '"+codPersona+"'");
                                    rs3.last();
                                    
                                    int empEncontrado = rs3.getRow();
                                    
                                    if (empEncontrado == 1) {
                                        String codEmpleado = rs3.getString("codEmpleado");
                                        
                                        if (empleadofail == 0) {
                                            //Insertar a la tabla personal_ventas
                                            CallableStatement pventas = cnn.prepareCall("Call insertar_pventas(?,?)");
                                            pventas.setString(1,codEmpleado);
                                            pventas.setInt(2,numAlmacen);
                                            pventas.execute();
                                            
                                            JOptionPane.showMessageDialog(null,tipoEmpleado.getSelectedItem().toString()+" ingresado correctamente");
                                            limpiar();
                                            rs3.close();
                                            st3.close();
                                            cnn.close();
                                        }

                                        if (empleadofail == 1){
                                            //Insertar a la tabla personal_almacen
                                            CallableStatement palmacen = cnn.prepareCall("Call insertar_palmacen(?)");
                                            palmacen.setString(1,codEmpleado);
                                            palmacen.execute();
                                            
                                            JOptionPane.showMessageDialog(null,tipoEmpleado.getSelectedItem().toString()+" ingresado correctamente");
                                            limpiar();
                                            rs3.close();
                                            st3.close();
                                            cnn.close();
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null,"no existe el codPersona en la tabla empleados");
                                    }

                                } catch (SQLException e) {
                                    JOptionPane.showMessageDialog(null,e);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null,"No se encontró el dni en la tabla personas");
                            }

                            rs2.close();
                            st2.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null,e);
                        }

                    }

                    st.close();
                    rs.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_btnGuardadActionPerformed

    private void tipoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoEmpleadoActionPerformed
        if (tipoEmpleado.getSelectedIndex()==0) {
            jLabel18.setVisible(true);
            jSpinner1.setVisible(true);
        }
        
        if(tipoEmpleado.getSelectedIndex()==1){
            jLabel18.setVisible(false);
            jSpinner1.setVisible(false);
            jSpinner1.setValue(0);
        }
    }//GEN-LAST:event_tipoEmpleadoActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected()){
            inicioLaboral.setEnabled(false);
            inicioLaboral.setCalendar(null);
        }else{
            inicioLaboral.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()) {
            user.setEnabled(true);
        } else {
            user.setEnabled(false);
            String txt = pass.getText();
            user.setText(txt);
            
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        if (jCheckBox1.isSelected()) {
            if (jTabbedPane1.getSelectedIndex()==0) {
                try {
                    cnn = conexion.conectar();
                    Statement st = cnn.createStatement();
                    ResultSet rs = st.executeQuery("Select * from usuarios where usuario = '"+user.getText()+"'");
                    rs.last();

                    int found = rs.getRow();

                    if (found == 1){
                        JOptionPane.showMessageDialog(null,"El nombre de usuario ya existe");
                        jTabbedPane1.setSelectedIndex(1);
                        user.selectAll();  // y luego en la siguiente linea pones
                        user.requestFocus(); 
                    } 

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null,e);
                }
            }
        }
        
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked
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
    private javax.swing.JTextField JTF_Codigo;
    private javax.swing.JTextField apellidoEmpleado;
    private javax.swing.JButton btnGuardad;
    private javax.swing.JTextField celularEmpleado;
    private javax.swing.JTextField correoEmpleado;
    private javax.swing.JTextField direccionEmpleado;
    private javax.swing.JTextField docEmpleado;
    private com.toedter.calendar.JDateChooser fechaRegistro;
    private com.toedter.calendar.JDateChooser inicioLaboral;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JDateChooser nacimientoEmpleado;
    private javax.swing.JTextField nombreEmpleado;
    private javax.swing.JTextField pass;
    private javax.swing.JComboBox sexoEmpleado;
    private javax.swing.JComboBox tipoEmpleado;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
