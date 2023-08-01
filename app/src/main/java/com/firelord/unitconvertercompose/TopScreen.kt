package com.firelord.unitconvertercompose

import androidx.compose.runtime.Composable

@Composable
fun TopScreen(list: List<Conversion>) {
    ConversionMenu(list = list)
}