package com.ecodeup.idao.admin;

import java.util.List;


import com.ecodeup.model.admin.*;

public interface IAdminDao {
	public boolean registrar(Admin admin);

	public List<Admin> obtener();

	public boolean actualizar(Admin admin);

	public boolean eliminar(Admin admin);

}
