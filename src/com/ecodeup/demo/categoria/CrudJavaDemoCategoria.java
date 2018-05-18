package com.ecodeup.demo.categoria;

import com.ecodeup.controller.categoria.ControllerCategoria;
import com.ecodeup.model.categoria.Categoria;

public class CrudJavaDemoCategoria {

	public static void main(String[] args) {

		Categoria categoria = new Categoria(11, "Aseo");

		// controlador
		ControllerCategoria controller = new ControllerCategoria();

		// guarda un cliente a través del controlador
		controller.registrar(categoria);

		// ver clientes
		controller.verCategoria();

		// editar un cliente por medio del id
		categoria.setId_categoria(1);
		categoria.setNombre_categoria("Aseo");
		controller.actualizar(categoria);

		// eliminar un cliente por medio del id
		categoria.setId_categoria(1);
		controller.eliminar(categoria);
	}
}
