package com.ecodeup.vista.login;

import java.util.List;

import com.ecodeup.model.login.login;

public class ViewLogin {

	public void verLogin(login login) {
		System.out.println("Datos del Cliente: " + login);
	}

	public void verLogins(List<login> logins) {
		for (login login: logins) {
			System.out.println("Datos del Login: " + login);
		}
	}

}
