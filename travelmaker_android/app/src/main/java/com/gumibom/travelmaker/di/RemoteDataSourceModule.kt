package com.gumibom.travelmaker.di

import com.gumibom.travelmaker.data.api.NaverLocationSearchService
import com.gumibom.travelmaker.data.datasource.naver.NaverLocationRemoteDataSource
import com.gumibom.travelmaker.data.datasource.naver.NaverLocationRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataSourceModule {

    @Singleton
    @Provides
    fun provideNaverLocationRemoteDataSource(naverLocationSearchService: NaverLocationSearchService) : NaverLocationRemoteDataSource {
        return NaverLocationRemoteDataSourceImpl(naverLocationSearchService)
    }

}