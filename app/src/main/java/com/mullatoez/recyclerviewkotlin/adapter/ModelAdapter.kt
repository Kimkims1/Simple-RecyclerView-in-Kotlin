package com.mullatoez.recyclerviewkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mullatoez.recyclerviewkotlin.R
import com.mullatoez.recyclerviewkotlin.model.Model

class ModelAdapter(val countryList: ArrayList<Model>) :
    RecyclerView.Adapter<ModelAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ModelAdapter.ViewHolder, position: Int) {
        holder.bindItems(countryList[position])
    }

    override fun getItemCount() = countryList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(model: Model) {

            val countryName: TextView = itemView.findViewById(R.id.country)
            val cityName: TextView = itemView.findViewById(R.id.city)

            countryName.text = model.country
            cityName.text = model.city

        }

    }
}