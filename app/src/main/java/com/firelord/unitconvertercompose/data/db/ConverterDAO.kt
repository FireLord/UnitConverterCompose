package com.firelord.unitconvertercompose.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.firelord.unitconvertercompose.data.ConversionResult
import kotlinx.coroutines.flow.Flow

@Dao
interface ConverterDAO {
    @Insert
    suspend fun insertResult(result: ConversionResult)

    @Delete
    suspend fun deleteResult(result: ConversionResult)

    @Query("DELETE FROM RESULT_TABLE")
    suspend fun deleteAll()

    @Query("SELECT * FROM result_table")
    fun getResult(): Flow<List<ConversionResult>>
}