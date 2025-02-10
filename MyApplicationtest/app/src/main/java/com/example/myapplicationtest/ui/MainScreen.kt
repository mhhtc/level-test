package com.example.myapplicationtest.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(navigateToDetail:(String) -> Unit) {
    var message by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        TextField(
            value = message,
            onValueChange = { message = it },
            label = { Text(text = "Introduce la frase que quieras analizar") },
            minLines = 3,
            maxLines = 3,
            modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navigateToDetail(message) }) {
            Text(text = "Analizar frase")
        }
    }
}
