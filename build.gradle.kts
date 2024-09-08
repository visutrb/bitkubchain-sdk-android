plugins {
    id("maven-publish")
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.bbt.core.bkc.sdk"
            artifactId = "bitkubchain-sdk"
            version = "0.0.1"
            artifact("dist/bkcsdk.aar")
        }
    }
}