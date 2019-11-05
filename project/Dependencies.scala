import sbt._

object Dependencies {

  object Versions {
    val cats          = "2.0.0"
    val catsEffect    = "2.0.0"
    val catsMeowMtl   = "0.4.0"
    val catsRetry     = "0.3.1"
    val circe         = "0.12.2"
    val ciris         = "1.0.0"
    val javaxCrypto   = "1.0.1"
    val fs2           = "2.0.0"
    val http4s        = "0.21.0-M5"
    val http4sJwtAuth = "0.0.3"
    val log4cats      = "1.0.0"
    val newtype       = "0.4.3"
    val refined       = "0.9.10"
    val redis4cats    = "0.9.1"
    val skunk         = "0.0.4+25-afe55d7f-SNAPSHOT"
    val squants       = "1.5.0"

    val betterMonadicFor = "0.3.0"
    val kindProjector    = "0.11.0"
    val logback          = "1.2.3"

    val scalaCheck = "1.14.1"
    val scalaTest  = "3.0.8"
  }

  object Libraries {
    def catsRetry(artifact: String): ModuleID = "com.github.cb372" %% s"cats-retry-$artifact" % Versions.catsRetry

    def circe(artifact: String): ModuleID  = "io.circe"   %% artifact % Versions.circe
    def ciris(artifact: String): ModuleID  = "is.cir"     %% artifact % Versions.ciris
    def http4s(artifact: String): ModuleID = "org.http4s" %% artifact % Versions.http4s

    lazy val cats        = "org.typelevel" %% "cats-core"     % Versions.cats
    lazy val catsMeowMtl = "com.olegpy"    %% "meow-mtl-core" % Versions.catsMeowMtl
    lazy val catsEffect  = "org.typelevel" %% "cats-effect"   % Versions.catsEffect
    lazy val squants     = "org.typelevel" %% "squants"       % Versions.squants
    lazy val fs2         = "co.fs2"        %% "fs2-core"      % Versions.fs2

    lazy val catsRetryCore   = catsRetry("core")
    lazy val catsRetryEffect = catsRetry("cats-effect")

    lazy val circeCore       = circe("circe-core")
    lazy val circeGeneric    = circe("circe-generic")
    lazy val circeGenericExt = circe("circe-generic-extras")
    lazy val circeParser     = circe("circe-parser")
    lazy val circeRefined    = circe("circe-refined")

    lazy val cirisCore    = ciris("ciris")
    lazy val cirisEnum    = ciris("ciris-enumeratum")
    lazy val cirisRefined = ciris("ciris-refined")

    lazy val http4sDsl    = http4s("http4s-dsl")
    lazy val http4sServer = http4s("http4s-blaze-server")
    lazy val http4sClient = http4s("http4s-blaze-client")
    lazy val http4sCirce  = http4s("http4s-circe")

    lazy val http4sJwtAuth = "dev.profunktor" %% "http4s-jwt-auth" % Versions.http4sJwtAuth

    lazy val refinedCore = "eu.timepit" %% "refined"      % Versions.refined
    lazy val refinedCats = "eu.timepit" %% "refined-cats" % Versions.refined

    lazy val log4cats = "io.chrisdavenport" %% "log4cats-slf4j" % Versions.log4cats
    lazy val newtype  = "io.estatico"       %% "newtype"        % Versions.newtype

    lazy val javaxCrypto = "javax.xml.crypto" % "jsr105-api" % Versions.javaxCrypto

    lazy val redis4catsEffects  = "dev.profunktor" %% "redis4cats-effects"  % Versions.redis4cats
    lazy val redis4catsLog4cats = "dev.profunktor" %% "redis4cats-log4cats" % Versions.redis4cats

    lazy val skunkCore = "org.tpolecat" %% "skunk-core" % Versions.skunk

    // Compiler plugins
    lazy val betterMonadicFor = "com.olegpy"    %% "better-monadic-for" % Versions.betterMonadicFor
    lazy val kindProjector    = "org.typelevel" % "kind-projector"      % Versions.kindProjector

    // Runtime
    lazy val logback = "ch.qos.logback" % "logback-classic" % Versions.logback

    // Test
    lazy val scalaTest      = "org.scalatest"  %% "scalatest"        % Versions.scalaTest
    lazy val scalaCheck     = "org.scalacheck" %% "scalacheck"       % Versions.scalaCheck
    lazy val catsEffectLaws = "org.typelevel"  %% "cats-effect-laws" % Versions.catsEffect
  }

}
