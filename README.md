# MailSend

This PlayFramework 2 application shows how to send emails using the Play 1.x approach.
This plugin uses Emailer plugin from TypeSafe (https://github.com/typesafehub/play-plugins/tree/master/mailer)

## Instalation

* Change SMTP properties on conf/application.conf
* Change the test user email in app/Global.java 

## Using MailSend:

```java
import com.relloder.notification.Mailer;
import views.html.notifiers.welcome;
import views.html.notifiers.lostpassword;

public class Mails extends Mailer {

	
public static void welcome(User user) {
		setSubject("Welcome %s", user.name);
		addRecipient(user.email);
		addFrom(no-reply <no-reply@example.com>);
		// get html and process the args in the view
		String mail = welcome.render(user).body();
		send(mail);
	}

	public static void lostPassword(User user) {
		String newpassword = user.password;
		addFrom(Robot <robot@example.com>);
		setSubject("Your password has been reset");
		addRecipient(user.email);
		String mail = lostpassword.render(user, newpassword).body();
		send(mail);
	}
}
```

## Licence

This software is licensed under the Apache 2 license, quoted below.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.