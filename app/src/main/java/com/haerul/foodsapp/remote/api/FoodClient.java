/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.remote.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FoodClient {

    //https://www.toptal.com/android/android-apps-mvvm-with-clean-architecture

    private static final String BASE_URL = "https://www.themealdb.com/api/json/v2/1/";
    private static final String BASE_DRINKS_URL = "https://www.thecocktaildb.com/api/json/v2/1/";


    public static Retrofit getFoodClient() {
        return new Retrofit.Builder().baseUrl(BASE_URL)
                .client(provideOkHttp())
                .addConverterFactory(GsonConverterFactory.create())
//                .addConverterFactory(new NullOnEmptyConverterFactory())
//                .addConverterFactory(GsonConverterFactory.create(getGsonViaBuilder()))
                .build();
    }

    public static Retrofit getDrinkClient() {
        return new Retrofit.Builder().baseUrl(BASE_DRINKS_URL)
                .client(provideOkHttp())
                .addConverterFactory(GsonConverterFactory.create())
//                .addConverterFactory(new NullOnEmptyConverterFactory())
//                .addConverterFactory(GsonConverterFactory.create(getGsonViaBuilder()))
                .build();
    }

    private static Gson getGsonViaBuilder() {
        return new GsonBuilder()
                    .serializeNulls()

                    .create();
    }

    private static Interceptor provideLoggingInterceptor() {
        return new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    private static OkHttpClient provideOkHttp() {
        return new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addNetworkInterceptor(provideLoggingInterceptor())
                .build();
    }
}
