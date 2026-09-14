@echo off
if not exist gradle\wrapper\gradle-wrapper.jar (
  echo Gradle wrapper JAR is not bundled. Open this project in Android Studio and let it sync.
  exit /b 1
)
java -classpath gradle\wrapper\gradle-wrapper.jar org.gradle.wrapper.GradleWrapperMain %*
