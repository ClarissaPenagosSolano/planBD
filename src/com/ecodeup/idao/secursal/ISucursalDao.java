package com.ecodeup.idao.secursal;

import java.util.List;


import com.ecodeup.model.sucursal.Sucursales;



public interface ISucursalDao {

	public boolean registrar(Sucursales sucursales);

	public List<Sucursales> obtener();

	public boolean actualizar(Sucursales sucursales);

	public boolean eliminar(Sucursales sucursales);
}
