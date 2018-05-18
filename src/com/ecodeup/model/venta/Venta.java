package com.ecodeup.model.venta;

public class Venta {

	public int id_venta;
	public String valor_venta;
	public int fecha_venta;

	public Venta() {
		super();
	}

	public Venta(int id_venta, String valor_venta, int fecha_venta) {
		super();
		this.id_venta = id_venta;
		this.valor_venta = valor_venta;
		this.fecha_venta = fecha_venta;
	}

	public int getId_venta() {
		return id_venta;
	}

	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}

	public String getValor_venta() {
		return valor_venta;
	}

	public void setValor_venta(String valor_venta) {
		this.valor_venta = valor_venta;
	}

	public int getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(int fecha_venta) {
		this.fecha_venta = fecha_venta;
	}
	
	@Override
	public String toString() {
		return this.id_venta + ", " + this.valor_venta +","+ this.fecha_venta;
	}

}
