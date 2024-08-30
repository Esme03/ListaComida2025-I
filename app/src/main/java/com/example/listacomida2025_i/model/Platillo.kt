package com.example.listacomida2025_i.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color

data class Platillo(

    val foto: Int,
    val name: String,
    val precio: Double,
    val descuento: Boolean

)
