package com.bruceotieno.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.bruceotieno.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column {
        Box{
            imagePainter = painterResource(R.drawable.xxxl)
        }
        Row {
            NameBox(
                name = stringResource(R.string.name_text),
                title = stringResource(R.string.title_text)
            )
        }
        Column {
            ContactInfo(
                telephoneNo = stringResource(R.string.phone_number),
                email = stringResource(R.string.email),
                socialMedia = stringResource(R.string.social_media)
            )
        }
    }
}

@Composable
fun NameBox(
    name: String,
    title: String
) {
    Column{
        Image(painter = image, contentDescription = null)
        Text(
            text = name
        )
        Text(
            text= title
        )
    }
}

@Composable
fun ContactInfo(
    telephoneNo: String,
    email: String,
    socialMedia: String
) {
    Text(
        text = telephoneNo
    )
    Text(
        text = socialMedia
    )
    Text(
        text = email
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}