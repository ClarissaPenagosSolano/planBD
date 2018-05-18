package com.ecodeup.vista.categoria;

import java.util.List;

import com.ecodeup.model.categoria.Categoria;

public class ViewCategoria {

	public void verCategoria(Categoria categoria) {
		System.out.println("Datos del Categoria: " + categoria);
	}

	public void verCategoria(List<Categoria> categorias) {
		for (Categoria categoria : categorias) {
			System.out.println("Datos del Categoria: " + categoria);
		}
	}
}
