
package vista;

import com.lowagie.text.pdf.parser.Matrix;
import java.util.Date;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Almacen;
import modelo.Conexion;
import modelo.Permisos;
import modelo.Producto;
import org.jfree.util.ObjectList;


public class ifrmTraspaso extends javax.swing.JInternalFrame {
    Main mp;
    Permisos permisos;
    Producto producto;
    JDesktopPane desk;
    Almacen alm;
    Conexion con;
    DefaultTableModel modeloTabla;
    
    public ifrmTraspaso(Main mp, JDesktopPane desk, Permisos permiso,Producto producto) {
        initComponents();
        this.con = new Conexion();
        this.mp = mp;
        this.permisos = permiso;
        this.producto = new Producto(con);
        this.alm = new Almacen(con);
        this.desk = desk;
        
        modeloTabla = new DefaultTableModel(){
            Class[] tipoColumn = {Integer.class,String.class,Double.class};
            boolean[] editColumn = {false,false,false};
            @Override
            public Class getColumnClass(int indColumn){
                return tipoColumn[indColumn];
            }
            @Override
            public boolean isCellEditable(int indFila, int indColum){
                return editColumn[indColum];
            }
        };
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre Producto");
        modeloTabla.addColumn("Cantidad");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscarArticulo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        panBotones = new javax.swing.JPanel();
        btnDummy = new javax.swing.JButton();
        btnDummy1 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panBG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fechaTraslado = new com.toedter.calendar.JDateChooser();
        panArticulos = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        btnBuscarArt = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDisponible = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        panAlmacenes = new javax.swing.JPanel();
        lblOrigen = new javax.swing.JLabel();
        comboOrigen = new javax.swing.JComboBox<String>();
        lblDestino = new javax.swing.JLabel();
        comboDestino = new javax.swing.JComboBox<String>();
        panFunciones = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        dummy1 = new javax.swing.JButton();
        dummy2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResumen = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        BuscarArticulo.setTitle("Inventario");
        BuscarArticulo.setMinimumSize(new java.awt.Dimension(493, 260));
        BuscarArticulo.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                BuscarArticuloWindowOpened(evt);
            }
        });
        BuscarArticulo.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaProductos.setBackground(new java.awt.Color(255, 255, 255));
        tablaProductos.setForeground(new java.awt.Color(0, 0, 102));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaProductos);

        panBotones.setBackground(new java.awt.Color(255, 255, 255));
        panBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panBotones.setLayout(new java.awt.GridLayout(1, 0));

        btnDummy.setBackground(new java.awt.Color(255, 255, 255));
        btnDummy.setBorderPainted(false);
        btnDummy.setContentAreaFilled(false);
        panBotones.add(btnDummy);

        btnDummy1.setBackground(new java.awt.Color(204, 204, 204));
        btnDummy1.setBorderPainted(false);
        btnDummy1.setContentAreaFilled(false);
        panBotones.add(btnDummy1);

        btnRegresar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 102));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panBotones.add(btnRegresar);

        btnSeleccionar.setBackground(new java.awt.Color(204, 255, 204));
        btnSeleccionar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(0, 0, 102));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        panBotones.add(btnSeleccionar);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Productos disponibles en el almacen seleccionado");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addComponent(panBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BuscarArticulo.getContentPane().add(jPanel2);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Traspasos");
        setMaximumSize(new java.awt.Dimension(444, 535));
        setMinimumSize(new java.awt.Dimension(444, 535));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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
                VentanaAbierta(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panBG.setBackground(new java.awt.Color(255, 255, 255));
        panBG.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Fecha de registro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fechaTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fechaTraslado, jLabel1});

        panArticulos.setBackground(new java.awt.Color(255, 255, 255));
        panArticulos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Artículos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblDescripcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 102));
        lblDescripcion.setText("Nombre");
        lblDescripcion.setToolTipText("");

        btnBuscarArt.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N
        btnBuscarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArtActionPerformed(evt);
            }
        });

        txtDescripcion.setEditable(false);

        lblCantidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 102));
        lblCantidad.setText("Cantidad");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Disponibles:");

        txtDisponible.setEditable(false);

        lblID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panArticulosLayout = new javax.swing.GroupLayout(panArticulos);
        panArticulos.setLayout(panArticulosLayout);
        panArticulosLayout.setHorizontalGroup(
            panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panArticulosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblDescripcion)
                .addGap(27, 27, 27)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblCantidad)
                .addGap(27, 27, 27)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panArticulosLayout.setVerticalGroup(
            panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panArticulosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCantidad, txtDisponible});

        panAlmacenes.setBackground(new java.awt.Color(255, 255, 255));
        panAlmacenes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Información de Almacenes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblOrigen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblOrigen.setForeground(new java.awt.Color(0, 0, 102));
        lblOrigen.setText("Almacén origen");

        comboOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrigenActionPerformed(evt);
            }
        });

        lblDestino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(0, 0, 102));
        lblDestino.setText("Almacén destino");

        comboDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAlmacenesLayout = new javax.swing.GroupLayout(panAlmacenes);
        panAlmacenes.setLayout(panAlmacenesLayout);
        panAlmacenesLayout.setHorizontalGroup(
            panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAlmacenesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDestino)
                    .addComponent(lblOrigen))
                .addGap(18, 18, 18)
                .addGroup(panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panAlmacenesLayout.setVerticalGroup(
            panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAlmacenesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panFunciones.setBackground(new java.awt.Color(255, 255, 255));
        panFunciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panFunciones.setLayout(new java.awt.GridLayout(1, 0));

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 102));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panFunciones.add(btnSalir);

        dummy1.setBorderPainted(false);
        dummy1.setContentAreaFilled(false);
        dummy1.setEnabled(false);
        dummy1.setFocusPainted(false);
        dummy1.setFocusable(false);
        panFunciones.add(dummy1);

        dummy2.setBorderPainted(false);
        dummy2.setContentAreaFilled(false);
        dummy2.setEnabled(false);
        dummy2.setFocusPainted(false);
        dummy2.setFocusable(false);
        panFunciones.add(dummy2);

        btnGuardar.setBackground(new java.awt.Color(204, 255, 204));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 102));
        btnGuardar.setText("Guardar y Salir");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panFunciones.add(btnGuardar);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Detalle del embarque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        tablaResumen.setBackground(new java.awt.Color(255, 255, 255));
        tablaResumen.setForeground(new java.awt.Color(0, 0, 102));
        tablaResumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaResumen);

        btnAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 102));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAgregar, btnEliminar});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAgregar, btnEliminar});

        javax.swing.GroupLayout panBGLayout = new javax.swing.GroupLayout(panBG);
        panBG.setLayout(panBGLayout);
        panBGLayout.setHorizontalGroup(
            panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panFunciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panAlmacenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panBGLayout.setVerticalGroup(
            panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panAlmacenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panBG);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        mp.ventTraspasoAb = false;
    }//GEN-LAST:event_formInternalFrameClosed
        
    private void btnBuscarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArtActionPerformed
        if(comboOrigen.getSelectedItem()!=null){
            String nombre = comboOrigen.getSelectedItem().toString();
            tablaProductos.setModel(producto.buscarProdXAlmacen(nombre));
            tablaProductos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            tablaProductos.getColumnModel().getColumn(0).setMaxWidth(60);
            tablaProductos.getColumnModel().getColumn(3).setMaxWidth(80);
            tablaProductos.setAutoCreateRowSorter(true);
            BuscarArticulo.setSize(450, 230);
            BuscarArticulo.setLocationRelativeTo(this);
            BuscarArticulo.setModal(true);
            BuscarArticulo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona el almacen de origen", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnBuscarArtActionPerformed
    
    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void VentanaAbierta(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_VentanaAbierta
        Date fecha = new Date();
        fechaTraslado.setDate(fecha);
        alm.cargarComboAlmacenes(comboOrigen);
        alm.cargarComboAlmacenes(comboDestino);
        
    }//GEN-LAST:event_VentanaAbierta

    
    private void BuscarArticuloWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_BuscarArticuloWindowOpened
        
    }//GEN-LAST:event_BuscarArticuloWindowOpened

    private void comboOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrigenActionPerformed
        validarAlmacen(comboOrigen, comboDestino);
    }//GEN-LAST:event_comboOrigenActionPerformed

    private void comboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDestinoActionPerformed
        validarAlmacen(comboDestino,comboOrigen);
    }//GEN-LAST:event_comboDestinoActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if(tablaProductos.getRowCount()>0){
            if(tablaProductos.getSelectedRow()!=-1){
                //idProducto, Nombre, Descripción, Disponible
                lblID.setText(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0).toString());
                txtDescripcion.setText(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 1).toString());
                if(tablaResumen.getRowCount()>0){
                    int id = (int) tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0); 
                    double disponible = (double) tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 3);
                    for(int i=0;i < tablaResumen.getRowCount();i++){
                        if(tablaResumen.getValueAt(i, 0).equals(id)){
                            disponible = disponible - Double.parseDouble(tablaResumen.getValueAt(i, 2).toString());
                            txtDisponible.setText(String.valueOf(disponible));
                            break;
                        } else {
                            txtDisponible.setText(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 3).toString());
                        }
                    }
                } else {
                    txtDisponible.setText(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 3).toString());
                }
                
                txtCantidad.setText("");
                BuscarArticulo.dispose();
            }
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        BuscarArticulo.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(!lblID.getText().isEmpty()){
            if(!txtCantidad.getText().isEmpty()){
                double cantidad = Double.parseDouble(txtCantidad.getText());
                if(cantidad > 0){
                    double cantidad2 = Double.parseDouble(txtDisponible.getText());
                    if(cantidad <= cantidad2){
                        if(comboDestino.getSelectedItem()!=null){
                        agregarArticulo();
                        comboOrigen.setEnabled(false);
                        comboDestino.setEnabled(false);
                        } else {
                        JOptionPane.showMessageDialog(null, "Selecciona el almacen destino", "Información", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else{
                        JOptionPane.showMessageDialog(null, "La cantidad ingresada excede la disponibilidad", "Información", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Captura la cantidad a transferir", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos seleccionados", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(tablaResumen.getSelectedRow()!=-1){
            modeloTabla.removeRow(tablaResumen.getSelectedRow());
            tablaResumen.setModel(modeloTabla);
            if(modeloTabla.getRowCount()==0){
                comboOrigen.setEnabled(true);
                comboDestino.setEnabled(true);
            }
        }
      
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //NombreAlmOrigen,idProd,fechaReg,cantidad,NombreAlmDestino
        Vector partida;
        ObjectList Datos = new ObjectList();
        if(modeloTabla.getRowCount()>0){
            for(int i=0;i<modeloTabla.getRowCount();i++){
                partida = new Vector();
                partida.addElement(comboOrigen.getSelectedItem().toString());   //Origen
                partida.addElement(modeloTabla.getValueAt(i, 0));   //idProducto
                partida.addElement(fechaTraslado.getDate());    //fecha
                partida.addElement(modeloTabla.getValueAt(i, 2));  //Cantidad
                partida.addElement(comboDestino.getSelectedItem().toString());   //Destino
                
                alm.aplicarTraspaso(partida);
            }
            JOptionPane.showMessageDialog(null, "Registro de traspaso exitoso", "Información", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public void agregarArticulo(){
        Vector fila = new Vector();
        boolean duplicado = false;
        if(modeloTabla.getRowCount()>0){
            int d2 = Integer.parseInt(lblID.getText());
            for(int i=0; i < modeloTabla.getRowCount();i++){
                int d1 = (int) modeloTabla.getValueAt(i, 0);
                if(d1 == d2){
                    double cantidad = (double) modeloTabla.getValueAt(i,2);
                    cantidad = cantidad + Double.parseDouble(txtCantidad.getText());
                    modeloTabla.setValueAt(cantidad, i, 2);
                    duplicado = true;
                    break;
                }
            }
        }
        if(!duplicado){
            fila.addElement(Integer.parseInt(lblID.getText()));
            fila.addElement(txtDescripcion.getText().toString());
            fila.addElement(Double.parseDouble(txtCantidad.getText()));
            modeloTabla.addRow(fila);
        }
        tablaResumen.setModel(modeloTabla);
        
        tablaResumen.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaResumen.getColumnModel().getColumn(0).setMaxWidth(60);
        tablaResumen.getColumnModel().getColumn(2).setMaxWidth(80);
        tablaResumen.setAutoCreateRowSorter(true);
        limpiarArticulo();
    }
    
    
    public void validarAlmacen(JComboBox combo1, JComboBox combo2){
        if(combo1.getSelectedIndex() == combo2.getSelectedIndex() && (combo1.getSelectedIndex()!=-1 || combo2.getSelectedIndex()!=-1)){
            combo2.setSelectedIndex(-1);
            limpiarArticulo();
        }
    }
    
    public void limpiarArticulo(){
        lblID.setText("");
        txtDescripcion.setText("");
        txtCantidad.setText("");
        txtDisponible.setText("");
    }
    
    public void consultarArticulo(){
        tablaProductos.setModel(producto.consultarProductoTotales());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog BuscarArticulo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarArt;
    private javax.swing.JButton btnDummy;
    private javax.swing.JButton btnDummy1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> comboDestino;
    private javax.swing.JComboBox<String> comboOrigen;
    private javax.swing.JButton dummy1;
    private javax.swing.JButton dummy2;
    private com.toedter.calendar.JDateChooser fechaTraslado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JPanel panAlmacenes;
    private javax.swing.JPanel panArticulos;
    private javax.swing.JPanel panBG;
    private javax.swing.JPanel panBotones;
    private javax.swing.JPanel panFunciones;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaResumen;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDisponible;
    // End of variables declaration//GEN-END:variables
}
