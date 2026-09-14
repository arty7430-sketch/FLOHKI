plugins {
    id("com.android.application")
}

android {
    namespace = "de.flohki.app"
    compileSdk = 36

    defaultConfig {
        applicationId = "de.flohki.app"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}
