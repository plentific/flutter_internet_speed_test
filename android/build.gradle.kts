group = "com.shaz.plugin.fist.flutter_internet_speed_test"
version = "1.0-SNAPSHOT"

plugins {
    id("com.android.library")
}

android {
    namespace = "com.shaz.plugin.fist.flutter_internet_speed_test"
    compileSdk = 36

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/kotlin")
        }
    }

    defaultConfig {
        minSdk = 16
    }
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
    }
}

dependencies {
    implementation("fr.bmartel:jspeedtest:1.32.1")
}
