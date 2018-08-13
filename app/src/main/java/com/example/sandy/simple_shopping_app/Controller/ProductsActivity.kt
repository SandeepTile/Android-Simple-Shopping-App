package com.example.sandy.simple_shopping_app.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sandy.simple_shopping_app.R
import com.example.sandy.simple_shopping_app.Utilites.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        var categoryType=intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
