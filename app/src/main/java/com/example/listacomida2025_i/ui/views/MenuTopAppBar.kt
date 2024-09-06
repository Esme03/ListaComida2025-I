package com.example.listacomida2025_i.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp
import com.example.listacomida2025_i.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuTopAppBar(modifier: Modifier = Modifier){
    CenterAlignedTopAppBar(title = {
    Row (
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(painter = painterResource(id = R.drawable.logoappcom)
            ,contentDescription = null
            ,modifier = modifier
                .padding(8.dp)
                .size(64.dp)
        )
        Text(text = "Commmudel"
        )
    }
     },modifier = modifier)

}