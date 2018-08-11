package com.example.sandy.simple_shopping_app.Services

import com.example.sandy.simple_shopping_app.Model.Category
import com.example.sandy.simple_shopping_app.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Graphic Beanie", "180", "hat01"),
            Product("Hat Black", "200", "hat02"),
            Product("Hat White", "180", "hat03"),
            Product("Hat Snapback", "220", "hat04")
    )

    val hoodies = listOf(
            Product("Hoodie Gray", "280", "hoodie01"),
            Product("Hoodie Red", "320", "hoodie02"),
            Product("Gray Hoodie", "280", "hoodie03"),
            Product("Black Hoodie", "320", "hoodie04")
    )

    val shirts = listOf(
            Product("Shirt Black", "180", "shirt01"),
            Product("Badge Light Gray", "200", "shirt02"),
            Product("Logo Shirt Red", "220", "shirt03"),
            Product("Hustle", "220", "shirt04"),
            Product("Studios", "180", "shirt05")
    )



}