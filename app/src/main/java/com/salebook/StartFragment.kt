package com.salebook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StartFragment : Fragment() {

    lateinit var bookRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_start, container, false)

       // val textView:TextView=view.findViewById()
       // val button: Button = view.findViewById(R.id.next_activity_button)

            bookRecyclerView = view.findViewById(R.id.book_recycler_view)

            val bookList: List<Book> = GetBookList()
            bookRecyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
           bookRecyclerView.adapter = BookAdapter(bookList)

        return view
    }

    fun GetBookList(): List<Book> {
        val bookList: List<Book> = listOf(
            Book("1+", R.drawable.kolobok),
            Book("3+", R.drawable.zhiharka),
            Book("6+", R.drawable.three_bear),
        )

        return bookList
    }

    }