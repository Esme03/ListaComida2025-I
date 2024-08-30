package com.example.listacomida2025_i.ui.views

import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeGesturesPadding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listacomida2025_i.R
import com.example.listacomida2025_i.model.Platillo
import com.example.listacomida2025_i.ui.theme.ListaComida2025ITheme

@Composable
fun MenuCard(platillo: Platillo,modifier: Modifier = Modifier){
    Card(modifier = Modifier) {
        Column {


        Image(painter =
        painterResource(id = platillo.drawableResourceId) ,
            contentDescription =
            stringResource(id = platillo.StringResourceId),
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp),
            contentScale = ContentScale.Crop
        )}
        Text(
            text = LocalContext.
            current.
            getString(platillo.StringResourceId),
            modifier = Modifier.padding(22.dp),
            style = MaterialTheme.
            typography.displayMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MenuCardDisplay(){
    ListaComida2025ITheme {

        MenuCard(platillo = Platillo(R.string.tacos,
            R.drawable.tacos) )
    }
}