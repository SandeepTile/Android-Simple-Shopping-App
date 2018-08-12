package com.example.sandy.simple_shopping_app.Adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.sandy.simple_shopping_app.Model.Category
import com.example.sandy.simple_shopping_app.R

class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView:View
        val holder:ViewHolder


        if (convertView==null)
        {

            categoryView=LayoutInflater.from(context).inflate(R.layout.category_indiview,null)
            holder= ViewHolder()
            holder.categoryName=categoryView.findViewById(R.id.categoryName)
            holder.categoryImage=categoryView.findViewById(R.id.categoryImage)

            categoryView.tag=holder


        }else{

            holder=convertView.tag as ViewHolder
            categoryView=convertView
        }



        val category=categories[position]

        //Converting String to resource id
        val resorceID=context.resources.getIdentifier(category.image,"drawable",context.packageName)

        holder.categoryImage!!.setImageResource(resorceID)
        holder.categoryName!!.text=category.title


        return categoryView

    }

    override fun getItem(position: Int): Any {

        return categories[position]
    }

    override fun getItemId(position: Int): Long {

        return 0
    }

    override fun getCount(): Int {

        return categories.count()
    }

    private class ViewHolder{

        var categoryImage:ImageView?=null
        var categoryName:TextView?=null
    }
}