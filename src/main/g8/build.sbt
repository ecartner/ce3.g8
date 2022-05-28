ThisBuild / organization := "$package$"
ThisBuild / scalaVersion := "3.1.2"
ThisBuild / javacOptions += "-Xlint:deprecation"
ThisBuild / scalacOptions += "-deprecation"
ThisBuild / version := "0.1-SNAPSHOT"


lazy val root = (project in file(".")).
  settings(
    name := "$name$",
    libraryDependencies += "org.typelevel" %% "cats-effect" % "3.3.12"
  )
