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
      resolvers += Resolver.url("Objectify Play Repository releases", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns),
      resolvers += Resolver.url("Objectify Play Repository snapshots", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns)
    )

}
