package vista;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;

/**
 * Este formulario se encarga de mostrar la ventana de registro de devoluciones.
 * @author Save Soto
 */
public class RegistrarNotaCredito extends javax.swing.JInternalFrame {
    
    NotaCredito notaCredito;
    Permisos permisos;
    Conexion conexion = new Conexion();
    Log ll = new Log();
    Date date = new Date ();
    
    /**
     * Constructor de la vista de registro de devoluciones.
     * @param p     Recibe la instancia de la clase Permisos.
     * @param nc    Recibe la instancia de la clase NotaCredito.
     */
    public RegistrarNotaCredito(Permisos p, NotaCredito nc) {
        this.permisos = p;
        this.notaCredito = nc;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblIdProveedor = new javax.swing.JLabel();
        txtIdNotaCredito = new javax.swing.JTextField();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegCliente = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        PanelDatosContacto = new javax.swing.JPanel();
        lblContactoCliente1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboIdClientes = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaConcepto = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        txtMontoAcreditar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        txtIva = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnLimpiarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Nota de Crédito");
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

        lblIdProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIdProveedor.setForeground(new java.awt.Color(0, 0, 102));
        lblIdProveedor.setText("Folio Nota de Crédito");

        txtIdNotaCredito.setEditable(false);

        lblFechaReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaReg.setForeground(new java.awt.Color(0, 0, 102));
        lblFechaReg.setText("Fecha de Registro");

        DateChooserFechaRegCliente.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Estatus");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACTIVA", "CANCELADA" }));
        jComboBox1.setEnabled(false);

        PanelDatosContacto.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatosContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Devolución", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblContactoCliente1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblContactoCliente1.setForeground(new java.awt.Color(0, 0, 102));
        lblContactoCliente1.setText("Concepto");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Id de Cliente");

        txtAreaConcepto.setColumns(20);
        txtAreaConcepto.setLineWrap(true);
        txtAreaConcepto.setRows(5);
        txtAreaConcepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaConceptoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtAreaConcepto);

        javax.swing.GroupLayout PanelDatosContactoLayout = new javax.swing.GroupLayout(PanelDatosContacto);
        PanelDatosContacto.setLayout(PanelDatosContactoLayout);
        PanelDatosContactoLayout.setHorizontalGroup(
            PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(PanelDatosContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosContactoLayout.createSequentialGroup()
                        .addGap(0, 140, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboIdClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosContactoLayout.createSequentialGroup()
                        .addComponent(lblContactoCliente1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelDatosContactoLayout.setVerticalGroup(
            PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosContactoLayout.createSequentialGroup()
                .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboIdClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContactoCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("Monto Acreeditado");

        txtMontoAcreditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoAcreditarKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("$");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel20.setText("$");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de Saldo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 102));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Total");

        lblIva.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIva.setForeground(new java.awt.Color(0, 0, 102));
        lblIva.setText("IVA");

        jLabel18.setText("$");

        jLabel22.setText("$");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIva)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblIva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)))
                .addContainerGap())
        );

        btnLimpiarCliente.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpiarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCliente.setText("Limpiar");
        btnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteActionPerformed(evt);
            }
        });

        btnCancelarCliente.setBackground(new java.awt.Color(102, 102, 255));
        btnCancelarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        btnRegistrarCliente.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setText("Generar");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(DateChooserFechaRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtMontoAcreditar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1))))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(txtIdNotaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFechaReg))
                            .addComponent(PanelDatosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(263, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarCliente)
                .addGap(6, 6, 6)
                .addComponent(btnRegistrarCliente)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIdProveedor)
                        .addComponent(txtIdNotaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaReg)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(DateChooserFechaRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtMontoAcreditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelDatosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarCliente)
                    .addComponent(btnCancelarCliente)
                    .addComponent(btnRegistrarCliente))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Verifica que toda la información haya sido introducida al formulario.
     * @return Regresa un valor booleano para indicar si se completado información.  
     */
    public boolean camposCompletos () {
        if (comboIdClientes.getSelectedIndex()!=-1 && !txtAreaConcepto.getText().isEmpty() && !txtMontoAcreditar.getText().isEmpty() && !txtTotal.getText().isEmpty()) {
           return true;
        }else {
           JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
           return false;
        }
    }
   
    /**
     * Recopila la información cargada en la vista y la envía al método alojado en la clase de nota de crédito para su respectiva actualización en la base de datos.
     * @param evt 
     */
    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
            if (camposCompletos()) {
                try {
                    notaCredito.setIdCliente(Integer.parseInt(comboIdClientes.getSelectedItem().toString()));
                    notaCredito.setConcepto(txtAreaConcepto.getText());
                    notaCredito.setSubtotal(Double.parseDouble(txtMontoAcreditar.getText()));
                    notaCredito.setIva(Double.parseDouble(txtIva.getText()));
                    notaCredito.setTotal(Double.parseDouble(txtTotal.getText()));
                    notaCredito.setEstatus("ACTIVA");
                    notaCredito.generarNotaCredito();
                    JOptionPane.showMessageDialog(null,"NOTA DE CREDITO GENERADA");
                    ll.agregarAccion(date.toString(),"Registro Nota de Credito");
                    this.dispose();
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getStackTrace());
                }
            }
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    /**
     * Método de apertura, se encarga de cargar la fecha, el id generado por la base de datos para su registro, además invoca el método que recupera el id de cliente.
     * @param evt
     * @see regresarIdCliente()
     */
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DateChooserFechaRegCliente.setDate(new Date());    //al iniciar setear la fecha actual
        txtIdNotaCredito.setText(String.valueOf(notaCredito.obtenerNoId()));    //
        regresarIdCliente();
    }//GEN-LAST:event_formInternalFrameOpened
    
    /**
     * carga la lista de clientes registrados en la base de datos y los carga en una lista desplegable.
     */
    public void regresarIdCliente() {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try
        {
        comando = conexion.getConexion().prepareStatement("select idCliente from cliente");
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
             comboIdClientes.addItem(String.valueOf(rs.getInt(1)));           
        }
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        } 
        
    }
    
    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar hasta 51 caracteres.
     * @param evt 
     */
    private void txtAreaConceptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaConceptoKeyTyped
        String concepto = txtAreaConcepto.getText();
        if (concepto.length()>50) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtAreaConceptoKeyTyped

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar números, destruye letras.
     * @param evt 
     */
    private void txtMontoAcreditarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoAcreditarKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); 
        }
        String msg = String.valueOf(evt.getKeyChar());
        String subtotall = txtMontoAcreditar.getText();
            int subtotal = txtMontoAcreditar.getText().length();
            if (!(msg.matches("[.0-9]"))) {
                    evt.consume();
            }
            if (subtotal >= 1) {
                    for (int j = 0; j < subtotal; j++) {
                            if (subtotall.charAt(j) == '.') {
                                    if (!msg.matches(("[0-9]"))) {
                                            evt.consume();
                                    }
                            }
                    }
            }
    }//GEN-LAST:event_txtMontoAcreditarKeyTyped

    /**
     * Con este botón se calculará el IVA y TOTAL de la cantidad ingresada.
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double monto = Double.parseDouble(txtMontoAcreditar.getText());
        double iva = monto * .16;
        double total = monto + iva ;
        txtIva.setText(String.valueOf(iva));
        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Cierra la ventana de actualización.
     * @param evt 
     */
    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    /**
     * Elimina los datos ingresados en las casillas del formulario.
     * @param evt 
     */
    private void btnLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClienteActionPerformed
        comboIdClientes.setSelectedIndex(-1);
        txtAreaConcepto.setText(null);
        txtMontoAcreditar.setText(null);
        txtIva.setText(null);
        txtTotal.setText(null);
    }//GEN-LAST:event_btnLimpiarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserFechaRegCliente;
    private javax.swing.JPanel PanelDatosContacto;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JComboBox<String> comboIdClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContactoCliente1;
    private javax.swing.JLabel lblFechaReg;
    private javax.swing.JLabel lblIdProveedor;
    private javax.swing.JLabel lblIva;
    private javax.swing.JTextArea txtAreaConcepto;
    private javax.swing.JTextField txtIdNotaCredito;
    private javax.swing.JLabel txtIva;
    private javax.swing.JTextField txtMontoAcreditar;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
