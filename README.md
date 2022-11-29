
### Run Desktop
`./gradlew :desktopApp:run`

## Run MacOS
 - on Intel CPU: `./gradlew :shared:runDebugExecutableMacosX64`
 - on Apple M1: `./gradlew :shared:runDebugExecutableMacosArm64`

## Possible problem:
Take a look at file I copied from .m2/... dir [components-resources-0.0.0-custom-version.module](attention%2Fcomponents-resources-0.0.0-custom-version.module)

And really published https://maven.pkg.jetbrains.space/public/p/compose/dev/org/jetbrains/compose/components/components-resources/1.3.0-beta04-dev871/components-resources-1.3.0-beta04-dev871.module