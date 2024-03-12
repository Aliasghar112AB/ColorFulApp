package com.example.colorfulapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val color1 = remember {
                mutableStateOf(Color.Blue)
            }
            val color2 = remember {
                mutableStateOf(Color.Black)
            }

            Column(
                modifier = Modifier
                    .background(color1.value)
                    .fillMaxSize()
                    .clickable {
                        color2.value = Color(
                            Random.nextFloat(),
                            Random.nextFloat(),
                            Random.nextFloat(),
                            1f
                        )
                    }
            ) {
                Column(
                    modifier = Modifier
                        .background(color2.value)
                        .fillMaxHeight(0.5f)
                        .fillMaxWidth()
                        .clickable {
                            color1.value = Color(
                                Random.nextFloat(),
                                Random.nextFloat(),
                                Random.nextFloat(),
                                1f


                            )
                        }
                ) {
                }
            }
        }
    }
}