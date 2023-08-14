package com.firelord.unitconvertercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.firelord.unitconvertercompose.compose.BaseScreen
import com.firelord.unitconvertercompose.data.ConverterRepositoryImpl
import com.firelord.unitconvertercompose.data.db.ConverterDatabase
import com.firelord.unitconvertercompose.ui.theme.UnitConverterComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dao = ConverterDatabase.getInstance(application).converterDAO
        val repository = ConverterRepositoryImpl(dao)
        val factory = ConverterViewModelFactory(repository)
        setContent {
            UnitConverterComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BaseScreen(factory)
                }
            }
        }
    }
}