package com.ecodeup.model.admin;

public class Admin {

	private int id_administrador;
	private String nombres;
	private String apellidos;
	private String tipo_doc;
	private int num_doc;
	private String celular;


	

	public Admin(int id_administrador, String nombres, String apellidos, String tipo_doc, int num_doc, String celular) {
		this.id_administrador = id_administrador;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipo_doc = tipo_doc;
		this.num_doc = num_doc;
		this.celular = celular;

	}
	public Admin() {
	}

	public int getId_administrador() {
		return id_administrador;
	}

	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
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

	public void setCelular(String celular) {
		this.celular = celular;
	}



	@Override
	public String toString() {
		return this.id_administrador + ", " + this.nombres + ", " + this.apellidos + ", " + this.tipo_doc + ", "
				+ this.num_doc + ", " + this.celular ;
	}

}
