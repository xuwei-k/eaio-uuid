scalaVersion := "2.12.8"

name := "eaio-uuid"

organization := "com.github.xuwei-k"

javacOptions in compile ++= Seq("-target", "8", "-source", "8", "-Xlint:deprecation")

javacOptions in (Compile, doc) ++= Seq("-locale", "en_US")

version := "3.5.0-SNAPSHOT"

licenses := Seq("MIT License" -> url("https://opensource.org/licenses/mit-license"))

homepage := Some(url("https://github.com/xuwei-k/eaio-uuid"))

pomExtra := (
  <developers>
    <developer>
      <id>xuwei-k</id>
      <name>Kenji Yoshida</name>
      <url>https://github.com/xuwei-k</url>
    </developer>
  </developers>
  <scm>
    <url>git@github.com:xuwei-k/eaio-uuid.git</url>
    <connection>scm:git:git@github.com:xuwei-k/eaio-uuid.git</connection>
  </scm>
)

description := "An implementation of the UUIDs and GUIDs specification in Java. UUIDs are 128 bit long identifiers that are guaranteed to be unique."

publishMavenStyle := true

crossPaths := false

autoScalaLibrary := false

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % "test",
)
