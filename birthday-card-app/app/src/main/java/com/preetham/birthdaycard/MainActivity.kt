package com.preetham.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.preetham.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayText(message = "Happy Birthday Preetham!", from = "From Android")
                }
            }
        }
    }
}

@Composable
fun BirthdayText(message: String, from: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp
        )
        Text(
            text = from,
            fontSize = 36.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BirthdayCardTheme {
        BirthdayText(message = "Happy Birthday Preetham!", from = "From Android")
    }
}