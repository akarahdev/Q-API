import java.net.URI

plugins {
    id("java")
    id("maven-publish")
}

repositories {
    mavenCentral()
    maven {
        url = URI("https://jitpack.io")
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }

    withSourcesJar()
    withJavadocJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name = "Q-API"
                description = "API for creating Minecraft servers"
                url = "https://akarah.dev"

                scm {
                    url = "https://github/akarahdev/Q-API"
                }

                issueManagement {
                    system = "github"
                    url = "https://github.com/akarahdev/Q-API/issues"
                }
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
            }
        }
    }
}

group = "dev.akarah"
version = "1.0-SNAPSHOT"