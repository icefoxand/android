package com.gumibom.travelmaker.data.api

import com.gumibom.travelmaker.data.dto.NaverLocationDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NaverLocationSearchService {

    // 네이버 장소 검색 api로 장소 response 받는 api
    @GET
    suspend fun findNaverLocationSearch(
        // TODO Header에 네이버 클라키 넣어야됨
        @Query("query") location : String,
        @Query("display") display : Int
    ) : Response<NaverLocationDTO>
}