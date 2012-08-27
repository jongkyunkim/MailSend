package com.relloder.notification;

import com.typesafe.plugin.MailerAPI;
import com.typesafe.plugin.MailerPlugin;

/**
 * 
 * Class similar to the Mailer class of Play 1.x using the Mailer plugin
 * from  https://github.com/typesafehub/play-plugins/tree/master/mailer
 *
 */
public class Mailer {

	private static MailerAPI mail = play.Play.application()
			.plugin(MailerPlugin.class).email();

	public static MailerAPI getMail() {
		return mail;
	}

	public static void setSubject(String subject) {
		mail.setSubject(subject);
	}
	
	public static void setSubject(String pattern, String subjects) {
		mail.setSubject(pattern, subjects);
	}

	public static void addRecipient(String recipient) {
		// "Peter Hausel Junior <noreply@email.com>"
		mail.addRecipient(recipient);
	}

	public static void addRecipient(String... recipients) {
		mail.addRecipient(recipients);
	}

	public static void addFrom(String from) {
		// "Peter Hausel Junior <noreply@email.com>"
		mail.addFrom(from);
	}

	public static void send(String html) {
		mail.sendHtml(html);
	}

	public static void sendText(String text) {
		mail.send(text);
	}
	
	public static String getEmailAndNameFormatted(String name, String email) {
		return name + " <" + email + ">";
	}

}
