package com.example.dappm_004v.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dappm_004v.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeScreen(){
    //Genera una pantalla basica
    Scaffold (
        topBar = {
            TopAppBar(title = {Text("Mi primer App")})
        }
    ){innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(space= 20.dp)
        ){//Inicio columna
            Text("!!!!  Bienvenido  !!!!")
            Button(onClick={/* accion futura */}){
                Text("Presioname")
            }

            Image(
                painter = painterResource(id = R.drawable.logoduoc),
                contentDescription = "logo app",
                modifier = Modifier
                    .fillMaxHeight()
                    .height(150.dp),
                contentScale = ContentScale.Fit

            )

        }
    }//fin inner

}//fin HomeScreen

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}