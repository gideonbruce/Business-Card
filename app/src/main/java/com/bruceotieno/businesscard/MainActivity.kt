package com.bruceotieno.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun BusinessCard(modifier: Modifier = Modifier) {
    Column {
        val image = painterResource(R.drawable.xxxl)
        Box{
            Image(
                painter = image,
                contentDescription = null
            )
        }
        Column(modifier = modifier){
            NameBox(
                name = stringResource(R.string.name_text),
                title = stringResource(R.string.title_text)
            )
        }
        Column(modifier = Modifier.padding(16.dp)) {
            ContactInfo(
                telephoneNo = stringResource(R.string.phone_number),
                socialMedia = stringResource(R.string.social_media),
                email = stringResource(R.string.email)
            )
        }
    }
}

@Composable
fun NameBox(
    name: String,
    title: String,
    modifier: Modifier = Modifier.fillMaxSize(1f)
) {
    Text(
        text = name,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(8.dp),
        fontSize = 24.sp
    )
    Text(
        text = title,
        modifier = Modifier.padding(8.dp)
    )
}

@Composable
fun ContactInfo(
    telephoneNo: String,
    socialMedia: String,
    email: String,
    modifier: Modifier = Modifier.padding(8.dp)
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