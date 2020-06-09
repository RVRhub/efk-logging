import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.3.0.RELEASE"
	id("io.spring.dependency-management") version "1.0.9.RELEASE"
	kotlin("jvm") version "1.3.72"
	kotlin("plugin.spring") version "1.3.72"
}

group = "com.rvr"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
	maven("http://sndyuk.github.com/maven")
	maven("http://jcenter.bintray.com")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	implementation ("ch.qos.logback:logback-classic:1.2.3")
	implementation ("ch.qos.logback.contrib:logback-json-classic:0.1.2")
	implementation ("ch.qos.logback.contrib:logback-jackson:0.1.2")
	implementation ("com.fasterxml.jackson.core:jackson-databind:2.9.5")

	implementation ("org.fluentd:fluent-logger:0.3.4")
	implementation ("com.sndyuk:logback-more-appenders:1.8.0")
	implementation ("ch.qos.logback:logback-classic:1.2.3")
	implementation ("ch.qos.logback:logback-core:1.2.3")
	implementation ("org.slf4j:slf4j-api:1.7.30")

	developmentOnly("org.springframework.boot:spring-boot-devtools")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
	implementation(kotlin("script-runtime"))
}

springBoot {
	mainClassName = "com.rvr.efk.EfkApplication"
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}
