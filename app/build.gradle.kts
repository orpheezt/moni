plugins {
    application
    alias(libs.plugins.spotless)
}

repositories {
    mavenCentral()
}

dependencies {
}

testing {
    suites {
        val test =
            named<JvmTestSuite>("test") {
                useJUnitJupiter("6.1.3")
            }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(27)
    }
}

application {
    mainClass = "org.example.App"
}

spotless {
    java {
        googleJavaFormat().aosp()
        removeUnusedImports()
        trimTrailingWhitespace()
        endWithNewline()
    }
    kotlinGradle {
        target("*.gradle.kts", "../settings.gradle.kts")
        ktlint()
        trimTrailingWhitespace()
        endWithNewline()
    }
}
