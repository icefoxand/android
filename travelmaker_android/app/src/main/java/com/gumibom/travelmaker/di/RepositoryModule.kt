package com.gumibom.travelmaker.di

import com.gumibom.travelmaker.data.api.NaverLocationSearchService
import com.gumibom.travelmaker.data.datasource.naver.NaverLocationRemoteDataSource
import com.gumibom.travelmaker.data.datasource.naver.NaverLocationRemoteDataSourceImpl
import com.gumibom.travelmaker.data.repository.naver.NaverLocationRepository
import com.gumibom.travelmaker.data.repository.naver.NaverLocationRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNaverLocationRepository(naverLocationRemoteDataSource: NaverLocationRemoteDataSource) : NaverLocationRepository {
        return NaverLocationRepositoryImpl(naverLocationRemoteDataSource)
    }
}