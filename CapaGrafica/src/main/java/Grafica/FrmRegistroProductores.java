/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafica;

import Dominio.Productor;
import Dominio.Residuo;
import Persistencia.ProductorDAO;
import com.mycompany.capalogica.FachadaLogica;
import com.mycompany.capalogica.ILogica;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author hoshi
 */
public class FrmRegistroProductores extends javax.swing.JFrame {

    /**
     * Variable de de tipo ILogica y de 
     * tipo entero
     */
    private int numIdentificador;
    private ILogica log;

    
    /**
     * Metodo constructor de la clase.
     */
    public FrmRegistroProductores() {
        initComponents();
        Random random = new Random();
        numIdentificador = random.nextInt(1000);
        jLabel3.setText(String.valueOf(numIdentificador));
        log = new FachadaLogica();
    }

    /**
     * Metodo que se encarga de registrar al productor
     * dependiendo de los datos puestos por el usuario.
     */
    public void registrarProductor() {
        Productor p = new Productor();
        p.setNombreEmpresa(txtNombreEmpresa.getText());
        System.out.println(txtNombreProductor.getText());
        p.setNombreEncargado(txtNombreProductor.getText());
        p.setNumeroIdentificador(numIdentificador);
        Residuo residuo = new Residuo();
        residuo.setCodigo(234);
        residuo.setDescripcion("Muy peligroso, altamente radioactivo");
        residuo.setTipo("Plomo");
        p.addResiduos(residuo);
        Residuo residuo2 = new Residuo();
        residuo2.setCodigo(333);
        residuo2.setDescripcion("Gas incoloro con un olor característico");
        residuo2.setTipo("Amoniaco");
        p.addResiduos(residuo2);
        Residuo residuo3 = new Residuo();
        residuo3.setCodigo(453);
        residuo3.setDescripcion("Gas amarillo-verdoso formado por moléculas diatómicas de cloro");
        residuo3.setTipo("Cloro");
        p.addResiduos(residuo3);
        Residuo residuo4 = new Residuo();
        residuo4.setCodigo(259);
        residuo4.setDescripcion("Grupo químico que consiste de un átomo de carbono conectado a un átomo de nitrógeno por tres enlaces");
        residuo4.setTipo("Cianuro");
        p.addResiduos(residuo4);
        log.guardarProductor(p);
        
    }

    /**
     * Método que nos ayuda para que no existan vacíos dentro del cuadro de
     * texto.
     *
     * @return regreso
     */
    public boolean validarVacios() {
        boolean error = true;

        if (txtNombreEmpresa.getText().equals("")
                && txtNombreProductor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Favor de no dejar campos sin llenar", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return error;
    }

    /**
     * Método de validación que solo permite letras y el espacio
     *
     * @param evento evt
     */
    public void validarNombre(java.awt.event.KeyEvent evento) {
        if (evento.getKeyChar() >= 33 && evento.getKeyChar() <= 64
                || evento.getKeyChar() >= 91 && evento.getKeyChar() <= 96
                || evento.getKeyChar() >= 123 && evento.getKeyChar() <= 127) {

            evento.consume();

        }
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
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblNombreProductor = new javax.swing.JLabel();
        lblNumeroIdentificador = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtNombreProductor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-logout-leave.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setOpaque(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreEmpresa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNombreEmpresa.setText("Nombre Empresa");
        jPanel2.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lblNombreProductor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNombreProductor.setText("Nombre Productor");
        jPanel2.add(lblNombreProductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lblNumeroIdentificador.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNumeroIdentificador.setText("Número Identificador");
        jPanel2.add(lblNumeroIdentificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txtNombreEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpresaActionPerformed(evt);
            }
        });
        txtNombreEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmpresaKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 250, 50));

        txtNombreProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductorActionPerformed(evt);
            }
        });
        txtNombreProductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProductorKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombreProductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 250, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("aqui va");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 240, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 640, 370));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 0));
        jLabel5.setText("Registro de productores");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 170, 60));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 160, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registroProducto 1.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Nada.
     * @param evt parámetro evento
     */
    private void txtNombreEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpresaActionPerformed

    }//GEN-LAST:event_txtNombreEmpresaActionPerformed

    /**
     * Metodo que regresa al menu principal
     * @param evt parámetro evento
     */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FrmLoginProductores login = new FrmLoginProductores();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * Metodo que se encarga de llamar al metodo registrar productor
     * y confirma la accion
     * @param evt parámetro evento
     */
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        
       if (validarVacios()){
           this.registrarProductor();

        int result = JOptionPane.showOptionDialog(this, "Se agrego correctamente", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

        if (result == JOptionPane.OK_OPTION) {
            FachadaLogica log= new FachadaLogica();
        log.registrarInformacion();
            this.setVisible(false);
            FrmLoginProductores login = new FrmLoginProductores();
            login.setVisible(true);
            this.dispose();
        } else {

        }
       }

    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * Llama al método validar nombre.
     * @param evt parámetro evento
     */
    private void txtNombreProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductorActionPerformed

    /**
     * Llama al método validar nombre.
     * @param evt parámetro evento
     */
    private void txtNombreEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpresaKeyTyped
        validarNombre(evt);
    }//GEN-LAST:event_txtNombreEmpresaKeyTyped

    /**
     * Llama al método validar nombre.
     * @param evt parámetro evento
     */
    private void txtNombreProductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductorKeyTyped
        validarNombre(evt);
    }//GEN-LAST:event_txtNombreProductorKeyTyped

    /**
     * Cancelar acción.
     * @param evt parámetro evento
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtNombreEmpresa.setText(" ");
        txtNombreProductor.setText(" ");

        int result = JOptionPane.showOptionDialog(this, "¿Seguro que quieres cancelar la acción?", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

        if (result == JOptionPane.OK_OPTION) {
            this.setVisible(false);

            FrmLoginProductores login = new FrmLoginProductores();
            login.setVisible(true);
            this.dispose();
        } else {

        }
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
//            java.util.logging.Logger.getLogger(FrmRegistroProductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmRegistroProductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmRegistroProductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmRegistroProductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               // new FrmRegistroProductores().setVisible(true);
//            }
//        });
//    }
    /**
     * Componentes del frame FrmRegistrarProductores
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblNombreProductor;
    private javax.swing.JLabel lblNumeroIdentificador;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtNombreProductor;
    // End of variables declaration//GEN-END:variables
}
