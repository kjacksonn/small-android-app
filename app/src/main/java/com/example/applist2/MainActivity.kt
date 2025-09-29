package com.example.applist2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf(
            "Calculator","Calendar","Camera","Clock","Contacts",
            "Email","Files","Maps","Messages","Music","Notes",
            "Photos","Settings","Weather"
        )

        recyclerView = findViewById(R.id.appList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = ItemAdapter(items) { name ->
            Toast.makeText(this, "Clicked: $name", Toast.LENGTH_SHORT).show()
        }
        recyclerView.adapter = adapter
    }
}
