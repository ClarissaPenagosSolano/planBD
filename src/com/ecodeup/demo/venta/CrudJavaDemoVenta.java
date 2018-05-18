package com.ecodeup.demo.venta;

import com.ecodeup.controller.venta.ControllerVenta;

import com.ecodeup.model.venta.Venta;

public class CrudJavaDemoVenta {

	public static void main(String[] args) {

		Venta venta = new Venta(1, "1.200.000", 22-05-2018);

		// controlador
		ControllerVenta controller = new ControllerVenta();

		// guarda un cliente a través del controlador
		controller.registrar(venta);

		// ver clientes
		controller.verVentas();

		// editar un cliente por medio del id
		venta.setId_venta(1);
		venta.setValor_venta("1.200.000");
		venta.setFecha_venta(22-05-2018);
		controller.actualizar(venta);

		// eliminar un cliente por medio del id
		venta.setId_venta(1);
		controller.eliminar(venta);
	}
}
