package com.example.foodystall.domain.repo
import com.example.foodystall.common.ResultState
import com.example.foodystall.data.models.userData
import kotlinx.coroutines.flow.Flow

interface Repo {
    fun LoginWithEmailandPassword(
        userData: userData
    ): Flow<ResultState<String>>
    fun RegisterWithEmailandPassword(
      userData: userData
    ): Flow<ResultState<String>>

}