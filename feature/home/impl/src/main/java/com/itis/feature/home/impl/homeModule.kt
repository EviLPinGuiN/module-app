package com.itis.feature.home.impl

import com.itis.feature.home.api.repository.HomeRepository
import com.itis.feature.home.api.usecase.GetHomeContentUseCase
import com.itis.feature.home.impl.data.HomeRepositoryImpl
import com.itis.feature.home.impl.data.datasource.memory.MemoryDataSource
import com.itis.feature.home.impl.data.datasource.remote.HomeApi
import com.itis.feature.home.impl.usecase.GetHomeContentUseCaseImpl
import org.koin.dsl.module
import retrofit2.Retrofit

val homeModule = module {
    factory { get<Retrofit>().create(HomeApi::class.java) }
    factory { MemoryDataSource() }

    factory<HomeRepository> { HomeRepositoryImpl(get()) }
    factory<GetHomeContentUseCase> { GetHomeContentUseCaseImpl(get()) }


}
