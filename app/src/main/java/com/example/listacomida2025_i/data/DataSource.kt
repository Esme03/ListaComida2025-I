package com.example.listacomida2025_i.data

import com.example.listacomida2025_i.R
import com.example.listacomida2025_i.model.Platillo


object DataSource{
    val platillos = listOf(
        Platillo(R.string.desayuno, precio = 65.0, descuento = true, name = R.drawable.desayuno.toString()),
        Platillo(R.string.hamburger, precio = 50.0, descuento = true, name = R.drawable.hamburger.toString()),
        Platillo(R.string.pizza, precio = 115.0, descuento = true, name = R.drawable.pizza.toString()),
        Platillo(R.string.postre, precio = 45.0, descuento = true, name = R.drawable.postre.toString()),
        Platillo(R.string.pozole, precio = 75.0, descuento = true, name = R.drawable.pozole.toString()),
        Platillo(R.string.tacos, precio = 20.0, descuento = true, name = R.drawable.tacos.toString())
    )
}

