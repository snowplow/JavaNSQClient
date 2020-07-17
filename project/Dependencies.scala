import sbt._

object Dependencies {
  object V {
    val log4j           = "2.13.3"
    val netty           = "4.1.51.Final"
    val guava           = "28.1-jre"
    val jacksonDatabind = "2.10.5"
    val commonsPool     = "2.8.0"
    val junitInterface  = "0.11"
    val nettyTcnative   = "2.0.31.Final"
  }

  object Libraries {
    val log4jApi             = "org.apache.logging.log4j"   % "log4j-api"        % V.log4j
    val log4jCore            = "org.apache.logging.log4j"   % "log4j-core"       % V.log4j
    val netty                = "io.netty"                   % "netty-all"        % V.netty
    val guava                = "com.google.guava"           % "guava"            % V.guava
    val jacksonDatabind      = "com.fasterxml.jackson.core" % "jackson-databind" % V.jacksonDatabind
    val commonsPool          = "org.apache.commons"         % "commons-pool2"    % V.commonsPool
    val junitInterface       = "com.novocode"               % "junit-interface"  % V.junitInterface % "test"
    val nettyTcnativeLinux   = ("io.netty"                  % "netty-tcnative"   % V.nettyTcnative  % "test").classifier("linux-x86_64")
    val nettyTcnativeWindows = ("io.netty"                  % "netty-tcnative"   % V.nettyTcnative  % "test").classifier("osx-x86_64")
    val nettyTcnativeOSX     = ("io.netty"                  % "netty-tcnative"   % V.nettyTcnative  % "test").classifier("windows-x86_64")
  }
}
