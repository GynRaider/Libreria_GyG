/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_secundarios;

import Atxy2k.CustomTextField.RestrictedTextField;
import conexion.conexion;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author GynRaider
 */
public class nuevoProducto extends javax.swing.JInternalFrame {
private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null; 
    /**
     * Creates new form nuevoProducto
     */
    public void limpiar(){
        nombreProducto.setText("");
        marcaProducto.setText("");
        precioProducto.setText("");
        n_almacen.setText("");
        stock.setValue(0);
    }
    
    public nuevoProducto() {
        ocultarBarraTitulo() ;
        initComponents();
        jButton1.setMnemonic(KeyEvent.VK_X);
         RestrictedTextField nn = new RestrictedTextField(nombreProducto); 
           nn.setLimit(20);
           
           RestrictedTextField mm = new RestrictedTextField(marcaProducto); 
           mm.setLimit(20);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        n_almacen = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        stock = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardad = new javax.swing.JButton();
        JBT_Limpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idproducto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        nombreProducto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        precioProducto = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        marcaProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("N° Almacén");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 40, -1, -1));
        jPanel6.add(n_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 40, 61, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Stock :");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));
        jPanel6.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 14, 61, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mchael\\Documents\\NetBeansProjects\\Libreria_GyG\\src\\fondo\\VL.jpg")); // NOI18N
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 80));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 226, 300, 70));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(btnGuardad, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 10, -1, 68));

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
        jPanel2.add(JBT_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 89, -1, 72));

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
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 167, 81, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mchael\\Documents\\NetBeansProjects\\Libreria_GyG\\src\\fondo\\VL.jpg")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 240));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 58, 130, 240));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel36.setText("SISTEMA DE INGRESO PRODUCTOS");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 15, 414, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID Producto :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 21, -1, -1));

        idproducto.setEditable(false);
        idproducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idproducto.setText("Autogenerado");
        jPanel1.add(idproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 20, 154, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Nombre :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 53, -1, -1));

        nombreProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 52, 154, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Marca :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 84, -1, -1));

        precioProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        precioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioProductoKeyTyped(evt);
            }
        });
        jPanel1.add(precioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 122, 65, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Precio :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 123, -1, -1));
        jPanel1.add(marcaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 84, 156, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("S/.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 124, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mchael\\Documents\\NetBeansProjects\\Libreria_GyG\\src\\fondo\\VL.jpg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 160));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 58, 300, 160));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/Captura.PNG"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBT_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_LimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_JBT_LimpiarActionPerformed

    private void btnGuardadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardadActionPerformed
        Connection con;
        con = conexion.conectar();
        String nombre, marca;
        int strock, numero;
        double precio;
        
        nombre = nombreProducto.getText();
        marca = marcaProducto.getText();
        precio = Double.parseDouble(precioProducto.getText());
        strock = (Integer)stock.getValue();
        numero = Integer.parseInt(n_almacen.getText());

        try {
            CallableStatement cst = con.prepareCall("CALL insertar_producto_almacen(?,?,?,?,?)");
            cst.setString(1,nombre);
            cst.setString(2,marca);
            cst.setDouble(3,precio);
            cst.setInt(4,strock);
            cst.setInt(5,numero);
            cst.execute();
            
            limpiar();
            JOptionPane.showMessageDialog(null,"Nuevo producto añadido");
            cst.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnGuardadActionPerformed

    private void precioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioProductoKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.'){
            evt.consume();
        }
        
        if (evt.getKeyChar() == '.' && precioProducto.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_precioProductoKeyTyped
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
    private javax.swing.JButton btnGuardad;
    private javax.swing.JTextField idproducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField marcaProducto;
    private javax.swing.JTextField n_almacen;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JSpinner stock;
    // End of variables declaration//GEN-END:variables
}
