package com.ecodeup.idao.encargado;

import java.util.List;
import com.ecodeup.model.encargado.Encargado;

public interface IEncargadoDao {

	public boolean registrar(Encargado encargado);

	public List<Encargado> obtener();

	public boolean actualizar(Encargado encargado);

	public boolean eliminar(Encargado encargado);
}
