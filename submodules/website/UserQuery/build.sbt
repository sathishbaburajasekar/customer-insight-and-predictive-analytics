
name := "user-query"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.10" % "1.1.1")

resolvers ++= Seq(
  "Akka Repository" at "http://repo.akka.io/releases/",
  "Spark RC5" at "https://repository.apache.org/content/repositories/orgapachespark-051/",
  "Spray Repository" at "http://repo.spray.cc/")









