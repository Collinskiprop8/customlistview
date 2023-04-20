package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView=findViewById<ListView>(R.id.listview)
        var mylist= mutableListOf<Model>()

        ///lets add images,title and description
        mylist.add(Model("Cities","Examples of great cities",R.drawable.city3))

        mylist.add(Model("Cities","A great city",R.drawable.city4))
        mylist.add(Model("Cities","Another city",R.drawable.city5))
        mylist.add(Model("Cities","A  city",R.drawable.city6))
        mylist.add(Model("Cities","A great city",R.drawable.cityy))



        listView.adapter=Myadapter(this,R.layout.row,mylist)
    }
}