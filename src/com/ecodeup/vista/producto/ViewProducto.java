package com.ecodeup.vista.producto;

import java.util.List;

import com.ecodeup.model.producto.Producto;

public class ViewProducto {
	public void verProducto(Producto producto) {
		System.out.println("Datos del Producto: " + producto);
	}

	public void verProducto(List<Producto> productos) {
		for (Producto producto : productos) {
			System.out.println("Datos  Producto: " + producto);
		}
	}

}
