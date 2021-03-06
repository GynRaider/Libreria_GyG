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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author GynRaider
 */
public class modificarProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form modificarProducto
     */
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null; 
    public modificarProducto() {
        initComponents();
        ocultarBarraTitulo();
        jButton1.setMnemonic(KeyEvent.VK_X);
    }
    
    public void limpiar(){
        codigoProducto.setText("");
        nombreProducto.setText("");
        marcaProducto.setText("");
        precioProducto.setText("");
        stock.setValue(0);
        numAlmacen.setText("");
        
        codigoProducto.setEnabled(true);
        nombreProducto.setEnabled(false);
        marcaProducto.setEnabled(false);
        precioProducto.setEnabled(false);
        stock.setEnabled(false);
        numAlmacen.setEnabled(false);
    }
    
    Connection con;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        numAlmacen = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        stock = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        codigoProducto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        nombreProducto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        precioProducto = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        marcaProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardad = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(java.awt.Color.gray);
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Numero almacén :");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 40, -1, -1));

        numAlmacen.setEnabled(false);
        jPanel6.add(numAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 40, 54, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Stock :");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        stock.setEnabled(false);
        jPanel6.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 14, 54, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/VL.jpg"))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 330, 80));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 268, 310, 70));

        jPanel5.setBackground(java.awt.Color.gray);
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Código");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 21, -1, -1));

        codigoProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel5.add(codigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 20, 154, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Nombre :");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 53, -1, -1));

        nombreProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreProducto.setEnabled(false);
        jPanel5.add(nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 52, 154, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Marca :");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 84, -1, -1));

        precioProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        precioProducto.setEnabled(false);
        jPanel5.add(precioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 115, 65, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Precio :");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 116, -1, -1));

        marcaProducto.setEnabled(false);
        jPanel5.add(marcaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 84, 153, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("S/.");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 117, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/VL.jpg"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 310, 170));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 65, 310, 160));

        jPanel2.setBackground(java.awt.Color.gray);
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardad.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardad.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnGuardad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Zoom.png"))); // NOI18N
        btnGuardad.setText("BUSCAR");
        btnGuardad.setToolTipText("");
        btnGuardad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardadActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardad, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 10, -1, 68));

        btnGuardar.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Floppy disk.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setEnabled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 84, -1, -1));

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
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 247, 81, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logout_Icon_32.png"))); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 170, 81, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/VL.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 110, 330));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 65, 110, 320));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel40.setText("MODIFICAR PRODUCTOS");
        jPanel3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 15, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/Captura.PNG"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 480, 420));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 408));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        con = conexion.conectar();
        
        String
                codProducto = codigoProducto.getText(),
                nombre = nombreProducto.getText(),
                marca = marcaProducto.getText(),
                precio = precioProducto.getText(),
                numerAlmacen = numAlmacen.getText();
        int
                strock = (Integer)stock.getValue();

        try {
            CallableStatement cst = con.prepareCall("Call actualizar_producto_almacen(?,?,?,?,?,?)");
            cst.setString(1,codProducto);
            cst.setString(2,nombre);
            cst.setString(3,marca);
            cst.setDouble(4,Double.parseDouble(precio));
            cst.setInt(5,strock);
            cst.setString(6,numerAlmacen);
            cst.execute();
            cst.close();
            limpiar();
            
            JOptionPane.showMessageDialog(null,"Datos del producto actualizados");

            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardadActionPerformed
        con = conexion.conectar();
        
        String 
                codigo = codigoProducto.getText(),
                nombre, marca,numeroAlmacen;
        
        int strock;
        double precio;
        
        if(codigo.equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese código del producto");
        }else{
                try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("Select * from almacen where codProducto = '"+codigo+"'");

                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Producto encontrado");

                    codigo = rs.getString("codProducto");
                    nombre = rs.getString("nombre");
                    marca = rs.getString("marca");
                    precio = rs.getDouble("precio");
                    strock = rs.getInt("stock");
                    numeroAlmacen = rs.getString("numeroAlmacen");

                    codigoProducto.setEnabled(false);
                    nombreProducto.setEnabled(true);
                    marcaProducto.setEnabled(true);
                    precioProducto.setEnabled(true);
                    stock.setEnabled(true);
                    numAlmacen.setEnabled(true);
                    btnGuardar.setEnabled(true);

                    nombreProducto.setText(nombre);
                    marcaProducto.setText(marca);
                    precioProducto.setText(Double.toString(precio));
                    stock.setValue(strock);
                    numAlmacen.setText(numeroAlmacen);
                }else{
                    JOptionPane.showMessageDialog(null,"El producto no existe o el código ingresado es incorrecto");
                }
                rs.close();
                st.close();
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        
        
    }//GEN-LAST:event_btnGuardadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed
public void ocultarBarraTitulo()
{ 
Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane(); 
dimBarra = Barra.getPreferredSize(); 
Barra.setSize(0,0); 
Barra.setPreferredSize(new Dimension(0,0)); 
repaint(); 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardad;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField codigoProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField marcaProducto;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JTextField numAlmacen;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JSpinner stock;
    // End of variables declaration//GEN-END:variables
}
