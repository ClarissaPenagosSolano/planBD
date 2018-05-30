package com.ecodeup.demo.login;

import com.ecodeup.controller.login.ControllerLogin;
import com.ecodeup.model.login.login;

public class CrudJavaDemoLogin {
	
	public static void main(String[] args) {

		login login= new login( "1234", "Administrador", "11");

		// controlador
		ControllerLogin controller = new ControllerLogin();



		// ver clientes
		controller.verLogin();

	}

}
