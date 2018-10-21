/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class empMailTLS {
    
    String name,usr,pswd,mail;
    
    public empMailTLS(String empName,String usr,String pswd,String mail)
    {
        name=empName;
        this.usr=usr;
        this.pswd=pswd;
        this.mail=mail;
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
                    message.setSubject("Welcome "+name+"!!");
                    message.setText("Hello!\n\tThis mail contains your username and default password for the system. Please change password later for security.\n\tUSERNAME: "+usr+"\n\tPASSWORD: "+pswd+"\n\n\t~Manager.");
                    Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
        }
}
