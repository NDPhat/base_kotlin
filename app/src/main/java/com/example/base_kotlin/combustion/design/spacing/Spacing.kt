package com.example.base_kotlin.combustion.design.spacing

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

internal object CombustionSpacingTokens {

    internal object TShirtTokens {
        const val zero = 0
        const val xxxSmall = 2
        const val xxSmall = 4
        const val xSmall = 8
        const val small = 12
        const val medium = 16
        const val large = 24
        const val xLarge = 32
        const val xxLarge = 48
    }

    internal object SpacingTokens {
        const val zero = TShirtTokens.zero
        const val squishy = TShirtTokens.xxSmall
        const val compact = TShirtTokens.xSmall
        const val cozy = TShirtTokens.small
        const val comfortable = TShirtTokens.medium
        const val roomy = TShirtTokens.large
        const val spacious = TShirtTokens.xLarge
    }
}
class Spacing(
    val none: Dp = CombustionSpacingTokens.SpacingTokens.zero.dp,
    val squishy: Dp = CombustionSpacingTokens.SpacingTokens.squishy.dp,
    val compact: Dp = CombustionSpacingTokens.SpacingTokens.compact.dp,
    val cozy: Dp = CombustionSpacingTokens.SpacingTokens.cozy.dp,
    val comfortable: Dp = CombustionSpacingTokens.SpacingTokens.comfortable.dp,
    val roomy: Dp = CombustionSpacingTokens.SpacingTokens.roomy.dp,
    val spacious: Dp = CombustionSpacingTokens.SpacingTokens.spacious.dp
)