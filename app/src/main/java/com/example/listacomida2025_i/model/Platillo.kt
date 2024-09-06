package com.example.listacomida2025_i.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val StringResourceId: Int,
    @DrawableRes val drawableResourceId: Int,
    @StringRes val stringResourceIdPrecios: Int,
    @StringRes val stringResourceIdOfertas: Int,

)
