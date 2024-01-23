package com.gumibom.travelmaker.data.datasource.naver

import com.gumibom.travelmaker.data.api.NaverLocationSearchService
import com.gumibom.travelmaker.data.dto.NaverLocationDTO
import retrofit2.Response
import javax.inject.Inject

class NaverLocationRemoteDataSourceImpl @Inject constructor(
    private val naverLocationService : NaverLocationSearchService
) : NaverLocationRemoteDataSource {

    // 네이버 위치 검색
    override suspend fun findNaverLocationSearch(
        location: String,
        display: Int
    ): Response<NaverLocationDTO> {
        return naverLocationService.findNaverLocationSearch(location, display)
    }
}