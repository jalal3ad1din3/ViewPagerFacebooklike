package com.example.viewpager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.R
import com.example.viewpager.adapter.AdapterFragment
import com.example.viewpager.adapter.ContactAdapter
import com.example.viewpager.model.Contect
import kotlinx.android.synthetic.main.fragment_first_page.*
import kotlinx.android.synthetic.main.fragment_first_page.view.*


class FirstPage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_first_page, container, false)

        val contect = prepareContactList()
        refreshAdapter(contect,rootView)

        return rootView

    }
    fun refreshAdapter(contect: List<Contect>,view: View){
        val recyclerView:RecyclerView = view.findViewById(R.id.recyclerView)
        val adapter = ContactAdapter(contect)
        recyclerView.adapter = adapter
    }

    fun prepareContactList():List<Contect>{
        val contects = ArrayList<Contect>()

        for (i in 0..15){
            contects.add(Contect("Jalal",94100043))
        }
        return contects
    }

}