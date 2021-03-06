package com.example.dagger_android_practical.di.viewmodel

import androidx.lifecycle.ViewModel
import com.example.dagger_android_practical.di.viewmodel.ViewModelKey
import com.example.dagger_android_practical.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel
}