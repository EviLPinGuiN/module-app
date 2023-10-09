package com.itis.feature.home.impl.usecase

import com.itis.feature.home.api.model.Content
import com.itis.feature.home.api.repository.HomeRepository
import com.itis.feature.home.api.usecase.GetHomeContentUseCase

internal class GetHomeContentUseCaseImpl(
    private val homeRepository: HomeRepository,
) : GetHomeContentUseCase {

    override suspend fun invoke(id: Int): Content {
        return homeRepository.getContent(id)
    }
}