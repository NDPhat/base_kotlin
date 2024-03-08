package com.example.base_kotlin.combustion.design.colors

import androidx.compose.ui.graphics.Color

interface ColorCombustion {
    val background: Color
    val surface: Color
    val error: Color

    val primary: Color
    val primaryLightVariant: Color
    val primaryDarkVariant: Color

    val secondary: Color
    val secondaryLightVariant: Color
    val secondaryDarkVariant: Color

    val onPrimary: Color
    val onSurface: Color
    val onError: Color
    val onDisabled: Color
}
object Colors : ColorCombustion {
    override val background: Color
        get() = Color(0xfff5f5f5)
    override val surface: Color
        get() = Color.White
    override val error: Color
        get() = Color(0xffed0c06)
    override val primary: Color
        get() = Color(0xff18249c)
    override val primaryLightVariant: Color
        get() = Color(0xff747cc4)
    override val primaryDarkVariant: Color
        get() =  Color(0xff141e84)
    override val secondary: Color
        get() = Color(0xffed0c06)
    override val secondaryLightVariant: Color
        get() = Color(0xfff46d6a)
    override val secondaryDarkVariant: Color
        get() = Color(0xffed0c06)
    override val onPrimary: Color
        get() = Color(0xff222222)
    override val onSurface: Color
        get() = Color(0xff222222)
    override val onError: Color
        get() = Color.White
    override val onDisabled: Color
        get() = Color.White

}