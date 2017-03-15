package vista;

import java.util.Date;
import java.util.Vector;
import javax.swing.JDesktopPane;
import modelo.*;

public class ConsultarEmpleado extends javax.swing.JInternalFrame {

    Permisos permiso;
    Empleado empleado;
    JDesktopPane escritorio;
    Log ll = new Log();
    Date date = new Date ();
    
    public ConsultarEmpleado(Empleado e,JDesktopPane escritorioo, Permisos per) {
        
        this.empleado = e;
        this.escritorio = escritorioo;
        this.permiso = per;
        initComponents();
        ll.agregarAccion(date.toString(),"Consulta de Empleados");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDatosBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        btnActualizarEmpleado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTAR EMPLEADOS");
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

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "ID DE EMPLEADO", "NOMBRE", "RFC", "CURP", "NSS", "DEPARTAMENTO", "STATUS" }));
        comboFiltro.setSelectedIndex(-1);

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
                .addGap(0, 29, Short.MAX_VALUE))
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

        btnActualizarEmpleado.setText("ACTUALIZAR REGISTRO");
        btnActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmpleadoActionPerformed(evt);
            }
        });

        btnSalir.setText("REGRESAR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(28, 28, 28)
                        .addComponent(btnActualizarEmpleado))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnActualizarEmpleado))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatosBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatosBusquedaKeyReleased
         switch(comboFiltro.getSelectedIndex()){
            case 0:
                try {
                table.setModel(empleado.consultarEmpleadosTotales());
                }catch (Exception e) {}
            break;
            case 1:
                try {
                empleado.setIdEmpleado(Integer.parseInt(txtDatosBusqueda.getText()));
                table.setModel(empleado.consultarEmpleadoId());
                }catch (Exception e) {}
            break;
            case 2:
                try {
                empleado.setNombre(txtDatosBusqueda.getText());
                table.setModel(empleado.consultarEmpleadoNombre());
                }catch (Exception e) {}
            break;
            case 3:
                try {
                empleado.setRfc(txtDatosBusqueda.getText());
                table.setModel(empleado.consultarEmpleadoRfc());
                }catch (Exception e){}
                break;
            case 4:
                try {
                empleado.setCurp(txtDatosBusqueda.getText());
                table.setModel(empleado.consultarEmpleadoCurp());
                }catch (Exception e){}
                break;
            case 5:
                try {
                empleado.setNss(txtDatosBusqueda.getText());
                table.setModel(empleado.consultarEmpleadoNss());
                }catch(Exception e) {}                
                break;
            case 6:
                try {
                empleado.setDepartamento(txtDatosBusqueda.getText());
                table.setModel(empleado.consultarEmpleadoDepto());
                }catch (Exception e) {}
                break;
            case 7:
                try {
                empleado.setStatus(txtDatosBusqueda.getText());
                table.setModel(empleado.consultarEmpleadoStatus());
                }catch (Exception e) {}
                break;                    
            default:
                break;
        }
    }//GEN-LAST:event_txtDatosBusquedaKeyReleased

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        table.setModel(empleado.consultarEmpleadosTotales());
        cargarPermiso();
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpleadoActionPerformed
        try {
            Vector fila = new Vector();
            for(int i=0;i<11;i++){
                
                fila.add(table.getValueAt(table.getSelectedRow(), i));
            }
            ModificarEmpleado me = new ModificarEmpleado (empleado,fila);
            
            escritorio.add(me);
            me.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnActualizarEmpleadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public void cargarPermiso(){
        if(permiso.getEmpleado()==2){
            btnActualizarEmpleado.setEnabled(true);
        } else {
            btnActualizarEmpleado.setEnabled(false);
        }
    }  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarEmpleado;
    private javax.swing.JButton btnSalir;
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
