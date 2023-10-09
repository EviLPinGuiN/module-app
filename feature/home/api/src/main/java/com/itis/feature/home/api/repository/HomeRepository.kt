package com.itis.feature.home.api.repository

import com.itis.feature.home.api.model.Content

interface HomeRepository {

    suspend fun getContent(id: Int): Content
}