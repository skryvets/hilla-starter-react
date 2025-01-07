plugins {
    java
    id("org.springframework.boot") version "3.4.1"
    id("io.spring.dependency-management") version "1.1.0"
    id("com.vaadin") version "24.6.0"
}

group = "com.skryvets"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
    maven("https://maven.vaadin.com/vaadin-prereleases")
    maven("https://repo.spring.io/milestone")
    maven("https://maven.vaadin.com/vaadin-addons")
}

dependencies {
    implementation("com.vaadin:vaadin-spring-boot-starter")
    implementation("org.parttio:line-awesome:1.1.0")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

dependencyManagement {
    imports {
        val vaadinVersion = "24.6.0"
        mavenBom("com.vaadin:vaadin-bom:$vaadinVersion")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
