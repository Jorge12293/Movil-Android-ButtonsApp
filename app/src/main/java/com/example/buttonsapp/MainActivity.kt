package com.example.buttonsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.buttonsapp.components.*
import com.example.buttonsapp.ui.theme.ButtonsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember { mutableStateOf(false)}
            ButtonsAppTheme(
                darkTheme = darkMode.value
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content(darkMode=darkMode)
                }
            }
        }
    }
}

@Composable
fun Content(darkMode:MutableState<Boolean>) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ButtonNormal()
        Space()
        ButtonNormalColor()
        Space()
        ButtonText()
        Space()
        ButtonOutline()
        Space()
        ButtonIcon()
        Space()
        ButtonSwitch()
        Space()
        DarkMode(darkMode=darkMode)
        Space()
        FloatingAction()
    }
}
