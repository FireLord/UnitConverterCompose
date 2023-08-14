package com.firelord.unitconvertercompose.data

import com.firelord.unitconvertercompose.data.db.ConverterDAO
import kotlinx.coroutines.flow.Flow

class ConverterRepositoryImpl(private val dao: ConverterDAO): ConverterRepository {

    override suspend fun insertResult(result: ConversionResult) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteResult(result: ConversionResult) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllResult(result: ConversionResult) {
        TODO("Not yet implemented")
    }

    override fun getSavedResult(): Flow<List<ConversionResult>> {
        TODO("Not yet implemented")
    }
}