 // SBT
import sbt._
import Keys._

// Bintray plugin
import bintray.BintrayPlugin._
import bintray.BintrayKeys._

object BuildSettings {

  // Build settings for our app
  lazy val buildSettings = Seq(
    organization          :=  "com.snowplowanalytics",
    scalaVersion          :=  "2.11.11",
    javacOptions          :=  javaCompilerOptions,
  )

  lazy val javaCompilerOptions = Seq(
    "-source", "1.8",
    "-target", "1.8"
  )
}
