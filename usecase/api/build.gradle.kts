project.base.archivesName.set("api")

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
    // project
    implementation(project(":domain"))

    // kotlin
    implementation(Libs.kotlin_stdlib)
    implementation(Libs.kotlin_jdk8)
    implementation(Libs.kotlin_reflect)
    implementation(Libs.arrow)
}