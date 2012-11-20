import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "MailSend"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
    	"com.typesafe" %% "play-plugins-mailer" % "2.0.4"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
    )

}
