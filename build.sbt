scalaVersion := "2.12.2"
organization := "com.github.fommil"
name := "spray-json-shapeless"
sonatypeGithub := ("fommil", "spray-json-shapeless")
licenses := Seq(Apache2)

scalacOptions in Test -= "-Ywarn-value-discard"

libraryDependencies ++= Seq(
  "io.spray" %% "spray-json" % "1.3.2"
) ++ shapeless.value

mimaPreviousArtifacts := Set(organization.value %% name.value % "1.3.0")
