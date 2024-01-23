package com.gumibom.travelmaker.data.repository.naver

import com.gumibom.travelmaker.data.datasource.naver.NaverLocationRemoteDataSource
import com.gumibom.travelmaker.data.datasource.naver.NaverLocationRemoteDataSourceImpl
import com.gumibom.travelmaker.data.dto.NaverLocationDTO
import retrofit2.Response
import javax.inject.Inject

class NaverLocationRepositoryImpl @Inject constructor(
    private val naverLocationRemoteDataSourceImpl: NaverLocationRemoteDataSource
) : NaverLocationRepository {

    // 네이버 위치 검색
    override suspend fun findNaverLocationSearch(
        location: String,
        display: Int
    ): Response<NaverLocationDTO> {
        return naverLocationRemoteDataSourceImpl.findNaverLocationSearch(location, display)
    }
}