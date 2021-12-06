package com.salebook

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ServiceViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    fun bind(service: Service){
        val workTextView:TextView = itemView.findViewById(R.id.work_text_view)
        val priceTextView:TextView = itemView.findViewById(R.id.price_text_view)

        workTextView.text   ="${service.work}"
        priceTextView.text  = "Цена: ${service.price} руб."

       // itemView.setOnClickListener{
       //    Toast.makeText(itemView.context,service.work,Toast.LENGTH_LONG).show()
       // }


    }
}