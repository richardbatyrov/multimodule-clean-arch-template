project.base.archivesName.set("rest")

plugins {
    id(Plugins.spring_dependency_management) version PluginVers.spring_dependency_management
    id(Plugins.spring_kotlin) version PluginVers.spring_kotlin
}

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
    // Project
    implementation(project(":domain"))
    implementation(project(":usecase:api"))

    // kotlin
    implementation(Libs.kotlin_jdk8)
    implementation(Libs.kotlin_reflect)
    implementation(Libs.kotlin_stdlib)
    implementation(Libs.arrow)

    // Spring
    implementation(Libs.spring_boot_starter_web)
    implementation(Libs.spring_boot_starter_validation)
    implementation(Libs.spring_boot_starter_actuator)
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")

    // Swagger
    implementation(Libs.springdoc)

    // jackson
    implementation(Libs.jackson_kotlin)
    implementation(Libs.jackson_databind)
    implementation(Libs.jackson_jsr310)

    // common
    implementation(Libs.commons_io)

    // test
    testImplementation(Libs.spring_boot_starter_test) {
        exclude(group = "org.mockito", module = "mockito-core")
        exclude(group = "org.mockito", module = "mockito-junit-jupiter")
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
    testImplementation(Libs.mockk)
    testImplementation(Libs.spring_mockk)
    testImplementation(Libs.kotest_property)
    testImplementation(Libs.kotest_junit)
    testImplementation(Libs.kotest_arrow)
}

dependencyManagement {
    imports {
        mavenBom(Libs.spring_cloud_bom)
    }
}