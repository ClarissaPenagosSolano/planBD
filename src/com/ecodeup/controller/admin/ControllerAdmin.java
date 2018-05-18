package com.ecodeup.controller.admin;

import java.util.ArrayList;
import java.util.List;
import com.ecodeup.dao.admin.AdminDaoImpl;
import com.ecodeup.idao.admin.IAdminDao;
import com.ecodeup.model.admin.Admin;
import com.ecodeup.vista.admin.ViewAdmin;

public class ControllerAdmin {

	private ViewAdmin vista = new ViewAdmin();

	public ControllerAdmin() {
	}

	// llama al DAO para guardar un cliente
	public void registrar(Admin admin) {
		IAdminDao dao = new AdminDaoImpl();
		dao.registrar(admin);
	}

	// llama al DAO para actualizar un cliente
	public void actualizar(Admin admin) {
		IAdminDao dao = new AdminDaoImpl();
		dao.actualizar(admin);
	}

	// llama al DAO para eliminar un cliente
	public void eliminar(Admin admin) {
		IAdminDao dao = new AdminDaoImpl();
		dao.eliminar(admin);
	}

	// llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public void verAdmin() {
		List<Admin> admins = new ArrayList<Admin>();
		IAdminDao dao = new AdminDaoImpl();
		admins = dao.obtener();
		vista.verAdmin(admins);
	}

}
