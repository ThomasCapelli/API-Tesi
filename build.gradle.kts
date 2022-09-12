import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.5.21"
    id("org.jetbrains.kotlin.plugin.jpa") version "1.5.21"
    id("org.springframework.boot") version "2.5.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("plugin.spring") version "1.5.21"
    kotlin("kapt") version "1.5.21"
}
configurations {
    implementation.get().exclude(module = "spring-boot-starter-logging")
    implementation.get().exclude(module = "spring-boot-starter-tomcat")
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

group = "org.thomas"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_13
java.targetCompatibility = JavaVersion.VERSION_13

repositories {
    mavenCentral()
    maven(url = "https://dl.bintray.com/kotlin/exposed")
    maven(url = "https://dl.bintray.com/gradle/gradle-plugins")
}

dependencies {
    // kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.5.21")
    implementation("org.jetbrains.kotlin:kotlin-noarg:1.5.21")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.21")

    // Spring core
    implementation("org.springframework.boot:spring-boot-starter-log4j2")
    implementation("org.springframework.boot:spring-boot-starter-jetty")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("commons-beanutils:commons-beanutils:1.9.4")

    // Spring config processor
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    // Docs
    implementation("io.springfox:springfox-boot-starter:3.0.0")
    implementation("org.springdoc:springdoc-openapi-ui:1.5.9")

    // Database
    annotationProcessor("org.projectlombok:lombok")
    compileOnly("org.projectlombok:lombok")
    runtimeOnly("org.postgresql:postgresql")
    implementation("org.mapstruct:mapstruct:1.5.2.Final")
    kapt("org.mapstruct:mapstruct-processor:1.5.2.Final")
    implementation("org.projectlombok:lombok-mapstruct-binding:0.2.0")
    implementation("com.vladmihalcea:hibernate-types-52:2.16.1")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
}


kapt {
    arguments {
        // Set Mapstruct Configuration options here
        // https://kotlinlang.org/docs/reference/kapt.html#annotation-processor-arguments
        // https://mapstruct.org/documentation/stable/reference/html/#configuration-options
        arg("mapstruct.defaultComponentModel", "spring")
    }
}

tasks {
    test {
        useJUnitPlatform()
    }

    withType<Jar> {
        archiveFileName.set("mini-api.jar")
    }

    withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "13"
        }
    }

    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}

springBoot {
    mainClass.set("org.thomas.backend.ApiApplicationKt")
}