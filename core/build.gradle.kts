apply {
    from("$rootDir/base-module.gradle")
}
//contains the base dependencies for non ui modules
dependencies {
    "kapt"(Room.roomCompiler)
    "implementation"(Room.roomKtx)
    "implementation"(Room.roomRuntime)
}