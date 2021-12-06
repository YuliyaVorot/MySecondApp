package com.salebook

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)  {

    private val bookImageView:ImageView = itemView.findViewById(R.id.book_image_view)
    private val ageTextView: TextView = itemView.findViewById(R.id.age_text_view)

    fun bind(book: Book) {
        ageTextView.text = book.age
        bookImageView.setImageResource(book.image)
    }

}