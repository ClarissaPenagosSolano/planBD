package com.ecodeup.controller.login;

import java.util.ArrayList;
import java.util.List;

import com.ecodeup.dao.login.LoginDaoImpl;
import com.ecodeup.idao.login.ILoginDao;
import com.ecodeup.model.login.login;
import com.ecodeup.vista.login.ViewLogin;

public class ControllerLogin {

	private ViewLogin vista = new ViewLogin();
	public ControllerLogin() {
	}
	
	// llama al DAO para obtener todos los clientes y luego los muestra en la vista
		public void verLogin() {
			List<login> login= new ArrayList<login>();
			ILoginDao dao =  (ILoginDao) new LoginDaoImpl();
			login = dao.obtener();
			vista.verLogins(login);
		}

	
}
