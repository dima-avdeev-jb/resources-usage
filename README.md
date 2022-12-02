
### Run Desktop
`./gradlew :desktopApp:run`

## Run MacOS
 - on Intel CPU: `./gradlew :shared:runDebugExecutableMacosX64`
 - on Apple M1: `./gradlew :shared:runDebugExecutableMacosArm64`


## Problem
Look at [build.gradle.kts](shared%2Fbuild.gradle.kts)

in commonMain not work `implementation("org.jetbrains.compose.components:components-resources:1.3.0-beta04-dev877")`

And I made workaround `implementation("org.jetbrains.compose.components:components-resources-macosX64:1.3.0-beta04-dev877")//workaround`

## Possible problem:
Take a look at file I copied from .m2/... dir [from-maven-local.module](attention%2Ffrom-maven-local.module)

And really published [readly-published.module](attention%2Freadly-published.module)
