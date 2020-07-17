lazy val root = project
  .in(file("."))
  .settings(
    name := "nsq-java-client",
    version := "1.3.0-M1",
    description := "Fast Java client for NSQ",
    autoScalaLibrary := false
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
