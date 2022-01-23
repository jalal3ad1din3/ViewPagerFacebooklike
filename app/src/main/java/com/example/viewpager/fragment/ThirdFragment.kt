package com.example.viewpager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.viewpager.R
import com.example.viewpager.adapter.CustomAdapter
import com.example.viewpager.adapter.CustomAdapterPosts
import com.example.viewpager.helper.SpaceItemDecoration
import com.example.viewpager.model.Users


class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_third, container, false)

        initViews(rootView)
        val users = prapareMemberList()
        refreshAdapter(users,rootView)

        return rootView

    }
    fun refreshAdapter(users: List<Users>, view: View){
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        val adapter = CustomAdapterPosts(users)
        recyclerView.adapter = adapter
    }

    private fun initViews(view: View) {
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        recyclerView.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        val decoration = SpaceItemDecoration(10)
        recyclerView.addItemDecoration(decoration)
    }
    fun prapareMemberList():List<Users>{
        val users = ArrayList<Users>()
        for (i in 0..15){

            users.add(Users())

        }
        return users
    }
}