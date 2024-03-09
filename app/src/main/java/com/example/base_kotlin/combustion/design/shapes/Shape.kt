package com.example.base_kotlin.combustion.design.shapes

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

class CombustionShapes(

    val none: CornerBasedShape = RoundedCornerShape(0.dp),

    val small: CornerBasedShape = RoundedCornerShape(4.dp),

    val medium: CornerBasedShape = RoundedCornerShape(8.dp),

    val large: CornerBasedShape = RoundedCornerShape(16.dp),

    val extraLarge: CornerBasedShape = RoundedCornerShape(28.dp)
)