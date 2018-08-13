package com.example.sandy.simple_shopping_app.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.sandy.simple_shopping_app.Adapters.ProductAdapter
import com.example.sandy.simple_shopping_app.R
import com.example.sandy.simple_shopping_app.Services.DataService
import com.example.sandy.simple_shopping_app.Utilites.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        var categoryType=intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductAdapter(this, DataService.getProducts(categoryType))

        val layoutManager = GridLayoutManager(this, 2)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter

    }
}
