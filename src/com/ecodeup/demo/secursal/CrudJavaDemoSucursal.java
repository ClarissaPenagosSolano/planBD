package com.ecodeup.demo.secursal;

import com.ecodeup.controller.sucursal.ControllerSucursal;
import com.ecodeup.model.sucursal.Sucursales;

public class CrudJavaDemoSucursal {

	public static void main(String[] args) {

		Sucursales sucursales = new Sucursales(1, "MiniMercados LTDA Suba", "Suba", "3212190278", 11);

		// controlador
		ControllerSucursal controller = new ControllerSucursal();

		// guarda un cliente a través del controlador
		controller.registrar(sucursales);

		// ver clientes
		controller.verSucursal();

		// editar un cliente por medio del id
		sucursales.setId_sucursal(1);
		sucursales.setRazon_social("MiniMercados LTDA Suba");
		controller.actualizar(sucursales);

		// eliminar un cliente por medio del id
		sucursales.setId_sucursal(1);
		controller.eliminar(sucursales);
		
	}
}
