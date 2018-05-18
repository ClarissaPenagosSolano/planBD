package com.ecodeup.vista.sucursal;

import java.util.List;

import com.ecodeup.model.sucursal.Sucursales;

public class ViewSucursal {

	public void verSucursales(Sucursales sucursales) {
		System.out.println("Datos Sucursal: " + sucursales);
	}

	public void verSucursales(List<Sucursales> sucursal) {
		for (Sucursales sucursales: sucursal) {
			System.out.println("Datos Sucursal: " + sucursal);
		}
	}
}
