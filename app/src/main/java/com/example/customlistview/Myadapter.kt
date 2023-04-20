package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Myadapter(var myCntxt:Context,var resources:Int,var items:List<Model>):ArrayAdapter<Model>(myCntxt,resources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(myCntxt)
        val view:View=layoutInflater.inflate(resources,null)

        val imageView:ImageView=view.findViewById(androidx.appcompat.R.id.image)
        val titleTextView:TextView=view.findViewById(R.id.Tv_maintext)
        val descriptionTextView:TextView=view.findViewById(R.id.Tv_subtext)
        val myItem:Model=items[position]
        imageView.setImageDrawable(myCntxt.resources.getDrawable(myItem.img))
        titleTextView.text=myItem.title
        descriptionTextView.text=myItem.description


        return view
    }
}