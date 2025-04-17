import com.vanniktech.maven.publish.SonatypeHost

plugins {
    kotlin("jvm") version "2.1.10"
    id("com.vanniktech.maven.publish") version "0.31.0"
}

group = "io.github.skyious.skl"
version = "0.1.4"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    signAllPublications()

    coordinates(group.toString(), "skl", version.toString())

    pom {
        name = "SKL"
        description = "SKL or aka SKYIOUS KOTLIN LIBRARY is a new growing library for kotlin in which anyone can contribute."
        inceptionYear = "2025"
        url = "https://www.github.com/SKYIOUS/skl/"
        licenses {
            licenses {
                name = "MIT License"
                url = "https://opensource.org/licenses/MIT"
                distribution = "repo"

            }
        }
        developers{
            developer {
                id = "SKYIOUS"
                name = "Nandakishor S"
                url = "https://github.com/SKYIOUS"

            }
        }
        scm {
            url = "https://github.com/SKYIOUS/skl"
            connection = "scm:git:git://github.com/SKYIOUS/skl.git"
            developerConnection = "scm:git:ssh://git@github.com/SKYIOUS/skl.git"
        }
    }

}
