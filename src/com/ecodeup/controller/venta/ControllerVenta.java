package com.ecodeup.controller.venta;

import java.util.ArrayList;
import java.util.List;
import com.ecodeup.dao.venta.VentaDaoImpl;
import com.ecodeup.idao.venta.IVentaDao;
import com.ecodeup.model.venta.Venta;
import com.ecodeup.vista.venta.ViewVenta;



public class ControllerVenta {

	private ViewVenta vista = new ViewVenta();

	public ControllerVenta() {
	}

	// llama al DAO para guardar un cliente
	public void registrar(Venta venta) {
		IVentaDao dao = new VentaDaoImpl();
		dao.registrar(venta);
	}

	// llama al DAO para actualizar un cliente
	public void actualizar(Venta venta) {
		IVentaDao dao = new VentaDaoImpl();
		dao.actualizar(venta);
	}

	// llama al DAO para eliminar un cliente
	public void eliminar(Venta venta) {
		IVentaDao dao = new VentaDaoImpl();
		dao.eliminar(venta);
	}

	// llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public void verVentas() {
		List<Venta> ventas = new ArrayList<Venta>();
		IVentaDao dao = new VentaDaoImpl();
		ventas = dao.obtener();
		vista.verVenta(ventas);
	}

	
}
