package com.example.listacomida2025_i.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.listacomida2025_i.R

// Set of Material typography styles to start with

val codystar = FontFamily(
    Font(R.font.codystar_regular)
)

val aclonica = FontFamily(
    Font(R.font.aclonica_regular)
)


val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = codystar,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),

    displayMedium = TextStyle(
        fontFamily = aclonica,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),

    labelSmall = TextStyle(
        fontFamily = aclonica,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),

    bodyLarge = TextStyle(
        fontFamily = codystar,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    )

)