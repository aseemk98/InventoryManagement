package ForgotPassword;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awasa
 */
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendMailTLS {
    
    String mail;
    String otp;
    
    public SendMailTLS(String email, String OTP)
    {
        mail=email;
       otp=OTP;
    }
    
    public String Execute()
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

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("johnrambo7112903@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,     
				InternetAddress.parse(mail));
			message.setSubject("Email Verification");
			message.setText("Yout One Time Password is "+otp+".\nDo no share this with anyone.");

			Transport.send(message);

			return "The OTP has been sent succesully.";

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
        }
}
    