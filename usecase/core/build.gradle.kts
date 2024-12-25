project.base.archivesName.set("core")

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
    // project
    implementation(project(":domain"))
    implementation(project(":usecase:api"))

    // kotlin
    implementation(Libs.kotlin_stdlib)
    implementation(Libs.kotlin_jdk8)
    implementation(Libs.kotlin_reflect)
    implementation(Libs.arrow)

    // dependency injection
    implementation(Libs.javax_inject)

    // logging
    implementation(Libs.slf4j_api)

    // tests
    testImplementation(Libs.junit_api)
    testRuntimeOnly(Libs.junit_engine)
    testImplementation(Libs.kotest_property)
    testImplementation(Libs.kotest_junit)
}
