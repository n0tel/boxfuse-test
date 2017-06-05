name := "testProject"

version := "1.1"

lazy val `testproject` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  cache ,
  ws   ,
  "net.codingwell" %% "scala-guice" % "4.0.1",
  // postgre
  "org.postgresql" % "postgresql" % "42.0.0",
  // slick
  "com.typesafe.play" %% "play-slick" % "2.1.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "2.1.0",
  // slick-pg
  "com.github.tminglei" %% "slick-pg" % "0.15.0",
  "com.github.tminglei" %% "slick-pg_joda-time" % "0.15.0",
  specs2 % Test )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  