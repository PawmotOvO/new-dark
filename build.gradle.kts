plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.17.4"
}

group = "com.pawmotovo.new-dark"
version = "1.0.0"

repositories {
    mavenCentral()
}

intellij {
    version.set("2024.1")
    type.set("IC")
}
