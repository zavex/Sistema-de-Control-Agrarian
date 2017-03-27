package vista;

import modelo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class RegistrarCompra extends javax.swing.JInternalFrame {
    
    DecimalFormat df = new DecimalFormat("0.00");//para dos decimales
    Conexion conexion = new Conexion();
    
    Compra compra;
    Permisos permiso;
    Producto producto;
    Empleado empleado;
    CompraProducto compraProd;
    AlmacenProducto almacenProd;
    //Conexion conexion;
    JDesktopPane escritorio;
    
   
    boolean userName = false;
    boolean elegirPrivilegios = false;
    int filasListaVenta=0;
    double subtotalArt=0, totalArt = 0;
    
    Log ll = new Log();
    Date date = new Date ();
    
    public RegistrarCompra(Permisos permiso, Compra compra, Producto producto, CompraProducto compraProd, AlmacenProducto almacenProd ) {
        
        this.permiso = permiso;
        this.compra = compra;
        this.producto = producto;
        this.compraProd = compraProd;
        this.almacenProd = almacenProd;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbxEstatusVenta = new javax.swing.JComboBox<String>();
        lblEstatusVenta = new javax.swing.JLabel();
        fechaa = new com.toedter.calendar.JDateChooser();
        lblFolioCompra = new javax.swing.JLabel();
        lblFechaRegistro = new javax.swing.JLabel();
        txtFolioCompra = new javax.swing.JTextField();
        PanelDetallesMovimiento = new javax.swing.JPanel();
        txtIdEmpleado = new javax.swing.JTextField();
        txtIdProv = new javax.swing.JTextField();
        lblEmpleado = new javax.swing.JLabel();
        lblProv = new javax.swing.JLabel();
        lblAlmacen = new javax.swing.JLabel();
        txtIdAlmacen = new javax.swing.JTextField();
        comboAlmacenes = new javax.swing.JComboBox<String>();
        comboEmpleado = new javax.swing.JComboBox<String>();
        comboProv = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelDetalleSaldo = new javax.swing.JPanel();
        lblIvaVenta = new javax.swing.JLabel();
        lblTotalVenta = new javax.swing.JLabel();
        lblSubtotalVenta = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        lblSignoDinero = new javax.swing.JLabel();
        txtIva = new javax.swing.JLabel();
        lblSignoDinero1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        lblSignoDinero2 = new javax.swing.JLabel();
        PanelDetallesVenta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblPrducto = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        lblPrecioProducto = new javax.swing.JLabel();
        lblCantidadComprarProducto = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        lblAgregarProd = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JTextField();
        lblUnidadMedida = new javax.swing.JLabel();
        cbxUnidadMedida = new javax.swing.JComboBox<String>();
        txtPrecioProducto = new javax.swing.JTextField();
        comboProducto = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        btnCancelarVenta = new javax.swing.JButton();
        btnRegistrarVenta = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Compra");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cbxEstatusVenta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACTIVA", "CANCELADA" }));
        cbxEstatusVenta.setEnabled(false);

        lblEstatusVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEstatusVenta.setForeground(new java.awt.Color(0, 0, 102));
        lblEstatusVenta.setText("Estatus");

        fechaa.setEnabled(false);

        lblFolioCompra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFolioCompra.setForeground(new java.awt.Color(0, 0, 102));
        lblFolioCompra.setText("Folio Compra");

        lblFechaRegistro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaRegistro.setForeground(new java.awt.Color(0, 0, 102));
        lblFechaRegistro.setText("Fecha");

        txtFolioCompra.setEditable(false);
        txtFolioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioCompraActionPerformed(evt);
            }
        });

        PanelDetallesMovimiento.setBackground(new java.awt.Color(255, 255, 255));
        PanelDetallesMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Movimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDetallesMovimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdEmpleado.setEditable(false);
        PanelDetallesMovimiento.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 64, 41, -1));

        txtIdProv.setEditable(false);
        PanelDetallesMovimiento.add(txtIdProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 94, 41, -1));

        lblEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblEmpleado.setText("Empleado");
        PanelDetallesMovimiento.add(lblEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 66, -1, -1));

        lblProv.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblProv.setForeground(new java.awt.Color(0, 0, 102));
        lblProv.setText("Proveedor");
        PanelDetallesMovimiento.add(lblProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 96, -1, -1));

        lblAlmacen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAlmacen.setForeground(new java.awt.Color(0, 0, 102));
        lblAlmacen.setText("Almacén");
        PanelDetallesMovimiento.add(lblAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 36, -1, -1));

        txtIdAlmacen.setEditable(false);
        PanelDetallesMovimiento.add(txtIdAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 34, 41, -1));

        comboAlmacenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlmacenesActionPerformed(evt);
            }
        });
        PanelDetallesMovimiento.add(comboAlmacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 31, 231, -1));

        comboEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmpleadoActionPerformed(evt);
            }
        });
        PanelDetallesMovimiento.add(comboEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 61, 231, -1));

        comboProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProvActionPerformed(evt);
            }
        });
        PanelDetallesMovimiento.add(comboProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 91, 231, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        PanelDetallesMovimiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 33, 19, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        PanelDetallesMovimiento.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 63, 19, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        PanelDetallesMovimiento.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 93, 19, -1));

        PanelDetalleSaldo.setBackground(new java.awt.Color(255, 255, 255));
        PanelDetalleSaldo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de Saldo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblIvaVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIvaVenta.setForeground(new java.awt.Color(0, 0, 102));
        lblIvaVenta.setText("IVA");

        lblTotalVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTotalVenta.setForeground(new java.awt.Color(0, 0, 102));
        lblTotalVenta.setText("Total");

        lblSubtotalVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSubtotalVenta.setForeground(new java.awt.Color(0, 0, 102));
        lblSubtotalVenta.setText("Subtotal");

        lblSignoDinero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSignoDinero.setForeground(new java.awt.Color(0, 0, 102));
        lblSignoDinero.setText("$");

        lblSignoDinero1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSignoDinero1.setForeground(new java.awt.Color(0, 0, 102));
        lblSignoDinero1.setText("$");

        lblSignoDinero2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSignoDinero2.setForeground(new java.awt.Color(0, 0, 102));
        lblSignoDinero2.setText("$");

        javax.swing.GroupLayout PanelDetalleSaldoLayout = new javax.swing.GroupLayout(PanelDetalleSaldo);
        PanelDetalleSaldo.setLayout(PanelDetalleSaldoLayout);
        PanelDetalleSaldoLayout.setHorizontalGroup(
            PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                        .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIvaVenta)
                            .addComponent(lblSubtotalVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetalleSaldoLayout.createSequentialGroup()
                                .addComponent(lblSignoDinero)
                                .addGap(0, 0, 0)
                                .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetalleSaldoLayout.createSequentialGroup()
                                .addComponent(lblSignoDinero1)
                                .addGap(0, 0, 0)
                                .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                        .addComponent(lblTotalVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSignoDinero2)
                        .addGap(0, 0, 0)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelDetalleSaldoLayout.setVerticalGroup(
            PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                        .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSignoDinero)
                                .addComponent(lblSubtotalVenta))
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIvaVenta))
                    .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSignoDinero1)
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSignoDinero2)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelDetallesVenta.setBackground(new java.awt.Color(255, 255, 255));
        PanelDetallesVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDetallesVenta.setPreferredSize(new java.awt.Dimension(571, 343));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setForeground(new java.awt.Color(0, 0, 102));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id de Producto", "Id de Almacén", "Descripción", "Precio Unitario", "Num Unidades", "Medida", "Importe"
            }
        ));
        table.setEnabled(false);
        jScrollPane1.setViewportView(table);

        lblPrducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPrducto.setForeground(new java.awt.Color(0, 0, 102));
        lblPrducto.setText("Producto");

        txtIdProducto.setEditable(false);

        lblPrecioProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPrecioProducto.setForeground(new java.awt.Color(0, 0, 102));
        lblPrecioProducto.setText("Precio");

        lblCantidadComprarProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCantidadComprarProducto.setForeground(new java.awt.Color(0, 0, 102));
        lblCantidadComprarProducto.setText("Cantidad");

        btnAgregarProducto.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/button_plus_blue.png"))); // NOI18N
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        lblAgregarProd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAgregarProd.setForeground(new java.awt.Color(0, 0, 102));
        lblAgregarProd.setText("Agregar");

        txtCantidadProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadProductoKeyTyped(evt);
            }
        });

        lblUnidadMedida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUnidadMedida.setForeground(new java.awt.Color(0, 0, 102));
        lblUnidadMedida.setText("Unidad de Medida");

        cbxUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TM Toneladas", "KG Kilogramos", "S   Sacos" }));
        cbxUnidadMedida.setSelectedIndex(-1);
        cbxUnidadMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUnidadMedidaActionPerformed(evt);
            }
        });

        txtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoActionPerformed(evt);
            }
        });
        txtPrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioProductoKeyTyped(evt);
            }
        });

        comboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N
        jLabel4.setText("jLabel1");

        javax.swing.GroupLayout PanelDetallesVentaLayout = new javax.swing.GroupLayout(PanelDetallesVenta);
        PanelDetallesVenta.setLayout(PanelDetallesVentaLayout);
        PanelDetallesVentaLayout.setHorizontalGroup(
            PanelDetallesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetallesVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelDetallesVentaLayout.createSequentialGroup()
                .addGroup(PanelDetallesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetallesVentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPrducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDetallesVentaLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(PanelDetallesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecioProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDetallesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDetallesVentaLayout.createSequentialGroup()
                                .addComponent(lblCantidadComprarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUnidadMedida))
                            .addGroup(PanelDetallesVentaLayout.createSequentialGroup()
                                .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(PanelDetallesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetallesVentaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAgregarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(PanelDetallesVentaLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelDetallesVentaLayout.setVerticalGroup(
            PanelDetallesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetallesVentaLayout.createSequentialGroup()
                .addGroup(PanelDetallesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetallesVentaLayout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(PanelDetallesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDetallesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdProducto)
                                .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(lblPrducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDetallesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecioProducto)
                            .addComponent(lblCantidadComprarProducto)
                            .addComponent(lblUnidadMedida))
                        .addGap(3, 3, 3)
                        .addGroup(PanelDetallesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetallesVentaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAgregarProd)
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnCancelarVenta.setBackground(new java.awt.Color(102, 102, 255));
        btnCancelarVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVenta.setText("Cancelar");
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        btnRegistrarVenta.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenta.setText("Comprar");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFolioCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(lblFechaRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblEstatusVenta)
                .addGap(2, 2, 2)
                .addComponent(cbxEstatusVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelarVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarVenta))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(PanelDetallesMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PanelDetalleSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(PanelDetallesVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFolioCompra)
                            .addComponent(txtFolioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaRegistro))
                        .addComponent(fechaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxEstatusVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEstatusVenta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelDetallesMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelDetalleSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelDetallesVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVenta)
                    .addComponent(btnRegistrarVenta))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void cargarComboAlmacenes() {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try
        {
        comando = conexion.getConexion().prepareStatement("select nombreA from almacen");
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
             comboAlmacenes.addItem(rs.getString(1));          
        }
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        } 
        
    }   
    
    public void cargarComboEmpleados() {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try
        {
        comando = conexion.getConexion().prepareStatement("select nombre from empleado");
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
             comboEmpleado.addItem(rs.getString(1));         
        }
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        } 
        
    }
    
    public void cargarComboProductos() {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try
        {
        comando = conexion.getConexion().prepareStatement("select nombre from producto");
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
             comboProducto.addItem(rs.getString(1));         
        }
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        } 
        
    }
        
    public void cargarComboProveedor() {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try
        {
        comando = conexion.getConexion().prepareStatement("select nombre from proveedor");
        ResultSet rs = comando.executeQuery();
        while(rs.next()){
             comboProv.addItem(rs.getString(1));           
        }
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
    }
        
    public boolean fieldsVentaOk () {
        String idEmpOk = txtIdEmpleado.getText();
        String idProvOk = txtIdProv.getText();
        String idAlmOk = txtIdAlmacen.getText();
        String ivaOk = txtIva.getText();
        if ( !idEmpOk.isEmpty() && !idProvOk.isEmpty() && !ivaOk.isEmpty() && !idAlmOk.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
    
    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
            if(fieldsVentaOk()){
            try {
                compra.setIdEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
                compra.setIdProveedor(Integer.parseInt(txtIdProv.getText()));
                compra.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
                compra.setSubtotal(Double.parseDouble(txtSubtotal.getText()));
                compra.setIva(Double.parseDouble(txtIva.getText()));
                compra.setTotal(Double.parseDouble(txtTotal.getText()));
                compra.setEstatus("ACTIVA");
                compra.registrarCompra();
                
                for (int i = 0; i < filasListaVenta; i++) {
                    //almacenar datos en venta_producto
                    compraProd.setFolioCompra(Integer.parseInt(txtFolioCompra.getText()));
                    compraProd.setIdProducto(Integer.parseInt(table.getModel().getValueAt(i, 0).toString()));
                    compraProd.setPrecio(Double.parseDouble(table.getModel().getValueAt(i, 3).toString()));
                    compraProd.setCantidad(Double.parseDouble(table.getModel().getValueAt(i, 4).toString()));
                    //almacenar datos en almacen_producto
                    almacenProd.setIdAlmacen(Integer.parseInt(table.getModel().getValueAt(i, 1).toString()));
                    almacenProd.setIdProducto(Integer.parseInt(table.getModel().getValueAt(i, 0).toString()));
                    almacenProd.setCantidad(Double.parseDouble(table.getModel().getValueAt(i, 4).toString()));
                    compraProd.registrarCompraProd();
                    almacenProd.registarAltaProducto();
                }
                JOptionPane.showMessageDialog(null,"Compra Realizada");
                ll.agregarAccion(date.toString(),"Compra Realizada");
                this.dispose();
            }catch (Exception e) {JOptionPane.showMessageDialog(null,"Operacion no soportada");this.dispose();}
        }
        else {
                JOptionPane.showMessageDialog(null,"LLene todos los datos");
        }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
            this.dispose();
    }//GEN-LAST:event_btnCancelarVentaActionPerformed
  /* 
  
    private double obtenerImporte() {
        double importe = 0;
    try{
        double precioInd = Double.parseDouble(preciouGenerado.getText());
        double cantidadComprada = Double.parseDouble(cantidadCompra.getText());
        importe = (precioInd * cantidadComprada);
        subtotalArt+= importe;
        totalArt = (subtotalArt + (subtotalArt * .16));
        df.format(totalArt);
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Solo numeros");
    }
        
        return importe;
        
    }*/
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       fechaa.setDate(new Date());    //al iniciar setear la fecha actual
       txtFolioCompra.setText(String.valueOf(compra.obtenerFolio())); 
       cargarComboProveedor();
       cargarComboProductos();
       cargarComboEmpleados();
       cargarComboAlmacenes();
    }//GEN-LAST:event_formInternalFrameOpened

    
    private void txtFolioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolioCompraActionPerformed

    private void txtCantidadProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadProductoKeyTyped
        char c = evt.getKeyChar();
        String cantidad = txtCantidadProducto.getText();

        if(cantidad.length()>2){
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isLetter(c)) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtCantidadProductoKeyTyped

    private void cbxUnidadMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUnidadMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUnidadMedidaActionPerformed

    private void txtPrecioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioProductoKeyTyped
        String msg = String.valueOf(evt.getKeyChar());
        String precioVentaa = txtPrecioProducto.getText();
        int precioVenta = txtPrecioProducto.getText().length();
        if (!(msg.matches("[.0-9]"))) {
                evt.consume();
        }
        if (precioVenta >= 1) {
                for (int j = 0; j < precioVenta; j++) {
                        if (precioVentaa.charAt(j) == '.') {
                                if (!msg.matches(("[0-9]"))) {
                                        evt.consume();
                                }
                        }
                }
        }
    }//GEN-LAST:event_txtPrecioProductoKeyTyped

    private void txtPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProductoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        
        String cantventa =txtCantidadProducto.getText();
        
        if (!cantventa.isEmpty()){
            DefaultTableModel modelo = (DefaultTableModel)table.getModel();
            modelo.addRow(new Object[filasListaVenta]);
            try {
                table.setValueAt(txtIdProducto.getText(), filasListaVenta, 0);
                table.setValueAt(txtIdAlmacen.getText(), filasListaVenta, 1);
                table.setValueAt(String.valueOf(comboProducto.getSelectedItem()), filasListaVenta, 2);
                table.setValueAt(txtPrecioProducto.getText(), filasListaVenta, 3);
                table.setValueAt(txtCantidadProducto.getText(), filasListaVenta, 4);
                table.setValueAt(String.valueOf(cbxUnidadMedida.getSelectedItem()), filasListaVenta, 5);
                table.setValueAt(obtenerImporte(), filasListaVenta, 6); 
                txtIva.setText(String.valueOf((subtotalArt * .16)));
                txtSubtotal.setText(String.valueOf(subtotalArt));
                txtTotal.setText(String.valueOf(totalArt));
                filasListaVenta++;
            } 
            catch (Exception e) {}
            }else {
            JOptionPane.showMessageDialog(null,"LLene cantidad y fecha");
        }

        
    }//GEN-LAST:event_btnAgregarProductoActionPerformed
    
     private double obtenerImporte() {
        double importe = 0;
    try{
        double precioInd = Double.parseDouble(txtPrecioProducto.getText());
        double cantidadComprada = Double.parseDouble(txtCantidadProducto.getText());
        importe = (precioInd * cantidadComprada);
        subtotalArt+= importe;
        totalArt = (subtotalArt + (subtotalArt * .16));
        df.format(totalArt);
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Solo numeros");
    }
    return importe;    
    }
    
    
    private void comboAlmacenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlmacenesActionPerformed
        txtIdAlmacen.setText(String.valueOf(regresarIdAlmacen()));
    }//GEN-LAST:event_comboAlmacenesActionPerformed

    private void comboEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmpleadoActionPerformed
        txtIdEmpleado.setText(String.valueOf(regresarIdEmp()));
    }//GEN-LAST:event_comboEmpleadoActionPerformed

    private void comboProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProvActionPerformed
        txtIdProv.setText(String.valueOf(regresarIdProv()));
    }//GEN-LAST:event_comboProvActionPerformed

    private void comboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductoActionPerformed
        txtIdProducto.setText(String.valueOf(regresarIdProd()));
    }//GEN-LAST:event_comboProductoActionPerformed

    public int regresarIdEmp () {
        int idEmpleado=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String empleadoo = comboEmpleado.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement("select idEmpleado from empleado where nombre=?");
        comando.setString(1, empleadoo);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
            idEmpleado = rs.getInt(1);   
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return idEmpleado;   
    }
 
    public int regresarIdProd () {
        int idProducto=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String productoo = comboProducto.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement("select idProducto from producto where nombre=?");
        comando.setString(1, productoo);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
            idProducto = rs.getInt(1);   
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return idProducto;   
    }
        
    public int regresarIdProv () {
        
        int idProveedor=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String proveedorr = comboProv.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement("select idProveedor from proveedor where nombre=?");
        comando.setString(1, proveedorr);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
            idProveedor = rs.getInt(1);   
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return idProveedor;   
    }
  
    public int regresarIdAlmacen () {
        int idAlmacen=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String almacenn = comboAlmacenes.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement("select idAlmacen from almacen where nombreA=?");
        comando.setString(1, almacenn);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
            idAlmacen = rs.getInt(1);   
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return idAlmacen;   
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDetalleSaldo;
    private javax.swing.JPanel PanelDetallesMovimiento;
    private javax.swing.JPanel PanelDetallesVenta;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JComboBox<String> cbxEstatusVenta;
    private javax.swing.JComboBox<String> cbxUnidadMedida;
    private javax.swing.JComboBox<String> comboAlmacenes;
    private javax.swing.JComboBox<String> comboEmpleado;
    private javax.swing.JComboBox<String> comboProducto;
    private javax.swing.JComboBox<String> comboProv;
    private com.toedter.calendar.JDateChooser fechaa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarProd;
    private javax.swing.JLabel lblAlmacen;
    private javax.swing.JLabel lblCantidadComprarProducto;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblEstatusVenta;
    private javax.swing.JLabel lblFechaRegistro;
    private javax.swing.JLabel lblFolioCompra;
    private javax.swing.JLabel lblIvaVenta;
    private javax.swing.JLabel lblPrducto;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblProv;
    private javax.swing.JLabel lblSignoDinero;
    private javax.swing.JLabel lblSignoDinero1;
    private javax.swing.JLabel lblSignoDinero2;
    private javax.swing.JLabel lblSubtotalVenta;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JLabel lblUnidadMedida;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtFolioCompra;
    private javax.swing.JTextField txtIdAlmacen;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdProv;
    private javax.swing.JLabel txtIva;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JLabel txtSubtotal;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
