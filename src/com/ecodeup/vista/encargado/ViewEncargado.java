package com.ecodeup.vista.encargado;

import java.util.List;

import com.ecodeup.model.encargado.Encargado;

public class ViewEncargado {

	public void verEncargado(Encargado encargado) {
		System.out.println("Datos del Encargado: " + encargado);
	}

	public void verEncargado(List<Encargado> encargados) {
		for (Encargado encargado : encargados) {
			System.out.println("Datos del Encargado: " + encargado);
		}
	}

}
