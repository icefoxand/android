package com.gumibom.travelmaker.di

import com.gumibom.travelmaker.data.datasource.naver.NaverLocationRemoteDataSource
import com.gumibom.travelmaker.data.repository.naver.NaverLocationRepository
import com.gumibom.travelmaker.data.repository.naver.NaverLocationRepositoryImpl
import com.gumibom.travelmaker.domain.signup.GetNaverLocationUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SignupUseCaseModule {

    @Singleton
    @Provides
    fun provideGetNaverLocationUseCase(naverLocationRepository: NaverLocationRepository) : GetNaverLocationUseCase {
        return GetNaverLocationUseCase(naverLocationRepository)
    }
}