package com.haliltprkk.rickandmortyapplication.data.remote.api_services

import com.haliltprkk.rickandmortyapplication.data.remote.models.response.CharacterListResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterApiService {

    @GET("character")
    suspend fun getCharacters(@Query("page") page: Int): CharacterListResponseDto

}