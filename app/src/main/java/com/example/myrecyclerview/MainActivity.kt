package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list = arrayOf("ali","mamad","hasan","Asghar")
        val list2 = arrayOf("09353254464","09354126578","09351154897","09365425858")
        val adapter = ListAdapter(list)
        val recycler = findViewById<RecyclerView>(R.id.RCV)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter


    }
}