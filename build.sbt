lazy val business = (project in file("modules/business"))
  .enablePlugins(PlayJava).enablePlugins(SbtWeb).enablePlugins(PlayEbean)

lazy val root = (project in file("."))
  .settings(
    Common.settings(Common.appName),
    javaOptions += s"-Dconfig.resource=application.dev.conf"
  )
  .enablePlugins(PlayJava)
  .aggregate(business)
  .dependsOn(business)

libraryDependencies ++= Common.commonDependencies

