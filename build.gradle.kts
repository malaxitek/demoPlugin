plugins {
    id ("java")
    id ("org.jetbrains.intellij") version "1.17.4"
}

group = "com.demo.plugin"
version = "1.0-SNAPSHOT"

intellij {
    version = "2024.1"
    type = "IU"
}

repositories {
    mavenCentral()
}

