package xyz.teamgravity.cmpresponsivelayout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun LoginHeaderSection(
    center: Boolean,
    modifier: Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
    ) {
        Text(
            text = "Log In",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = if (center) TextAlign.Center else TextAlign.Start,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Enter your email and password",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black,
            textAlign = if (center) TextAlign.Center else TextAlign.Start,
            modifier = Modifier.fillMaxWidth()
        )
    }
}