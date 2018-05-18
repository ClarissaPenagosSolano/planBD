package com.ecodeup.controller.producto;

import java.util.ArrayList;


import java.util.List;

import com.ecodeup.dao.producto.ProductoDaoImpl;
import com.ecodeup.idao.producto.IProductoDao;
import com.ecodeup.model.producto.Producto;
import com.ecodeup.vista.producto.ViewProducto;

public class ControllerProducto {

	private ViewProducto vista = new ViewProducto();

	public ControllerProducto() {
	}

	// llama al DAO para guardar un cliente
	public void registrar(Producto producto) {
		IProductoDao dao = new ProductoDaoImpl();
		dao.registrar(producto);
	}

	// llama al DAO para actualizar un cliente
	public void actualizar(Producto producto) {
		IProductoDao dao = new ProductoDaoImpl();
		dao.actualizar(producto);
	}

	// llama al DAO para eliminar un cliente
	public void eliminar(Producto producto) {
		IProductoDao dao = new ProductoDaoImpl();
		dao.eliminar(producto);
	}

	// llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public void verProductos() {
		List<Producto> productos = new ArrayList<Producto>();
		IProductoDao dao = new ProductoDaoImpl();
		productos = dao.obtener();
		vista.verProducto(productos);
	}

}
