
val snapshotSuffix = "-SNAPSHOT"

version in ThisBuild := "0.3.2" + snapshotSuffix

isSnapshot := version.value.endsWith(snapshotSuffix)