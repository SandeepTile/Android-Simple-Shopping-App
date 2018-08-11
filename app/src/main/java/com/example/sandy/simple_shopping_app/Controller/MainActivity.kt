package com.example.sandy.simple_shopping_app.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.sandy.simple_shopping_app.Adapters.CategoryAdapter
import com.example.sandy.simple_shopping_app.Model.Category
import com.example.sandy.simple_shopping_app.R
import com.example.sandy.simple_shopping_app.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   lateinit var adapter:CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter= CategoryAdapter(this,DataService.categories)


        categoryListView.adapter=adapter

    }
}
