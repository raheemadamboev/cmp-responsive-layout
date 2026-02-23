package xyz.teamgravity.cmpresponsivelayout

import androidx.compose.runtime.Composable

@Composable
fun LoginScreen(
    configuration: ScreenConfiguration = getScreenConfiguration()
) {
    when (configuration) {
        ScreenConfiguration.MobilePortrait -> LoginMobilePortraitScreen()
        ScreenConfiguration.MobileLandscape -> LoginMobileLandscapeScreen()
        else -> LoginLargeScreen()
    }
}