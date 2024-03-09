package com.example.base_kotlin.combustion.ui.buttons

import com.example.base_kotlin.combustion.design.shapes.CombustionShapes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import com.example.base_kotlin.combustion.design.typography.Typography

@Composable
fun CombustionButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    type: CombustionButtonType = CombustionButtonType.Primary,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = CombustionShapes().medium,
    border: BorderStroke? = null,
    wrapsContent: Boolean = false,
    contentDescription: String? = null,
    content: @Composable RowScope.() -> Unit
) {
    val colors = when (type) {
        CombustionButtonType.Primary -> CombustionButtonDefaults.primaryButtonColors()
        CombustionButtonType.Secondary -> CombustionButtonDefaults.secondaryButtonColors()
        CombustionButtonType.PrimaryTextOnly -> CombustionButtonDefaults.textPrimaryButtonColors()
        CombustionButtonType.SecondaryTextOnly -> CombustionButtonDefaults.textSecondaryButtonColors()
        CombustionButtonType.Tertiary -> TODO()
        CombustionButtonType.TertiaryTextOnly -> TODO()
        CombustionButtonType.PrimaryOnSurface -> TODO()
        CombustionButtonType.SecondaryOnSurface -> TODO()
        CombustionButtonType.TertiaryOnSurface -> TODO()
    }
    Button(
        onClick = onClick,
        modifier = Modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        border = border,
        interactionSource = interactionSource
    ) {
        ProvideTextStyle(
            value = TextStyle(fontSize = Typography().body)
        ) {
            val wrappedModifier = if (wrapsContent) {
                Modifier
            } else {
                Modifier.fillMaxWidth()
            }
            Row(
                wrappedModifier,
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}