package com.ecodeup.model.sucursal;

public class Sucursales {

	public int id_sucursal;
	public String razon_social;
	public String direccion_suc;
	public String telefono;
	public int id_administrador;
	
	
	public Sucursales() {
		super();
	}


	public Sucursales(int id_sucursal, String razon_social, String direccion_suc, String telefono,
			int id_administrador) {
		super();
		this.id_sucursal = id_sucursal;
		this.razon_social = razon_social;
		this.direccion_suc = direccion_suc;
		this.telefono = telefono;
		this.id_administrador = id_administrador;
	}


	public int getId_sucursal() {
		return id_sucursal;
	}


	public void setId_sucursal(int id_sucursal) {
		this.id_sucursal = id_sucursal;
	}


	public String getRazon_social() {
		return razon_social;
	}


	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}


	public String getDireccion_suc() {
		return direccion_suc;
	}


	public void setDireccion_suc(String direccion_suc) {
		this.direccion_suc = direccion_suc;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int getId_administrador() {
		return id_administrador;
	}


	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
	}
	
	@Override
	public String toString() {
		return this.id_sucursal+ "," + this.razon_social+ "," + this.direccion_suc+ "," + this.telefono+ ","
				+ this.id_administrador;
	}
}
