/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafica;

import Dominio.Productor;
import Persistencia.ProductorDAO;
import java.util.List;

/**
 *
 * @author hoshi
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal(Productor productor) {
        initComponents();
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
        btnRegistrarProductos = new javax.swing.JButton();
        btnConsultaTraslados = new javax.swing.JButton();
        lblMenuPrincipal = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSolicitudEmpresas.setBackground(new java.awt.Color(255, 255, 255));
        btnSolicitudEmpresas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSolicitudEmpresas.setText("Solicitud Empresa");
        btnSolicitudEmpresas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSolicitudEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudEmpresasActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitudEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 200, 70));

        btnRegistrarProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarProductos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnRegistrarProductos.setText("Registrar Productos");
        btnRegistrarProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarProductos.setPreferredSize(new java.awt.Dimension(159, 29));
        btnRegistrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 200, 70));

        btnConsultaTraslados.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultaTraslados.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnConsultaTraslados.setText("Consulta Traslados");
        btnConsultaTraslados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultaTraslados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaTrasladosActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultaTraslados, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 200, 70));

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

    private void btnSolicitudEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudEmpresasActionPerformed
        // TODO add your handling code here:
        ProductorDAO productorDAO = new ProductorDAO();
        List<Productor> productores = productorDAO.buscarNombreEmpresa(lblNombreEmpresa.getText());
        
        this.setVisible(false);
        FrmSeleccionEmpresa seleccion= new FrmSeleccionEmpresa(productores.get(0));
        seleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSolicitudEmpresasActionPerformed

    private void btnRegistrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductosActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FrmRegistrarProductos registroProductos= new FrmRegistrarProductos();
        registroProductos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarProductosActionPerformed

    private void btnConsultaTrasladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaTrasladosActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FrmConsultaTraslados traslados= new FrmConsultaTraslados();
        traslados.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaTrasladosActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaTraslados;
    private javax.swing.JButton btnRegistrarProductos;
    private javax.swing.JButton btnSolicitudEmpresas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblNombreEmpresa;
    // End of variables declaration//GEN-END:variables
}
