package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class ComposeQuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingQuadrant()
                }
            }
        }
    }
}

@Composable
fun GreetingQuadrant() {

        Column(Modifier
            .fillMaxWidth()
        ) {
            Row(Modifier.weight(1f)) {
                GreetingFirstQuadrant(
                    Color(0xFF302247),
                    heading = "Text composable",
                    description = "Displays text and follows the recommended Material Design guidelines.",
                    modifier = Modifier.weight(1f)
                )
                GreetingFirstQuadrant(
                    Color(0xFFFFEB3B),
                    heading = "Text composable",
                    description = "Displays text and follows the recommended Material Design s.",
                    modifier = Modifier.weight(1f)
                )
            }
            Row(Modifier.weight(1f)) {
                GreetingFirstQuadrant(
                    Color(0xFF4CAF50),
                    heading = "Text composable",
                    description = "Displays text and follows the recommended Material Design guidelines.",
                    modifier = Modifier.weight(1f)
                )
                GreetingFirstQuadrant(
                    Color(0xFFBD0946),
                    heading = "Text composable",
                    description = "Displays text and follows the recommended Material Design guidelines.",
                    modifier = Modifier.weight(1f)
                )
            }
        }

    }
@Composable
fun GreetingFirstQuadrant(
    colorOneOf: androidx.compose.ui.graphics.Color,
    heading:String,
    description: String,
    modifier: Modifier = Modifier) {

        Column(
            modifier = modifier
                .padding(16.dp)
                .background(colorOneOf)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(text = heading,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(text = description,
                textAlign = TextAlign.Justify)
        }
    }




@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    ComposeArticleTheme {
        GreetingQuadrant()
    }
}