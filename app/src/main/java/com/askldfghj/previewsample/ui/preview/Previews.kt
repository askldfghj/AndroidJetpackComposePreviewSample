package com.askldfghj.previewsample.ui.preview

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(group = "Theme", name = "Light", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(group = "Theme", name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
internal annotation class ThemePreviews

@Preview(group = "Device", name = "Phone", showBackground = true, device = Devices.PHONE)
@Preview(group = "Device", name = "Tablet", showBackground = true, device = Devices.TABLET)
@Preview(group = "Device", name = "PortraitTablet", showBackground = true, widthDp = 768, heightDp = 1024)
internal annotation class DevicePreviews