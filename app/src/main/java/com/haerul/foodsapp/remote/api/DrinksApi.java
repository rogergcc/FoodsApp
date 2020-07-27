/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.remote.api;

import com.haerul.foodsapp.remote.model.Categories;
import com.haerul.foodsapp.remote.model.DrinkResponse;
import com.haerul.foodsapp.remote.model.Drinks;
import com.haerul.foodsapp.remote.model.Meals;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DrinksApi {
    //https://www.themealdb.com/api/json/v2/1/latest.php
    @GET("latest.php")
    Call<DrinkResponse> getMeal();

    //https://www.thecocktaildb.com/api/json/v1/1/list.php?c=list
    @GET("popular.php")
    Call<Categories> getPopular();

    //example https://themealdb.com/api/json/v2/1/filter.php?c=Beef
    @GET("filter.php") 
    Call<Drinks> getMealByCategory(@Query("c") String category);

    //TODO #3 Call the search.php with query string the meal name @GET("search.php)

    @GET("search.php")
    Call<Drinks> getMealByName(@Query("s") String mealName);
}
