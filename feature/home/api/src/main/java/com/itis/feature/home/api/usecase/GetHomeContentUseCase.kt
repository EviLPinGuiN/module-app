package com.itis.feature.home.api.usecase

import com.itis.feature.home.api.model.Content

interface GetHomeContentUseCase {

    suspend operator fun invoke(id: Int): Content
}
