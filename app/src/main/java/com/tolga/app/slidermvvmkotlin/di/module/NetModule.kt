package com.tolga.app.slidermvvmkotlin.di.module

import android.os.Environment
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Named
import javax.inject.Singleton
import okhttp3.Cache
import java.util.concurrent.TimeUnit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import com.google.gson.Gson
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.tolga.app.slidermvvmkotlin.BuildConfig
import com.tolga.app.slidermvvmkotlin.service.NbrbAPI


@Module
class NetModule {
    @Singleton
    @Provides
    @Named("cached")
    fun provideOkHttpClient(): OkHttpClient {
        val cache = Cache(Environment.getDownloadCacheDirectory(), 10 * 1024 * 1024)
        return OkHttpClient.Builder()
                .readTimeout(1, TimeUnit.MINUTES)
                .writeTimeout(1, TimeUnit.MINUTES)
                .cache(cache)
                .build()
    }

    @Singleton
    @Provides
    @Named("non_cached")
    fun provideNonCachedOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .readTimeout(1, TimeUnit.MINUTES)
                .writeTimeout(1, TimeUnit.MINUTES)
                .build()
    }


    @Provides
    @Singleton
    fun provideGson(): Gson {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        return gsonBuilder.create()
    }

    @Singleton
    @Provides
    @Named("cached")
    fun provideRetrofit(gson: Gson, @Named("cached") client: OkHttpClient): Retrofit.Builder {
        return Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }



    @Provides
    @Singleton
    @Named("Anonym")
    fun provideService(@Named("cached") retrofit: Retrofit.Builder): NbrbAPI {
        return retrofit.baseUrl(BuildConfig.BASE_API_URL).build().create(NbrbAPI::class.java)
    }
}