package com.example.jetpackcomposedemo.composables

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.Dp
import com.example.jetpackcomposedemo.models.Item
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun ShowImage(radius: Dp,elevation: Dp,height: Dp, stateInfo: Item?) {
    CoilImage(
        data = stateInfo?.image_url.toString(),
        contentDescription = stateInfo?.puppy_name.toString(),
        Modifier.shadow(shape = RoundedCornerShape(radius), elevation = elevation).height(height),
    )
}