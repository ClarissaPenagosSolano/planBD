package com.ecodeup.model.login;


public class login {


	public String password;
	public String usuario;
	public String rol;
	
	
	public login() {
		super();
	}
	public login(String password, String usuario, String rol) {
		super();
		this.password = password;
		this.usuario = usuario;
		this.rol = rol;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	@Override
	public String toString() {
		return this.password+ ", " + this.usuario+ ", " + this.rol;
	}
	
	
	
	
	
	
	
	
}
