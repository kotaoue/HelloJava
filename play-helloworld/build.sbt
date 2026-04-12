name := "play-helloworld"
version := "1.0-SNAPSHOT"
scalaVersion := "2.13.15"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies += guice
