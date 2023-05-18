/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

//import com.sun.istack.internal.logging.Logger;
import java.util.Properties;
import java.util.logging.Level;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author koine
 */
public class CorreoDAO {
    //Atributo de tipo properties, importado de una libreria de tipo properties
    private Properties properties;
	
        //Atributo estático contraseña, que es la contraseña del correo
	private static String password = "qhmwutzmyjdcjfra";
        //Atributo estático formato email, que es el correo
        private static String emailForm = "traslados.productos@gmail.com";
        
        //Atributo de tipo session, importado de una libreria de tipo session
	private Session session;
        //Atributo de tipo message, importado de una libreria de tipo message
        private MimeMessage message;

    /**
     * Constructor vacío, que inicializa el atributo properties.
     */
    public CorreoDAO() {
        properties = new Properties();
    }
        
        
        /**
         * Método init, que settea las propiedades del puerto, protocolos, y etc,
         * además agrega el tipo de dominio maneja, siendo, .gmail.com.
         */
	private void init() {
            
		properties.put("mail.smtp.host", "smtp.gmail.com");
                properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		properties.setProperty("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.smtp.port","587");
                properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
                properties.setProperty("mail.smtp.auth", "true");
                    
                //Usuario para el correo
		properties.setProperty("mail.smtp.user", emailForm);
 
		session = Session.getDefaultInstance(properties);
                
        }
        
//        private void crearEmail(){
//            properties.put("mail.smtp.host", "smtp.gmail.com");
//            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//            properties.setProperty("mail.smtp.starttls.enable", "true");
//            properties.setProperty("mail.smtp.port","587");
//            properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
//            properties.setProperty("mail.smtp.auth", "true");
//            properties.setProperty("mail.smtp.user", emailForm);
//        }
 
        /**
         * Método que toma el string receptor y el String traslado cómo 
         * parámetros y realiza el envio del correo al email de destino, 
         * dependiendo de los parámetros de traslado.
         * @param receptor parámetro receptor
         * @param traslado parámetro traslado
         */
	public void sendEmail(String receptor, String traslado){
		init();
		try{
			message = new MimeMessage(session);
			message.setFrom(new InternetAddress(emailForm));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(receptor));
			message.setSubject("Traslado -  petición");
			message.setText(traslado, "ISO-8859-1", "html");
                        
                        //Envio
			Transport t = session.getTransport("smtp");
			t.connect(emailForm, password);
			t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
			t.close();
                        
                        JOptionPane.showMessageDialog(null,"Correo enviado exitosamente a la empresa transportista");
		}catch (MessagingException me){
                        //Error en la conexion al servidor de correos
//                        Logger.getLogger(CorreoDAO.class).log(Level.SEVERE,null,me);
                        JOptionPane.showMessageDialog(null,"ERROR: el correo no pudo ser enviado!");
			return;
		}
		
	}
}
