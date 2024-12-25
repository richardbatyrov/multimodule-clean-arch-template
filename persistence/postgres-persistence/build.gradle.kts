project.base.archivesName.set("persistence")

plugins {
    id(Plugins.spring_kotlin) version PluginVers.spring_kotlin
    id(Plugins.kotlin_jpa) version PluginVers.kotlin
}

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {

    //project
    implementation(project(":domain"))
    implementation(project(":usecase:api"))

    // kotlin
    implementation(Libs.kotlin_jdk8)
    implementation(Libs.kotlin_reflect)
    implementation(Libs.kotlin_stdlib)

    // database
    implementation(Libs.spring_boot_starter_jpa)

    // tests
    testImplementation(Libs.junit_api)
    testRuntimeOnly(Libs.junit_engine)
}