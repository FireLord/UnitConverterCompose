package com.firelord.unitconvertercompose.data

import com.firelord.unitconvertercompose.data.db.ConverterDAO
import kotlinx.coroutines.flow.Flow

class ConverterRepositoryImpl(private val dao: ConverterDAO): ConverterRepository {

    override suspend fun insertResult(result: ConversionResult) {
        dao.insertResult(result)
    }

    override suspend fun deleteResult(result: ConversionResult) {
        dao.deleteResult(result)
    }

    override suspend fun deleteAllResult() {
        dao.deleteAll()
    }

    override fun getSavedResult(): Flow<List<ConversionResult>> {
        return dao.getResult()
    }
}