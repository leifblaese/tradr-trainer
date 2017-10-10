lazy val libdeps = Seq(
  "org.apache.spark" %% "spark-core" % "2.2.0",
  "org.apache.spark" %% "spark-sql" % "2.2.0",
  "org.apache.spark" %% "spark-mllib" % "2.2.0",

  "tradr" %% "tradr-common" % "0.0.+",
  "tradr" %% "tradr-models" % "0.0.+"
)





lazy val root = (project in file("."))
  .settings(Seq(
    name := "tradr-trainer",
    organization := "tradr",
    scalaVersion := "2.11.11",
    version := "0.0.1",
    libraryDependencies ++= libdeps,
    assemblyJarName in assembly :=  s"${name.value}_${scalaVersion.value}-${version.value}.jar"
  ))

