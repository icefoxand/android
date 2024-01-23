package com.gumibom.travelmaker.data.datasource.naver

import com.gumibom.travelmaker.data.dto.NaverLocationDTO
import retrofit2.Response

interface NaverLocationRemoteDataSource {
    suspend fun findNaverLocationSearch(location : String, display : Int) : Response<NaverLocationDTO>
}