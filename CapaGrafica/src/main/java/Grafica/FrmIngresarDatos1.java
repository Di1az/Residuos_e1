/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafica;

import Dominio.Destino;
import Dominio.Detalle_Traslado;
import Dominio.Empresa_transportista;
import Dominio.Productor;
import Dominio.Residuo;
import Dominio.Traslado;
import Persistencia.ProductorDAO;
import Persistencia.empresaDAO;
import com.mycompany.capalogica.ControlCorreo;
import com.mycompany.capalogica.ControlTraslado;
import com.mycompany.capalogica.FachadaLogica;
import com.mycompany.capalogica.ILogica;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author hoshi
 */
public class FrmIngresarDatos1 extends javax.swing.JFrame {

    //
    ILogica log;

    //
//    ControlCorreo control = new ControlCorreo();
    //Atributo costo total
    float costoTotal = 0;
    //Atributo numIdentificador
    private int numIdentificador;
    //Atributo productor
    private Productor productor;
    //Atributo empresa
    private Empresa_transportista empresa;

    /**
     * Creates new form FrmIngresarDatos
     *
     * @param empresa parámetro empresa
     * @param producto parámetro producto
     */
    public FrmIngresarDatos1(Empresa_transportista empresa, Productor producto) {
        initComponents();
        log = new FachadaLogica();
        this.productor = producto;
//        costoTotal = empresa.getCostoKM();
        lblNombreEmpresaProductor.setText(producto.getNombreEmpresa());
        this.empresa = empresa;
        llenarComboBox();
    }

    /**
     * Método que llena el combo box con los residuos que tenga el productor.
     */
    public void llenarComboBox() {
        cmbProducto.removeAllItems();
        for (int i = 0; i < productor.getResiduos().size(); i++) {
            cmbProducto.addItem(productor.getResiduos().get(i));
        }
    }

    /**
     * Metodo que se encarga de obtener los traslados que se han hecho
     * en el dia
     * @param fecha
     * @return 
     */
    public int obtenerTrasladosDia(Date fecha) {
        int count = 0;
        ControlTraslado tra = new ControlTraslado();

        // Supongamos que tienes una lista de traslados llamada "listaTraslados" que contiene todos los traslados registrados
        for (Traslado traslado : tra.buscarTodos()) {
            // Comparar la fecha del traslado con la fecha especificada
            if (esMismoDia(traslado.getFecha_traslado(), fecha)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Metodo que regresa el dia de hoy
     * @param fecha1
     * @param fecha2
     * @return 
     */
    private boolean esMismoDia(Date fecha1, Date fecha2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(fecha1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(fecha2);

        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Metodo que solicita traslado y lo registra en la bd
     *
     * @return regresa el traslado
     */
    public Traslado solicitudTraslado() {
        Traslado t = new Traslado();
        t.setProductor(productor);

        Destino destino = new Destino();
        destino.setNombre(txtDireccion.getText());
        destino.setTratamiento((String) cmbTratamiento.getSelectedItem());

        Calendar fechaSeleccionada = Calendar.getInstance();
        fechaSeleccionada.setTime(txtFechaNa.getDate());
        fechaSeleccionada.add(Calendar.WEEK_OF_YEAR, 1);
        destino.setFecha_llegada(fechaSeleccionada.getTime());

        t.setKilometros(Integer.valueOf(txtKilometros.getText()));
        t.setDestino(destino);
        Residuo residuoSeleccionado = (Residuo) cmbProducto.getSelectedItem();
        t.setResiduo(residuoSeleccionado);
        t.setCantidad_residuos(Integer.valueOf(txtCantidad.getText()));
        t.setFecha_traslado(new Date());

        log.guardarTraslado(t);

        return t;
    }

//<<<<<<< Updated upstream
    /**
     * Metodo que obtiene el texto del correo enviado.
     *
     * @param t parámetro t
     * @return regresa un traslado
     */
    public String getTextoCorreo(Traslado t) {
        String traslado = "";

//         String nombreP = t.getResiduo().getProductor().getNombreEmpresa();
//         String nombreR = t.getResiduo().getDescripcion();
        String direccion = this.txtDireccion.getText();
        String km = this.txtKilometros.getText();
        String fechaEs = t.getFecha_traslado().toString();
        String cantidadR = this.txtCantidad.getText();

        traslado = log.correoTexto(direccion, empresa.getNombre(), km, lblNombreEmpresaProductor.getText(), cmbProducto.getSelectedItem().toString(), cantidadR, fechaEs, empresa.getTipo_traslado());

        return traslado;
    }

    /**
     * Método que nos ayuda para que no existan vacíos dentro del cuadro de
     * texto.
     *
     * @return regreso
     */
    public boolean validarVacios() {
        boolean error = true;

        if (txtCantidad.getText().equals("")
                && txtFechaNa.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Favor de no dejar campos sin llenar", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return error;
    }
    
    /**
     * Metodo que valida que no se puedan poner caracteres especiales
     *
     * @param evento
     */
    public void validarCaracteres(java.awt.event.KeyEvent evento){
        if(evento.getKeyChar()>=33 && evento.getKeyChar() <=34
                || evento.getKeyChar()>=36 && evento.getKeyChar() <=47
                ||evento.getKeyChar()>=58 && evento.getKeyChar() <=64
                || evento.getKeyChar()>=91 && evento.getKeyChar() <=96
                || evento.getKeyChar()>=123 && evento.getKeyChar() <=208
                || evento.getKeyChar()>=210 && evento.getKeyChar() <=240
                || evento.getKeyChar()>=242 && evento.getKeyChar() <=255){
            
            evento.consume();
            
        }
        
    }

    /**
     * Metodo que se encarga de que la fecha estimada no sea menor al dia de hoy
     *
     * @param fecha parámetro fecha.
     * @return regresa un booleano verdadero o falso.
     */
    public boolean validarFecha(Date fecha) {
        Date hoy = new Date(); // Obtiene la fecha de hoy

        // Compara las fechas utilizando el método compareTo()
        // Si la fecha proporcionada es anterior a la fecha de hoy, devuelve false
        if (fecha.compareTo(hoy) < 0) {
            JOptionPane.showMessageDialog(this, "Fecha inválida");
            return false;

        }

        return true; // Si la fecha es igual o posterior a la fecha de hoy, devuelve true
    }

//    public void calcularCosto(){
//        empresa
//        
//    }
//=======
//>>>>>>> Stashed changes
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSolicitud = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        cmbProducto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtFechaNa = new com.toedter.calendar.JDateChooser();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbTratamiento = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtKilometros = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNombreEmpresaProductor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSolicitud.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lblSolicitud.setForeground(new java.awt.Color(102, 102, 0));
        lblSolicitud.setText("Solicitud de Traslado");
        jPanel1.add(lblSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Producto a trasladar");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Cantidad de residuos (kg, L)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 310, -1));

        cmbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductoActionPerformed(evt);
            }
        });
        jPanel2.add(cmbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 310, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Fecha estimada");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        jPanel2.add(txtFechaNa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 250, 30));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 250, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Tratamiento");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        cmbTratamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "residuo", "uso para maquillaje", "etc." }));
        cmbTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTratamientoActionPerformed(evt);
            }
        });
        jPanel2.add(cmbTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 210, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Kilometros");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        txtKilometros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKilometrosKeyTyped(evt);
            }
        });
        jPanel2.add(txtKilometros, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 310, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Dirección destino");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 720, 370));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, -1));
        jPanel1.add(lblNombreEmpresaProductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 110, 90, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-arrow-wide-left.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame 3.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método action event del botón aceptar que agrega la solicitud en la base.
     *
     * @param evt
     */
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        if (validarVacios()) {
            if (validarFecha(txtFechaNa.getDate())) {
                // Validación de cantidad de traslados por día
                int trasladosDia = obtenerTrasladosDia(new Date());

                if (trasladosDia >= 5) {
                    // Mostrar mensaje de error o tomar alguna acción cuando se excede el límite de traslados por día
                    JOptionPane.showMessageDialog(this, "Se ha excedido el límite de traslados por día");
                    FrmMenuPrincipal menu = new FrmMenuPrincipal(productor);
                    menu.setVisible(true);
                    dispose();
                } else {
                    Traslado t = this.solicitudTraslado();
                    JOptionPane.showMessageDialog(this, "Se agrego correctamente");
                    String traslado = getTextoCorreo(t);

                    log.correoEnvio(empresa.getEmail(), traslado);
                    FrmMenuPrincipal menu = new FrmMenuPrincipal(productor);
                    menu.setVisible(true);
                    dispose();
                }

            }

        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * Metodo que elimina los datos agregados.
     *
     * @param evt
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtCantidad.setText(" ");
        cmbProducto.setSelectedIndex(0);
        txtFechaNa.setDate(null);

        int result = JOptionPane.showOptionDialog(this, "¿Seguro que quieres cancelar la acción?", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

        if (result == JOptionPane.OK_OPTION) {
            this.setVisible(false);
            ProductorDAO productorDAO = new ProductorDAO();
            List<Productor> productores = productorDAO.buscarNombreEmpresa(lblNombreEmpresaProductor.getText());
            FrmSeleccionEmpresa seleccion = new FrmSeleccionEmpresa(productores.get(0));
            seleccion.setVisible(true);
        } else {

        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Método action event del botón regresar, que regresa al frame anterior.
     *
     * @param evt parámetro evento
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ProductorDAO productorDAO = new ProductorDAO();
        List<Productor> productores = productorDAO.buscarNombreEmpresa(lblNombreEmpresaProductor.getText());
        FrmSeleccionEmpresa seleccion = new FrmSeleccionEmpresa(productores.get(0));
        seleccion.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Nada
     *
     * @param evt parámetro evento
     */
    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    /**
     * Nada
     *
     * @param evt parámetro evento
     */
    private void cmbTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTratamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTratamientoActionPerformed

    /**
     * Nada
     *
     * @param evt parámetro evento
     */
    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    /**
     * Nada
     *
     * @param evt parámetro evento
     */
    private void cmbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProductoActionPerformed
    /**
     * Método que valida el solo escribir números
     * @param evt evt
     */
    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9')) {
            evt.consume();
        }

        if (txtCantidad.getText().length() == 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped
    /**
     * Método que valida el solo escribir números
     * @param evt evt
     */
    private void txtKilometrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilometrosKeyTyped
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9')) {
            evt.consume();
        }

        if (txtKilometros.getText().length() == 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txtKilometrosKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        this.validarCaracteres(evt);
    }//GEN-LAST:event_txtDireccionKeyTyped

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmIngresarDatos().setVisible(true);
//            }
//        });
//    }
    /**
     * Componentes del frame FrmIngresarDatos
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<Residuo> cmbProducto;
    private javax.swing.JComboBox<String> cmbTratamiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNombreEmpresaProductor;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDireccion;
    private com.toedter.calendar.JDateChooser txtFechaNa;
    private javax.swing.JTextField txtKilometros;
    // End of variables declaration//GEN-END:variables
}
