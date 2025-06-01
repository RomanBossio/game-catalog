package com.example.gamecatalog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CatalogActivity : AppCompatActivity() {
    private lateinit var rvCategorias: RecyclerView
    private lateinit var adapter: CategoriaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        rvCategorias = findViewById(R.id.rvCategorias)
        rvCategorias.layoutManager = LinearLayoutManager(this)

        val categorias = listOf(
            Categoria("Acción", "Juegos llenos de adrenalina", R.drawable.accion),
            Categoria("Aventura", "Explorá mundos increíbles", R.drawable.aventura),
            Categoria("Puzzle", "Poné a prueba tu ingenio", R.drawable.puzzle)
        )

        adapter = CategoriaAdapter(categorias) { categoria ->
            // Acá podés abrir otra Activity con el detalle
        }

        rvCategorias.adapter = adapter
    }
}