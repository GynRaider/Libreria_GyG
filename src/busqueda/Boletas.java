/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmTransaccion.java
 *
 * Created on 25/08/2010, 12:06:49 AM
 */
package busqueda;

import java.net.*;
import java.sql.*;
import java.util.logging.*;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;

/**
 *
 * @author Richard
 */
public class Boletas extends javax.swing.JFrame {
    /*
     * Parametros Para los JTABLES
     */

    DefaultTableModel LTransacciones = new DefaultTableModel();
    /*
     * Parametro para mostrar la imagen del Producto
     */
//    metodos m = new metodos() {
//    };
    Double Importe = 0.0;
    Double SubTotal = 0.0;
    Double TotalIGV = 0.0;

    /** Creates new form FrmTransaccion */
    public Boletas() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        /*
         * Sentencia que permitira Mostrar los elmentos en un JTABLE
         */
        String campos[] = {"CANTIDAD", "PRODUCTO", "PRECIO UND.", "TOTAL"};
        LTransacciones.setColumnIdentifiers(campos);
        //
//        try {
//            Connection con = BD.getConnection();
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select max(idcompra) from COMPRA ");
//            while (rs.next()) {
//                txtNroCompT.setText(String.valueOf(rs.getString(1)));
//            }
//            rs.close();
//            stmt.close();
//            con.close();
//        } catch (SQLException error) {
//            System.out.print(error);
//        }
    }

    /*
     * Metodo que me permitira mostrar la imagen en un panel
     */
    public void Mostrar(JPanel p) {
//        try {
//            //se asigna a "url" el archivo de imagen seleccionado
//            URL url = m.getObtener();
//            //se lo coloca en memoria
//            m.cargar_imagen(url);
//            //se aÃ±ade al contenedor
//            p.add(new mipanel(m.Obtener_imagen_de_Buffer(), p.getSize()) {
//            });
//            p.setVisible(true);
//            p.repaint();
//        } catch (Exception ex) {
//            Logger.getLogger(metodos.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    /*
     * Agregar los elemntos a la tabla transaccion
     */

    public void AgregarTransaccion() {
//        Transaccion t = new Transaccion() {
//        };
//        t.setCantidad(Integer.parseInt(txtCantidadT.getText()));
//        try {
//            Producto p = BDProducto.buscarProducto(Integer.parseInt(txtIdProdT.getText()));
//            Compra comp = BDCompra.buscarCompra(Integer.parseInt(txtNroCompT.getText()));
//            t.setProducto(p);
//            t.setCompra(comp);
//            BDTransaccion.insertarTransaccion(t);
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
//        }
    }
    /*
     * Metodo para limpiar las cajas de Texto
     */

    public void limpiarTextos() {
//        txtIdProdT.setText("");
//        txtNombrePT.setText("");
//        txtPrecioUndT.setText("");
//        txtStockT.setText("");
//        txtUnidadMedT.setText("");
//        txtCantidadT.setText("");
//        jpImageProd.removeAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTransacProd = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSubTotalT = new javax.swing.JFormattedTextField();
        txtIGVT = new javax.swing.JFormattedTextField();
        txtTotalApagar = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtImporteT = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        txtVuelto = new javax.swing.JFormattedTextField();
        lblNombreTipoComp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNroCompT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDatoClienteT = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtTelefonoT = new javax.swing.JTextField();
        lblRucT = new javax.swing.JLabel();
        txtRucF = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtIdProdT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioUndT = new javax.swing.JTextField();
        txtCantidadT = new javax.swing.JTextField();
        txtStockT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtUnidadMedT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNombrePT = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnImporte = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnBuscarProducto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        btnAtrasT = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jPanel4.setBackground(new java.awt.Color(247, 254, 255));

        jPanel2.setBackground(new java.awt.Color(247, 254, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtTransacProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtTransacProd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtTransacProd.setModel(LTransacciones);
        jScrollPane2.setViewportView(jtTransacProd);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 199, 442, 182));

        jPanel7.setBackground(new java.awt.Color(247, 254, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("SUB. TOT:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("I.G.V:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("TOT. A PAGAR:");

        txtSubTotalT.setEditable(false);

        txtIGVT.setEditable(false);
        txtIGVT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIGVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIGVTActionPerformed(evt);
            }
        });

        txtTotalApagar.setEditable(false);
        txtTotalApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalApagarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("IMPORTE:");

        txtImporteT.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("VUELTO:");

        txtVuelto.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIGVT)
                            .addComponent(txtSubTotalT, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTotalApagar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtImporteT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(txtVuelto, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubTotalT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIGVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTotalApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImporteT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(16, 16, 16))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 387, -1, -1));

        lblNombreTipoComp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNombreTipoComp.setText("BOLETA DE VENTA");
        jPanel2.add(lblNombreTipoComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 76, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nro :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 17, -1, -1));

        txtNroCompT.setEditable(false);
        txtNroCompT.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNroCompT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtNroCompT, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 13, 67, -1));

        jLabel8.setText("FECHA:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 46, -1, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 46, 101, -1));

        jLabel10.setText("CLIENTE :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 126, -1, -1));

        jLabel15.setText("DIRECC.");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 164, -1, -1));

        jLabel16.setText("TEL:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 164, -1, -1));

        txtDatoClienteT.setEditable(false);
        jPanel2.add(txtDatoClienteT, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 123, 253, -1));

        jTextField3.setEditable(false);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 161, 253, -1));

        txtTelefonoT.setEditable(false);
        jPanel2.add(txtTelefonoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 161, 78, -1));

        lblRucT.setText("RUC:");
        jPanel2.add(lblRucT, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 126, -1, -1));
        jPanel2.add(txtRucF, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 123, 78, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 66, 442, 4));

        jPanel3.setBackground(new java.awt.Color(247, 254, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Id Producto:");

        txtIdProdT.setEditable(false);
        txtIdProdT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdProdT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdTActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Stock :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio Und :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cantidad :");

        txtPrecioUndT.setEditable(false);
        txtPrecioUndT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCantidadT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtStockT.setEditable(false);
        txtStockT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Unidad Med :");

        txtUnidadMedT.setEditable(false);
        txtUnidadMedT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtNombrePT.setEditable(false);
        txtNombrePT.setColumns(20);
        txtNombrePT.setRows(5);
        jScrollPane1.setViewportView(txtNombrePT);

        jButton3.setText("Imprimir");

        jButton4.setText("Guardar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdProdT, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidadT)
                            .addComponent(txtStockT)
                            .addComponent(txtUnidadMedT)
                            .addComponent(txtPrecioUndT, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdProdT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(176, 176, 176)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioUndT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUnidadMedT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidadT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jToolBar1.setBackground(new java.awt.Color(247, 254, 255));
        jToolBar1.setRollover(true);

        btnAgregar.setBackground(new java.awt.Color(247, 254, 255));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/1283147462_plus_48.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAgregar);

        btnEliminar.setBackground(new java.awt.Color(247, 254, 255));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/1283147878_dbmin2.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEliminar);
        jToolBar1.add(jSeparator2);

        btnImporte.setBackground(new java.awt.Color(247, 254, 255));
        btnImporte.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnImporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/1283148262_taxes.png"))); // NOI18N
        btnImporte.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImporteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImporte);

        btnCalcular.setBackground(new java.awt.Color(247, 254, 255));
        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/1283149480_kcalc.png"))); // NOI18N
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCalcular);
        jToolBar1.add(jSeparator3);

        btnBuscarProducto.setText("BUSCARPROD");
        btnBuscarProducto.setFocusable(false);
        btnBuscarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscarProducto);

        jButton1.setText("buscarprodID");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator4);

        jButton2.setBackground(new java.awt.Color(247, 254, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/1283127166_document-print-preview.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        btnAtrasT.setBackground(new java.awt.Color(247, 254, 255));
        btnAtrasT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAtrasT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/1283127227_print_printer.png"))); // NOI18N
        btnAtrasT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasTActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAtrasT);
        jToolBar1.add(jSeparator5);

        btnCancelar.setBackground(new java.awt.Color(247, 254, 255));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/1283150452_Cancel__Red.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCancelar);

        btnSalir.setBackground(new java.awt.Color(247, 254, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponenteImagenes/1283149900_Log Out.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalir);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdProdTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdTActionPerformed

    private void txtTotalApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalApagarActionPerformed

    private void txtIGVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIGVTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIGVTActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiarTextos();
        while(LTransacciones.getRowCount()>0)LTransacciones.removeRow(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAtrasTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasTActionPerformed

    }//GEN-LAST:event_btnAtrasTActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        // TODO add your handling code here:
//        FrmBuscarProducto frmBP = new FrmBuscarProducto(this) {
//        };
//        frmBP.setVisible(true);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < jtTransacProd.getRowCount(); i++) {
            float total = Float.parseFloat(String.valueOf(jtTransacProd.getModel().getValueAt(i, 3)));
            SubTotal += total;
            TotalIGV += (total * 0.19);
        }
        txtSubTotalT.setText(String.valueOf(Math.round(SubTotal)));
        txtIGVT.setText(String.valueOf(TotalIGV));
        Double totalapagar = SubTotal + TotalIGV;
        txtTotalApagar.setText(String.valueOf(totalapagar));
        txtVuelto.setText(String.valueOf(Math.round(Importe - totalapagar)));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImporteActionPerformed
        // TODO add your handling code here:
        Importe = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Importe S/0.0", "Mensaje..!!"));
        txtImporteT.setText(String.valueOf(Importe));
    }//GEN-LAST:event_btnImporteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
//        // TODO add your handling code here:
//        int elim_fila = jtTransacProd.getSelectedRow();
//        int idcom = Integer.parseInt(txtNroCompT.getText());
//        int cant = Integer.parseInt(String.valueOf(jtTransacProd.getModel().getValueAt(elim_fila, 0)));
//        try {
//            Producto p = BDProducto.buscarProductoNombre(String.valueOf(jtTransacProd.getModel().getValueAt(elim_fila, 1)));
//            int idp = p.getIdProducto();
//            BDTransaccion.eliminarTransaccion(idcom, idp);
//            p.setStock(p.getStock() + cant);
//            BDProducto.actualizarProducto(p);
//            txtStockT.setText(String.valueOf(p.getStock() + cant));
//        } catch (SQLException ex) {
//            Logger.getLogger(Boletas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        LTransacciones.removeRow(elim_fila);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        int DestStock = 0;
        if (Integer.parseInt(txtStockT.getText()) > Integer.parseInt(txtCantidadT.getText())) {
            AgregarTransaccion(); //Metodo para agregar transacciones realizadas
            /*
            * Por cada producto que agregue se mostrar en JTable
            */
            String Datos[] = {txtCantidadT.getText(), txtNombrePT.getText(), txtPrecioUndT.getText(),
                String.valueOf(Math.round(Integer.parseInt(txtCantidadT.getText()) * Double.parseDouble(txtPrecioUndT.getText())))};
            LTransacciones.addRow(Datos);
            DestStock = Integer.parseInt(txtStockT.getText()) - Integer.parseInt(txtCantidadT.getText());
//            try {
//                Producto p = BDProducto.buscarProducto(Integer.parseInt(txtIdProdT.getText()));
//                p.setStock(DestStock);
//                BDProducto.actualizarProducto(p);
//            } catch (SQLException ex) {
//                Logger.getLogger(Boletas.class.getName()).log(Level.SEVERE, null, ex);
//            }
            txtStockT.setText(String.valueOf(Integer.parseInt(txtStockT.getText()) - Integer.parseInt(txtCantidadT.getText())));
        } else if (Integer.parseInt(txtStockT.getText()) == Integer.parseInt(txtCantidadT.getText())) {
            AgregarTransaccion(); //Metodo para agregar transacciones realizadas
            /*
            * Por cada producto que agregue se mostrar en JTable
            */
            String Datos[] = {txtCantidadT.getText(), txtNombrePT.getText(), txtPrecioUndT.getText(),
                String.valueOf(Math.round(Integer.parseInt(txtCantidadT.getText()) * Double.parseDouble(txtPrecioUndT.getText())))};
            LTransacciones.addRow(Datos);
            DestStock = Integer.parseInt(txtStockT.getText()) - Integer.parseInt(txtCantidadT.getText());
//            try {
//                Producto p = BDProducto.buscarProducto(Integer.parseInt(txtIdProdT.getText()));
//                p.setStock(DestStock);
//                BDProducto.actualizarProducto(p);
//            } catch (SQLException ex) {
//                Logger.getLogger(Boletas.class.getName()).log(Level.SEVERE, null, ex);
//            }
            txtStockT.setText(String.valueOf(Integer.parseInt(txtStockT.getText()) - Integer.parseInt(txtCantidadT.getText())));
        } else {
            JOptionPane.showMessageDialog(null, "[ Cantidad < ó = Stock ]");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Boletas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtrasT;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jtTransacProd;
    public javax.swing.JLabel lblNombreTipoComp;
    public javax.swing.JLabel lblRucT;
    public javax.swing.JTextField txtCantidadT;
    public javax.swing.JTextField txtDatoClienteT;
    public javax.swing.JFormattedTextField txtIGVT;
    public javax.swing.JTextField txtIdProdT;
    private javax.swing.JFormattedTextField txtImporteT;
    public javax.swing.JTextArea txtNombrePT;
    private javax.swing.JTextField txtNroCompT;
    public javax.swing.JTextField txtPrecioUndT;
    public javax.swing.JTextField txtRucF;
    public javax.swing.JTextField txtStockT;
    public javax.swing.JFormattedTextField txtSubTotalT;
    public javax.swing.JTextField txtTelefonoT;
    private javax.swing.JFormattedTextField txtTotalApagar;
    public javax.swing.JTextField txtUnidadMedT;
    private javax.swing.JFormattedTextField txtVuelto;
    // End of variables declaration//GEN-END:variables
}
