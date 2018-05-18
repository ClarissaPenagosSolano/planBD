package com.ecodeup.dao.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Conexion;
import com.ecodeup.idao.admin.IAdminDao;
import com.ecodeup.model.admin.Admin;

public class AdminDaoImpl implements IAdminDao {

	@Override
	public boolean registrar(Admin admin) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		String sql = "INSERT INTO administrador values ( id_administrador, nombres, apellidos, tipo_doc, num_doc, celular)";

		System.out.println(sql);

		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error: Clase AdministradorDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public List<Admin> obtener() {

		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM administrador ORDER BY id_administrador";

		List<Admin> listaAdmin = new ArrayList<Admin>();

		try {
			co = Conexion.conectar();
			stm = co.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Admin a = new Admin();
				a.setId_administrador(rs.getInt(1));
				a.setNombres(rs.getString(2));
				a.setApellidos(rs.getString(3));
				a.setTipo_doc(rs.getString(4));
				a.setNum_doc(rs.getInt(5));
				a.setCelular(rs.getString(6));
				listaAdmin.add(a);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}

		return listaAdmin;
	}

	@Override
	public boolean actualizar(Admin admin) {
		Connection connect = null;
		Statement stm = null;

		boolean actualizar = false;
		String sql = "UPDATE administrador SET  nombres = 'nombres' , apellidos = 'apellidos' , tipo_doc='tipo_doc' ,  num_doc = num_doc, celular = 'celular'  WHERE id_administrador  ";
		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			actualizar = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase AdministradorDaoImple, método actualizar");
			e.printStackTrace();
		}
		return actualizar;
	}

	@Override
	public boolean eliminar(Admin admin) {
		Connection connect = null;
		Statement stm = null;

		boolean eliminar = false;
		String sql = "DELETE FROM administrador WHERE id_administrador";
		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			eliminar = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase Adminwee, método eliminar");
			e.printStackTrace();
		}

		return eliminar;
	}

}
