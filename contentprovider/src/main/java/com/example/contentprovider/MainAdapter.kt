package com.example.contentprovider

import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.example.contentprovider.databinding.ViewHolderMainBinding


class MainAdapter(private val list:List<String>) : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    inner class MyViewHolder(val viewDataBinding: ViewHolderMainBinding):RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MyViewHolder {
        val binding = ViewHolderMainBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MyViewHolder, position: Int) {
        val binding = holder.viewDataBinding
        binding.tvName.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}