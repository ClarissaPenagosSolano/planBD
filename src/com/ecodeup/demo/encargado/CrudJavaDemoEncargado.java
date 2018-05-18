package com.ecodeup.demo.encargado;

import com.ecodeup.controller.encargado.ControllerEncargado;
import com.ecodeup.model.encargado.Encargado;

public class CrudJavaDemoEncargado {

	public static void main(String[] args) {

		Encargado encargado = new Encargado(2, "Karla", "Pattherson", "Cedula", 108859877, "3102359189", "KarlaP", 1);

		// controlador
		ControllerEncargado controller = new ControllerEncargado();

		// guarda un cliente a través del controlador
		controller.registrar(encargado);

		// ver clientes
		controller.verEncargado();

		// editar un cliente por medio del id
		encargado.setId_encargado(1);
		encargado.setNombres("Karla");
		controller.actualizar(encargado);

		// eliminar un cliente por medio del id
		encargado.setId_encargado(1);
		controller.eliminar(encargado);
	}

}
