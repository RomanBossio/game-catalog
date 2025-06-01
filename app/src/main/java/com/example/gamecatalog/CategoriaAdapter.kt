package com.example.gamecatalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoriaAdapter(
    private val categorias: List<Categoria>,
    private val onClick: (Categoria) -> Unit
) : RecyclerView.Adapter<CategoriaAdapter.CategoriaViewHolder>() {

    inner class CategoriaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivImagen: ImageView = view.findViewById(R.id.ivCategoria)
        val tvNombre: TextView = view.findViewById(R.id.tvNombreCategoria)
        val tvDescripcion: TextView = view.findViewById(R.id.tvDescripcionCategoria)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_categoria, parent, false)
        return CategoriaViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriaViewHolder, position: Int) {
        val categoria = categorias[position]
        holder.ivImagen.setImageResource(categoria.imagen)
        holder.tvNombre.text = categoria.nombre
        holder.tvDescripcion.text = categoria.descripcion

        holder.itemView.setOnClickListener { onClick(categoria) }
    }

    override fun getItemCount(): Int = categorias.size
}