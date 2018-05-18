package com.ecodeup.model;

public class Cliente {

	public String nombres;
	public String apellidos;
	public String tipo_doc;
	public int num_doc;
	public String celular;
	public String contrasena;

	public Cliente() {
	}

	public Cliente(String nombres, String apellidos, String tipo_doc, int num_doc, String celular, String contrasena) {

		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipo_doc = tipo_doc;
		this.num_doc = num_doc;
		this.celular = celular;
		this.contrasena = contrasena;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo_doc() {
		return tipo_doc;
	}

	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	public int getNum_doc() {
		return num_doc;
	}

	public void setNum_doc(int num_doc) {
		this.num_doc = num_doc;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String calular) {
		this.celular = calular;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return this.nombres + ", " + this.apellidos + ", " + this.tipo_doc + ", " + this.num_doc + ", " + this.celular
				+ "," + this.contrasena;
	}

}
