package com.askldfghj.previewsample.ui.preview

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(group = "Theme", name = "Light", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(group = "Theme", name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
internal annotation class ThemePreviews
