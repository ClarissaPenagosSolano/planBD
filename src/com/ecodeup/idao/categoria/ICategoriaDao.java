package com.ecodeup.idao.categoria;

import java.util.List;
import com.ecodeup.model.categoria.Categoria;

public interface ICategoriaDao {

	public boolean registrar(Categoria categoria);

	public List<Categoria> obtener();

	public boolean actualizar(Categoria categoria);

	public boolean eliminar(Categoria categoria);

}
