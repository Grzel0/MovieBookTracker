package com.example.moviebooktracker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.SeekBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        lateinit var lista: MutableList<ElementListy>
        lateinit var adapter: ListaAdapter
        lista = mutableListOf()
        adapter = ListaAdapter(lista)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        val tytul = findViewById<EditText>(R.id.tytul)
        val gatunek = findViewById<EditText>(R.id.gatunek)
        val recenzja = findViewById<EditText>(R.id.recenzja)
        val ocena = findViewById<SeekBar>(R.id.ocena)
        val typGroup = findViewById<RadioGroup>(R.id.typ)
        val dodajButton = findViewById<Button>(R.id.dodajButton)

        dodajButton.setOnClickListener {
            val wybranyTyp = findViewById<RadioButton>(
                typGroup.checkedRadioButtonId
            )?.text?.toString() ?: "Nieznany"
        }
    }
}

