package com.haliltprkk.rickandmortyapplication.data.remote.models.response

import com.haliltprkk.rickandmortyapplication.data.remote.models.InfoDto
import com.haliltprkk.rickandmortyapplication.data.remote.models.CharacterDto

data class CharacterListResponseDto(
    val info: InfoDto,
    val results: List<CharacterDto>,
)