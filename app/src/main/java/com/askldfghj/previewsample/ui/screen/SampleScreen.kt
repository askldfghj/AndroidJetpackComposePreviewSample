package com.askldfghj.previewsample.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.askldfghj.previewsample.ui.theme.PreviewSampleTheme

@Composable
internal fun SampleScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
        ) {
            Text(text = "Hello Android!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SampleScreenPreview() {
    PreviewSampleTheme {
        SampleScreen()
    }
}