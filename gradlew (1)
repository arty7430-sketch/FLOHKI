#!/bin/sh
if [ ! -f "gradle/wrapper/gradle-wrapper.jar" ]; then
  echo "Gradle wrapper JAR is not bundled. Open this project in Android Studio and let it sync, or generate the wrapper with Gradle 8.13."
  exit 1
fi
exec java -classpath gradle/wrapper/gradle-wrapper.jar org.gradle.wrapper.GradleWrapperMain "$@"
