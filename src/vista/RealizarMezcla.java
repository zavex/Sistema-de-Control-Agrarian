package vista;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;

/**
 * Este formulario se encarga de mostrar la ventana de registro de mezclas.
 * @author Save Soto
 */
public class RealizarMezcla extends javax.swing.JInternalFrame {
    Permisos permiso;
    Formula f;
    Producto producto;
    Conexion conexion = new Conexion();
    AlmacenProducto almacenProd;    
    Log ll = new Log();
    Date date = new Date ();
    
    /**
     * Constructor de la vista de registro de mezclas.
     * @param permisoo  Recibe la instancia de la clase permisos.
     * @param formulaa  Recibe la instancia de la clase formula.
     * @param producto  Recibe la instancia de la clase producto.
     * @param almacenProd   Recibe la instancia de la clase Almacen Producto.
     */
    public RealizarMezcla(Permisos permisoo, Formula formulaa, Producto producto, AlmacenProducto almacenProd) {
        this.permiso = permisoo;
        this.f = formulaa;
        this.producto = producto;
        this.almacenProd = almacenProd;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblKg = new javax.swing.JLabel();
        lblNitrogeno = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        lblPrecioVenta1 = new javax.swing.JLabel();
        lblUrea = new javax.swing.JLabel();
        txtUrea = new javax.swing.JTextField();
        txtUreaN = new javax.swing.JTextField();
        txtUreaMezcla = new javax.swing.JTextField();
        txtPrecioUrea = new javax.swing.JTextField();
        txtTotalUrea = new javax.swing.JTextField();
        txtTotalDap = new javax.swing.JTextField();
        txtTotalMap = new javax.swing.JTextField();
        txtTotalKcl = new javax.swing.JTextField();
        txtTotalKmag = new javax.swing.JTextField();
        txtTotalFosfo = new javax.swing.JTextField();
        txtTotalPotasio = new javax.swing.JTextField();
        txtTotalAmonio = new javax.swing.JTextField();
        txtPrecioAmonio = new javax.swing.JTextField();
        txtPrecioPotasio = new javax.swing.JTextField();
        txtPrecioFosfo = new javax.swing.JTextField();
        txtPrecioKmag = new javax.swing.JTextField();
        txtPrecioKcl = new javax.swing.JTextField();
        txtPrecioMap = new javax.swing.JTextField();
        txtPrecioDap = new javax.swing.JTextField();
        txtDapMezcla = new javax.swing.JTextField();
        txtMapMezcla = new javax.swing.JTextField();
        txtKclMezcla = new javax.swing.JTextField();
        txtKmgMezcla = new javax.swing.JTextField();
        txtFosfoMezcla = new javax.swing.JTextField();
        txtPotasioMezcla = new javax.swing.JTextField();
        txtAmonioMezcla = new javax.swing.JTextField();
        txtKmgMg = new javax.swing.JTextField();
        txtAmonioS = new javax.swing.JTextField();
        txtKmgS = new javax.swing.JTextField();
        txtPotasioK = new javax.swing.JTextField();
        txtKmgK = new javax.swing.JTextField();
        txtKclK = new javax.swing.JTextField();
        txtMapP = new javax.swing.JTextField();
        txtDapP = new javax.swing.JTextField();
        txtDapN = new javax.swing.JTextField();
        txtMapN = new javax.swing.JTextField();
        txtFosfoN = new javax.swing.JTextField();
        txtAmonioN = new javax.swing.JTextField();
        txtSumaN = new javax.swing.JTextField();
        txtSumaP = new javax.swing.JTextField();
        txtSumaK = new javax.swing.JTextField();
        txtSumaS = new javax.swing.JTextField();
        txtSumaMg = new javax.swing.JTextField();
        txtSumaKgM = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblManiobras = new javax.swing.JLabel();
        txtManiobras = new javax.swing.JTextField();
        txtSumaPrecio = new javax.swing.JTextField();
        lblPrecioTotal = new javax.swing.JLabel();
        txtPrecioTotal = new javax.swing.JTextField();
        txtSumaKilos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblAmonio = new javax.swing.JLabel();
        txtAmonio = new javax.swing.JTextField();
        txtPotasio = new javax.swing.JTextField();
        lblPotasio = new javax.swing.JLabel();
        lblFosfo = new javax.swing.JLabel();
        txtFosfo = new javax.swing.JTextField();
        txtKmag = new javax.swing.JTextField();
        lblKmag = new javax.swing.JLabel();
        lblKcl = new javax.swing.JLabel();
        lblMap = new javax.swing.JLabel();
        txtKcl = new javax.swing.JTextField();
        txtMap = new javax.swing.JTextField();
        txtDap = new javax.swing.JTextField();
        lblDap = new javax.swing.JLabel();
        lblPrecioTotal1 = new javax.swing.JLabel();
        lblPrecioVenta2 = new javax.swing.JLabel();
        txtCantidadDap = new javax.swing.JTextField();
        txtCantidadUrea = new javax.swing.JTextField();
        txtCantidadMap = new javax.swing.JTextField();
        txtCantidadKcl = new javax.swing.JTextField();
        txtCantidadKmag = new javax.swing.JTextField();
        txtCantidadFosfo = new javax.swing.JTextField();
        txtCantidadPotasio = new javax.swing.JTextField();
        txtCantidadAmonio = new javax.swing.JTextField();
        lblPrecioVenta3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblNitrogeno1 = new javax.swing.JLabel();
        txtFormulaN = new javax.swing.JTextField();
        lblFosforo1 = new javax.swing.JLabel();
        txtFormulaP = new javax.swing.JTextField();
        lblPotasio1 = new javax.swing.JLabel();
        txtFormulaK = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtFormulaS = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFormulaMg = new javax.swing.JTextField();
        lblToneladas1 = new javax.swing.JLabel();
        lblToneladas = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        lblAlmacen = new javax.swing.JLabel();
        txtIdAlmacen = new javax.swing.JTextField();
        comboAlmacenes = new javax.swing.JComboBox<String>();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtToneladas = new javax.swing.JTextField();
        txtRealizarM = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Realizar Mezcla");
        setToolTipText("");
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de Fórmula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Producto Fuente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 31, 156, 27));

        lblKg.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblKg.setForeground(new java.awt.Color(0, 0, 51));
        lblKg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKg.setText("KG.");
        lblKg.setToolTipText("");
        jPanel1.add(lblKg, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 31, 112, 27));

        lblNitrogeno.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNitrogeno.setForeground(new java.awt.Color(0, 0, 51));
        lblNitrogeno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNitrogeno.setText("Nitrógeno (N)");
        jPanel1.add(lblNitrogeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 31, 100, 27));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fósforo (P)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 31, 100, 27));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Potasio (K)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 31, 100, 27));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Azufre (S)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 31, 100, 27));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Magnesio (MG)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 31, 100, 27));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("KG. 1 TM");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 31, 100, 27));

        lblPrecioVenta.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPrecioVenta.setForeground(new java.awt.Color(0, 0, 51));
        lblPrecioVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioVenta.setText("Precio por KG");
        jPanel1.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 31, 100, -1));

        lblPrecioVenta1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPrecioVenta1.setForeground(new java.awt.Color(0, 0, 51));
        lblPrecioVenta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioVenta1.setText("Total $");
        jPanel1.add(lblPrecioVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 100, 24));

        lblUrea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblUrea.setForeground(new java.awt.Color(0, 0, 102));
        lblUrea.setText("UREA 46-00-00");
        jPanel1.add(lblUrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 76, 156, 23));

        txtUrea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtUrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUrea.setText("0.00");
        txtUrea.setToolTipText("");
        txtUrea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUreaActionPerformed(evt);
            }
        });
        txtUrea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUreaFocusGained(evt);
            }
        });
        txtUrea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUreaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUreaKeyTyped(evt);
            }
        });
        jPanel1.add(txtUrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 77, 100, -1));

        txtUreaN.setEditable(false);
        txtUreaN.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtUreaN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUreaN.setText("0.00");
        txtUreaN.setToolTipText("");
        txtUreaN.setEnabled(false);
        jPanel1.add(txtUreaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 77, 100, -1));

        txtUreaMezcla.setEditable(false);
        txtUreaMezcla.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtUreaMezcla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUreaMezcla.setText("0.00");
        txtUreaMezcla.setToolTipText("");
        txtUreaMezcla.setEnabled(false);
        jPanel1.add(txtUreaMezcla, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 77, 100, -1));

        txtPrecioUrea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecioUrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioUrea.setText("5.50");
        txtPrecioUrea.setToolTipText("");
        txtPrecioUrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUreaActionPerformed(evt);
            }
        });
        txtPrecioUrea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioUreaFocusGained(evt);
            }
        });
        txtPrecioUrea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioUreaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioUreaKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioUrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 77, 100, -1));

        txtTotalUrea.setEditable(false);
        txtTotalUrea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtTotalUrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalUrea.setText("0.00");
        txtTotalUrea.setToolTipText("");
        txtTotalUrea.setEnabled(false);
        jPanel1.add(txtTotalUrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 70, 100, -1));

        txtTotalDap.setEditable(false);
        txtTotalDap.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtTotalDap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalDap.setText("0.00");
        txtTotalDap.setToolTipText("");
        txtTotalDap.setEnabled(false);
        jPanel1.add(txtTotalDap, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 100, 100, -1));

        txtTotalMap.setEditable(false);
        txtTotalMap.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtTotalMap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalMap.setText("0.00");
        txtTotalMap.setToolTipText("");
        txtTotalMap.setEnabled(false);
        jPanel1.add(txtTotalMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 130, 100, -1));

        txtTotalKcl.setEditable(false);
        txtTotalKcl.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtTotalKcl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalKcl.setText("0.00");
        txtTotalKcl.setToolTipText("");
        txtTotalKcl.setEnabled(false);
        jPanel1.add(txtTotalKcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 160, 100, -1));

        txtTotalKmag.setEditable(false);
        txtTotalKmag.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtTotalKmag.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalKmag.setText("0.00");
        txtTotalKmag.setToolTipText("");
        txtTotalKmag.setEnabled(false);
        jPanel1.add(txtTotalKmag, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 190, 100, -1));

        txtTotalFosfo.setEditable(false);
        txtTotalFosfo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtTotalFosfo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalFosfo.setText("0.00");
        txtTotalFosfo.setToolTipText("");
        txtTotalFosfo.setEnabled(false);
        jPanel1.add(txtTotalFosfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 220, 100, -1));

        txtTotalPotasio.setEditable(false);
        txtTotalPotasio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtTotalPotasio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalPotasio.setText("0.00");
        txtTotalPotasio.setToolTipText("");
        txtTotalPotasio.setEnabled(false);
        jPanel1.add(txtTotalPotasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 250, 100, -1));

        txtTotalAmonio.setEditable(false);
        txtTotalAmonio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtTotalAmonio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalAmonio.setText("0.00");
        txtTotalAmonio.setToolTipText("");
        txtTotalAmonio.setEnabled(false);
        jPanel1.add(txtTotalAmonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 280, 100, -1));

        txtPrecioAmonio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecioAmonio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioAmonio.setText("4.10");
        txtPrecioAmonio.setToolTipText("");
        txtPrecioAmonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioAmonioActionPerformed(evt);
            }
        });
        txtPrecioAmonio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioAmonioFocusGained(evt);
            }
        });
        txtPrecioAmonio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioAmonioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioAmonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 277, 100, -1));

        txtPrecioPotasio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecioPotasio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioPotasio.setText("14.50");
        txtPrecioPotasio.setToolTipText("");
        txtPrecioPotasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioPotasioActionPerformed(evt);
            }
        });
        txtPrecioPotasio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioPotasioFocusGained(evt);
            }
        });
        txtPrecioPotasio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioPotasioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioPotasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 248, 100, -1));

        txtPrecioFosfo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecioFosfo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioFosfo.setText("6.50");
        txtPrecioFosfo.setToolTipText("");
        txtPrecioFosfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioFosfoActionPerformed(evt);
            }
        });
        txtPrecioFosfo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioFosfoFocusGained(evt);
            }
        });
        txtPrecioFosfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioFosfoKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioFosfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 219, 100, -1));

        txtPrecioKmag.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecioKmag.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioKmag.setText("6.50");
        txtPrecioKmag.setToolTipText("");
        txtPrecioKmag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioKmagActionPerformed(evt);
            }
        });
        txtPrecioKmag.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioKmagFocusGained(evt);
            }
        });
        txtPrecioKmag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKmagKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioKmag, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 190, 100, -1));

        txtPrecioKcl.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecioKcl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioKcl.setText("7.50");
        txtPrecioKcl.setToolTipText("");
        txtPrecioKcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioKclActionPerformed(evt);
            }
        });
        txtPrecioKcl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioKclFocusGained(evt);
            }
        });
        txtPrecioKcl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKclKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioKcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 163, 100, -1));

        txtPrecioMap.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecioMap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioMap.setText("22.00");
        txtPrecioMap.setToolTipText("");
        txtPrecioMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioMapActionPerformed(evt);
            }
        });
        txtPrecioMap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioMapFocusGained(evt);
            }
        });
        txtPrecioMap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioMapKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 135, 100, -1));

        txtPrecioDap.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecioDap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioDap.setText("8.50");
        txtPrecioDap.setToolTipText("");
        txtPrecioDap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioDapActionPerformed(evt);
            }
        });
        txtPrecioDap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioDapFocusGained(evt);
            }
        });
        txtPrecioDap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioDapKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioDap, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 106, 100, -1));

        txtDapMezcla.setEditable(false);
        txtDapMezcla.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtDapMezcla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDapMezcla.setText("0.00");
        txtDapMezcla.setToolTipText("");
        txtDapMezcla.setEnabled(false);
        jPanel1.add(txtDapMezcla, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 106, 100, -1));

        txtMapMezcla.setEditable(false);
        txtMapMezcla.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtMapMezcla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMapMezcla.setText("0.00");
        txtMapMezcla.setToolTipText("");
        txtMapMezcla.setEnabled(false);
        jPanel1.add(txtMapMezcla, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 135, 100, -1));

        txtKclMezcla.setEditable(false);
        txtKclMezcla.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtKclMezcla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKclMezcla.setText("0.00");
        txtKclMezcla.setToolTipText("");
        txtKclMezcla.setEnabled(false);
        jPanel1.add(txtKclMezcla, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 163, 100, -1));

        txtKmgMezcla.setEditable(false);
        txtKmgMezcla.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtKmgMezcla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKmgMezcla.setText("0.00");
        txtKmgMezcla.setToolTipText("");
        txtKmgMezcla.setEnabled(false);
        jPanel1.add(txtKmgMezcla, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 190, 100, -1));

        txtFosfoMezcla.setEditable(false);
        txtFosfoMezcla.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFosfoMezcla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFosfoMezcla.setText("0.00");
        txtFosfoMezcla.setToolTipText("");
        txtFosfoMezcla.setEnabled(false);
        jPanel1.add(txtFosfoMezcla, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 219, 100, -1));

        txtPotasioMezcla.setEditable(false);
        txtPotasioMezcla.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPotasioMezcla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPotasioMezcla.setText("0.00");
        txtPotasioMezcla.setToolTipText("");
        txtPotasioMezcla.setEnabled(false);
        jPanel1.add(txtPotasioMezcla, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 248, 100, -1));

        txtAmonioMezcla.setEditable(false);
        txtAmonioMezcla.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtAmonioMezcla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmonioMezcla.setText("0.00");
        txtAmonioMezcla.setToolTipText("");
        txtAmonioMezcla.setEnabled(false);
        jPanel1.add(txtAmonioMezcla, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 277, 100, -1));

        txtKmgMg.setEditable(false);
        txtKmgMg.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtKmgMg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKmgMg.setText("0.00");
        txtKmgMg.setToolTipText("");
        txtKmgMg.setEnabled(false);
        jPanel1.add(txtKmgMg, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 190, 100, -1));

        txtAmonioS.setEditable(false);
        txtAmonioS.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtAmonioS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmonioS.setText("0.00");
        txtAmonioS.setToolTipText("");
        txtAmonioS.setEnabled(false);
        jPanel1.add(txtAmonioS, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 277, 100, -1));

        txtKmgS.setEditable(false);
        txtKmgS.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtKmgS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKmgS.setText("0.00");
        txtKmgS.setToolTipText("");
        txtKmgS.setEnabled(false);
        jPanel1.add(txtKmgS, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 190, 100, -1));

        txtPotasioK.setEditable(false);
        txtPotasioK.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPotasioK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPotasioK.setText("0.00");
        txtPotasioK.setToolTipText("");
        txtPotasioK.setEnabled(false);
        jPanel1.add(txtPotasioK, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 248, 100, -1));

        txtKmgK.setEditable(false);
        txtKmgK.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtKmgK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKmgK.setText("0.00");
        txtKmgK.setToolTipText("");
        txtKmgK.setEnabled(false);
        jPanel1.add(txtKmgK, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 190, 100, -1));

        txtKclK.setEditable(false);
        txtKclK.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtKclK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKclK.setText("0.00");
        txtKclK.setToolTipText("");
        txtKclK.setEnabled(false);
        jPanel1.add(txtKclK, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 163, 100, -1));

        txtMapP.setEditable(false);
        txtMapP.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtMapP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMapP.setText("0.00");
        txtMapP.setToolTipText("");
        txtMapP.setEnabled(false);
        jPanel1.add(txtMapP, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 135, 100, -1));

        txtDapP.setEditable(false);
        txtDapP.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtDapP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDapP.setText("0.00");
        txtDapP.setToolTipText("");
        txtDapP.setEnabled(false);
        jPanel1.add(txtDapP, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 106, 100, -1));

        txtDapN.setEditable(false);
        txtDapN.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtDapN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDapN.setText("0.00");
        txtDapN.setToolTipText("");
        txtDapN.setEnabled(false);
        jPanel1.add(txtDapN, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 106, 100, -1));

        txtMapN.setEditable(false);
        txtMapN.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtMapN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMapN.setText("0.00");
        txtMapN.setToolTipText("");
        txtMapN.setEnabled(false);
        jPanel1.add(txtMapN, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 135, 100, -1));

        txtFosfoN.setEditable(false);
        txtFosfoN.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFosfoN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFosfoN.setText("0.00");
        txtFosfoN.setToolTipText("");
        txtFosfoN.setEnabled(false);
        jPanel1.add(txtFosfoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 219, 100, -1));

        txtAmonioN.setEditable(false);
        txtAmonioN.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtAmonioN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmonioN.setText("0.00");
        txtAmonioN.setToolTipText("");
        txtAmonioN.setEnabled(false);
        jPanel1.add(txtAmonioN, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 277, 100, -1));

        txtSumaN.setEditable(false);
        txtSumaN.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtSumaN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSumaN.setText("0.00");
        txtSumaN.setToolTipText("");
        txtSumaN.setEnabled(false);
        jPanel1.add(txtSumaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 332, 100, -1));

        txtSumaP.setEditable(false);
        txtSumaP.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtSumaP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSumaP.setText("0.00");
        txtSumaP.setToolTipText("");
        txtSumaP.setEnabled(false);
        jPanel1.add(txtSumaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 332, 100, -1));

        txtSumaK.setEditable(false);
        txtSumaK.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtSumaK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSumaK.setText("0.00");
        txtSumaK.setToolTipText("");
        txtSumaK.setEnabled(false);
        jPanel1.add(txtSumaK, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 332, 100, -1));

        txtSumaS.setEditable(false);
        txtSumaS.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtSumaS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSumaS.setText("0.00");
        txtSumaS.setToolTipText("");
        txtSumaS.setEnabled(false);
        jPanel1.add(txtSumaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 332, 100, -1));

        txtSumaMg.setEditable(false);
        txtSumaMg.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtSumaMg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSumaMg.setText("0.00");
        txtSumaMg.setToolTipText("");
        txtSumaMg.setEnabled(false);
        jPanel1.add(txtSumaMg, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 332, 100, -1));

        txtSumaKgM.setEditable(false);
        txtSumaKgM.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtSumaKgM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSumaKgM.setText("0.00");
        txtSumaKgM.setToolTipText("");
        txtSumaKgM.setEnabled(false);
        jPanel1.add(txtSumaKgM, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 332, 100, -1));

        lblPrecio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 51));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("Precio por TM");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 100, -1));

        lblManiobras.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblManiobras.setForeground(new java.awt.Color(0, 0, 51));
        lblManiobras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManiobras.setText("Maniobras");
        jPanel1.add(lblManiobras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, 100, -1));

        txtManiobras.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtManiobras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtManiobras.setText("180.00");
        txtManiobras.setToolTipText("");
        txtManiobras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtManiobrasFocusGained(evt);
            }
        });
        txtManiobras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManiobrasActionPerformed(evt);
            }
        });
        txtManiobras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtManiobrasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtManiobrasKeyTyped(evt);
            }
        });
        jPanel1.add(txtManiobras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 360, 100, -1));

        txtSumaPrecio.setEditable(false);
        txtSumaPrecio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtSumaPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSumaPrecio.setText("0.00");
        txtSumaPrecio.setToolTipText("");
        txtSumaPrecio.setEnabled(false);
        jPanel1.add(txtSumaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 330, 100, -1));

        lblPrecioTotal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPrecioTotal.setForeground(new java.awt.Color(0, 0, 51));
        lblPrecioTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioTotal.setText("Precio Total");
        jPanel1.add(lblPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, 100, -1));

        txtPrecioTotal.setEditable(false);
        txtPrecioTotal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPrecioTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioTotal.setText("0.00");
        txtPrecioTotal.setToolTipText("");
        txtPrecioTotal.setEnabled(false);
        jPanel1.add(txtPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 390, 100, -1));

        txtSumaKilos.setEditable(false);
        txtSumaKilos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtSumaKilos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSumaKilos.setText("0.00");
        txtSumaKilos.setToolTipText("");
        txtSumaKilos.setEnabled(false);
        jPanel1.add(txtSumaKilos, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 332, 100, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Total");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 330, 116, 25));

        lblAmonio.setBackground(new java.awt.Color(255, 255, 255));
        lblAmonio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblAmonio.setForeground(new java.awt.Color(0, 0, 102));
        lblAmonio.setText("S. de Amonio 22-00-00-24");
        jPanel1.add(lblAmonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 276, -1, 23));

        txtAmonio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtAmonio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmonio.setText("0.00");
        txtAmonio.setToolTipText("");
        txtAmonio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAmonioFocusGained(evt);
            }
        });
        txtAmonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmonioActionPerformed(evt);
            }
        });
        txtAmonio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAmonioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmonioKeyTyped(evt);
            }
        });
        jPanel1.add(txtAmonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 277, 100, -1));

        txtPotasio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtPotasio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPotasio.setText("0.00");
        txtPotasio.setToolTipText("");
        txtPotasio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPotasioFocusGained(evt);
            }
        });
        txtPotasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotasioActionPerformed(evt);
            }
        });
        txtPotasio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPotasioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPotasioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPotasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 248, 100, -1));

        lblPotasio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPotasio.setForeground(new java.awt.Color(0, 0, 102));
        lblPotasio.setText("S. de Potasio 00-00-50");
        jPanel1.add(lblPotasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 247, 156, 23));

        lblFosfo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblFosfo.setForeground(new java.awt.Color(0, 0, 102));
        lblFosfo.setText("Fosfonitrato 33-00-00");
        jPanel1.add(lblFosfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 218, 156, 23));

        txtFosfo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFosfo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFosfo.setText("0.00");
        txtFosfo.setToolTipText("");
        txtFosfo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFosfoFocusGained(evt);
            }
        });
        txtFosfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFosfoActionPerformed(evt);
            }
        });
        txtFosfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFosfoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFosfoKeyTyped(evt);
            }
        });
        jPanel1.add(txtFosfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 219, 100, -1));

        txtKmag.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtKmag.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKmag.setText("0.00");
        txtKmag.setToolTipText("");
        txtKmag.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtKmagFocusGained(evt);
            }
        });
        txtKmag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKmagActionPerformed(evt);
            }
        });
        txtKmag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKmagKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKmagKeyTyped(evt);
            }
        });
        jPanel1.add(txtKmag, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 190, 100, -1));

        lblKmag.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblKmag.setForeground(new java.awt.Color(0, 0, 102));
        lblKmag.setText("KMG 00-00-22-11-22");
        jPanel1.add(lblKmag, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 189, 156, 23));

        lblKcl.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblKcl.setForeground(new java.awt.Color(0, 0, 102));
        lblKcl.setText("KCL 00-00-60");
        jPanel1.add(lblKcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 165, 156, -1));

        lblMap.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblMap.setForeground(new java.awt.Color(0, 0, 102));
        lblMap.setText("MAP 10-50-00");
        jPanel1.add(lblMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 134, 156, 23));

        txtKcl.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtKcl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKcl.setText("0.00");
        txtKcl.setToolTipText("");
        txtKcl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtKclFocusGained(evt);
            }
        });
        txtKcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKclActionPerformed(evt);
            }
        });
        txtKcl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKclKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKclKeyTyped(evt);
            }
        });
        jPanel1.add(txtKcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 163, 100, -1));

        txtMap.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtMap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMap.setText("0.00");
        txtMap.setToolTipText("");
        txtMap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMapFocusGained(evt);
            }
        });
        txtMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMapActionPerformed(evt);
            }
        });
        txtMap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMapKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMapKeyTyped(evt);
            }
        });
        jPanel1.add(txtMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 135, 100, -1));

        txtDap.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtDap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDap.setText("0.00");
        txtDap.setToolTipText("");
        txtDap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDapFocusGained(evt);
            }
        });
        txtDap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDapActionPerformed(evt);
            }
        });
        txtDap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDapKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDapKeyTyped(evt);
            }
        });
        jPanel1.add(txtDap, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 106, 100, -1));

        lblDap.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDap.setForeground(new java.awt.Color(0, 0, 102));
        lblDap.setText("DAP 18-46-00");
        jPanel1.add(lblDap, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 105, 156, 23));

        lblPrecioTotal1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPrecioTotal1.setForeground(new java.awt.Color(0, 0, 51));
        lblPrecioTotal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioTotal1.setText("por TM");
        jPanel1.add(lblPrecioTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 400, 100, -1));

        lblPrecioVenta2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPrecioVenta2.setForeground(new java.awt.Color(0, 0, 51));
        lblPrecioVenta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioVenta2.setText("TM");
        jPanel1.add(lblPrecioVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 66, -1));

        txtCantidadDap.setEditable(false);
        txtCantidadDap.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtCantidadDap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadDap.setToolTipText("");
        txtCantidadDap.setEnabled(false);
        jPanel1.add(txtCantidadDap, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 100, 66, -1));

        txtCantidadUrea.setEditable(false);
        txtCantidadUrea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtCantidadUrea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadUrea.setToolTipText("");
        txtCantidadUrea.setEnabled(false);
        txtCantidadUrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadUreaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadUrea, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 70, 66, -1));

        txtCantidadMap.setEditable(false);
        txtCantidadMap.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtCantidadMap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadMap.setToolTipText("");
        txtCantidadMap.setEnabled(false);
        jPanel1.add(txtCantidadMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 130, 66, -1));

        txtCantidadKcl.setEditable(false);
        txtCantidadKcl.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtCantidadKcl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadKcl.setToolTipText("");
        txtCantidadKcl.setEnabled(false);
        jPanel1.add(txtCantidadKcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 160, 66, -1));

        txtCantidadKmag.setEditable(false);
        txtCantidadKmag.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtCantidadKmag.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadKmag.setToolTipText("");
        txtCantidadKmag.setEnabled(false);
        jPanel1.add(txtCantidadKmag, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 190, 66, -1));

        txtCantidadFosfo.setEditable(false);
        txtCantidadFosfo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtCantidadFosfo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadFosfo.setToolTipText("");
        txtCantidadFosfo.setEnabled(false);
        jPanel1.add(txtCantidadFosfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 220, 66, -1));

        txtCantidadPotasio.setEditable(false);
        txtCantidadPotasio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtCantidadPotasio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadPotasio.setToolTipText("");
        txtCantidadPotasio.setEnabled(false);
        jPanel1.add(txtCantidadPotasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 250, 66, -1));

        txtCantidadAmonio.setEditable(false);
        txtCantidadAmonio.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtCantidadAmonio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadAmonio.setToolTipText("");
        txtCantidadAmonio.setEnabled(false);
        jPanel1.add(txtCantidadAmonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 280, 66, -1));

        lblPrecioVenta3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPrecioVenta3.setForeground(new java.awt.Color(0, 0, 51));
        lblPrecioVenta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioVenta3.setText("Disponibles");
        jPanel1.add(lblPrecioVenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fórmula En Porcentajes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Unidades de Fórmula en %");

        lblNitrogeno1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNitrogeno1.setForeground(new java.awt.Color(0, 0, 102));
        lblNitrogeno1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNitrogeno1.setText("Nitrógeno (N)");

        txtFormulaN.setEditable(false);
        txtFormulaN.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFormulaN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFormulaN.setText("0.00");
        txtFormulaN.setToolTipText("");

        lblFosforo1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblFosforo1.setForeground(new java.awt.Color(0, 0, 102));
        lblFosforo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFosforo1.setText("Fósforo (P)");

        txtFormulaP.setEditable(false);
        txtFormulaP.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFormulaP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFormulaP.setText("0.00");
        txtFormulaP.setToolTipText("");

        lblPotasio1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPotasio1.setForeground(new java.awt.Color(0, 0, 102));
        lblPotasio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPotasio1.setText("Potasio (K)");

        txtFormulaK.setEditable(false);
        txtFormulaK.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFormulaK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFormulaK.setText("0.00");
        txtFormulaK.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Azufre  (S)");

        txtFormulaS.setEditable(false);
        txtFormulaS.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFormulaS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFormulaS.setText("0.00");
        txtFormulaS.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Magnesio (MG)");

        txtFormulaMg.setEditable(false);
        txtFormulaMg.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFormulaMg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFormulaMg.setText("0.00");
        txtFormulaMg.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFormulaN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFormulaP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFormulaK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFormulaS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFormulaMg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNitrogeno1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFosforo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPotasio1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addComponent(lblPotasio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFosforo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNitrogeno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormulaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormulaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormulaK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormulaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormulaMg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblToneladas1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblToneladas1.setForeground(new java.awt.Color(0, 0, 51));
        lblToneladas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToneladas1.setText("Id Producto");

        lblToneladas.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblToneladas.setForeground(new java.awt.Color(0, 0, 51));
        lblToneladas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToneladas.setText("Toneladas");

        txtIdProducto.setEditable(false);

        lblAlmacen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAlmacen.setForeground(new java.awt.Color(0, 0, 51));
        lblAlmacen.setText("Id Almacén");

        txtIdAlmacen.setEditable(false);

        comboAlmacenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlmacenesActionPerformed(evt);
            }
        });

        lblTotal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 51));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("0.00");
        txtTotal.setToolTipText("");
        txtTotal.setEnabled(false);

        txtToneladas.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtToneladas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtToneladas.setText("0.00");
        txtToneladas.setToolTipText("");
        txtToneladas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtToneladasFocusGained(evt);
            }
        });
        txtToneladas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtToneladasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtToneladasKeyTyped(evt);
            }
        });

        txtRealizarM.setBackground(new java.awt.Color(102, 102, 255));
        txtRealizarM.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtRealizarM.setForeground(new java.awt.Color(255, 255, 255));
        txtRealizarM.setText("Registrar Mezcla");
        txtRealizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRealizarMActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/mezcla3.0.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1315, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblToneladas1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblToneladas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtToneladas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(comboAlmacenes, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRealizarM, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblToneladas)
                            .addComponent(txtToneladas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblToneladas1)
                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlmacen)
                            .addComponent(txtIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRealizarM, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboAlmacenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento de selección de selección de datos en la casilla de urea
     * @param evt 
     */
    private void txtUreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUreaFocusGained

        txtUrea.selectAll();

    }//GEN-LAST:event_txtUreaFocusGained

    /**
     * Envía el enfoque a la casilla Dap al presionar la tecla de salto de linea.
     * @param evt 
     */
    private void txtUreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUreaActionPerformed

        txtDap.requestFocus();

    }//GEN-LAST:event_txtUreaActionPerformed

    /**
     * Formatea el texto contenido en la casilla UreaK cuando se activa el evento de soltar tecla desde la casilla Urea
     * @param evt 
     */
    private void txtUreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUreaKeyReleased
        
        if (!txtUrea.getText().isEmpty()){
            f.setUreaK(Double.parseDouble(txtUrea.getText()));
            txtUreaN.setText(String.format("%.2f", f.ureaNitro()));
        } else {
            txtUrea.setText("0.00");
            f.setUreaK(0);
            txtUreaN.setText(String.format("%.2f", f.ureaNitro()));
            txtUrea.selectAll();
        }
        txtSumaKilos.setText(String.format("%.2f", f.sumaKilosCalculo()));
        txtSumaKgM.setText(String.format("%.2f", f.sumaKilosMezcla()));
        System.out.println("en el keyreleased....");
        //System.out.println(f.sumaNitrogeno(Double.parseDouble(txtUreaN.getText()), Double.parseDouble(txtDapN.getText()), Double.parseDouble(txtMapN.getText()), Double.parseDouble(txtFosfoN.getText()), Double.parseDouble(txtAmonioN.getText())));
        operacionesNitrogeno();
        System.out.println("paso operacionesNitrogeno");
        operacionesMezcla();
    }//GEN-LAST:event_txtUreaKeyReleased

    /**
     * Evita que se ingrese mas de un punto a la casilla urea y limita el tamaño a 7 caracteres.
     * @param evt 
     */
    private void txtUreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUreaKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtUrea.getText().contains(".")){

            evt.consume();

        }

        if(txtUrea.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtUreaKeyTyped

    /**
     * Evento de selección de datos en la casilla de Precio Urea
     * @param evt 
     */
    private void txtPrecioUreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioUreaFocusGained

        txtPrecioUrea.selectAll();

    }//GEN-LAST:event_txtPrecioUreaFocusGained

    /**
     * Envía el enfoque a la casilla precio Dap al presionar la tecla de salto de linea.
     * @param evt 
     */
    private void txtPrecioUreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUreaActionPerformed

        txtPrecioDap.requestFocus();

    }//GEN-LAST:event_txtPrecioUreaActionPerformed

    /**
     * Si la casilla de urea no esta vacía mostrará el costo de la urea en la casilla de precio de urea.
     * @param evt 
     */
    private void txtPrecioUreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUreaKeyReleased

        if(txtPrecioUrea.getText().isEmpty()) {

            txtPrecioUrea.setText("5.50");

        }

    }//GEN-LAST:event_txtPrecioUreaKeyReleased

    /**
     * Evita que se ingrese mas de un punto a la casilla urea y limita el tamaño a 7 caracteres.
     * @param evt 
     */
    private void txtPrecioUreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUreaKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtPrecioUrea.getText().contains(".")){

            evt.consume();

        }

        if(txtPrecioUrea.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtPrecioUreaKeyTyped

    /**
     * Evento de selección de datos en la casilla de Precio de amonio.
     * @param evt 
     */
    private void txtPrecioAmonioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioAmonioFocusGained

        txtPrecioAmonio.selectAll();

    }//GEN-LAST:event_txtPrecioAmonioFocusGained

    /**
     * Envía el enfoque a la casilla precio txtManiobras al presionar la tecla de salto de linea.
     * @param evt 
     */
    private void txtPrecioAmonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioAmonioActionPerformed

        txtManiobras.requestFocus();

    }//GEN-LAST:event_txtPrecioAmonioActionPerformed

    /**
     * Evita que se ingrese mas de un punto en la casilla precioAmonio y limita el tamaño a 7 caracteres.
     * @param evt 
     */
    private void txtPrecioAmonioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioAmonioKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtPrecioAmonio.getText().contains(".")){

            evt.consume();

        }

        if(txtPrecioAmonio.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtPrecioAmonioKeyTyped

    /**
     * Evento de selección de datos en la casilla de txtPrecioPotasio.
     * @param evt 
     */
    private void txtPrecioPotasioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioPotasioFocusGained

        txtPrecioPotasio.selectAll();

    }//GEN-LAST:event_txtPrecioPotasioFocusGained

    /**
     * Envía el enfoque a la casilla precio txtPrecioAmonio al presionar la tecla de salto de linea.
     * @param evt 
     */
    private void txtPrecioPotasioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioPotasioActionPerformed

        txtPrecioAmonio.requestFocus();

    }//GEN-LAST:event_txtPrecioPotasioActionPerformed

    /**
     * Evita que se ingrese mas de un punto en la casilla txtPrecioPotasio y limita el tamaño a 7 caracteres.
     * @param evt 
     */
    private void txtPrecioPotasioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioPotasioKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtPrecioPotasio.getText().contains(".")){

            evt.consume();

        }

        if(txtPrecioPotasio.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtPrecioPotasioKeyTyped

    /**
     * Evento de selección de datos en la casilla de txtPrecioFosfo.
     * @param evt 
     */
    private void txtPrecioFosfoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFosfoFocusGained

        txtPrecioFosfo.selectAll();

    }//GEN-LAST:event_txtPrecioFosfoFocusGained

    /**
     * Envía el enfoque a la casilla precio txtPrecioPotasio al presionar la tecla de salto de linea.
     * @param evt 
     */
    private void txtPrecioFosfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioFosfoActionPerformed

        txtPrecioPotasio.requestFocus();

    }//GEN-LAST:event_txtPrecioFosfoActionPerformed

    /**
     * Evita que se ingrese mas de un punto en la casilla txtPrecioFosfo y limita el tamaño a 7 caracteres.
     * @param evt 
     */
    private void txtPrecioFosfoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioFosfoKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtPrecioFosfo.getText().contains(".")){

            evt.consume();

        }

        if(txtFosfo.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtPrecioFosfoKeyTyped

    /**
     * Evento de selección de datos en la casilla de txtPrecioKmag.
     * @param evt 
     */
    private void txtPrecioKmagFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioKmagFocusGained

        txtPrecioKmag.selectAll();

    }//GEN-LAST:event_txtPrecioKmagFocusGained

    /**
     * Envía el enfoque a la casilla precio txtPrecioFosfo al presionar la tecla de salto de linea.
     * @param evt 
     */
    private void txtPrecioKmagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioKmagActionPerformed

        txtPrecioFosfo.requestFocus();

    }//GEN-LAST:event_txtPrecioKmagActionPerformed

    /**
     * Evita que se ingrese mas de un punto en la casilla txtPrecioKmag y limita el tamaño a 7 caracteres.
     * @param evt 
     */
    private void txtPrecioKmagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKmagKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtPrecioKmag.getText().contains(".")){

            evt.consume();

        }

        if(txtPrecioKmag.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtPrecioKmagKeyTyped

    /**
     * Evento de selección de datos en la casilla de txtPrecioKcl.
     * @param evt 
     */
    private void txtPrecioKclFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioKclFocusGained

        txtPrecioKcl.selectAll();

    }//GEN-LAST:event_txtPrecioKclFocusGained

    /**
     * Envía el enfoque a la casilla precio txtPrecioKmag al presionar la tecla de salto de linea.
     * @param evt 
     */
    private void txtPrecioKclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioKclActionPerformed

        txtPrecioKmag.requestFocus();

    }//GEN-LAST:event_txtPrecioKclActionPerformed

    /**
     * Evita que se ingrese mas de un punto en la casilla txtPrecioKcl y limita el tamaño a 7 caracteres.
     * @param evt 
     */
    private void txtPrecioKclKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKclKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtPrecioKcl.getText().contains(".")){

            evt.consume();

        }

        if(txtPrecioKcl.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtPrecioKclKeyTyped

    /**
     * Evento de selección de datos en la casilla de txtPrecioMap.
     * @param evt 
     */
    private void txtPrecioMapFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioMapFocusGained

        txtPrecioMap.selectAll();

    }//GEN-LAST:event_txtPrecioMapFocusGained

    /**
     * Envía el enfoque a la casilla precio txtPrecioKcl al presionar la tecla de salto de linea.
     * @param evt 
     */
    private void txtPrecioMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioMapActionPerformed

        txtPrecioKcl.requestFocus();

    }//GEN-LAST:event_txtPrecioMapActionPerformed

    /**
     * Evita que se ingrese mas de un punto en la casilla txtPrecioMap y limita el tamaño a 7 caracteres.
     * @param evt 
     */
    private void txtPrecioMapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioMapKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtPrecioMap.getText().contains(".")){

            evt.consume();

        }

        if(txtPrecioMap.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtPrecioMapKeyTyped

    /**
     * Evento de selección de datos en la casilla de txtPrecioDap.
     * @param evt 
     */
    private void txtPrecioDapFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioDapFocusGained

        txtPrecioDap.selectAll();

    }//GEN-LAST:event_txtPrecioDapFocusGained

    /**
     * Envía el enfoque a la casilla precio txtPrecioKcl al presionar la tecla de salto de linea.
     * @param evt 
     */
    private void txtPrecioDapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioDapActionPerformed

        txtPrecioMap.requestFocus();

    }//GEN-LAST:event_txtPrecioDapActionPerformed

    /**
     * Evita que se ingrese mas de un punto en la casilla txtPrecioMap y limita el tamaño a 7 caracteres.
     * @param evt 
     */
    private void txtPrecioDapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioDapKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtPrecioDap.getText().contains(".")){

            evt.consume();

        }

        if(txtPrecioDap.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtPrecioDapKeyTyped

    private void txtManiobrasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtManiobrasFocusGained

        txtManiobras.selectAll();

    }//GEN-LAST:event_txtManiobrasFocusGained

    private void txtManiobrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManiobrasActionPerformed

        txtToneladas.requestFocus();

    }//GEN-LAST:event_txtManiobrasActionPerformed

    private void txtManiobrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtManiobrasKeyReleased

        if(!txtManiobras.getText().isEmpty()) {

            txtPrecioTotal.setText(String.format("%.2f", f.precioTotal(Double.parseDouble(txtManiobras.getText()))));

        } else {

            txtManiobras.setText("180.00");

        }

    }//GEN-LAST:event_txtManiobrasKeyReleased

    private void txtManiobrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtManiobrasKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtManiobras.getText().contains(".")){

            evt.consume();

        }

        if(txtManiobras.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtManiobrasKeyTyped

    private void txtAmonioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmonioFocusGained

        txtAmonio.selectAll();

    }//GEN-LAST:event_txtAmonioFocusGained

    private void txtAmonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmonioActionPerformed

        txtManiobras.requestFocus();

    }//GEN-LAST:event_txtAmonioActionPerformed

    private void txtAmonioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmonioKeyReleased

        if (!txtAmonio.getText().isEmpty()){

            f.setAmonioK(Double.parseDouble(txtAmonio.getText()));

            txtAmonioN.setText(String.format("%.2f", f.amonioNitro()));

            txtAmonioS.setText(String.format("%.2f", f.amonioAzufre()));

        } else {

            txtAmonio.setText("0.00");

            f.setAmonioK(0);

            txtAmonioN.setText(String.format("%.2f", f.amonioNitro()));

            txtAmonioS.setText(String.format("%.2f", f.amonioAzufre()));

            txtAmonio.selectAll();

        }

        txtSumaKilos.setText(String.format("%.2f", f.sumaKilosCalculo()));

        txtSumaKgM.setText(String.format("%.2f", f.sumaKilosMezcla()));

        operacionesNitrogeno();

        operacionesAzufre();

        operacionesMezcla();

    }//GEN-LAST:event_txtAmonioKeyReleased

    private void txtAmonioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmonioKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtAmonio.getText().contains(".")){

            evt.consume();

        }

        if(txtAmonio.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtAmonioKeyTyped

    private void txtPotasioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPotasioFocusGained

        txtPotasio.selectAll();

    }//GEN-LAST:event_txtPotasioFocusGained

    private void txtPotasioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotasioActionPerformed

        txtAmonio.requestFocus();

    }//GEN-LAST:event_txtPotasioActionPerformed

    private void txtPotasioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPotasioKeyReleased

        if (!txtPotasio.getText().isEmpty()){

            f.setPotasioK(Double.parseDouble(txtPotasio.getText()));

            txtPotasioK.setText(String.format("%.2f", f.potasioPotasio()));

        } else {

            txtPotasio.setText("0.00");

            f.setPotasioK(0);

            txtPotasioK.setText(String.format("%.2f", f.potasioPotasio()));

            txtPotasio.selectAll();

        }

        txtSumaKilos.setText(String.format("%.2f", f.sumaKilosCalculo()));

        txtSumaKgM.setText(String.format("%.2f", f.sumaKilosMezcla()));

        operacionesPotasio();

        operacionesMezcla();

    }//GEN-LAST:event_txtPotasioKeyReleased

    private void txtPotasioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPotasioKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtPotasio.getText().contains(".")){

            evt.consume();

        }

        if(txtPotasio.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtPotasioKeyTyped

    private void txtFosfoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFosfoFocusGained

        txtFosfo.selectAll();

    }//GEN-LAST:event_txtFosfoFocusGained

    private void txtFosfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFosfoActionPerformed

        txtPotasio.requestFocus();
    }//GEN-LAST:event_txtFosfoActionPerformed

    private void txtFosfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFosfoKeyReleased

        if (!txtFosfo.getText().isEmpty()){

            f.setFosfoK(Double.parseDouble(txtFosfo.getText()));

            txtFosfoN.setText(String.format("%.2f", f.fosfoNitro()));

        } else {

            txtFosfo.setText("0.00");

            f.setFosfoK(0);

            txtFosfoN.setText(String.format("%.2f", f.fosfoNitro()));

            txtFosfo.selectAll();

        }

        txtSumaKilos.setText(String.format("%.2f", f.sumaKilosCalculo()));

        txtSumaKgM.setText(String.format("%.2f", f.sumaKilosMezcla()));

        operacionesNitrogeno();

        operacionesMezcla();

    }//GEN-LAST:event_txtFosfoKeyReleased

    private void txtFosfoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFosfoKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtFosfo.getText().contains(".")){

            evt.consume();

        }

        if(txtFosfo.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtFosfoKeyTyped

    private void txtKmagFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKmagFocusGained

        txtKmag.selectAll();

    }//GEN-LAST:event_txtKmagFocusGained

    private void txtKmagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKmagActionPerformed

        txtFosfo.requestFocus();

    }//GEN-LAST:event_txtKmagActionPerformed

    private void txtKmagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKmagKeyReleased

        if (!txtKmag.getText().isEmpty()){

            f.setKmagK(Double.parseDouble(txtKmag.getText()));

            txtKmgK.setText(String.format("%.2f", f.kmagPotasio()));

            txtKmgS.setText(String.format("%.2f", f.kmagAzufre()));

            txtKmgMg.setText(String.format("%.2f", f.kmagMagnesio()));

        } else {

            txtKmag.setText("0.00");

            f.setKmagK(0);

            txtKmgK.setText(String.format("%.2f", f.kmagPotasio()));

            txtKmgS.setText(String.format("%.2f", f.kmagAzufre()));

            txtKmgMg.setText(String.format("%.2f", f.kmagMagnesio()));

            txtKmag.selectAll();

        }

        txtSumaKilos.setText(String.format("%.2f", f.sumaKilosCalculo()));

        txtSumaKgM.setText(String.format("%.2f", f.sumaKilosMezcla()));

        operacionesPotasio();

        operacionesAzufre();

        operacionesMagnesio();

        operacionesMezcla();

    }//GEN-LAST:event_txtKmagKeyReleased

    private void txtKmagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKmagKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtKmag.getText().contains(".")){

            evt.consume();

        }

        if(txtKmag.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtKmagKeyTyped

    private void txtKclFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKclFocusGained

        txtKcl.selectAll();

    }//GEN-LAST:event_txtKclFocusGained

    private void txtKclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKclActionPerformed

        txtKmag.requestFocus();

    }//GEN-LAST:event_txtKclActionPerformed

    private void txtKclKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKclKeyReleased

        if (!txtKcl.getText().isEmpty()){

            f.setKclK(Double.parseDouble(txtKcl.getText()));

            txtKclK.setText(String.format("%.2f", f.kclPotasio()));

        } else {

            txtKcl.setText("0.00");

            f.setKclK(0);

            txtKclK.setText(String.format("%.2f", f.kclPotasio()));

            txtKcl.selectAll();

        }

        txtSumaKilos.setText(String.format("%.2f", f.sumaKilosCalculo()));

        txtSumaKgM.setText(String.format("%.2f", f.sumaKilosMezcla()));

        operacionesPotasio();

        operacionesMezcla();

    }//GEN-LAST:event_txtKclKeyReleased

    private void txtKclKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKclKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtKcl.getText().contains(".")){

            evt.consume();

        }

        if(txtKcl.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtKclKeyTyped

    private void txtMapFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMapFocusGained

        txtMap.selectAll();

    }//GEN-LAST:event_txtMapFocusGained

    private void txtMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMapActionPerformed

        txtKcl.requestFocus();

    }//GEN-LAST:event_txtMapActionPerformed

    private void txtMapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMapKeyReleased

        if (!txtMap.getText().isEmpty()){

            f.setMapK(Double.parseDouble(txtMap.getText()));

            txtMapN.setText(String.format("%.2f", f.mapNitro()));

            txtMapP.setText(String.format("%.2f", f.mapFosforo()));

        } else {

            txtMap.setText("0.00");

            f.setMapK(0);

            txtMapN.setText(String.format("%.2f", f.mapNitro()));

            txtMapP.setText(String.format("%.2f", f.mapFosforo()));

            txtMap.selectAll();

        }

        txtSumaKilos.setText(String.format("%.2f", f.sumaKilosCalculo()));

        txtSumaKgM.setText(String.format("%.2f", f.sumaKilosMezcla()));

        operacionesNitrogeno();

        operacionesFosforo();

        operacionesMezcla();

    }//GEN-LAST:event_txtMapKeyReleased

    private void txtMapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMapKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtMap.getText().contains(".")){

            evt.consume();

        }

        if(txtMap.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtMapKeyTyped

    private void txtDapFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDapFocusGained

        txtDap.selectAll();

    }//GEN-LAST:event_txtDapFocusGained

    private void txtDapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDapActionPerformed

        txtMap.requestFocus();

    }//GEN-LAST:event_txtDapActionPerformed

    private void txtDapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDapKeyReleased

        if (!txtDap.getText().isEmpty()){

            f.setDapK(Double.parseDouble(txtDap.getText()));

            txtDapN.setText(String.format("%.2f", f.dapNitro()));

            txtDapP.setText(String.format("%.2f", f.dapFosforo()));

        } else {

            txtDap.setText("0.00");

            f.setDapK(0);

            txtDapN.setText(String.format("%.2f", f.dapNitro()));

            txtDapP.setText(String.format("%.2f", f.dapFosforo()));

            txtDap.selectAll();

        }

        txtSumaKilos.setText(String.format("%.2f", f.sumaKilosCalculo()));

        txtSumaKgM.setText(String.format("%.2f", f.sumaKilosMezcla()));

        operacionesNitrogeno();

        operacionesFosforo();

        operacionesMezcla();

    }//GEN-LAST:event_txtDapKeyReleased

    private void txtDapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDapKeyTyped

        validacion(evt);

        if(evt.getKeyChar() == '.' && txtDap.getText().contains(".")){

            evt.consume();

        }

        if(txtDap.getText().length()>=7) {

            evt.consume();
            getToolkit().beep();

        }

    }//GEN-LAST:event_txtDapKeyTyped

    private void txtToneladasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtToneladasFocusGained

        txtToneladas.selectAll();

    }//GEN-LAST:event_txtToneladasFocusGained

    private void txtToneladasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtToneladasKeyReleased

        if (!txtToneladas.getText().isEmpty()) {
            Double txtTonelada = Double.parseDouble(txtToneladas.getText());
            Double txtPrecioTota = Double.parseDouble(txtPrecioTotal.getText());
            Double total = txtTonelada * txtPrecioTota;
            txtTotal.setText(String.valueOf(total));
        }
        



/*        if(!txtToneladas.getText().isEmpty()) {

            txtTotal.setText(String.format("%.2f", f.precioTotalTm(Double.parseDouble(txtToneladas.getText()))));

        } else {

            txtToneladas.setText("0.00");

        }*/

    }//GEN-LAST:event_txtToneladasKeyReleased

    private void txtToneladasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtToneladasKeyTyped
        validacion(evt);
        if(evt.getKeyChar() == '.' && txtToneladas.getText().contains(".")){
            evt.consume();
        }
        if(txtToneladas.getText().length()>=7) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtToneladasKeyTyped

    
    
    public String generarNombre () {
        String nombreP = "";
        Double FormulaN = Double.parseDouble(txtFormulaN.getText());
        Double FormulaP = Double.parseDouble(txtFormulaP.getText());
        Double FormulaK = Double.parseDouble(txtFormulaK.getText());
        Double FormulaS = Double.parseDouble(txtFormulaS.getText());
        Double FormulaMg = Double.parseDouble(txtFormulaMg.getText());
        Boolean booleanFormulaN = false;
        Boolean booleanFormulaP = false;
        Boolean booleanFormulaK = false;
        Boolean booleanFormulaS = false;
        Boolean booleanFormulaMg = false;
        
        if (FormulaN!=0) { /*Si tiene valores*/
            booleanFormulaN=true;
        }
        if (FormulaP!=0) { /*Si tiene valores*/
            booleanFormulaP=true;
        }
        if (FormulaK!=0) { /*Si tiene valores*/
            booleanFormulaK=true;
        }
        if (FormulaS!=0) { /*Si tiene valores*/
            booleanFormulaS=true;
        }
        if (FormulaMg!=0) { /*Si tiene valores*/
            booleanFormulaMg=true;
        }
        
        if (booleanFormulaN) {
            nombreP = "Nitrogeno-"+String.valueOf(FormulaN)+"%";
        }
        if (booleanFormulaP) {
            nombreP += "-Fosforo-"+String.valueOf(FormulaP)+"%";
        }
        if (booleanFormulaK) {
            nombreP += " -Potasio-"+String.valueOf(FormulaK)+"%";
        }
        if (booleanFormulaS) {
            nombreP += "-Azufre-"+String.valueOf(FormulaS)+"%";
        }
        if (booleanFormulaMg) {
            nombreP += " -Magnesio-"+String.valueOf(FormulaMg)+"%";
        }
         System.out.println("nombreP " + nombreP ) ;
        return nombreP;
    }
    
    
    private void txtRealizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRealizarMActionPerformed
        String name = generarNombre();
        String totalTons = txtToneladas.getText();
        if (!name.isEmpty() && !totalTons.isEmpty() && Double.parseDouble(totalTons)!=0.00){            
            try {
            
            Double totalToneladas = Double.parseDouble(txtToneladas.getText());
            //almacenar PRODUCTO en producto
            producto.setNombre(generarNombre());
            producto.setDescripcion("Mezcla Personalizada");
            producto.setMedida("TM");
            producto.setPresentacion("Envasado");
            producto.setPrecioSugerido(Double.parseDouble(txtPrecioTotal.getText()));
            producto.registrarProducto();
                        //almacenar NUEVO PRODUCTO en almacen_producto
            almacenProd.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
            almacenProd.setIdProducto(Integer.parseInt(txtIdProducto.getText()));            
            almacenProd.setCantidad(Double.parseDouble(txtToneladas.getText()));
            almacenProd.registarAltaProducto();

            Double ureaKilos = Double.parseDouble(txtUreaMezcla.getText());
            Double ureaToneladas = (ureaKilos / 1000)*totalToneladas; 
            Double dapKilos = Double.parseDouble(txtDapMezcla.getText());
            Double dapToneladas = dapKilos / 1000*totalToneladas;
            Double mapKilos = Double.parseDouble(txtMapMezcla.getText());
            Double mapToneladas = mapKilos / 1000*totalToneladas;
            Double kclKilos = Double.parseDouble(txtKclMezcla.getText());
            Double kclToneladas = kclKilos / 1000*totalToneladas;
            Double kmgKilos = Double.parseDouble(txtKmgMezcla.getText());
            Double kmgToneladas = kmgKilos / 1000*totalToneladas;
            Double fosfoKilos = Double.parseDouble(txtFosfoMezcla.getText());
            Double fosfoToneladas = fosfoKilos / 1000*totalToneladas;   
            Double potaKilos = Double.parseDouble(txtPotasioMezcla.getText());
            Double potaToneladas = potaKilos / 1000*totalToneladas;
            Double amonKilos = Double.parseDouble(txtAmonioMezcla.getText());
            Double amonToneladas = amonKilos / 1000*totalToneladas;
            
            AlmacenProducto almacenProdUrea = new AlmacenProducto(conexion);
            AlmacenProducto almacenProdDap = new AlmacenProducto(conexion);
            AlmacenProducto almacenProdMap = new AlmacenProducto(conexion);
            AlmacenProducto almacenProdKcl = new AlmacenProducto(conexion);
            AlmacenProducto almacenProdKmg = new AlmacenProducto(conexion);
            AlmacenProducto almacenProdFosfo = new AlmacenProducto(conexion);
            AlmacenProducto almacenProdPota = new AlmacenProducto(conexion);
            AlmacenProducto almacenProdAmon = new AlmacenProducto(conexion);
            
            almacenProdUrea.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
            almacenProdUrea.setIdProducto(regresarIdProdUrea());
            almacenProdUrea.setCantidad(ureaToneladas);
            almacenProdUrea.registarSalidaProducto();
            
            almacenProdDap.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
            almacenProdDap.setIdProducto(regresarIdProdDap());
            almacenProdDap.setCantidad(dapToneladas);
            almacenProdDap.registarSalidaProducto();
            
            almacenProdMap.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
            almacenProdMap.setIdProducto(regresarIdProdMap());
            almacenProdMap.setCantidad(mapToneladas);
            almacenProdMap.registarSalidaProducto();
            
            almacenProdKcl.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
            almacenProdKcl.setIdProducto(regresarIdProdKcl());
            almacenProdKcl.setCantidad(kclToneladas);
            almacenProdKcl.registarSalidaProducto();
            
            almacenProdKmg.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
            almacenProdKmg.setIdProducto(regresarIdProdKmg());
            almacenProdKmg.setCantidad(kmgToneladas);
            almacenProdKmg.registarSalidaProducto();
            
            almacenProdFosfo.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
            almacenProdFosfo.setIdProducto(regresarIdProdFosfo());
            almacenProdFosfo.setCantidad(fosfoToneladas);
            almacenProdFosfo.registarSalidaProducto();
            
            almacenProdPota.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
            almacenProdPota.setIdProducto(regresarIdProdPota());
            almacenProdPota.setCantidad(potaToneladas);
            almacenProdPota.registarSalidaProducto();
            
            almacenProdAmon.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
            almacenProdAmon.setIdProducto(regresarIdProdAmon());
            almacenProdAmon.setCantidad(amonToneladas);      
            almacenProdAmon.registarSalidaProducto(); 
            
            JOptionPane.showMessageDialog(null,"Nueva mezcla creada");
            JOptionPane.showMessageDialog(null,"Inventario actualizado");
            ll.agregarAccion(date.toString(),"Creacion Nueva Mezcla");
            
            this.dispose();
            
        }catch (Exception e ) {}
            
        }else {
            JOptionPane.showMessageDialog(null,"Seleccione producto y cantidad");
        }

    }//GEN-LAST:event_txtRealizarMActionPerformed

    /**
     * Consulta la base de datos para obtener el id de producto utilizando el nombre del producto seleccionado.
     * @return retorna el id del producto.
     */
    public int regresarIdProdUrea () {
        int idProducto=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String productoo = "Urea";
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
     
    /**
     * Consulta la base de datos para obtener el id de almacén desde la tabla almacen producto utilizando el nombre de producto seleccionado.
     * @return retorna el id de almacen.
     */
    public int regresarIdAlmacenProdUrea () {
        int idAlmacen=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String nombreProd = "Urea";
        try{
        comando = conexion.getConexion().prepareStatement("select a.idAlmacen from almacen_producto a join producto p on a.idProducto = p.idProducto where p.nombre=?");
        comando.setString(1, nombreProd);
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
    
    /**
     * Consulta la base de datos para obtener el id de producto utilizando el nombre del producto seleccionado.
     * @return retorna el id del producto.
     */
    public int regresarIdProdDap () {
        int idProducto=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String productoo = "DAP";
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
     
    /**
     * Consulta la base de datos para obtener el id de almacén desde la tabla almacen producto utilizando el nombre de producto seleccionado.
     * @return retorna el id de almacen.
     */
    public int regresarIdAlmacenProdDap () {
        int idAlmacen=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String nombreProd = "DAP";
        try{
        comando = conexion.getConexion().prepareStatement("select a.idAlmacen from almacen_producto a join producto p on a.idProducto = p.idProducto where p.nombre=?");
        comando.setString(1, nombreProd);
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
    
    /**
     * Consulta la base de datos para obtener el id de producto utilizando el nombre del producto seleccionado.
     * @return retorna el id del producto.
     */
    public int regresarIdProdMap () {
        int idProducto=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String productoo = "MAP";
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
     
    /**
     * Consulta la base de datos para obtener el id de almacén desde la tabla almacen producto utilizando el nombre de producto seleccionado.
     * @return retorna el id de almacen.
     */
    public int regresarIdAlmacenProdMap () {
        int idAlmacen=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String nombreProd = "MAP";
        try{
        comando = conexion.getConexion().prepareStatement("select a.idAlmacen from almacen_producto a join producto p on a.idProducto = p.idProducto where p.nombre=?");
        comando.setString(1, nombreProd);
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
    
    /**
     * Consulta la base de datos para obtener el id de producto utilizando el nombre del producto seleccionado.
     * @return retorna el id del producto.
     */
    public int regresarIdProdKcl () {
        int idProducto=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String productoo = "KCL";
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
     
    /**
     * Consulta la base de datos para obtener el id de almacén desde la tabla almacen producto utilizando el nombre de producto seleccionado.
     * @return retorna el id de almacen.
     */
    public int regresarIdAlmacenProdKcl () {
        int idAlmacen=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String nombreProd = "KCL";
        try{
        comando = conexion.getConexion().prepareStatement("select a.idAlmacen from almacen_producto a join producto p on a.idProducto = p.idProducto where p.nombre=?");
        comando.setString(1, nombreProd);
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
    
    /**
     * Consulta la base de datos para obtener el id de producto utilizando el nombre del producto seleccionado.
     * @return retorna el id del producto.
     */
    public int regresarIdProdKmg () {
        int idProducto=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String productoo = "KMG";
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
     
    /**
     * Consulta la base de datos para obtener el id de almacén desde la tabla almacen producto utilizando el nombre de producto seleccionado.
     * @return retorna el id de almacen.
     */
    public int regresarIdAlmacenProdKmg () {
        int idAlmacen=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String nombreProd = "KMG";
        try{
        comando = conexion.getConexion().prepareStatement("select a.idAlmacen from almacen_producto a join producto p on a.idProducto = p.idProducto where p.nombre=?");
        comando.setString(1, nombreProd);
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
    
    /**
     * Consulta la base de datos para obtener el id de producto utilizando el nombre del producto seleccionado.
     * @return retorna el id del producto.
     */
    public int regresarIdProdFosfo () {
        int idProducto=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String productoo = "Fosfonitrato";
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
     
    /**
     * Consulta la base de datos para obtener el id de almacén desde la tabla almacen producto utilizando el nombre de producto seleccionado.
     * @return retorna el id de almacen.
     */
    public int regresarIdAlmacenProdFosfo () {
        int idAlmacen=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String nombreProd = "Fosfonitrato";
        try{
        comando = conexion.getConexion().prepareStatement("select a.idAlmacen from almacen_producto a join producto p on a.idProducto = p.idProducto where p.nombre=?");
        comando.setString(1, nombreProd);
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
    
    /**
     * Consulta la base de datos para obtener el id de producto utilizando el nombre del producto seleccionado.
     * @return retorna el id del producto.
     */
    public int regresarIdProdPota () {
        int idProducto=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String productoo = "S. de Potasio";
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
     
    /**
     * Consulta la base de datos para obtener el id de almacén desde la tabla almacen producto utilizando el nombre de producto seleccionado.
     * @return retorna el id de almacen.
     */
    public int regresarIdAlmacenProdPota () {
        int idAlmacen=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String nombreProd = "S. de Potasio";
        try{
        comando = conexion.getConexion().prepareStatement("select a.idAlmacen from almacen_producto a join producto p on a.idProducto = p.idProducto where p.nombre=?");
        comando.setString(1, nombreProd);
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
    
    /**
     * Consulta la base de datos para obtener el id de producto utilizando el nombre del producto seleccionado.
     * @return retorna el id del producto.
     */
    public int regresarIdProdAmon () {
        int idProducto=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String productoo = "S. de Amonio";
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
    
    /**
     * Consulta la base de datos para obtener el id de almacén desde la tabla almacen producto utilizando el nombre de producto seleccionado.
     * @return retorna el id de almacen.
     */
    public int regresarIdAlmacenProdAmon () {
        int idAlmacen=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String nombreProd = "S. de Amonio";
        try{
        comando = conexion.getConexion().prepareStatement("select a.idAlmacen from almacen_producto a join producto p on a.idProducto = p.idProducto where p.nombre=?");
        comando.setString(1, nombreProd);
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
    
    

    
    
    private void comboAlmacenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlmacenesActionPerformed
        txtIdAlmacen.setText(String.valueOf(regresarIdAlmacen()));
        
        txtCantidadUrea.setText(regresarCantidadesActual("1"));
        txtCantidadDap.setText(regresarCantidadesActual("2"));
        txtCantidadMap.setText(regresarCantidadesActual("3"));
        txtCantidadKcl.setText(regresarCantidadesActual("4"));
        txtCantidadKmag.setText(regresarCantidadesActual("5"));
        txtCantidadFosfo.setText(regresarCantidadesActual("6"));
        txtCantidadPotasio.setText(regresarCantidadesActual("7"));
        txtCantidadAmonio.setText(regresarCantidadesActual("8"));

    }//GEN-LAST:event_comboAlmacenesActionPerformed

    /**
     * Consulta en la base de datos para recuperar la unidad de medida del producto necesario.
     * @param idProducto Id del producto que se va consultar.
     * @return retorna la unidad de medida del producto.
     */
     public String regresarCantidadesActual (String idProducto) {
        String medidaProd=null;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try{
        comando = conexion.getConexion().prepareStatement("select ap.cantidad from almacen_producto ap join producto p on ap.idProducto = p.idProducto where ap.idProducto = ? and ap.idAlmacen = ?");
        comando.setString(1, idProducto);
        comando.setString(2, txtIdAlmacen.getText());
        ResultSet rs = comando.executeQuery();
        while(rs.next()){      
            medidaProd = rs.getString(1);
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return medidaProd;
    }    

     /**
      * Consulta los nombres de almacén en la base de datos y los carga en una lista desplegable.
      */
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
    
    /**
     * Consulta en la base de datos para obtener el id de almacen usando el nombre de almacén seleccionado.
     * @return retorna el id del almacén seleccionado
     */
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
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtIdProducto.setText(String.valueOf(producto.obtenerNoId())); 
        cargarComboAlmacenes();
        f.cleanFields();

    }//GEN-LAST:event_formInternalFrameOpened

    private void txtCantidadUreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadUreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadUreaActionPerformed
    
    /* 
    public boolean validarExistencias () {
        String ureaString = txtCantidadUrea.getText();
        
        if (!ureaString.isEmpty()){
           double urea = Double.parseDouble(txtUrea.getText());
           
        
        }
        
                
        double dap = Double.parseDouble(txtDap.getText());
        double map = Double.parseDouble(txtMap.getText());
        double kcl = Double.parseDouble(txtKcl.getText());
        double kmg = Double.parseDouble(txtKmag.getText());
        double fosfo = Double.parseDouble(txtFosfo.getText());
        double pota = Double.parseDouble(txtPotasio.getText());
        double amon = Double.parseDouble(txtAmonio.getText());
        
        if (urea < Double.parseDouble(txtCantidadUrea.getText())) {
        
        }
        
        return true;
        
    }*/
    
    
    /**
     * Suma las cantidades necesarias para la formula seleccionada.
     */
       public void operacionesMezcla() {
        Double suma = 0.00;
        Double mani = 0.00;
                
        txtUreaMezcla.setText(String.format("%.2f", f.kilosUreaMezcla()));
        
        txtTotalUrea.setText(String.format("%.2f", f.precioUrea(Double.parseDouble(txtPrecioUrea.getText()))));
        
        txtDapMezcla.setText(String.format("%.2f", f.kilosDapMezcla()));
        
        txtTotalDap.setText(String.format("%.2f", f.precioDap(Double.parseDouble(txtPrecioDap.getText()))));
        
        txtMapMezcla.setText(String.format("%.2f", f.kilosMapMezcla()));
        
        txtTotalMap.setText(String.format("%.2f", f.precioMap(Double.parseDouble(txtPrecioMap.getText()))));
        
        txtKclMezcla.setText(String.format("%.2f", f.kilosKclMezcla()));
        
        txtTotalKcl.setText(String.format("%.2f", f.precioKcl(Double.parseDouble(txtPrecioKcl.getText()))));
        
        txtKmgMezcla.setText(String.format("%.2f", f.kilosKmagMezcla()));
        
        txtTotalKmag.setText(String.format("%.2f", f.precioKmag(Double.parseDouble(txtPrecioKmag.getText()))));
        
        txtFosfoMezcla.setText(String.format("%.2f", f.kilosFosfoMezcla()));
        
        txtTotalFosfo.setText(String.format("%.2f", f.precioFosfo(Double.parseDouble(txtPrecioFosfo.getText()))));
        
        txtPotasioMezcla.setText(String.format("%.2f", f.kilosPotasioMezcla()));
        
        txtTotalPotasio.setText(String.format("%.2f", f.precioPotasio(Double.parseDouble(txtPrecioPotasio.getText()))));
        
        txtAmonioMezcla.setText(String.format("%.2f", f.kilosAmonioMezcla()));
        
        txtTotalAmonio.setText(String.format("%.2f", f.precioAmonio(Double.parseDouble(txtPrecioAmonio.getText()))));
        
        txtSumaPrecio.setText(String.format("%.2f", f.sumaPrecio()));
        
        
        suma = Double.parseDouble(txtSumaPrecio.getText());
        mani = Double.parseDouble(txtManiobras.getText());
        Double precioT = suma + mani;
        txtPrecioTotal.setText(String.valueOf(precioT));
   }
   
    /**
    * Calcula la cantidad de nitrogeno necesario para la formula seleccionada, ademas aplica un formato de 2 dígitos.
    */
   public void operacionesNitrogeno() {
       
       
        txtSumaN.setText(String.format("%.2f", f.sumaNitrogeno(Double.parseDouble(txtUreaN.getText()), Double.parseDouble(txtDapN.getText()), Double.parseDouble(txtMapN.getText()), Double.parseDouble(txtFosfoN.getText()), Double.parseDouble(txtAmonioN.getText()))));
        txtFormulaN.setText(String.format("%.2f", f.formulaNitrogeno()));
       
   }
   
   /**
    * Calcula la cantidad de fosforo necesario para la formula seleccionada, ademas aplica un formato de 2 dígitos.
    */
   public void operacionesFosforo() {
       
       txtSumaP.setText(String.format("%.2f", f.sumaFosforo(Double.parseDouble(txtDapP.getText()), Double.parseDouble(txtMapP.getText()))));
       
       txtFormulaP.setText(String.format("%.2f", f.formulaFosforo()));
       
   }
   
   /**
    * Calcula la cantidad de potasio necesario para la formula seleccionada, ademas aplica un formato de 2 dígitos.
    */
   public void operacionesPotasio() {
       
       txtSumaK.setText(String.format("%.2f", f.sumaPotasio(Double.parseDouble(txtKclK.getText()), Double.parseDouble(txtKmgK.getText()), Double.parseDouble(txtPotasioK.getText()))));
       
       txtFormulaK.setText(String.format("%.2f", f.formulaPotasio()));
       
   }
   
   /**
    * Calcula la cantidad de azufre necesario para la formula seleccionada, ademas aplica un formato de 2 dígitos.
    */
   public void operacionesAzufre() {
       
       txtSumaS.setText(String.format("%.2f", f.sumaAzufre(Double.parseDouble(txtKmgS.getText()), Double.parseDouble(txtAmonioS.getText()))));
       
       txtFormulaS.setText(String.format("%.2f", f.formulaAzufre()));
       
   }
   
   /**
    * Calcula la cantidad de magnesio necesario para la formula seleccionada, ademas aplica un formato de 2 dígitos.
    */
   public void operacionesMagnesio() {
       
       txtSumaMg.setText(String.format("%.2f", f.sumaMagenesio(Double.parseDouble(txtKmgMg.getText()))));
       
       txtFormulaMg.setText(String.format("%.2f", f.formulaMagnesio()));
       
   }
   
    public void validacion(java.awt.event.KeyEvent evt) {
       
          char Letra = evt.getKeyChar();
           
        if(!Character.isDigit(Letra) && !(((int)Letra) == 8) && !(((int)Letra) == 10) && !(((int)Letra) == 46)){

            evt.consume();

            JOptionPane.showMessageDialog(this, "Solo puedes ingresar números");

        } 
      
   }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAlmacenes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAlmacen;
    private javax.swing.JLabel lblAmonio;
    private javax.swing.JLabel lblDap;
    private javax.swing.JLabel lblFosfo;
    private javax.swing.JLabel lblFosforo1;
    private javax.swing.JLabel lblKcl;
    private javax.swing.JLabel lblKg;
    private javax.swing.JLabel lblKmag;
    private javax.swing.JLabel lblManiobras;
    private javax.swing.JLabel lblMap;
    private javax.swing.JLabel lblNitrogeno;
    private javax.swing.JLabel lblNitrogeno1;
    private javax.swing.JLabel lblPotasio;
    private javax.swing.JLabel lblPotasio1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecioTotal;
    private javax.swing.JLabel lblPrecioTotal1;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblPrecioVenta1;
    private javax.swing.JLabel lblPrecioVenta2;
    private javax.swing.JLabel lblPrecioVenta3;
    private javax.swing.JLabel lblToneladas;
    private javax.swing.JLabel lblToneladas1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUrea;
    private javax.swing.JTextField txtAmonio;
    private javax.swing.JTextField txtAmonioMezcla;
    private javax.swing.JTextField txtAmonioN;
    private javax.swing.JTextField txtAmonioS;
    private javax.swing.JTextField txtCantidadAmonio;
    private javax.swing.JTextField txtCantidadDap;
    private javax.swing.JTextField txtCantidadFosfo;
    private javax.swing.JTextField txtCantidadKcl;
    private javax.swing.JTextField txtCantidadKmag;
    private javax.swing.JTextField txtCantidadMap;
    private javax.swing.JTextField txtCantidadPotasio;
    private javax.swing.JTextField txtCantidadUrea;
    private javax.swing.JTextField txtDap;
    private javax.swing.JTextField txtDapMezcla;
    private javax.swing.JTextField txtDapN;
    private javax.swing.JTextField txtDapP;
    private javax.swing.JTextField txtFormulaK;
    private javax.swing.JTextField txtFormulaMg;
    private javax.swing.JTextField txtFormulaN;
    private javax.swing.JTextField txtFormulaP;
    private javax.swing.JTextField txtFormulaS;
    private javax.swing.JTextField txtFosfo;
    private javax.swing.JTextField txtFosfoMezcla;
    private javax.swing.JTextField txtFosfoN;
    private javax.swing.JTextField txtIdAlmacen;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtKcl;
    private javax.swing.JTextField txtKclK;
    private javax.swing.JTextField txtKclMezcla;
    private javax.swing.JTextField txtKmag;
    private javax.swing.JTextField txtKmgK;
    private javax.swing.JTextField txtKmgMezcla;
    private javax.swing.JTextField txtKmgMg;
    private javax.swing.JTextField txtKmgS;
    private javax.swing.JTextField txtManiobras;
    private javax.swing.JTextField txtMap;
    private javax.swing.JTextField txtMapMezcla;
    private javax.swing.JTextField txtMapN;
    private javax.swing.JTextField txtMapP;
    private javax.swing.JTextField txtPotasio;
    private javax.swing.JTextField txtPotasioK;
    private javax.swing.JTextField txtPotasioMezcla;
    private javax.swing.JTextField txtPrecioAmonio;
    private javax.swing.JTextField txtPrecioDap;
    private javax.swing.JTextField txtPrecioFosfo;
    private javax.swing.JTextField txtPrecioKcl;
    private javax.swing.JTextField txtPrecioKmag;
    private javax.swing.JTextField txtPrecioMap;
    private javax.swing.JTextField txtPrecioPotasio;
    private javax.swing.JTextField txtPrecioTotal;
    private javax.swing.JTextField txtPrecioUrea;
    private javax.swing.JButton txtRealizarM;
    private javax.swing.JTextField txtSumaK;
    private javax.swing.JTextField txtSumaKgM;
    private javax.swing.JTextField txtSumaKilos;
    private javax.swing.JTextField txtSumaMg;
    private javax.swing.JTextField txtSumaN;
    private javax.swing.JTextField txtSumaP;
    private javax.swing.JTextField txtSumaPrecio;
    private javax.swing.JTextField txtSumaS;
    private javax.swing.JTextField txtToneladas;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalAmonio;
    private javax.swing.JTextField txtTotalDap;
    private javax.swing.JTextField txtTotalFosfo;
    private javax.swing.JTextField txtTotalKcl;
    private javax.swing.JTextField txtTotalKmag;
    private javax.swing.JTextField txtTotalMap;
    private javax.swing.JTextField txtTotalPotasio;
    private javax.swing.JTextField txtTotalUrea;
    private javax.swing.JTextField txtUrea;
    private javax.swing.JTextField txtUreaMezcla;
    private javax.swing.JTextField txtUreaN;
    // End of variables declaration//GEN-END:variables
}
