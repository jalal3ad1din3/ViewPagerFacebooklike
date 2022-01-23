package com.example.viewpager.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.R
import com.example.viewpager.model.Users
import java.lang.reflect.Member

class CustomAdapterPosts(val users:List<Users>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.posts_custom_item,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is CustomViewHolder) {

            holder.apply {
                when {
                      position % 11 == 0 ->{
                          image_item.setImageResource(R.drawable.img_1)
                      }position % 3 == 0 ->{
                          image_item.setImageResource(R.drawable.masjid)
                      }position % 5 == 0 ->{
                          image_item.setImageResource(R.drawable.img)
                      }position % 7 == 0 ->{
                          image_item.setImageResource(R.drawable.cat)
                     }
                }
            }
        }
    }

    override fun getItemCount(): Int {
       return users.size
    }
   class CustomViewHolder(view: View):RecyclerView.ViewHolder(view){
       val image_item = view.findViewById<ImageView>(R.id.im_item)
   }
}