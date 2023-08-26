package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // App Codes Is Here
                    MainContainer(
                        getString(R.string.first_container_text),
                        getString(R.string.first_container_paragraph),
                        getString(R.string.second_container_text),
                        getString(R.string.second_container_paragraph),
                        getString(R.string.third_container_text),
                        getString(R.string.third_container_paragraph),
                        getString(R.string.fourth_container_text),
                        getString(R.string.fourth_container_paragraph)
                    )
                }
            }
        }
    }
}
// Functions All Here
@Composable
fun MainContainer(
    firstContainerText: String,
    firstContainerParagraph: String,
    secondContainerText: String,
    secondContainerParagraph: String,
    thirdContainerText: String,
    thirdContainerParagraph: String,
    fourthContainerText: String,
    fourthContainerParagraph: String,
) {
    Column(modifier = Modifier.fillMaxSize()) {
        // First Row
        Row(modifier = Modifier.weight(1f)) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
            ) {
                FirstContainer(
                    firstContainerText = firstContainerText,
                    firstContainerParagraph = firstContainerParagraph
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            ) {
                SecondContainer(
                    secondContainerText = secondContainerText,
                    secondContainerParagraph = secondContainerParagraph
                )
            }
        }

        // Second Row
        Row(modifier = Modifier.weight(1f)) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
            ) {
                ThirdContainer(
                    thirdContainerText = thirdContainerText,
                    thirdContainerParagraph = thirdContainerParagraph
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            ) {
                FourthContainer(
                    fourthContainerText = fourthContainerText,
                    fourthContainerParagraph = fourthContainerParagraph
                )
            }
        }
    }
}

@Composable
fun FirstContainer(
    firstContainerText: String,
    firstContainerParagraph: String,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = firstContainerText,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = firstContainerParagraph,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun SecondContainer(
    secondContainerText: String,
    secondContainerParagraph: String,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = secondContainerText,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = secondContainerParagraph,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun ThirdContainer(
    thirdContainerText: String,
    thirdContainerParagraph: String,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = thirdContainerText,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)

        )
        Text(
            text = thirdContainerParagraph,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun FourthContainer(
    fourthContainerText: String,
    fourthContainerParagraph: String,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = fourthContainerText,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = fourthContainerParagraph,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "My Preview"
)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        // Preview Code Are Here
        MainContainer(
            stringResource(R.string.first_container_text),
            stringResource(R.string.first_container_paragraph),
            stringResource(R.string.second_container_text),
            stringResource(R.string.second_container_paragraph),
            stringResource(R.string.third_container_text),
            stringResource(R.string.third_container_paragraph),
            stringResource(R.string.fourth_container_text),
            stringResource(R.string.fourth_container_paragraph)
        )
    }
}