package com.example.foodystall.domain.useCases

import com.example.foodystall.common.ResultState
import com.example.foodystall.data.models.userData
import com.example.foodystall.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class createUserUseCase @Inject constructor(val repo: Repo) {
    fun createUser(userData: userData): Flow<ResultState<String>>{
        return repo.RegisterWithEmailandPassword(userData)
    }

}