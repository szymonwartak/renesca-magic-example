name := "renesca-example"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.github.renesca" %% "renesca-magic" % "0.3.4-1"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
