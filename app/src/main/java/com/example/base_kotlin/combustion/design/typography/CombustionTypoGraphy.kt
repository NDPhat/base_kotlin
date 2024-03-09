package com.example.base_kotlin.combustion.design.typography

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.base_kotlin.combustion.design.spacing.CombustionSpacingTokens

internal object CombustionTypoGraphy {
    internal object TypeFaceTokens {
        const val TitleLargeToken = 34
        const val TitleOneToken = 28
        const val TitleTwoToken = 22
        const val TitleThreeToken = 20
        const val TitleRegularToken = 17
        const val TitleBodyToken = 17
        const val CallOutToken = 16
        const val SubheadToken = 15
        const val FootnoteToken = 13
        const val CaptionOneToken = 12
        const val CaptionTwoToken = 11

    }

    internal object TypoGraphyTokens {
        const val titleLarge = CombustionTypoGraphy.TypeFaceTokens.TitleLargeToken
        const val titleOne = CombustionTypoGraphy.TypeFaceTokens.TitleOneToken
        const val titleTwo = CombustionTypoGraphy.TypeFaceTokens.TitleTwoToken
        const val titleThree = CombustionTypoGraphy.TypeFaceTokens.TitleThreeToken
        const val titleRegular = CombustionTypoGraphy.TypeFaceTokens.TitleRegularToken
        const val titleBody = CombustionTypoGraphy.TypeFaceTokens.TitleBodyToken
        const val callOut = CombustionTypoGraphy.TypeFaceTokens.CallOutToken
        const val subHead = CombustionTypoGraphy.TypeFaceTokens.SubheadToken
        const val footNote = CombustionTypoGraphy.TypeFaceTokens.FootnoteToken
        const val captionOne = CombustionTypoGraphy.TypeFaceTokens.CaptionOneToken
        const val captionTwo = CombustionTypoGraphy.TypeFaceTokens.CaptionTwoToken
    }
}

class Typography(
    val titleLarge: TextUnit = CombustionTypoGraphy.TypoGraphyTokens.titleLarge.sp,
    val titleOne: TextUnit = CombustionTypoGraphy.TypoGraphyTokens.titleOne.sp,
    val titleTwo: TextUnit = CombustionTypoGraphy.TypoGraphyTokens.titleTwo.sp,
    val titleThree: TextUnit = CombustionTypoGraphy.TypoGraphyTokens.titleThree.sp,
    val titleRegular: TextUnit = CombustionTypoGraphy.TypoGraphyTokens.titleRegular.sp,
    val body: TextUnit = CombustionTypoGraphy.TypoGraphyTokens.titleBody.sp,
    val callOut: TextUnit = CombustionTypoGraphy.TypoGraphyTokens.callOut.sp,
    val subHeader: TextUnit = CombustionTypoGraphy.TypoGraphyTokens.subHead.sp,
    val footnote: TextUnit = CombustionTypoGraphy.TypoGraphyTokens.footNote.sp,
    val captionOne: TextUnit = CombustionTypoGraphy.TypoGraphyTokens.captionOne.sp,
    val captionTwo: TextUnit = CombustionTypoGraphy.TypoGraphyTokens.captionTwo.sp,
)

