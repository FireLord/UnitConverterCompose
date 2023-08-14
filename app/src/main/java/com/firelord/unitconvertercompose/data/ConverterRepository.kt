package com.firelord.unitconvertercompose.data

import kotlinx.coroutines.flow.Flow

interface ConverterRepository {
    suspend fun insertResult(result: ConversionResult)
    suspend fun deleteResult(result: ConversionResult)
    suspend fun deleteAllResult(result: ConversionResult)
    fun getSavedResult():Flow<List<ConversionResult>>
}