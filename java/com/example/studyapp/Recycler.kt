package com.example.studyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_view_layout.view.*

class Recycler (val context: Context, val messages: ArrayList<Lesson>):
        RecyclerView.Adapter<Recycler.ViewHolder>(){
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.card_view_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val message = messages[position]
        holder.itemView.apply {
            tvLessonName.text = message.name
            tvLessonDetails.text = message.details
            cvCard.setOnClickListener { AlertDialog(context, "Extra Info", message.extraDetails) }
        }
    }

    override fun getItemCount(): Int = messages.size
}