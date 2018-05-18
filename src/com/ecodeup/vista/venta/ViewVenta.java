package com.ecodeup.vista.venta;

import java.util.List;

import com.ecodeup.model.venta.Venta;


public class ViewVenta {

	public void verVenta(Venta venta) {
		System.out.println("Datos Venta: " + venta);
	}

	public void verVenta(List<Venta> ventas) {
		for (Venta venta : ventas) {
			System.out.println("Datos de Venta: " + ventas);
		}
	}
}
