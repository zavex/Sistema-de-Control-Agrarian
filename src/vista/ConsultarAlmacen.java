package vista;

import java.util.Date;
import java.util.Vector;
import javax.swing.JDesktopPane;
import modelo.*;

public class ConsultarAlmacen extends javax.swing.JInternalFrame {

    Permisos permiso;
    Almacen almacen;
    JDesktopPane escritorio;
    Empleado empleado;
    Log ll = new Log();
    Date date = new Date ();
    
    public ConsultarAlmacen(Almacen almacen, JDesktopPane escritorioo, Permisos permisoo, Empleado empleadoo) {
        this.permiso = permisoo;
        this.almacen = almacen;
        this.escritorio =  escritorioo;
        this.empleado = empleadoo;
        initComponents();
        ll.agregarAccion(date.toString(),"Consulta de Almacenes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDatosBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        btnSalir1 = new javax.swing.JButton();
        btnActualizarAlmacen = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTAR ALMACENES");
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

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "ID DE ALMACÉN", "NOMBRE", "DIRECCIÓN", "TELÉFONO", "CAPACIDAD", "ID EMPLEADO" }));
        comboFiltro.setSelectedIndex(-1);
        comboFiltro.setToolTipText("");
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDatosBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
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

        btnActualizarAlmacen.setText("ACTUALIZAR REGISTRO");
        btnActualizarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAlmacenActionPerformed(evt);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir1)
                .addGap(28, 28, 28)
                .addComponent(btnActualizarAlmacen)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir1)
                    .addComponent(btnActualizarAlmacen))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatosBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatosBusquedaKeyReleased
        switch(comboFiltro.getSelectedIndex()){
            case 0:
            try {
                table.setModel(almacen.consultarAlmacenTotales());
            }catch (Exception e) {}
            break;
            case 1:
            try {
                almacen.setIdAlmacen(Integer.parseInt(txtDatosBusqueda.getText()));
                table.setModel(almacen.consultarAlmacenId());
            }catch (Exception e) {}
            break;
            case 2:
            try {
                almacen.setNombreA(txtDatosBusqueda.getText());
                table.setModel(almacen.consultarAlmacenNombre());
            }catch (Exception e) {}
            break;
            case 3:
            try {
                almacen.setDireccion(txtDatosBusqueda.getText());
                table.setModel(almacen.consultarAlmacenDireccion());
            }catch (Exception e){}
            break;
            case 4:
            try {
                almacen.setTelefono(txtDatosBusqueda.getText());
                table.setModel(almacen.consultarAlmacenTelefono());
            }catch (Exception e){}
            break;
            case 5:
            try {
                almacen.setCapacidad(txtDatosBusqueda.getText());
                table.setModel(almacen.consultarAlmacenCapacidad());
            }catch(Exception e) {}
            break;
            case 6:
            try {
                almacen.setIdEmpleado(Integer.parseInt(txtDatosBusqueda.getText()));
                table.setModel(almacen.consultarIdEmpleado());
            }catch (Exception e) {}
            break;
            
            default:
            break;
        }
    }//GEN-LAST:event_txtDatosBusquedaKeyReleased

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        
        this.dispose();

    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnActualizarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAlmacenActionPerformed
        try {
            Vector fila = new Vector();
            for(int i=0;i<7;i++){
                fila.add(table.getValueAt(table.getSelectedRow(), i));
            }
            ModificarAlmacen ma = new ModificarAlmacen (permiso,almacen,fila,empleado);
            escritorio.add(ma);
            ma.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnActualizarAlmacenActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        table.setModel(almacen.consultarAlmacenTotales());
        cargarPermiso();
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed
    
    public void cargarPermiso () {
        if (permiso.getAlmacen()==2) {
            btnActualizarAlmacen.setEnabled(true);
        }else {
            btnActualizarAlmacen.setEnabled(false);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarAlmacen;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtDatosBusqueda;
    // End of variables declaration//GEN-END:variables
}
