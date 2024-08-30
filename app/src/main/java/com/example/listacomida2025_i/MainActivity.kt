package com.example.listacomida2025_i

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.listacomida2025_i.data.DataSource
import com.example.listacomida2025_i.ui.theme.ListaComida2025ITheme
import com.example.listacomida2025_i.ui.views.MenuCardList


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppContent()
        }
    }
}
@Preview( showBackground = true)
@Composable
fun AppContent() {
    ListaComida2025ITheme {
        MenuCardList(platilloList = DataSource.platillos)
    }
}


