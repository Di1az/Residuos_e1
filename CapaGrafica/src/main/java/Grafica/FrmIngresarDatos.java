/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafica;

import Dominio.Empresa_transportista;
import Dominio.Productor;
import Dominio.Residuo;
import Dominio.Traslado;
import Persistencia.empresaDAO;
import com.mycompany.capalogica.FachadaLogica;
import com.mycompany.capalogica.ILogica;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JComboBox;

/**
 *
 * @author hoshi
 */
public class FrmIngresarDatos extends javax.swing.JFrame {
    
    
    ILogica log;
    empresaDAO empresaDAO = new empresaDAO();
    float costoTotal = 0;
    /**
     * Creates new form FrmIngresarDatos
     * @param empresa
     */
    public FrmIngresarDatos(Empresa_transportista empresa) {
        initComponents();
        log = new FachadaLogica();
        costoTotal = empresa.getCostoKM();
        
    }
    
    public void solicitudTraslado(){
        Traslado t = new Traslado();
        // Supongamos que tienes un JComboBox llamado cmbProducto que contiene objetos de tipo Producto
        JComboBox<Residuo> cmbProducto = new JComboBox<>();

        // Obtén el objeto seleccionado del JComboBox
        Residuo residuoSeleccionado = (Residuo) cmbProducto.getSelectedItem();

        t.setResiduo(residuoSeleccionado);
        t.setCantidad_residuos(Integer.valueOf(txtCantidad.getText()));
        t.setLote(Integer.valueOf(txtNumLote.getText()));
        t.setKilometros(Integer.valueOf(txtKilometros.getText()));
        //Date fechita = new Date();
        // Supongamos que tienes una variable llamada fechaSeleccionada de tipo Calendar que contiene la fecha seleccionada por el usuario
        Calendar fechaSeleccionada = Calendar.getInstance();

        // Obtén la fecha seleccionada por el usuario
        fechaSeleccionada.setTime(txtFechaNa.getDate());

        // Agrega una semana a la fecha seleccionada
        fechaSeleccionada.add(Calendar.WEEK_OF_YEAR, 1);

        // Establece la nueva fecha estimada
        t.setFecha_estimada(fechaSeleccionada.getTime());
        costoTotal = costoTotal*Integer.valueOf(txtKilometros.getText());
        t.setCoste(costoTotal);
        log.guardarTraslado(t);
    }
    
//    public void calcularCosto(){
//        empresa
//        
//    }

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtNumLote = new javax.swing.JTextField();
        cmbProducto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtKilometros = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion1 = new javax.swing.JTextField();
        txtFechaNa = new com.toedter.calendar.JDateChooser();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Número de lote");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Dirección destino");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 310, -1));
        jPanel2.add(txtNumLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 310, -1));

        cmbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Cloro", "Plomo", "Amoniaco", "Cianuro" }));
        jPanel2.add(cmbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 310, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Kilometros");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        jPanel2.add(txtKilometros, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 310, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Fecha estimada");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        jPanel2.add(txtDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 310, -1));
        jPanel2.add(txtFechaNa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 310, 30));

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
         this.solicitudTraslado();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCancelarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDireccion1;
    private com.toedter.calendar.JDateChooser txtFechaNa;
    private javax.swing.JTextField txtKilometros;
    private javax.swing.JTextField txtNumLote;
    // End of variables declaration//GEN-END:variables
}
