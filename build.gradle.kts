plugins {
    id("maven-publish")
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.visutrb"
            artifactId = "bitkubchain-sdk-android"
            version = "0.0.1"
            artifact("dist/bkcsdk.aar")
        }
    }
}
