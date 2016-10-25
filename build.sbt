organization := "br.com.iriarte"
name := "spotify-client-scala"
version := "0.1"

scalaVersion := "2.11.8"
scalacOptions ++= Seq("-unchecked", "-deprecation","-feature")

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "io.github.finagle" %"featherbed_2.11" %"0.2.1-SNAPSHOT",
  "com.github.melrief" %% "pureconfig" % "0.3.1.1",
  "com.softwaremill.macwire" %% "macros" % "2.2.4" % "provided",
  "com.softwaremill.macwire" %% "util" % "2.2.4",
  "com.softwaremill.macwire" %% "proxy" % "2.2.4",
  "org.scalacheck" %% "scalacheck" % "1.13.3" % "test"
)