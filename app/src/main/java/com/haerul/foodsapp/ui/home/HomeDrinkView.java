/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.ui.home;

import com.haerul.foodsapp.remote.model.Categories;
import com.haerul.foodsapp.remote.model.Drinks;
import com.haerul.foodsapp.remote.model.Meals;

import java.util.List;

public interface HomeDrinkView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Drinks> drinks);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
