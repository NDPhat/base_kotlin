package com.example.base_kotlin.combustion.ui.buttons


import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver

import com.example.base_kotlin.combustion.design.colors.Colors

internal object CombustionButtonDefaults {

    private const val disabledSurfaceAlpha = 0.12f
    private const val disabledContentAlpha = 0.6f


    @Composable
    fun primaryButtonColors(
        backgroundColor: Color = Colors.primary,
        contentColor: Color = Colors.background,
        disabledBackgroundColor: Color = Colors.onSurface.copy(alpha = disabledSurfaceAlpha)
            .compositeOver(Colors.surface),
        disabledContentColor: Color = Colors.onSurface.copy(alpha = disabledContentAlpha)
    ): ButtonColors = ButtonDefaults.buttonColors(
        containerColor = backgroundColor,
        contentColor = contentColor,
        disabledContentColor = disabledContentColor,
        disabledContainerColor = disabledBackgroundColor
    )

    @Composable
    fun secondaryButtonColors(
        backgroundColor: Color = Colors.surface,
        contentColor: Color = Colors.primary,
        disabledBackgroundColor: Color = Colors.onSurface.copy(alpha = disabledSurfaceAlpha)
            .compositeOver(Colors.onSurface),
        disabledContentColor: Color = Colors.onSurface.copy(alpha = disabledContentAlpha)
    ): ButtonColors = ButtonDefaults.buttonColors(
        containerColor = backgroundColor,
        contentColor = contentColor,
        disabledContentColor = disabledContentColor,
        disabledContainerColor = disabledBackgroundColor
    )

    @Composable
    fun textPrimaryButtonColors(
        contentColor: Color = Colors.primary,
        disabledContentColor: Color = Colors.primary.copy(alpha = disabledContentAlpha)
    ): ButtonColors = ButtonDefaults.buttonColors(
        containerColor = Color.Transparent,
        contentColor = contentColor,
        disabledContentColor = disabledContentColor,
        disabledContainerColor = Color.Transparent
    )

    @Composable
    fun textSecondaryButtonColors(
        contentColor: Color = Colors.onSurface,
        disabledContentColor: Color = Colors.onSurface.copy(alpha = disabledContentAlpha)
    ): ButtonColors = ButtonDefaults.buttonColors(
        containerColor = Color.Transparent,
        contentColor = contentColor,
        disabledContentColor = disabledContentColor,
        disabledContainerColor = Color.Transparent
    )

}

enum class CombustionButtonType {
    Primary,
    Secondary,
    Tertiary,
    PrimaryTextOnly,
    SecondaryTextOnly,
    TertiaryTextOnly,
    PrimaryOnSurface,
    SecondaryOnSurface,
    TertiaryOnSurface
}

