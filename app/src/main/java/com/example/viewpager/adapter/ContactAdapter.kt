package com.example.viewpager.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.R
import com.example.viewpager.model.Contect


class ContactAdapter(val contect: List<Contect>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_list,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val contect =  contect[position]

         if (holder is CustomViewHolder){
             holder.name.text = contect.name
             holder.phoneNumber.text = contect.phoneNumber.toString()
         }
    }

    override fun getItemCount(): Int {
      return contect.size
    }

    class CustomViewHolder(view: View):RecyclerView.ViewHolder(view){
        val name:TextView = view.findViewById(R.id.tv_name)
        val phoneNumber:TextView = view.findViewById(R.id.tv_phoneNumber)
    }
}