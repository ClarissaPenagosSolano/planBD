package com.ecodeup.idao.venta;

import java.util.List;

import com.ecodeup.model.venta.Venta;



public interface IVentaDao {

	public boolean registrar(Venta venta);

	public List<Venta> obtener();

	public boolean actualizar(Venta venta);

	public boolean eliminar(Venta venta);
}
