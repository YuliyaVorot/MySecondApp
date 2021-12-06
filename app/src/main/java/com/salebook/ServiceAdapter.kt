package com.salebook

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ServiceAdapter(private val serviceList: List<Service>):RecyclerView.Adapter<ServiceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceViewHolder {
       val itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.service_list_item,parent,false)
        return ServiceViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ServiceViewHolder, position: Int) {
        val service=serviceList[position]
        holder.bind(service)
    }

    override fun getItemCount(): Int {
        return serviceList.size
    }


}