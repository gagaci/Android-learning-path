package com.example.greeting_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greeting_card.ui.theme.HappybirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappybirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                    shape = MaterialTheme.shapes.medium
                ) {
                    GreetingImage(
                        title = stringResource(R.string.title),
                        subject = stringResource(R.string.subject),
                        body = stringResource(R.string.body)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(title: String, subject: String, body: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = subject,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify

        )
        Text(
            text = body,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Composable
fun GreetingImage(title: String, subject: String, body: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.compose_background)
    Column(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        GreetingText(
            title = title,
            subject = subject,
            body = body
        )
    }
}


