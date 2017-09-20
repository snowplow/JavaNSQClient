/*
 * Copyright (c) 2014-2017 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at
 * http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and
 * limitations there under.
 */
lazy val root = project.in(file("."))
  .settings(
    name        := "nsq-java-client",
    version     := "1.0.0-rc4",
    description := "Fast Java client for NSQ"
  )
  .settings(BuildSettings.buildSettings)
  .settings(BuildSettings.publishSettings)
  .settings(
    libraryDependencies ++= Seq(
      Dependencies.Libraries.log4jApi,
      Dependencies.Libraries.log4jCore,
      Dependencies.Libraries.netty,
      Dependencies.Libraries.guava,
      Dependencies.Libraries.jacksonDatabind,
      Dependencies.Libraries.commonsPool,
      // (test only)
      Dependencies.Libraries.nettyTcnativeLinux,
      Dependencies.Libraries.nettyTcnativeWindows,
      Dependencies.Libraries.nettyTcnativeOSX,
      Dependencies.Libraries.junitInterface
    )
  )

shellPrompt := { _ => "nsq-client> " }
