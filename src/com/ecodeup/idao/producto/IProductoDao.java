package com.ecodeup.idao.producto;

import java.util.List;
import com.ecodeup.model.producto.Producto;

public interface IProductoDao {

	public boolean registrar(Producto producto);

	public List<Producto> obtener();

	public boolean actualizar(Producto producto);

	public boolean eliminar(Producto producto);

}
