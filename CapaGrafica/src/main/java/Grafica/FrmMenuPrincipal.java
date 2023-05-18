/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafica;

import Dominio.Productor;
import Persistencia.ProductorDAO;
import com.mycompany.capalogica.FachadaLogica;
import java.util.List;

/**
 *
 * @author hoshi
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    //Atributo productor
    private Productor productorIniciado;
    /**
     * Creates new form FrmMenuPrincipal
     * @param productor parámetro productor
     */
    public FrmMenuPrincipal(Productor productor) {
        initComponents();
        this.productorIniciado = productor;
        lblNombreEmpresa.setText(productor.getNombreEmpresa());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSolicitudEmpresas = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnConsultaTraslados1 = new javax.swing.JButton();
        lblMenuPrincipal = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSolicitudEmpresas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSolicitudEmpresas.setText("Solicitud Empresa");
        btnSolicitudEmpresas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSolicitudEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudEmpresasActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitudEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 230, 100));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCerrar.setText("Cerrar sesion");
        btnCerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 170, 40));

        btnConsultaTraslados1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnConsultaTraslados1.setText("Consulta Traslados");
        btnConsultaTraslados1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultaTraslados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaTraslados1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultaTraslados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 230, 100));

        lblMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lblMenuPrincipal.setForeground(new java.awt.Color(102, 102, 0));
        lblMenuPrincipal.setText("Menú Principal");
        jPanel1.add(lblMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));
        jPanel1.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 60, 90, 20));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame 4.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
     * Método action performed que va a la pantalla de frmSolicitudEmpresas.
     * @param evt parámetro evento
     */
    private void btnSolicitudEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudEmpresasActionPerformed
        // TODO add your handling code here:
        FachadaLogica log= new FachadaLogica();
        log.registrarInformacion();
        this.setVisible(false);
        FrmSeleccionEmpresa seleccion= new FrmSeleccionEmpresa(productorIniciado);
        seleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSolicitudEmpresasActionPerformed

    /**
     * Método action performed que va a la pantalla de frmConsultaTraslado.
     * @param evt parámetro evento
     */
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        FrmLoginProductores login= new FrmLoginProductores();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnConsultaTraslados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaTraslados1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultaTraslados1ActionPerformed

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
//            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmMenuPrincipal().setVisible(true);
//            }
//        });
//    }
    /**
     * Componentes del frame FrmMenuPrincipal
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConsultaTraslados1;
    private javax.swing.JButton btnSolicitudEmpresas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblNombreEmpresa;
    // End of variables declaration//GEN-END:variables
}
