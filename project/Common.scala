import play.sbt.PlayImport._
import sbt.Keys._

object Common {
  def appName = "appName"

  // Common settings for every project
  def settings (theName: String) = Seq(
    name := theName,
    version := "1.0.55",
    scalaVersion := "2.12.11"
  )

  val commonDependencies = Seq(
    guice,
    javaJdbc,
    javaJpa,
    javaWs,
    evolutions
  )
}

