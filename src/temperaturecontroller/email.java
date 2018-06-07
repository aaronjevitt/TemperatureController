import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class email {

	public static void main(String[] args) {

		final String username = "troop709webmaster@gmail.com";
		final String password = "mwymauuywfbnkezu";

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
			message.setFrom(new InternetAddress("troop709webmaster@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("aaron.jevitt@gmail.com"));
			message.setSubject("Heater Controller Status");
			message.setText("You are almost up to temp");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
                        System.out.println("failed to use correct password and username");
//throw new RuntimeException(e);
		}
	}
}