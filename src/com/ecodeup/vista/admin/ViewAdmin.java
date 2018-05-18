package com.ecodeup.vista.admin;


import java.util.List;


import com.ecodeup.model.admin.Admin;

public class ViewAdmin {

	public void verAdmin(Admin admin) {
		System.out.println("Datos Administrador: " + admin);
	}

	public void verAdmin(List<Admin> admins) {
		for (Admin admin : admins) {
			System.out.println("Datos del Administrador: " + admins);
		}
	}

}
