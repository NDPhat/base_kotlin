package com.example.base_kotlin.combustion.ui.surface

import com.example.base_kotlin.combustion.design.shapes.CombustionShapes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.base_kotlin.combustion.design.colors.Colors
import com.example.base_kotlin.combustion.design.spacing.Spacing

@Composable
fun CombustionSurface(
    modifier: Modifier = Modifier,
    shape: Shape = CombustionShapes().large,
    padding: Dp = Spacing().cozy,
    backgroundColor: Color = Colors.background,
    contentColor: Color = Colors.background,
    verticalArrangement: Arrangement.Vertical = Arrangement.spacedBy(Spacing().squishy),
    border: BorderStroke? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = backgroundColor,
        contentColor = contentColor,
        tonalElevation = 0.dp,
        shadowElevation = 0.dp,
        border = border,
    ) {
        Column(
            content = content,
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth(),
            verticalArrangement = verticalArrangement
        )
    }
}