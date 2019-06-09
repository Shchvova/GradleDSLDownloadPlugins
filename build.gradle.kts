import de.undercouch.gradle.tasks.download.Download

buildscript {
    repositories {
        jcenter()
    }
}

plugins {
    id("de.undercouch.download") version "3.4.3"
}


tasks.create("downloadPlugins") {
    val pluginUrls = listOf("https://google.com")
    doLast {
        pluginUrls.forEach{ pluginUrl ->
             /* how to make this work? */
             //download {
             //    src(pluginUrl)
             //    dest("$buildDir/downloadedPlugins/extension")
             //}
        }
    }
}

tasks.create<Download>("downloadSinglePlugin") {
    src("https://google.com")
    dest("$buildDir/downloadedPlugins/single")
}
