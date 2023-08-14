package com.firelord.unitconvertercompose.di

import android.app.Application
import androidx.room.Room
import com.firelord.unitconvertercompose.data.ConverterRepository
import com.firelord.unitconvertercompose.data.ConverterRepositoryImpl
import com.firelord.unitconvertercompose.data.db.ConverterDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideConverterDatabase(app:Application) : ConverterDatabase {
        return Room.databaseBuilder(
            app,
            ConverterDatabase::class.java,
            "converter_data_database"
        ).build()
    }

    @Singleton
    @Provides
    fun provideConverterRepository(db: ConverterDatabase) : ConverterRepository {
        return ConverterRepositoryImpl(db.converterDAO)
    }
}