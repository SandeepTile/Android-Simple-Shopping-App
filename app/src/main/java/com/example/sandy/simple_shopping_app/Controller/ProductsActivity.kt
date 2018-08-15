package com.example.sandy.simple_shopping_app.Controller

import android.content.res.Configuration
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

        //LANDSCAPE mode
        var spanCount=2
        val orientation=resources.configuration.orientation
        if(orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            spanCount=3
        }

        //For large screen device
        var screenSize=resources.configuration.screenWidthDp
        if (screenSize>720){

            spanCount=3
        }



        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter

    }
}
