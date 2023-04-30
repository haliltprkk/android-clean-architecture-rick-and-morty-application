package com.haliltprkk.rickandmortyapplication.data.repositories

import com.haliltprkk.rickandmortyapplication.data.remote.api_services.CharacterApiService
import com.haliltprkk.rickandmortyapplication.data.remote.models.response.CharacterListResponseDto
import com.haliltprkk.rickandmortyapplication.domain.repositories.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(private val api: CharacterApiService) :
    CharacterRepository {
    override suspend fun getCharacterList(page: Int): CharacterListResponseDto {
        TODO("Not yet implemented")
    }
}