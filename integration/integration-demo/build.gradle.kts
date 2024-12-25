project.base.archivesName.set("integration-demo")

plugins {
    id(Plugins.spring_kotlin) version PluginVers.spring_kotlin
    id(Plugins.spring_dependency_management) version PluginVers.spring_dependency_management
}

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
    // project
    implementation(project(":domain"))
    implementation(project(":usecase:api"))

    // kotlin
    implementation(Libs.kotlin_jdk8)
    implementation(Libs.kotlin_reflect)
    implementation(Libs.kotlin_stdlib)

    // jackson
    implementation(Libs.jackson_kotlin)
    implementation(Libs.jackson_databind)
    implementation(Libs.jackson_jsr310)

    // spring
    implementation(Libs.spring_boot_starter_web)
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")

    // common
    implementation(Libs.commons_io)

    // tests
    testImplementation(Libs.junit_api)
    testRuntimeOnly(Libs.junit_engine)
    testImplementation(Libs.kotest_property)
    testImplementation(Libs.kotest_junit)
}

dependencyManagement {
    imports {
        mavenBom(Libs.spring_cloud_bom)
    }
}
