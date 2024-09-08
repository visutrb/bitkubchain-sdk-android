plugins {
    id("maven-publish")
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.visutrb"
            artifactId = "bitkubchain-sdk-android-dist"
            version = "0.0.2"
            artifact("dist/bkcsdk.aar")
        }
    }
}

tasks.register("assemble") {
    doLast {
        println("Placeholder for assembling artifact")
    }
}
