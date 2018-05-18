package com.ecodeup.dao.encargado;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Conexion;
import com.ecodeup.idao.encargado.IEncargadoDao;
import com.ecodeup.model.encargado.Encargado;

public class EncargadoDaoImpl implements IEncargadoDao {

	@Override
	public boolean registrar(Encargado encargado) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		String sql = "INSERT INTO encargado  values ( id_administrador, nombres, apellidos, tipo_doc, num_doc, celular, id_administrador)";
		System.out.println(sql);
	
		
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase RncargadoDaoImpl, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public List<Encargado> obtener() {

		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM encargado ORDER BY id_encargado";

		List<Encargado> listaEncargado = new ArrayList<Encargado>();

		try {
			co = Conexion.conectar();
			stm = co.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Encargado e = new Encargado();
				e.setId_encargado(rs.getInt(1));
				e.setNombres(rs.getString(2));
				e.setApellidos(rs.getString(3));
				e.setTipo_doc(rs.getString(4));
				e.setNum_doc(rs.getInt(5));
				e.setCelular(rs.getString(6));
				e.setContrasena(rs.getString(7));
				listaEncargado.add(e);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}

		return listaEncargado;
	}

	@Override
	public boolean actualizar(Encargado encargado) {
		Connection connect = null;
		Statement stm = null;

		boolean actualizar = false;
		String sql = "UPDATE encargado SET nombres='nombres', apellidos='apellidos', tipo_doc='tipo_doc', num_doc= num_doc, celular='celular', id_administrador= id_administrador  WHERE id_encargado";
		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			actualizar = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase EncargadoDaoImple, método actualizar");
			e.printStackTrace();
		}
		return actualizar;
	}

	@Override
	public boolean eliminar(Encargado encargado) {

		Connection connect = null;
		Statement stm = null;

		boolean eliminar = false;

		String sql = "DELETE FROM encargado WHERE id_encargado";
		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			eliminar = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase EncargadoDaoImple, método eliminar");
			e.printStackTrace();
		}
		return eliminar;
	}

}
