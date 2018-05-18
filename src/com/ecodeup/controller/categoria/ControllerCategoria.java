package com.ecodeup.controller.categoria;

import java.util.ArrayList;

import java.util.List;

import com.ecodeup.dao.categoria.CategoriaDaoImpl;
import com.ecodeup.idao.categoria.ICategoriaDao;
import com.ecodeup.model.categoria.Categoria;
import com.ecodeup.vista.categoria.ViewCategoria;

public class ControllerCategoria {

	private ViewCategoria vista = new ViewCategoria();

	public ControllerCategoria() {
	}

	// llama al DAO para guardar un cliente
	public void registrar(Categoria categoria) {
		ICategoriaDao dao = new CategoriaDaoImpl();
		dao.registrar(categoria);
	}

	// llama al DAO para actualizar un cliente
	public void actualizar(Categoria categoria) {
		ICategoriaDao dao = new CategoriaDaoImpl();
		dao.actualizar(categoria);
	}

	// llama al DAO para eliminar un cliente
	public void eliminar(Categoria categoria) {
		ICategoriaDao dao = new CategoriaDaoImpl();
		dao.eliminar(categoria);
	}

	// llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public void verCategoria() {
		List<Categoria> categorias = new ArrayList<Categoria>();
		ICategoriaDao dao = new CategoriaDaoImpl();
		categorias = dao.obtener();
		vista.verCategoria(categorias);
	}

}
