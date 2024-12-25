project.base.archivesName.set("domain")

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
    // kotlin
    implementation(Libs.kotlin_jdk8)
    implementation(Libs.kotlin_reflect)
    implementation(Libs.kotlin_stdlib)
    implementation(Libs.arrow)

    // tests
    testImplementation(Libs.junit_api)
    testRuntimeOnly(Libs.junit_engine)
    testImplementation(Libs.kotest_property)
    testImplementation(Libs.kotest_junit)
}
