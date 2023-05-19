/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafica;

import Dominio.Empresa_transportista;
import Dominio.Productor;
import Dominio.Traslado;
import Persistencia.ProductorDAO;
import subsistemaTraslado.ITraslado;
import com.mycompany.capalogica.FachadaLogica;
import com.mycompany.capalogica.ILogica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import subsistemaTraslado.FachadaTraslado;

/**
 *
 * @author hoshi
 */
public class FrmConsultaTraslados extends javax.swing.JFrame {
    
    //Atributo Empresa Transportista
    List<Traslado> resultados = new ArrayList<>();
    //Atributo Inferfaz log
    ILogica log;
    ITraslado tras;
    
    Productor productorInicializado;
    /**
     * Creates new form FrmConsultaTraslados
     * @param productor parámetro productor
     */
    public FrmConsultaTraslados(Productor productor) {
        initComponents();
        this.productorInicializado = productor;
        log = new FachadaLogica();
        tras=new FachadaTraslado();
        buscarTraslados();
    }

    /**
     * Método que busca el traslado y manda los datos a la tabla para que pueda
     * introducir los valores.
     */
     private void buscarTraslados() {
        
        resultados = tras.buscarTodosT();

        //resultados = empresaDAO.desencriptarPersonaLista(resultados);
        // Realizar la consulta utilizando CriteriaBuilder según la opción seleccionada en cmbSeleccion
        
        
        DefaultTableModel model = (DefaultTableModel) tblResultados.getModel();
        model.setRowCount(0);
        if (resultados != null) {
            for (Traslado t : resultados) {

                //String n = t.getNombre();
                //String destino = t.getDestino().toString();
                model.addRow(new Object[]{ t.getCantidad_residuos(),t.getKilometros(), t.getFecha_traslado(), t.getDestino()});

            }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        lblSolicitud = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblPopo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad Residuos", "Kilometros", "Fecha Traslado", "Destino"
            }
        ));
        jScrollPane1.setViewportView(tblResultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 860, 460));

        lblSolicitud.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblSolicitud.setForeground(new java.awt.Color(102, 102, 0));
        lblSolicitud.setText("Consulta Solicitudes Traslados");
        jPanel1.add(lblSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-logout-leave.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pantallaTabla 3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblPopo.setText("jLabel2");
        jPanel1.add(lblPopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

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
     * Método action event del botón regresar.
     * @param evt parámetro evento
     */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FrmMenuPrincipal menu = new FrmMenuPrincipal(productorInicializado);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
//            java.util.logging.Logger.getLogger(FrmConsultaTraslados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmConsultaTraslados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmConsultaTraslados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmConsultaTraslados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmConsultaTraslados().setVisible(true);
//            }
//        });
//    }
/**
 * Componentes del frame FrmConsultaTraslados
 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPopo;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JTable tblResultados;
    // End of variables declaration//GEN-END:variables
}
