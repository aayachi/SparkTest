name := "SparkTest"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.3"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.6.3"
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka" % "1.6.3"

libraryDependencies += "org.apache.kafka" %% "kafka" % "0.9.0.1"
libraryDependencies += "org.apache.kafka" % "kafka-log4j-appender" % "0.9.0.1"

