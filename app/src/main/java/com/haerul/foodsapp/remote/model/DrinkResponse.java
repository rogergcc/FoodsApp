package com.haerul.foodsapp.remote.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rogergcc on 26/07/2020.
 * Copyright Ⓒ 2020 . All rights reserved.
 */
public class DrinkResponse {

    @SerializedName("drinks")
    private List<Drinks> drinks;

    public List<Drinks> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drinks> drinks) {
        this.drinks = drinks;
    }
}
