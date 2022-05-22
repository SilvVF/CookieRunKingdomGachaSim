

apply {
    from("$rootDir/compose-module.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.coreUi))
    "implementation"(project(Modules.gachaDomain))

    "implementation"("io.coil-kt:coil:2.0.0-rc02")
    "implementation"("io.coil-kt:coil-gif:2.0.0-rc02")
    "implementation"("io.coil-kt:coil-compose:2.0.0-rc02")
}