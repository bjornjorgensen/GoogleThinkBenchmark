name := "GoogleThinkBenchmark"

version := "0.1"

scalaVersion := "2.12.17"

// Add JMH plugin
enablePlugins(JmhPlugin)

// Add any additional library dependencies here
libraryDependencies ++= Seq(
  "com.google.crypto.tink" % "tink" % "1.9.0"
)