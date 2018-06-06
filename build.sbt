name := "SparkTest"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.3"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.6.3"
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka" % "1.6.3"

libraryDependencies += "org.apache.kafka" %% "kafka" % "0.9.0.1"
libraryDependencies += "org.apache.kafka" % "kafka-log4j-appender" % "0.9.0.1"

libraryDependencies += "org.json4s" %% "json4s-native" % "3.5.3"
libraryDependencies += "org.apache.kafka" %% "kafka" % "1.1.0" exclude("org.slf4j", "slf4j-api")
libraryDependencies += "org.apache.kafka" % "kafka-log4j-appender" % "1.1.0"
libraryDependencies += "net.manub" %% "scalatest-embedded-kafka" % "1.1.0" % "test"
libraryDependencies += "commons-daemon" % "commons-daemon" % "1.1.0"
libraryDependencies += "com.typesafe" % "config" % "1.3.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
libraryDependencies += "com.holdenkarau" %% "spark-testing-base" % "1.6.3_0.9.0" % Test

libraryDependencies += "org.apache.hbase" % "hbase-client" % "1.4.4"
libraryDependencies += "org.apache.hbase" % "hbase-common" % "1.4.4"
libraryDependencies += "org.apache.hadoop" % "hadoop-mapred" % "0.22.0"

libraryDependencies += "joda-time" % "joda-time" % "2.9.9"
libraryDependencies += "org.joda" % "joda-convert" % "2.0.1"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", _ @ _*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}

evictionWarningOptions in update := EvictionWarningOptions.default
  .withWarnTransitiveEvictions(false)
  .withWarnDirectEvictions(false)
  .withWarnScalaVersionEviction(false)

parallelExecution in Test := false

logLevel in assembly := Level.Error
