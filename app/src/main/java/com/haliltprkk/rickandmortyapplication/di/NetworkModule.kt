package com.haliltprkk.rickandmortyapplication.di

import android.content.Context
import android.util.Log
import com.chuckerteam.chucker.api.ChuckerCollector
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.haliltprkk.rickandmortyapplication.BuildConfig
import com.haliltprkk.rickandmortyapplication.data.remote.api_services.CharacterApiService
import com.ihsanbal.logging.Level
import com.ihsanbal.logging.LoggingInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): CharacterApiService {
        return Retrofit.Builder().baseUrl(BuildConfig.BASE_URL).client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(CharacterApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideOkHttpClientBuilder(): OkHttpClient.Builder =
        OkHttpClient.Builder().readTimeout(20, TimeUnit.SECONDS)
            .connectTimeout(20, TimeUnit.SECONDS)

    @Provides
    @Singleton
    fun provideOkHttpClient(
        httpLoggingInterceptor: LoggingInterceptor,
        chuckerInterceptor: ChuckerInterceptor,
        builder: OkHttpClient.Builder,
    ): OkHttpClient {
        if (BuildConfig.DEBUG) {
            builder.addInterceptor(httpLoggingInterceptor)
            builder.addInterceptor(chuckerInterceptor)
        }
        return builder.build()
    }

    @Singleton
    @Provides
    fun provideHttpLoggingInterceptor(): LoggingInterceptor =
        LoggingInterceptor.Builder().setLevel(Level.BODY).log(Log.VERBOSE).build()

    @Singleton
    @Provides
    fun provideChuckerInterceptor(@ApplicationContext appContext: Context): ChuckerInterceptor =
        ChuckerInterceptor.Builder(appContext).collector(ChuckerCollector(appContext))
            .maxContentLength(250000L).redactHeaders(emptySet()).alwaysReadResponseBody(false)
            .build()
}
