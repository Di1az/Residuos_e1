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
    private final Properties properties = new Properties();
	
	private static String password = "qhmwutzmyjdcjfra";
        private static String emailForm = "traslados.productos@gmail.com";
 
	private Session session;
        
	private void init() {
            
		properties.put("mail.smtp.host", "mail.gmail.com");
                properties.put("mail.smtp.ssl.host.trust", "smtp.gmail.com");
		properties.setProperty("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.smtp.port","587");
                properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
                properties.setProperty("mail.smtp.auth", "true");
                    
                //Usuario para el correo
		properties.setProperty("mail.smtp.user", emailForm);
 
		session = Session.getDefaultInstance(properties);
                
        }
 
	public void sendEmail(String receptor, String traslado){
		init();
		try{
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(emailForm));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(receptor));
			message.setSubject("Traslado -  petición");
			message.setText(traslado, "ISO-8859-1", "html");
                        
                        //Envio
			Transport t = session.getTransport("smtp");
			t.connect(emailForm, CorreoDAO.password);
			t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
			t.close();
                        
                        JOptionPane.showMessageDialog(null,"Correo enviado exitosamente a la empresa transportista");
		}catch (MessagingException me){
                        //Error en la conexion al servidor de correos
//                        Logger.getLogger(CorreoDAO.class).log(Level.SEVERE,null,me);
			return;
		}
		
	}
}
