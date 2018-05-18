package com.ecodeup.controller.sucursal;

import java.util.ArrayList;
import java.util.List;

import com.ecodeup.dao.sucursal.SucursalDaoImpl;
import com.ecodeup.idao.secursal.ISucursalDao;
import com.ecodeup.model.sucursal.Sucursales;
import com.ecodeup.vista.sucursal.ViewSucursal;





public class ControllerSucursal {

	private ViewSucursal vista = new ViewSucursal();

	public ControllerSucursal() {
	}

	// llama al DAO para guardar un cliente
	public void registrar(Sucursales sucursales) {
		ISucursalDao dao = new SucursalDaoImpl();
		dao.registrar(sucursales);
	}

	// llama al DAO para actualizar un cliente
	public void actualizar(Sucursales sucursales) {
		ISucursalDao dao = new SucursalDaoImpl();
		dao.actualizar(sucursales);
	}

	// llama al DAO para eliminar un cliente
	public void eliminar(Sucursales sucursales) {
		ISucursalDao dao = new SucursalDaoImpl();
		dao.eliminar(sucursales);
	}

	// llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public void verSucursal() {
		List<Sucursales> sucursales = new ArrayList<Sucursales>();
		ISucursalDao dao = new SucursalDaoImpl();
		sucursales = dao.obtener();
		vista.verSucursales(sucursales);
	}

	
	
	
	
}
