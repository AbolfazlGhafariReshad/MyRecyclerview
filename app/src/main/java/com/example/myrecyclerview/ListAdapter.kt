package com.example.myrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val list: Array<String>): RecyclerView.Adapter<ListAdapter.ListAdapterViewHolder>() {


    class ListAdapterViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView) {
        val text : TextView = itemView.findViewById(R.id.textView)
        val btn : Button = itemView.findViewById(R.id.button2)
        val img : ImageView = itemView.findViewById(R.id.imageView)

    }

private lateinit var context:Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapterViewHolder {

        context=parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)

        return ListAdapterViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListAdapterViewHolder, position: Int) {
        holder.text.text =  list.get(position)
        val list2 = arrayOf("09353254464","09354126578","09351154897","09365425858")


        holder.btn.setOnClickListener {

            Toast.makeText(context,list2.get(position), Toast.LENGTH_LONG).show()

        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

}






