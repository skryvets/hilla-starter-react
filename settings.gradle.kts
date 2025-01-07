pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.vaadin.com/vaadin-prereleases")
    }
    plugins {
        id("com.vaadin") version "${extra["vaadinVersion"]}"
    }
}
