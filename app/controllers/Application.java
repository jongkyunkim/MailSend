package controllers;

import models.User;
import notifiers.Mails;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.sent;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render("MailSend Example"));
	}

	public static Result welcome() {
		User user = User.find.all().get(0);
		// sends email
		Mails.welcome(user);
		return ok(sent.render(user));
	}

	public static Result lostPassword() {
		User user = User.find.all().get(0);
		// sends email
		Mails.lostPassword(user);
		return ok(sent.render(user));
	}

}