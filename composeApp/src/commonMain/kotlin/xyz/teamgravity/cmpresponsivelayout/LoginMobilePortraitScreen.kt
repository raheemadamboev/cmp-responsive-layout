package xyz.teamgravity.cmpresponsivelayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun LoginMobilePortraitScreen(
    viewmodel: LoginViewModel = viewModel { LoginViewModel() }
) {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.primary,
        contentWindowInsets = WindowInsets.statusBars
    ) { padding ->
        Column(
            verticalArrangement = Arrangement.spacedBy(32.dp),
            modifier = Modifier.fillMaxSize()
                .padding(padding)
                .clip(
                    RoundedCornerShape(
                        topStart = 16.dp,
                        topEnd = 16.dp
                    )
                )
                .background(MaterialTheme.colorScheme.surfaceContainerLowest)
                .padding(
                    horizontal = 16.dp,
                    vertical = 24.dp
                )
                .windowInsetsPadding(WindowInsets.navigationBars)
        ) {
            LoginHeaderSection(
                center = false,
                modifier = Modifier.fillMaxWidth()
            )
            LoginInputSection(
                email = viewmodel.email,
                onEmailChange = viewmodel::onEmailChange,
                password = viewmodel.password,
                onPasswordChange = viewmodel::onPasswordChange,
                onSubmit = viewmodel::onSubmit,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}