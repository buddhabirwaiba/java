package mail;


import  java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
        
public class javamail extends Authenticator{
    static String from="usbuwaiba@gmail.com";
    static String pass="pkns kohv qmxn sxio";
    private static InternetAddress to;
    public static void main(String[] args) throws MessagingException {
        //Get the session object
        Properties properties= System.getProperties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        //start TLS(transport layer security)

        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.user",from);
        properties.put("mail.smtp.password",pass);
        Session session=Session.getDefaultInstance(properties);

        //compose the message
        MimeMessage msg=new MimeMessage(session);
        msg.setFrom(new InternetAddress("usbuwaiba@gmail.com"));
        to=new InternetAddress("buddhaatamang123@gmail.com");
        msg.addRecipient(Message.RecipientType.TO,to);
        msg.setSubject("Test java mail");
        msg.setText("hello, this is example of sending email");
        //send message
        Transport transport=session.getTransport("smtp");
        transport.connect("smtp.gmail.com",from,pass);
        transport.sendMessage(msg,msg.getAllRecipients());
        System.out.println("Message sent successfully...");
    }
}
