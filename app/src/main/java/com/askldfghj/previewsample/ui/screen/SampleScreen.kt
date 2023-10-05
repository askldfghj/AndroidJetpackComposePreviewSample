package com.askldfghj.previewsample.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.askldfghj.previewsample.ui.preview.ThemePreviews
import com.askldfghj.previewsample.ui.theme.PreviewSampleTheme

@Composable
internal fun SampleScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
            ) {
                Icon(imageVector = Icons.Default.Home, contentDescription = "HomeIcon")
                Text(text = "Hello Android!")
            }
        }
    }

}

@ThemePreviews
@Composable
internal fun SampleScreenPreview() {
    PreviewSampleTheme {
        SampleScreen()
    }
}