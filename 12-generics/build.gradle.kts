plugins {
    java
    kotlin("jvm")
    application
}

application {
    mainClassName = "com.github.qiuzhanghua.learn.GenericsKt"
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    testCompile("junit", "junit", "4.12")
}
