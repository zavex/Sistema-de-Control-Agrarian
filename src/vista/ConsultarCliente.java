package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import modelo.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ConsultarCliente extends javax.swing.JInternalFrame {

    Permisos permiso;
    Cliente cliente;
    JDesktopPane escritorio;
    Log ll = new Log();
    Date date = new Date ();
    
    public ConsultarCliente(Cliente clientee, JDesktopPane escritorioo, Permisos permisoo) {
        this.permiso = permisoo;
        this.cliente = clientee;
        this.escritorio =  escritorioo;
        initComponents();
        ll.agregarAccion(date.toString(),"Consulta de Clientes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDatosBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<String>();
        btnSalir1 = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTAR CLIENTES");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        jLabel2.setText("PALABRAS CLAVES");

        txtDatosBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDatosBusquedaKeyReleased(evt);
            }
        });

        jLabel1.setText("BUSCAR POR");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GENERAL", "ID DE CLIENTE", "NOMBRE", "RFC", "DIRECCIÓN", "TELÉFONO", "CÓDIGO POSTAL", "MUNICIPIO", "ESTADO", "CORREO", "CONTACTO" }));
        comboFiltro.setSelectedIndex(-1);
        comboFiltro.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDatosBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatosBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalir1.setText("REGRESAR");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        btnActualizarCliente.setText("ACTUALIZAR REGISTRO");
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registros Encontrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        jButton1.setText("VER VENTAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VER EDO CTA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir1)
                .addGap(28, 28, 28)
                .addComponent(btnActualizarCliente)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir1)
                    .addComponent(btnActualizarCliente))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatosBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatosBusquedaKeyReleased
        switch(comboFiltro.getSelectedIndex()){
            case 0:
            try {
                table.setModel(cliente.consultarClientesTotales());
            }catch (Exception e) {}
            break;
            case 1:
            try {
                cliente.setIdCliente(Integer.parseInt(txtDatosBusqueda.getText()));
                table.setModel(cliente.consultarClienteId());
            }catch (Exception e) {}
            break;
            case 2:
            try {
                cliente.setNombre(txtDatosBusqueda.getText());
                table.setModel(cliente.consultarClienteNombre());
            }catch (Exception e) {}
            break;
            case 3:
            try {
                cliente.setRfc(txtDatosBusqueda.getText());
                table.setModel(cliente.consultarClienteRfc());
            }catch (Exception e){}
            break;
            case 4:
            try {
                cliente.setDireccion(txtDatosBusqueda.getText());
                table.setModel(cliente.consultarClienteDireccion());
            }catch (Exception e){}
            break;
            case 5:
            try {
                cliente.setTelefono(txtDatosBusqueda.getText());
                table.setModel(cliente.consultarClienteTelefono());
            }catch(Exception e) {}
            break;
            case 6:
            try {
                cliente.setCp(txtDatosBusqueda.getText());
                table.setModel(cliente.consultarClienteCp());
            }catch (Exception e) {}
            break;
            case 7:
            try {
                cliente.setMunicipio(txtDatosBusqueda.getText());
                table.setModel(cliente.consultarClienteMunicipio());
            }catch (Exception e) {}
            break;
            case 8:
            try {
                cliente.setEstado(txtDatosBusqueda.getText());
                table.setModel(cliente.consultarClienteEstado());
            }catch (Exception e) {}
            break;
            case 9:
            try {
                cliente.setCorreo(txtDatosBusqueda.getText());
                table.setModel(cliente.consultarClienteCorreo());
            }catch (Exception e) {}
            break;
            case 10:
            try {
                cliente.setContacto(txtDatosBusqueda.getText());
                table.setModel(cliente.consultarClienteContacto());
            }catch (Exception e) {}
            break;
            default:
            break;
        }
    }//GEN-LAST:event_txtDatosBusquedaKeyReleased

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        try {
           Vector fila = new Vector();
            for(int i=0;i<12;i++){
                fila.add(table.getValueAt(table.getSelectedRow(), i));
            }
            ModificarCliente mc = new ModificarCliente (permiso,cliente,fila);
            escritorio.add(mc);
            mc.setVisible(true);
        }catch (Exception e) {}
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        table.setModel(cliente.consultarClientesTotales());
        cargarPermiso();
    }//GEN-LAST:event_formInternalFrameOpened

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (table.getSelectedRow() != -1) {
            String path = "C:\\Users\\zawex\\Documents\\GitHub\\agrarian2\\src\\reports\\ventsCliente.jasper";
            Map param = new HashMap();
            param.put("idClient", table.getValueAt(table.getSelectedRow(),0));
            JasperReport jr = null;
            try {
                Connection conexion = DriverManager.getConnection("jdbc:sqlserver://localhost\\MSSQLSERVER1;databaseName=agrarian","sa","12345678");
                jr = (JasperReport) JRLoader.loadObject(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, param, conexion);
                JasperViewer jv = new JasperViewer(jp,false); 
                jv.setTitle(path);
                jv.setVisible(true);
                conexion.close();
            }catch (Exception e) {System.out.println(e.getMessage());}
        
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione registro");
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (table.getSelectedRow() != -1) {
            String path = "C:\\Users\\zawex\\Documents\\GitHub\\agrarian2\\src\\reports\\EdoCuentaCliente.jasper";
            Map param = new HashMap();
            param.put("idClient", table.getValueAt(table.getSelectedRow(),0));
            JasperReport jr = null;
            try {
                Connection conexion = DriverManager.getConnection("jdbc:sqlserver://localhost\\MSSQLSERVER1;databaseName=agrarian","sa","12345678");
                jr = (JasperReport) JRLoader.loadObject(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, param, conexion);
                JasperViewer jv = new JasperViewer(jp,false); 
                jv.setTitle(path);
                jv.setVisible(true);
                conexion.close();
            }catch (Exception e) {System.out.println(e.getMessage());}
        
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione registro");
        }    
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void cargarPermiso () {
        if (permiso.getCliente()==2) {
            btnActualizarCliente.setEnabled(true);
        }else {
            btnActualizarCliente.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtDatosBusqueda;
    // End of variables declaration//GEN-END:variables
}
