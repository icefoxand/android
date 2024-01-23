package com.gumibom.travelmaker.data.repository.naver

import com.gumibom.travelmaker.data.dto.NaverLocationDTO
import retrofit2.Response

interface NaverLocationRepository {
    suspend fun findNaverLocationSearch(location : String, display : Int) : Response<NaverLocationDTO>
}