package com.example.dagger_android_practical.di.auth

import com.example.dagger_android_practical.models.User
import com.example.dagger_android_practical.network.auth.AuthApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import java.util.*
import javax.inject.Named

@Module
class AuthModule {

    /***
     * this is the main usage of access of parent component's dependencies as here we are using Retrofit from appComponent
     * and using that to create our local dependency for local AuthSubComponent
     */
    companion object {
        @AuthScope
        @Provides
        fun provideAuthApi(retrofit: Retrofit): AuthApi {
            return retrofit.create(AuthApi::class.java)
        }

        @AuthScope
        @Provides
        @Named("auth-user")
        fun provideAuthUser(): User {
            return User(Random().nextInt(10000), "", "", "")
        }
    }

}