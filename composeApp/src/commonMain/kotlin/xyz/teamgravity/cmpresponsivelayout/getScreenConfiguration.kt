package xyz.teamgravity.cmpresponsivelayout

import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable

@Composable
fun getScreenConfiguration(): ScreenConfiguration {
    val value = currentWindowAdaptiveInfo(true).windowSizeClass
    return ScreenConfiguration.fromWindowSizeClass(value)
}