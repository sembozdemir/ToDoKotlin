package com.sembozdemir.todokotlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import org.jetbrains.anko.dip
import org.jetbrains.anko.padding
import java.util.*

class TodoListAdapter(val arrayList: ArrayList<String> = ArrayList<String>())
    : RecyclerView.Adapter<TodoListAdapter.ViewHolder>() {

    override fun getItemCount(): Int = arrayList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemView = TextView(parent.context).apply {
            padding = dip(16)
        }

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = arrayList[position]
    }

    fun add(text: String) {
        arrayList.add(0, text)
        notifyItemInserted(0)
    }

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}