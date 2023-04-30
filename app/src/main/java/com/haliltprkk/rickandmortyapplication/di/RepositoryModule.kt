package com.haliltprkk.rickandmortyapplication.di

import com.haliltprkk.rickandmortyapplication.data.repositories.CharacterRepositoryImpl
import com.haliltprkk.rickandmortyapplication.domain.repositories.CharacterRepository
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
    abstract fun bindMovieRepository(
        movieRepositoryImpl: CharacterRepositoryImpl,
    ): CharacterRepository
}
