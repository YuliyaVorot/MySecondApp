package com.salebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//private const val HELLO_KEY = "helloNoNull"
class ServiceActivity : AppCompatActivity() {

    lateinit var serviceRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        val serviceList:List<Service> = GetServiceList()

        serviceRecyclerView = findViewById(R.id.service_recycler_view)
        serviceRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        serviceRecyclerView.adapter = ServiceAdapter(serviceList)
        serviceRecyclerView.addItemDecoration(
            DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL)
        )

    }

    fun GetServiceList(): List<Service> {
        val serviceList:List<Service> = listOf(
            Service("Твердый переплет",500),
            Service("Подшивка документов", 300),
            Service("Распечатка, за 1 стр", 15),
            Service("Ксерокопия, за 1 стр", 10)
        )

        return serviceList
    }

}