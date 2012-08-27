import models.User;
import play.Application;
import play.GlobalSettings;

/**
 * User example loaded at Application start
 */
public class Global extends GlobalSettings {

	@Override
	public void onStart(Application application) {
		if (User.find.findRowCount() == 0) {
			User user = new User();
			user.name = "John Stuart";
			user.password = "123456";
			// user.email = "jstuart@example.com";
			user.email = "jstuart@example.com";
			user.save();
		}
	}

}
