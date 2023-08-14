package com.firelord.unitconvertercompose.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.firelord.unitconvertercompose.data.ConversionResult

@Database(entities = [ConversionResult::class], version = 1)
abstract class ConverterDatabase : RoomDatabase() {
    abstract val converterDAO : ConverterDAO
}