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
