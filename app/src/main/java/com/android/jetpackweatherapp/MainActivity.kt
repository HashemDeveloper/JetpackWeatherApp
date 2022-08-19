package com.android.jetpackweatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.jetpackweatherapp.ui.theme.JetpackWeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           AppEntryPoint()
        }
    }
}
@Composable
private fun AppEntryPoint() {
    JetpackWeatherAppTheme {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackWeatherAppTheme {

    }
}