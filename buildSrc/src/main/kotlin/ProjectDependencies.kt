object LibVers {
    const val spring_boot = "2.7.0"
    const val spring_cloud = "2021.0.3"
    const val javax_inject = "1"
    const val swagger = "3.0.0"
    const val springdoc = "1.6.14"
    const val junit = "5.7.1"
    const val kotest = "5.0.2"
    const val kotest_arrow = "1.2.0"
    const val mockk = "1.13.7"
    const val spring_mockk = "4.0.2"
    const val jackson = "2.16.2"
    const val commons_io = "2.11.0"
    const val arrow = "1.0.1"
    const val slf4j = "2.0.9"
    const val postgresql = "42.3.8"
    const val flyway = "8.5.11"
    const val testng = "7.3.0"
    const val testcontainers = "1.17.3"
    const val rest_assured = "4.4.0"
    const val io_micrometer="1.9.0"
}

object Libs {
    // Kotlin
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Global.kotlin_version}"
    const val kotlin_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Global.kotlin_version}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Global.kotlin_version}"
    const val arrow = "io.arrow-kt:arrow-core:${LibVers.arrow}"

    // dependency injection
    const val javax_inject = "javax.inject:javax.inject:${LibVers.javax_inject}"

    // logging
    const val slf4j_api = "org.slf4j:slf4j-api:${LibVers.slf4j}"

    // Jackson
    const val jackson_kotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${LibVers.jackson}"
    const val jackson_databind = "com.fasterxml.jackson.core:jackson-databind:${LibVers.jackson}"
    const val jackson_jsr310 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:${LibVers.jackson}"

    // Spring
    const val spring_boot_starter_web = "org.springframework.boot:spring-boot-starter-web:${LibVers.spring_boot}"
    const val spring_boot_starter_jpa = "org.springframework.boot:spring-boot-starter-data-jpa:${LibVers.spring_boot}"
    const val spring_boot_starter_validation = "org.springframework.boot:spring-boot-starter-validation:${LibVers.spring_boot}"
    const val spring_boot_starter_actuator = "org.springframework.boot:spring-boot-starter-actuator:${LibVers.spring_boot}"
    const val spring_boot_starter_openfeign = "org.springframework.boot:spring-boot-starter-openfeign"
    const val spring_boot_starter_logging =
        "org.springframework.boot:spring-boot-starter-logging:${LibVers.spring_boot}"
    const val spring_boot_starter_test = "org.springframework.boot:spring-boot-starter-test:${LibVers.spring_boot}"
    const val io_micrometer = "io.micrometer:micrometer-registry-prometheus:${LibVers.io_micrometer}"

    // Swagger
    const val swagger = "io.springfox:springfox-boot-starter:${LibVers.swagger}"
    const val swagger_ui = "io.springfox:springfox-swagger-ui:${LibVers.swagger}"
    const val springdoc = "org.springdoc:springdoc-openapi-ui:${LibVers.springdoc}"

    // Common
    const val commons_io = "commons-io:commons-io:${LibVers.commons_io}"

    // Tests
    const val junit_params = "org.junit.jupiter:junit-jupiter-params:${LibVers.junit}"
    const val junit_engine = "org.junit.jupiter:junit-jupiter-engine:${LibVers.junit}"
    const val junit_api = "org.junit.jupiter:junit-jupiter-api:${LibVers.junit}"
    const val kotest_junit = "io.kotest:kotest-runner-junit5:${LibVers.kotest}"
    const val kotest_property = "io.kotest:kotest-property:${LibVers.kotest}"
    const val kotest_arrow = "io.kotest.extensions:kotest-assertions-arrow-jvm:${LibVers.kotest_arrow}"
    const val mockk = "io.mockk:mockk:${LibVers.mockk}"
    const val spring_mockk = "com.ninja-squad:springmockk:${LibVers.spring_mockk}"
    const val testcontainers_postgresql = "org.testcontainers:postgresql:${LibVers.testcontainers}"
    const val testcontainers_core = "org.testcontainers:testcontainers:${LibVers.testcontainers}"
    const val testcontainers_junit = "org.testcontainers:junit-jupiter:${LibVers.testcontainers}"
    const val rest_assured = "io.rest-assured:rest-assured:${LibVers.rest_assured}"
    const val rest_assured_kotlin = "io.rest-assured:kotlin-extensions:${LibVers.rest_assured}"

    // Database
    const val postgresql = "org.postgresql:postgresql:${LibVers.postgresql}"
    const val flyway = ("org.flywaydb:flyway-core:${LibVers.flyway}")

    // BOM
    const val spring_cloud_bom = "org.springframework.cloud:spring-cloud-dependencies:${LibVers.spring_cloud}"

    // Camunda
}

object PluginVers {
    const val sonar = "5.1.0.4882"
    const val kotlin = Global.kotlin_version
    const val spring_boot = LibVers.spring_boot
    const val detekt = "1.23.1"
    const val detekt_formatting = detekt
    const val update_dependencies = "0.36.0"
    const val spring_dependency_management = "1.1.0"
    const val spring_kotlin = Global.kotlin_version
    const val owasp_dependencies = "8.4.2"
    const val test_logger = "3.2.0"
    const val spot_bugs = "6.0.0-rc.2"
}

object Plugins {
    const val sonar = "org.sonarqube"
    const val jacoco = "jacoco"
    const val kotlin = "org.jetbrains.kotlin.jvm"
    const val spring_boot = "org.springframework.boot"
    const val kotlin_jpa = "org.jetbrains.kotlin.plugin.jpa"
    const val detekt = "io.gitlab.arturbosch.detekt"
    const val detekt_formatting = "io.gitlab.arturbosch.detekt:detekt-formatting"
    const val update_dependencies = "com.github.ben-manes.versions"
    const val spring_dependency_management = "io.spring.dependency-management"
    const val spring_kotlin = "org.jetbrains.kotlin.plugin.spring"
    const val owasp_dependencies = "org.owasp.dependencycheck"
    const val test_logger = "com.adarshr.test-logger"
    const val spot_bugs = "com.github.spotbugs"
}
