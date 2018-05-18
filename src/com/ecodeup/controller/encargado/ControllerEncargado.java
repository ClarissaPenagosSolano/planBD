package com.ecodeup.controller.encargado;

import java.util.ArrayList;
import java.util.List;

import com.ecodeup.dao.encargado.EncargadoDaoImpl;
import com.ecodeup.idao.encargado.IEncargadoDao;
import com.ecodeup.model.encargado.Encargado;
import com.ecodeup.vista.encargado.ViewEncargado;

public class ControllerEncargado {

	private ViewEncargado vista = new ViewEncargado();

	public ControllerEncargado() {
	}

	// llama al DAO para guardar un cliente
	public void registrar(Encargado encargado) {
		IEncargadoDao dao = new EncargadoDaoImpl();
		dao.registrar(encargado);
	}

	// llama al DAO para actualizar un cliente
	public void actualizar(Encargado encargado) {
		IEncargadoDao dao = new EncargadoDaoImpl();
		dao.actualizar(encargado);
	}

	// llama al DAO para eliminar un cliente
	public void eliminar(Encargado encargado) {
		IEncargadoDao dao = new EncargadoDaoImpl();
		dao.eliminar(encargado);
	}

	// llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public void verEncargado() {
		List<Encargado> encargados = new ArrayList<Encargado>();
		IEncargadoDao dao = new EncargadoDaoImpl();
		encargados = dao.obtener();
		vista.verEncargado(encargados);
	}

}
