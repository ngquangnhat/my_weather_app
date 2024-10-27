package com.example.myweatherapp.di

import com.example.myweatherapp.data.location.DefaultLocationTracker
import com.example.myweatherapp.data.repository.WeatherRepositoryImpl
import com.example.myweatherapp.domain.location.LocationTracker
import com.example.myweatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindLocationTracker(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository

}