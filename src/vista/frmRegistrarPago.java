
package vista;

import com.toedter.calendar.JCalendar;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Pago;


public class frmRegistrarPago extends javax.swing.JFrame {
    ConsultarVenta cVenta;
    ConsultarCompra cCompra;
    Pago p;
    int op = -1;
    Conexion conexion;
    boolean pagoRegistrado;
    
    DefaultComboBoxModel bancos1;
    DefaultComboBoxModel bancos2;
    
    DefaultTableModel pagos;
    
    public frmRegistrarPago(ConsultarVenta cV,int opcion, int[] datos) {
        initComponents();
        this.cVenta = cV;
        this.op = opcion;
        crearVentana(opcion);
        creaComboBanco();
        this.pagoRegistrado = false;
        
        p = new Pago(datos, opcion);
        p.llenarFormulario(txtFolio, txtFechaV, txtNombreC, txtMonto, txtIVA, txtTotal, txtEstatus,txtSaldo);
        
    }
    
    public frmRegistrarPago(ConsultarCompra cC, int opcion, int[] datos){
        initComponents();
        this.cCompra = cC;
        this.op = opcion;
        crearVentana(opcion);
        creaComboBanco();
        
        this.pagoRegistrado = false;
        p = new Pago(datos, opcion);
        p.llenarFormulario(txtFolio, txtFechaV, txtNombreC, txtMonto, txtIVA, txtTotal, txtEstatus,txtSaldo);
    }
    
    public void creaComboBanco(){
        String[] listaBancos = {"Banamex","Santander","Bancomer","IXE","Banorte","HSBC","Inbursa","Afirme","Scotiabank"};
        bancos1 = new DefaultComboBoxModel();
        bancos2 = new DefaultComboBoxModel();
        for (int i=0; i < listaBancos.length;i++) {
                bancos1.addElement(listaBancos[i]);
                bancos2.addElement(listaBancos[i]);
        }
        menuBDestino.setModel(bancos1);
        menuBOrigen.setModel(bancos2);
        menuBDestino.setSelectedIndex(-1);
        menuBOrigen.setSelectedIndex(-1);
    }

    public void crearVentana(int x){
        this.setTitle("Registro de pagos");
        switch(x){
            case 1: //Venta
                jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Información de la venta"));
                lblFolio.setText("Folio de Venta");
                lbfechaV.setText("Fecha de Venta");
                lbNombreC.setText("Nombre del Cliente");
                menuBOrigen.setEnabled(false);
                break;
            case 2:
                jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Información de la compra"));
                lblFolio.setText("Folio de Compra");
                lbfechaV.setText("Fecha de Compra");
                lbNombreC.setText("Nombre del empleado");
                break;
        }
    }
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capturaPago = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        panBotonera = new javax.swing.JPanel();
        btnSalirDialog = new javax.swing.JButton();
        btnLimpiarDialog = new javax.swing.JButton();
        btnGuardarDialog = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblBOrigen = new javax.swing.JLabel();
        menuBOrigen = new javax.swing.JComboBox<>();
        lblBDestino = new javax.swing.JLabel();
        menuBDestino = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidadAbonada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tfFechaActual = new com.toedter.calendar.JDateChooser();
        lbFechaActual = new javax.swing.JLabel();
        Pago = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnNulo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbfechaV = new javax.swing.JLabel();
        txtFechaV = new javax.swing.JTextField();
        lbNombreC = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        lblFolio = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lbIVA = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblEstatus = new javax.swing.JLabel();
        txtEstatus = new javax.swing.JTextField();
        lbSaldo = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        btnRegistrarPago = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPagos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        capturaPago.setTitle("Captura de pago");
        capturaPago.setAlwaysOnTop(true);
        capturaPago.setModal(true);
        capturaPago.setUndecorated(true);
        capturaPago.setPreferredSize(new java.awt.Dimension(248, 221));
        capturaPago.setResizable(false);
        capturaPago.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panBotonera.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panBotonera.setLayout(new java.awt.GridLayout(1, 0));

        btnSalirDialog.setText("Salir");
        btnSalirDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDialogActionPerformed(evt);
            }
        });
        panBotonera.add(btnSalirDialog);

        btnLimpiarDialog.setText("Limpiar");
        btnLimpiarDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDialogActionPerformed(evt);
            }
        });
        panBotonera.add(btnLimpiarDialog);

        btnGuardarDialog.setText("Guardar");
        btnGuardarDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDialogActionPerformed(evt);
            }
        });
        panBotonera.add(btnGuardarDialog);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblBOrigen.setText("Banco Origen");

        menuBOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblBDestino.setText("Banco Destino");

        menuBDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBOrigen)
                    .addComponent(lblBDestino))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuBOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuBDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBDestino, lblBOrigen});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBOrigen)
                    .addComponent(menuBOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBDestino)
                    .addComponent(menuBDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBDestino, lblBOrigen, menuBDestino, menuBOrigen});

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCantidad.setText("Cantidad");

        txtCantidadAbonada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadAbonadaKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 204));
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingresa la cantidad abonada");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblCantidad)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidadAbonada)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidadAbonada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, lblCantidad, txtCantidadAbonada});

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        capturaPago.getContentPane().add(jPanel5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de pagos");
        setMinimumSize(new java.awt.Dimension(405, 445));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbFechaActual.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbFechaActual.setText("Fecha de pago");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFechaActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfFechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbFechaActual, tfFechaActual});

        Pago.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout PagoLayout = new javax.swing.GroupLayout(Pago);
        Pago.setLayout(PagoLayout);
        PagoLayout.setHorizontalGroup(
            PagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PagoLayout.setVerticalGroup(
            PagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir);

        btnNulo.setBorderPainted(false);
        btnNulo.setContentAreaFilled(false);
        btnNulo.setEnabled(false);
        btnNulo.setFocusable(false);
        btnNulo.setRequestFocusEnabled(false);
        btnNulo.setRolloverEnabled(false);
        jPanel2.add(btnNulo);

        btnLimpiar.setText("Limpiar");
        jPanel2.add(btnLimpiar);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Información de la venta"));

        lbfechaV.setText("Fecha de venta");

        txtFechaV.setEditable(false);
        txtFechaV.setFocusable(false);

        lbNombreC.setText("Razón social del proveedor");

        txtNombreC.setEditable(false);
        txtNombreC.setFocusable(false);

        lblFolio.setText("Folio Venta");

        txtFolio.setEditable(false);
        txtFolio.setFocusable(false);

        lblMonto.setText("Monto");

        txtMonto.setEditable(false);
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMonto.setFocusable(false);

        lbIVA.setText("IVA");

        txtIVA.setEditable(false);
        txtIVA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIVA.setFocusable(false);

        lblTotal.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setFocusable(false);

        lblEstatus.setText("Estatus");

        txtEstatus.setEditable(false);
        txtEstatus.setFocusable(false);

        lbSaldo.setText("Saldo pendiente");

        txtSaldo.setEditable(false);
        txtSaldo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSaldo.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbNombreC)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreC))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblFolio)
                        .addGap(18, 18, 18)
                        .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbfechaV)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal)
                            .addComponent(lbIVA)
                            .addComponent(lblMonto))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblEstatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstatus))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbSaldo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtSaldo)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbfechaV)
                    .addComponent(txtFechaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFolio)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreC)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEstatus))
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIVA)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbSaldo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbfechaV, txtFechaV});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblFolio, txtFolio});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbNombreC, txtNombreC});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbIVA, lblMonto, lblTotal, txtIVA, txtMonto, txtTotal});

        btnRegistrarPago.setText("Registrar pago");
        btnRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPagoActionPerformed(evt);
            }
        });

        tablaPagos.setBorder(null);
        tablaPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPagos);

        tablaHistorial.setBorder(null);
        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaHistorial);

        jButton1.setText("Eliminar pago");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarPago)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRegistrarPago, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarPago)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void generarFecha(){
        Date fechaActual = new Date();
        tfFechaActual.setDate(fechaActual); 
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       generarFecha();
       
    }//GEN-LAST:event_formWindowOpened

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPagoActionPerformed
        if(!pagoRegistrado){
            capturaPago.setSize(250, 223);
            capturaPago.setLocationRelativeTo(this);
            capturaPago.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(this, "Ya hay un pago registrado","Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarPagoActionPerformed

    private void btnSalirDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDialogActionPerformed
        capturaPago.dispose();
    }//GEN-LAST:event_btnSalirDialogActionPerformed

    private void btnLimpiarDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDialogActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarDialogActionPerformed

    private void btnGuardarDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDialogActionPerformed
        Vector columna = new Vector();
        switch(op){
            case 1:
                if(txtCantidadAbonada.getText().length()>0){
                    columna.addElement("$ "+(txtCantidadAbonada.getText()));
                    
                    if(menuBDestino.getSelectedIndex()!=-1){
                        columna.addElement(menuBDestino.getSelectedItem());
                        crearTabla(columna);
                        limpiar();
                        capturaPago.dispose();
                    } else {
                        menuBDestino.requestFocus();
                    }
                } else {
                    txtCantidadAbonada.requestFocus();
                }
                break;
            case 2:
                if(txtCantidadAbonada.getText().length()>0){
                    columna.addElement("$ "+txtCantidadAbonada.getText());
                    
                    if(menuBOrigen.getSelectedIndex()!=-1){
                        columna.addElement(menuBOrigen.getSelectedItem());
                        
                        if(menuBDestino.getSelectedIndex()!=-1){
                        columna.addElement(menuBDestino.getSelectedItem());
                        crearTabla(columna);
                        limpiar();
                        capturaPago.dispose();
                        } else {
                            menuBDestino.requestFocus();
                        }
                    } else {
                            menuBOrigen.requestFocus();
                    } 
                } else {
                    txtCantidadAbonada.requestFocus();
                }
                break;
        }
    }//GEN-LAST:event_btnGuardarDialogActionPerformed
    
    private void txtCantidadAbonadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadAbonadaKeyTyped
        if(Character.isDigit(evt.getKeyChar()) || evt.getKeyChar()=='.'){
            if(evt.getKeyChar()=='.' && txtCantidadAbonada.getText().contains(".")){
                evt.consume();
            }
        } else {
            evt.consume();
        }
        
    }//GEN-LAST:event_txtCantidadAbonadaKeyTyped

    public void limpiar(){
        creaComboBanco();
        txtCantidadAbonada.setText("");
    }
    
    public void crearTabla(Vector filas){
        switch(this.op){
            case 1:
                pagos = new DefaultTableModel(){
                    Class[] tipoColumn = {String.class,String.class};
                    boolean[] editColumn = {false,false};
                    @Override
                    public Class getColumnClass(int indColumn){
                        return tipoColumn[indColumn];
                    }
                    @Override
                    public boolean isCellEditable(int indFila, int indColum){
                        return editColumn[indColum];
                    }
                };
                pagos.addColumn("Cantidad");
                pagos.addColumn("Banco receptor");
                pagos.addRow(filas);
                tablaPagos.setModel(pagos);
                tablaPagos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                tablaPagos.getColumnModel().getColumn(0).setMaxWidth(80);
                tablaPagos.getColumnModel().getColumn(1).setMinWidth(120);
                tablaPagos.setAutoCreateRowSorter(true);
                pagoRegistrado = true;
                break;
            case 2:
                pagos = new DefaultTableModel(){
                    Class[] tipoColumn = {String.class,String.class,String.class};
                    boolean[] editColumn = {false,false};
                    @Override
                    public Class getColumnClass(int indColumn){
                        return tipoColumn[indColumn];
                    }
                    @Override
                    public boolean isCellEditable(int indFila, int indColum){
                        return editColumn[indColum];
                    }
                };
                pagos.addColumn("Cantidad");
                pagos.addColumn("Banco emisor");
                pagos.addColumn("Banco receptor");
                pagos.addRow(filas);
                tablaPagos.setModel(pagos);
                tablaPagos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                tablaPagos.getColumnModel().getColumn(0).setMinWidth(60);
                tablaPagos.getColumnModel().getColumn(1).setMinWidth(100);
                tablaPagos.getColumnModel().getColumn(2).setMinWidth(100);
                tablaPagos.setAutoCreateRowSorter(true);
                pagoRegistrado = true;
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(frmRegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pago;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarDialog;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarDialog;
    private javax.swing.JButton btnNulo;
    private javax.swing.JButton btnRegistrarPago;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirDialog;
    private javax.swing.JDialog capturaPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbFechaActual;
    private javax.swing.JLabel lbIVA;
    private javax.swing.JLabel lbNombreC;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbfechaV;
    private javax.swing.JLabel lblBDestino;
    private javax.swing.JLabel lblBOrigen;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblEstatus;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JComboBox<String> menuBDestino;
    private javax.swing.JComboBox<String> menuBOrigen;
    private javax.swing.JPanel panBotonera;
    private javax.swing.JTable tablaHistorial;
    private javax.swing.JTable tablaPagos;
    private com.toedter.calendar.JDateChooser tfFechaActual;
    private javax.swing.JTextField txtCantidadAbonada;
    private javax.swing.JTextField txtEstatus;
    private javax.swing.JTextField txtFechaV;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
