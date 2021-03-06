name := """products"""
organization := "tech.morma"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.6"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "net.sf.barcode4j" % "barcode4j" % "2.0"
libraryDependencies += jdbc
libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.2"
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.4"



// Adds additional packages into Twirl
//TwirlKeys.templateImports += "tech.morma.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "tech.morma.binders._"
