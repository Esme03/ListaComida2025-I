package com.example.listacomida2025_i.ui.views


import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.integerResource

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listacomida2025_i.MainActivity

import com.example.listacomida2025_i.model.Platillo
import com.example.listacomida2025_i.ui.theme.ListaComida2025ITheme


@Composable
fun MenuCard(platillo: Platillo,modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .padding(10.dp)
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Image(
                painter =
                painterResource(id = platillo.foto),
                contentDescription =
                platillo.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(190.dp)
                    .clip(CircleShape)
            )


            Spacer(modifier = Modifier.height(5.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                Column {
                    Text(
                        text = platillo.name,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal
                    )
                    Text(
                        text = "$${platillo.precio}",
                        fontSize = 20.sp
                    )
                    if (platillo.descuento) {
                        Text(
                            text = "¡Oferton!",
                            color = Color.Green,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 20.sp
                        )

                    }


                }


            }


        }
    }
}
    @Preview(showBackground = true)
    @Composable
    fun MenuCardDisplay(){
        ListaComida2025ITheme {

        }
    }



