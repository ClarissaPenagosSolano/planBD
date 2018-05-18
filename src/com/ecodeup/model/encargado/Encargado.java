package com.ecodeup.model.encargado;

public class Encargado {

	private int id_encargado;
	private String nombres;
	private String apellidos;
	private String tipo_doc;
	private int num_doc;
	private String celular;
	private String contrasena;
	private int id_administrador;
	public Encargado() {

	}

	public Encargado(int id_encargado, String nombres, String apellidos, String tipo_doc, int num_doc, String celular,
			String contrasena, int id_administrador) {
		this.id_encargado = id_encargado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipo_doc = tipo_doc;
		this.num_doc = num_doc;
		this.celular = celular;
		this.contrasena = contrasena;
		this.id_administrador= id_administrador;
	}

	public int getId_administrador() {
		return id_administrador;
	}

	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
	}

	public int getId_encargado() {
		return id_encargado;
	}

	public void setId_encargado(int id_encargado) {
		this.id_encargado = id_encargado;
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return this.id_encargado + ", " + this.nombres + ", " + this.apellidos + ", " + this.tipo_doc + ", "
				+ this.num_doc + ", " + this.celular + ", " + this.contrasena + ","+ this.id_administrador;
	}

}
