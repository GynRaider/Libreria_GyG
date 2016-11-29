
package busqueda;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class devoluciones extends javax.swing.JInternalFrame {
   Connection cn;
   CallableStatement cts;
   ResultSet r;
   
    public devoluciones() {
    initComponents();
    DefaultTableModel tabla= new DefaultTableModel();   
    this.setLocation(350, 100);
    try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          cn=DriverManager.getConnection("jdbc:odbc:conexion");
          
      tabla.addColumn("CODIGO");
      tabla.addColumn("NOMBRE");
      tabla.addColumn ("TELEFONO");
      tabla.addColumn ("APELLIDO");
      tabla.addColumn ("CORREO");
      cts=cn.prepareCall("{call sp_mostrar}");
      r=cts.executeQuery();
      while (r.next()){
      Object dato[]= new Object [5];
      for(int i =0;i<5;i++){
      dato[i]=r.getString(i+1);
          }
     tabla.addRow(dato);
      }
     this.JT_TablaClientes.setModel(tabla);
           

        }catch(Exception e){
        
        }         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTF_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTF_APELLIDO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTF_TELEFONO = new javax.swing.JTextField();
        JTF_NOMBRE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_TablaClientes = new javax.swing.JTable();
        JB_Agregar = new javax.swing.JButton();
        JB_Limpiar = new javax.swing.JButton();
        JB_Salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JB_Buscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ID Devoluciones :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        JTF_ID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(JTF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 13, 87, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ID Proveedor :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 13, 88, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("ID Entrada :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 13, -1, -1));

        JTF_APELLIDO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JTF_APELLIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_APELLIDOActionPerformed(evt);
            }
        });
        jPanel1.add(JTF_APELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 13, 88, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Cantidad :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 52, -1, -1));

        JTF_TELEFONO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JTF_TELEFONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_TELEFONOActionPerformed(evt);
            }
        });
        jPanel1.add(JTF_TELEFONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 52, 71, -1));

        JTF_NOMBRE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(JTF_NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 13, 103, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Estado :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 52, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACEPTADO", "RECHAZADO" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 49, 103, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mchael\\Documents\\NetBeansProjects\\Libreria_GyG\\src\\fondo\\VL.jpg")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 620, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 620, 100));

        JT_TablaClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JT_TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Devoluciones", "ID Proveedor", "ID Entrada ", "Cantidad", "Estado "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JT_TablaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 620, 162));

        JB_Agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JB_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Folder docs.png"))); // NOI18N
        JB_Agregar.setText("AGREGAR");
        JB_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 45));

        JB_Limpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JB_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Paint tools.png"))); // NOI18N
        JB_Limpiar.setText("LIMPIAR");
        JB_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, 45));

        JB_Salir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JB_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logout_Icon_32.png"))); // NOI18N
        JB_Salir.setText("SALIR");
        JB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 113, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("REGISTRO DEVOLUCIONES");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 22));

        JB_Buscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JB_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Zoom.png"))); // NOI18N
        JB_Buscar.setText("BUSCAR");
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 140, 48));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/Captura.PNG"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_TELEFONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_TELEFONOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_TELEFONOActionPerformed

    private void JB_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AgregarActionPerformed
       
        try {
       String id = this.JTF_ID.getText();
       String nom=this.JTF_NOMBRE.getText();
       int tel=Integer.parseInt(this.JTF_TELEFONO.getText());
       String ape=this.JTF_APELLIDO.getText();
//       String cor=this.JTF_CORREO.getText();
        
            cts=cn.prepareCall("{call sp_registrar(?,?,?,?,?)}");
            cts.setString(1, id);
            cts.setString(2, nom);
            cts.setInt(3, tel);
            cts.setString(4, ape);
//            cts.setString(5, cor);
            int rpta=cts.executeUpdate();
            if (rpta==1)
                JOptionPane.showMessageDialog(this,"Registrado correctamente!!","Atencion",JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
             
        }
        
    }//GEN-LAST:event_JB_AgregarActionPerformed

    private void JB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_SalirActionPerformed
        // TODO add your handling code here:
        int opcion=JOptionPane.showConfirmDialog(null,"Realmente deseea Salir","SALIR?",JOptionPane.YES_NO_OPTION);
if(opcion==JOptionPane.YES_NO_OPTION){
this.dispose();
}
    }//GEN-LAST:event_JB_SalirActionPerformed

    private void JB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BuscarActionPerformed
        // TODO add your handling code here:
        String cod=JOptionPane.showInputDialog("INGRESE EL CODIGO DEL CLIENTE A BUSCAR");
        try {
            cts=cn.prepareCall("{call sp_buscar(?)}");
            cts.setString(1, cod);
            r=cts.executeQuery();
            if (r.next()){
                JOptionPane.showMessageDialog(this,"Cliente Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.JTF_ID.setText(r.getString(1));
                this.JTF_NOMBRE.setText(r.getString(2));
                this.JTF_TELEFONO.setText(r.getString(3));
                this.JTF_APELLIDO.setText(r.getString(4));
//                this.JTF_CORREO.setText(r.getString(5));
             }else{

           JOptionPane.showMessageDialog(this,"Cliente  No Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception e) {JOptionPane.showMessageDialog(this, e.toString());
        }    
                
            
    }//GEN-LAST:event_JB_BuscarActionPerformed

    private void JTF_APELLIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_APELLIDOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_APELLIDOActionPerformed

    private void JB_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LimpiarActionPerformed
        // TODO add your handling code here:
        this.JTF_APELLIDO.setText("");
        this.JTF_ID.setText("");
        this.JTF_TELEFONO.setText("");
        this.JTF_NOMBRE.setText("");
    }//GEN-LAST:event_JB_LimpiarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Agregar;
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_Limpiar;
    private javax.swing.JButton JB_Salir;
    private javax.swing.JTextField JTF_APELLIDO;
    private javax.swing.JTextField JTF_ID;
    private javax.swing.JTextField JTF_NOMBRE;
    private javax.swing.JTextField JTF_TELEFONO;
    private javax.swing.JTable JT_TablaClientes;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
