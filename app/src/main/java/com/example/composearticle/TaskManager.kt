package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.R
import com.example.composearticle.ui.theme.ui.theme.ComposeArticleTheme

class TaskManager : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingImage(stringResource(R.string.task_completed), stringResource(R.string.nice_work))
                }
            }
        }
    }
}

@Composable
fun GreetingText(firstText: String, secondText: String, modifier: Modifier = Modifier) {
    Column(

    ) {
        Text(text = firstText,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                top = 24.dp,
                bottom = 8.dp
            )

        )
        Text(text = secondText,

            fontSize = 16.sp
        )

    }
}

@Composable
fun GreetingImage(firstText: String, secondText: String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(painter = image,
            contentDescription = null,

        )

        GreetingText(firstText = firstText,
            secondText = secondText,
        )
        
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    ComposeArticleTheme {
        GreetingImage(stringResource(R.string.task_completed), stringResource(R.string.nice_work))
    }
}