// -*- mode: scala -*
import AssemblyKeys._

organization := "me.ycy"

name := "jackson-test1"

scalaVersion := "2.10.2"

version := "0.1"

net.virtualvoid.sbt.graph.Plugin.graphSettings

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xcheckinit", "-Xfatal-warnings")

assemblySettings

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.2.3",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.2.3"
)
