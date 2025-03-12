plugins {
    id("java")
    application // Подключаем плагин application
    jacoco
    id("checkstyle")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("hexlet.code.App") // Указываем точку входа в приложение
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

checkstyle {
    toolVersion = "10.3.1" // Укажите нужную версию Checkstyle
    configFile = file("${project.rootDir}/config/checkstyle/checkstyle.xml")
}
