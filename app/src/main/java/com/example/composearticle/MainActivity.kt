package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingImage(stringResource(R.string.text_title),
                                  stringResource(R.string.text_firstPart),
                                  stringResource(R.string.text_secondPart))
                }
            }
        }
    }
}

@Composable
fun GreetingText(title: String, firstPart: String, secondPart: String, modifier: Modifier = Modifier) {
    Column(


    ) {
        Text(text = title,
        modifier = Modifier.padding(16.dp)
        )
        Text(text = firstPart,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            textAlign = TextAlign.Justify
        )
        Text(text = secondPart,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Composable
fun GreetingImage(title: String, firstPart: String, secondPart: String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = image,
            contentDescription = null,

        )

        GreetingText(title = title,
            firstPart = firstPart,
            secondPart = secondPart,

            )

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme {
        GreetingImage(stringResource(R.string.text_title),
                      stringResource(R.string.text_firstPart),
                      stringResource(R.string.text_secondPart))
    }
}