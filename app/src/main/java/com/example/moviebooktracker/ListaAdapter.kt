package com.example.moviebooktracker

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListaAdapter(private val lista: List<ElementListy>) :
    RecyclerView.Adapter<ListaAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tytul: TextView = view.findViewById(R.id.tytulElement)
        val gatunek: TextView = view.findViewById(R.id.gatunekElement)
        val recenzja: TextView = view.findViewById(R.id.recenzjaElement)
        val ocena: TextView = view.findViewById(R.id.ocenaElement)
        val typ: TextView = view.findViewById(R.id.typElement)
        val obejrzane: CheckBox = view.findViewById(R.id.obejrzaneCheckbox)
    }

}