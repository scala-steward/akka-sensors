import sbt.addSbtPlugin
addSbtPlugin("com.github.sbt"    % "sbt-git"              % "2.0.1")
addSbtPlugin("dev.guardrail"     % "sbt-guardrail"        % "0.75.2")
addSbtPlugin("org.wartremover"   % "sbt-wartremover"      % "3.1.3")
addSbtPlugin("net.vonbuchholtz"  % "sbt-dependency-check" % "5.1.0")
addSbtPlugin("com.github.sbt"    % "sbt-native-packager"  % "1.9.16")
addSbtPlugin("com.timushev.sbt"  % "sbt-updates"          % "0.6.4")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"         % "2.5.0")
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype"         % "3.10.0")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"              % "2.1.1")
addSbtPlugin("no.arktekk.sbt"    % "aether-deploy"        % "0.28.0")
addSbtPlugin("com.github.gseitz" % "sbt-release"          % "1.0.13")
addSbtPlugin("org.scoverage"     % "sbt-scoverage"        % "2.0.9")

ThisBuild / libraryDependencySchemes ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
)
