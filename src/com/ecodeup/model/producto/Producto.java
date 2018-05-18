package com.ecodeup.model.producto;

public class Producto {

	public int id_producto;
	public String nombre_producto;
	public String precio_producto;
	public String marca;
	public String presentacion;

	public Producto() {

	}

	public Producto(int id_producto, String nombre_producto, String precio_producto, String marca, String presentacion) {
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.precio_producto = precio_producto;
		this.marca = marca;
		this.presentacion = presentacion;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(String precio_producto) {
		this.precio_producto = precio_producto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	@Override
	public String toString() {
		return this.id_producto + "," + this.nombre_producto + "," + this.precio_producto + "," + this.marca + ","
				+ this.presentacion;
	}

}
