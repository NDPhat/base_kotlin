package com.example.base_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.base_kotlin.combustion.design.colors.ColorCombustion
import com.example.base_kotlin.combustion.design.colors.Colors
import com.example.base_kotlin.combustion.design.spacing.Spacing
import com.example.base_kotlin.combustion.design.typography.Typography
import com.example.base_kotlin.combustion.ui.buttons.CombustionButton
import com.example.base_kotlin.combustion.ui.buttons.CombustionButtonType
import com.example.base_kotlin.combustion.ui.list.CombustionList
import com.example.base_kotlin.combustion.ui.surface.CombustionSurface
import com.example.base_kotlin.ui.theme.Base_kotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Base_kotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", color = Colors.error, fontSize = Typography().body)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Base_kotlinTheme {
        Column() {
            Greeting("Android")
            Spacing().spacious
            CombustionSurface {
                CombustionButton(
                    onClick = {},
                    type = CombustionButtonType.Primary
                ) {
                    Text("Button primary on surface")
                }
            }
            CombustionSurface {
                CombustionButton(
                    onClick = {},
                    type = CombustionButtonType.Secondary
                ) {
                    Text("Button primary on surface")
                }
            }
            CombustionList()
        }

    }
}