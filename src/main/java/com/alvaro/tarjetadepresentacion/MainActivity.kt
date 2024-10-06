package com.alvaro.tarjetadepresentacion

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alvaro.tarjetadepresentacion.ui.theme.TarjetaDePresentacionTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaDePresentacion()

        }
    }
}

@Composable
fun TarjetaDePresentacion(){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ){
        Columna1()

     }
}

@Composable
fun Columna1() {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color.LightGray)
    ) {

        Column(
            modifier = Modifier
                .align(Alignment.Center),
            horizontalAlignment = CenterHorizontally


        ) {

            val image = painterResource(R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = null,
            )


            Text(
                "Alvaro Torales",
                fontSize = 45.sp,
            )
            Text(
                text = "Andoroid Developer Extraordinaire"
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth()
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            horizontalAlignment = CenterHorizontally
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                val image = painterResource(R.drawable.phone)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Text(text = "+595992248868")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                val image = painterResource(R.drawable.share)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Text(text = "@alvarotorales")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                val image = painterResource(R.drawable.mail)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Text(text = "alvaro.torales@android.com")
            }

        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaDePresentacionTheme() {
        TarjetaDePresentacion()
    }
}