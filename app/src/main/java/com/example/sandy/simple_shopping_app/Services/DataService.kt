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
            Product("Graphic Beanie", "180", "hat1"),
            Product("Hat Black", "200", "hat2"),
            Product("Hat White", "180", "hat3"),
            Product("Hat Snapback", "220", "hat4")
    )

    val hoodies = listOf(
            Product("Hoodie Gray", "280", "hoodie1"),
            Product("Hoodie Red", "320", "hoodie2"),
            Product("Gray Hoodie", "280", "hoodie3"),
            Product("Black Hoodie", "320", "hoodie4")
    )

    val shirts = listOf(
            Product("Shirt Black", "180", "shirt1"),
            Product("Badge Light Gray", "200", "shirt2"),
            Product("Logo Shirt Red", "220", "shirt3"),
            Product("Hustle", "220", "shirt4"),
            Product("Studios", "180", "shirt5")
    )



}