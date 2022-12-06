plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

version = "1.0-SNAPSHOT"

kotlin {
    jvm("desktop")
    macosX64 {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }
    macosArm64 {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.runtime)
                implementation("org.jetbrains.compose.components:components-resources:1.3.0-beta04-dev879")
            }
        }
        val desktopMain by getting {
            dependencies {
                implementation(compose.desktop.common)
//                implementation("org.jetbrains.compose.components:components-resources:1.3.0-beta04-dev877")//workaround
            }
        }
        val macosMain by creating {
            dependsOn(commonMain)
        }
        val macosX64Main by getting {
            dependsOn(macosMain)
            dependencies {
//                implementation("org.jetbrains.compose.components:components-resources-macosX64:1.3.0-beta04-dev877")//workaround
            }
        }
        val macosArm64Main by getting {
            dependsOn(macosMain)
            dependencies {
//                implementation("org.jetbrains.compose.components:components-resources-macosArm64:1.3.0-beta04-dev877")//workaround
            }
        }
    }
}
