

apply {
    from("$rootDir/compose-module.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.coreUi))
    "implementation"(project(Modules.gachaDomain))

    "implementation"("io.coil-kt:coil-compose:2.1.0")
}