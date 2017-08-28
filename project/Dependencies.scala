/*
 * Copyright (c) 2016-2017 Snowplow Analytics Ltd. All rights reserved.
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
import sbt._

object Dependencies {
  object V {
    val log4jApi        = "2.6.2"
    val log4jCore       = "2.6.2"
    val netty           = "4.1.15.Final"
    val guava           = "19.0"
    val jacksonDatabind = "2.8.8"
    val commonsPool     = "2.4.2"
    // (test only)
    val junitInterface  = "0.8"
    val nettyTcnative   = "2.0.6.Final"
  }

  object Libraries {
    val log4jApi              = "org.apache.logging.log4j"   % "log4j-api"             % V.log4jApi
    val log4jCore             = "org.apache.logging.log4j"   % "log4j-core"            % V.log4jCore
    val netty                 = "io.netty"                   % "netty-all"             % V.netty
    val guava                 = "com.google.guava"           % "guava"                 % V.guava
    val jacksonDatabind       = "com.fasterxml.jackson.core" % "jackson-databind"      % V.jacksonDatabind
    val commonsPool           = "org.apache.commons"         % "commons-pool2"         % V.commonsPool
    // (test only)
    val junitInterface        = "com.novocode"               % "junit-interface"       % V.junitInterface % "test"
    val nettyTcnativeLinux    = "io.netty"                   % "netty-tcnative"        % V.nettyTcnative  % "test" classifier "linux-x86_64"
    val nettyTcnativeWindows  = "io.netty"                   % "netty-tcnative"        % V.nettyTcnative  % "test" classifier "osx-x86_64"
    val nettyTcnativeOSX      = "io.netty"                   % "netty-tcnative"        % V.nettyTcnative  % "test" classifier "windows-x86_64"
  }
}
