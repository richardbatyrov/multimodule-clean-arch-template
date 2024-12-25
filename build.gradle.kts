import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val parentProjectDir = projectDir

repositories {
    mavenCentral()
    mavenLocal()
}

plugins {
    jacoco
    id(Plugins.sonar) version PluginVers.sonar
    id(Plugins.kotlin) version PluginVers.kotlin apply false
    id(Plugins.detekt) version PluginVers.detekt
    id(Plugins.test_logger) version PluginVers.test_logger
    id(Plugins.update_dependencies) version PluginVers.update_dependencies
    id(Plugins.owasp_dependencies) version PluginVers.owasp_dependencies
    id(Plugins.spot_bugs) version PluginVers.spot_bugs apply false
}

version = "1.10.0"

subprojects {

    repositories {
        mavenCentral()
        mavenLocal()
    }

    apply {
        plugin("java")
        plugin(Plugins.kotlin)
        plugin(Plugins.detekt)
        plugin(Plugins.owasp_dependencies)
        plugin(Plugins.test_logger)
        plugin(Plugins.jacoco)
    }

    detekt {
        buildUponDefaultConfig = true
        config.from(files("$parentProjectDir/detekt-config.yaml"))
        source.from(files("src/main/kotlin", "src/test/kotlin"))
        dependencies {
            detektPlugins("${Plugins.detekt_formatting}:${PluginVers.detekt_formatting}")
        }
    }

    tasks {
        withType<KotlinCompile> {
            kotlinOptions {
                allWarningsAsErrors = true
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "17"
            }
        }

        withType<JavaCompile> {
            options.compilerArgs.add("-Xlint:all")
        }

        withType<Test> {
            useJUnitPlatform()
            testLogging {
                events(
                    org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED,
                    org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED,
                    org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED
                )
                showStandardStreams = true
                exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
            }
            finalizedBy(withType<JacocoReport>())
        }
        withType<JacocoReport> {
            dependsOn(withType<Test>())
            reports {
                xml.required = true
                html.required = true
                csv.required = false
                html.outputLocation = layout.buildDirectory.dir("jacocoHtml")
            }

        }
    }

    sonar {
        properties {
            property("sonar.coverage.jacoco.xmlReportPaths", "${layout.buildDirectory}/reports/jacoco/test/jacocoTestReport.xml")
        }
    }
}

tasks {
    register("getArtifactName") {
        doLast {
            println(rootProject.name)
        }
    }

    register("getArtifactVersion") {
        doLast {
            println(version)
        }
    }
}
