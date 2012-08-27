package notifiers;

import com.relloder.notification.Mailer;
import views.html.notifiers.welcome;
import views.html.notifiers.lostpassword;

import models.User;

public class Mails extends Mailer {

	public static final String noReply = "no-reply <no-reply@example.com>";

	public static void welcome(User user) {
		setSubject("Welcome %s", user.name);
		addRecipient(user.email);
		addFrom(noReply);
		// get html and process the args in the view
		String mail = welcome.render(user).body();
		send(mail);
	}

	public static void lostPassword(User user) {
		String newpassword = user.password;
		addFrom(noReply);
		setSubject("Your password has been reset");
		addRecipient(user.email);
		String mail = lostpassword.render(user, newpassword).body();
		send(mail);
	}

}
