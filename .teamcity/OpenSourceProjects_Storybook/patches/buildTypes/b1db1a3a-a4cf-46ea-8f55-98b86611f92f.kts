package OpenSourceProjects_Storybook.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with uuid = 'b1db1a3a-a4cf-46ea-8f55-98b86611f92f' (id = 'OpenSourceProjects_Storybook_CliSmokeTest')
accordingly, and delete the patch script.
*/
changeBuildType("b1db1a3a-a4cf-46ea-8f55-98b86611f92f") {
    check(paused == false) {
        "Unexpected paused: '$paused'"
    }
    paused = true
}