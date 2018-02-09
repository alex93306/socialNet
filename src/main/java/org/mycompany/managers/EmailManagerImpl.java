package org.mycompany.managers;


import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EmailManagerImpl implements EmailManager {

    public static void main(String[] args) {
        new EmailManagerImpl().sendEmail(null, null, null);
    }
    
    @Override
    public void sendEmail(String email, String subject, String text) throws IOException {
        
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("/resources/mail.properties");
        props.load(fis);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication((String) props.get("login"), (String) props.get("password"));
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("from-email@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("alex93306@gmail.com"));
            message.setSubject(subject);
            message.setText(text);

            Transport.send(message);

            System.out.println("Done");
            
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
