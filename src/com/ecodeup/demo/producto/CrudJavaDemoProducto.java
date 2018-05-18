package com.ecodeup.demo.producto;

import com.ecodeup.controller.producto.ControllerProducto;
import com.ecodeup.model.producto.Producto;

public class CrudJavaDemoProducto {

	public static void main(String[] args) {

		Producto producto = new Producto(1, "Leche", "2100", "Alqueria", "500ml");

		// controlador
		ControllerProducto controller = new ControllerProducto();

		// guarda un cliente a través del controlador
		controller.registrar(producto);

		// ver clientes
		controller.verProductos();

		// editar un cliente por medio del id
		producto.setId_producto(1);
		producto.setNombre_producto("Leche");
		controller.actualizar(producto);

		// eliminar un cliente por medio del id
		producto.setId_producto(1);
		controller.eliminar(producto);
	}
}
