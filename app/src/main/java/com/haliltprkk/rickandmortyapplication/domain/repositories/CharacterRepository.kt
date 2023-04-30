package com.haliltprkk.rickandmortyapplication.domain.repositories

import com.haliltprkk.rickandmortyapplication.data.remote.models.response.CharacterListResponseDto

interface CharacterRepository {
    suspend fun getCharacterList(page: Int): CharacterListResponseDto
}