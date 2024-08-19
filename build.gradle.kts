plugins {
    alias(libs.plugins.gradle.versions)
    alias(libs.plugins.version.catalog.update)
}

apply("${project.rootDir}/gradle/script/toml-updater-config.gradle")
