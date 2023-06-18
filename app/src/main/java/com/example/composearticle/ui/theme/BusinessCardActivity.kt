package com.example.composearticle.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composearticle.R
import com.example.composearticle.ui.theme.ui.theme.ComposeArticleTheme

class BusinessCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun GreetingFirstPart(title: String, name: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.baseline_add_a_photo_24)

    Column(modifier = modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Icon(painter = image,
            contentDescription = null,
            modifier = Modifier.background(color = Color(0xFFFFFFFF)
        ))
        Text(text = title)
        Text(text = name)
    }
}

@Composable
fun GreetingSecondPart(mail: String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.baseline_email_24)

    Row(modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(painter = image,
            contentDescription = null,
            modifier = Modifier.background(color = Color(0xFFFFFFFF)))
        Text(text = mail)
    }
}

@Composable
fun GreetingAllPart(){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom) {
        GreetingFirstPart(title = "Anderson", name = "Employee_status", modifier = Modifier.weight(2f))
        Column(
            modifier = Modifier.fillMaxWidth().weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            GreetingSecondPart(mail = "ffdsdfds", modifier = Modifier.weight(1f))
            GreetingSecondPart(mail = "ffdsdfds", modifier = Modifier.weight(1f))
            GreetingSecondPart(mail = "ffdsdfds", modifier = Modifier.weight(1f))


        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    ComposeArticleTheme {
        GreetingAllPart()
    }
}