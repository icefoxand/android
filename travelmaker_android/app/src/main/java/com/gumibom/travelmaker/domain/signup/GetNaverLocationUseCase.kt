package com.gumibom.travelmaker.domain.signup

import com.gumibom.travelmaker.data.dto.NaverLocationDTO
import com.gumibom.travelmaker.data.repository.naver.NaverLocationRepository
import com.gumibom.travelmaker.data.repository.naver.NaverLocationRepositoryImpl
import retrofit2.Response
import javax.inject.Inject

class GetNaverLocationUseCase @Inject constructor(
    private val naverLocationRepositoryImpl: NaverLocationRepository
) {
    suspend fun findNaverLocationSearch(location : String, display : Int) : Response<NaverLocationDTO> {
        // TODO 여기서 DTO null 체크를 하고 model로 데이터 변환
        return naverLocationRepositoryImpl.findNaverLocationSearch(location, display)
    }
}