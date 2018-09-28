package loginPage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awasa
 */
import java.io.IOException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;


public class SendBillTLS {
    
    String mail;
    
    public SendBillTLS(String email)
    {
        mail=email;
    }
    
    public void Execute()
        {
            final String username = "johnrambo7112903@gmail.com";
            final String password = "anu@1234";

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
	  });

            try {
                    // creates a new e-mail message
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress("johnrambo7112903@gmail.com"));
                    message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(mail));
                    message.setSubject("No reply.\nThis is e-bill of your recent purchase");
                    // creates message part
                    MimeBodyPart messageBodyPart = new MimeBodyPart();
                    messageBodyPart.setContent(message, "text/html");
                    // creates multi-part
                    Multipart multipart = new MimeMultipart();
                    // adds attachments
                    MimeBodyPart attachPart = new MimeBodyPart();
                    try {
                        attachPart.attachFile("d:/SDL/InventoryManagement/src/checkout/bill.csv");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    attachPart.setFileName("bill.csv");
                    multipart.addBodyPart(attachPart);
                    // sets the multipart as message's content
                    message.setContent(multipart);
                    Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
        }
}
    