package xyz.teamgravity.cmpresponsivelayout

import androidx.compose.runtime.Composable

@Composable
fun LoginScreen(
    configuration: ScreenConfiguration = getScreenConfiguration()
) {
    when (configuration) {
        ScreenConfiguration.PhonePortrait -> LoginPhonePortraitScreen()
        ScreenConfiguration.PhoneLandscape -> LoginPhoneLandscapeScreen()
        else -> LoginLargeScreen()
    }
}