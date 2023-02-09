plugins {
    id("com.android.application")
    id("io.gitlab.arturbosch.detekt") version "1.22.0"
    id("org.jlleitschuh.gradle.ktlint") version "11.1.0"
    id("com.google.dagger.hilt.android")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "de.larshaider.yodo"
    compileSdk = 33

    defaultConfig {
        applicationId = "de.larshaider.yodo"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }

    packagingOptions {
        resources {
            exclude("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    val ktxCore = "1.9.0"
    implementation("androidx.core:core-ktx:$ktxCore")

    val ktxLifecycle = "2.5.1"
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$ktxLifecycle")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$ktxLifecycle")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$ktxLifecycle")

    val composeActivity = "1.6.1"
    implementation("androidx.activity:activity-compose:$composeActivity")

    val composeUI = "1.3.3"
    implementation("androidx.compose.ui:ui:$composeUI")
    implementation("androidx.compose.ui:ui-tooling-preview:$composeUI")
    implementation("androidx.compose.runtime:runtime-livedata:$composeUI")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:$composeUI")
    debugImplementation("androidx.compose.ui:ui-tooling:$composeUI")
    debugImplementation("androidx.compose.ui:ui-test-manifest:$composeUI")

    val composeMaterial = "1.3.1"
    implementation("androidx.compose.material:material:$composeMaterial")

    val room = "2.5.0"
    implementation("androidx.room:room-runtime:$room")
    implementation("androidx.room:room-ktx:$room")
    annotationProcessor("androidx.room:room-compiler:$room")
    kapt("androidx.room:room-compiler:$room")
    testImplementation("androidx.room:room-testing:$room")

    val navigation = "2.5.3"
    implementation("androidx.navigation:navigation-compose:$navigation")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    val composeRules = "0.0.26"
    detektPlugins("com.twitter.compose.rules:detekt:$composeRules")
    ktlintRuleset("com.twitter.compose.rules:ktlint:$composeRules")

    val hilt = "2.44"
    implementation("com.google.dagger:hilt-android:$hilt")
    kapt("com.google.dagger:hilt-android-compiler:$hilt")
    kapt("androidx.hilt:hilt-compiler:1.0.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
}

kapt {
    correctErrorTypes = true
}
