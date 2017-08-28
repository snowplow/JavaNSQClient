/*
 * Copyright (c) 2014 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */

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
    resolvers             ++= Dependencies.resolvers
  )

  lazy val publishSettings = bintraySettings ++ Seq(
  publishMavenStyle := true,
  publishArtifact := true,
  publishArtifact in Test := false,
  licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html")),
  bintrayOrganization := Some("snowplow"),
  bintrayRepository := "snowplow-maven",
  pomIncludeRepository := { _ => false },
  homepage := Some(url("http://snowplowanalytics.com")),
  scmInfo := Some(ScmInfo(url("https://github.com/snowplow/JavaNSQClient"),
    "scm:git@github.com:snowplow/JavaNSQClient.git")),
  pomExtra := (
    <developers>
      <developer>
        <name>Snowplow Analytics Ltd</name>
        <email>support@snowplowanalytics.com</email>
        <organization>Snowplow Analytics Ltd</organization>
        <organizationUrl>http://snowplowanalytics.com</organizationUrl>
      </developer>
    </developers>)
  )
}
