name := "implicit-poly-prune-2.12.x-failure"

description := "implicit-poly-prune-2.12.x-failure"

scalaVersion := "2.12.6"

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-language:implicitConversions",
  "-feature",
  "-Xlint",
  "-Ywarn-unused-import",
  "-opt:l:inline",
  "-opt-inline-from:<sources>",
)
