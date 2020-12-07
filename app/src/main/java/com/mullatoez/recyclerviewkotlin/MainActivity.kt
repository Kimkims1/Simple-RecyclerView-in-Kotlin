package com.mullatoez.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mullatoez.recyclerviewkotlin.adapter.ModelAdapter
import com.mullatoez.recyclerviewkotlin.model.Model

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this)

        /* Let's create a dummy data for our recyclerview*/

        val countries = ArrayList<Model>()

        countries.add(Model("UK", "London"))
        countries.add(Model("France", "Paris"))
        countries.add(Model("Germany", "Munich"))
        countries.add(Model("Spain", "Madrid"))
        countries.add(Model("Portugal", "Lisbon"))
        countries.add(Model("Greece", "Athens"))

        val adapter = ModelAdapter(countries)

        recyclerView.adapter = adapter

        /* WE ARE DONE! LET'S RUN THE APP*/
    }
}