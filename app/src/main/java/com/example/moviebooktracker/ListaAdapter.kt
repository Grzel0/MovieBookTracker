package com.example.moviebooktracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.element_listy, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val element = lista[position]
        holder.tytul.text = element.tytul
        holder.gatunek.text = element.gatunek
        holder.recenzja.text = element.recenzja
        holder.ocena.text = "Ocena: ${element.ocena}"
        holder.typ.text = element.typ
        holder.obejrzane.isChecked = element.obejrzane

        holder.obejrzane.setOnCheckedChangeListener { _, isChecked ->
            element.obejrzane = isChecked
        }
    }
    override fun getItemCount(): Int = lista.size
}