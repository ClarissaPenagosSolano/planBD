package com.ecodeup.demo;

import com.ecodeup.controller.ControllerCliente;

import com.ecodeup.model.Cliente;

public class CrudJavaDemo {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Clarissa", "Penagos", "Cedula", 1016112818, "3212190278", "Clary99");

		ControllerCliente controller = new ControllerCliente();

		// guarda un cliente a través del controlador
		controller.registrar(cliente);

		// ver clientes
		controller.verClientes();

		// editar un cliente por medio del id
		cliente.setNum_doc(4);
		cliente.setNombres("Clarissa");
		controller.actualizar(cliente);

		cliente.setNum_doc(1);
		controller.eliminar(cliente);

	}
}