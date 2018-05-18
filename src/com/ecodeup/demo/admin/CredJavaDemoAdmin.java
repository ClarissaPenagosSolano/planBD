package com.ecodeup.demo.admin;

import com.ecodeup.controller.admin.ControllerAdmin;
import com.ecodeup.model.admin.Admin;

public class CredJavaDemoAdmin {

	public static void main(String[] args) {

		Admin admin = new Admin(2, "Fabian", "Gonzales", "Cedula", 102659870, "3102359296");

		// controlador
		ControllerAdmin controller = new ControllerAdmin();

		// guarda un cliente a través del controlador
		controller.registrar(admin);

		// ver clientes
		controller.verAdmin();

		// editar un cliente por medio del id
		admin.setId_administrador(1);
		admin.setNombres("Fabian");
		controller.actualizar(admin);

		// eliminar un cliente por medio del id
		admin.setId_administrador(1);
		controller.eliminar(admin);
	}
}
