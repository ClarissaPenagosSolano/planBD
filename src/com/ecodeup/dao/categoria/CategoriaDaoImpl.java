package com.ecodeup.dao.categoria;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Conexion;
import com.ecodeup.idao.categoria.ICategoriaDao;
import com.ecodeup.model.categoria.Categoria;

public class CategoriaDaoImpl implements ICategoriaDao {

	@Override
	public boolean registrar(Categoria categoria) {

		Statement stm = null;
		Connection con = null;
		boolean registrar = false;

		String sql = "INSERT INTO categoria  values ( id_categoria, nombre_categoria )";
		
		System.out.println(sql);
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase CategoriaDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public List<Categoria> obtener() {
		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM categoria ORDER BY id_categoria";

		List<Categoria> listaCategoria = new ArrayList<Categoria>();

		try {
			co = Conexion.conectar();
			stm = co.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Categoria t = new Categoria();
				t.setId_categoria(rs.getInt(1));
				t.setNombre_categoria(rs.getString(2));

				listaCategoria.add(t);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase CategoriaDaoImple, método obtener");
			e.printStackTrace();
		}

		return listaCategoria;

	}

	@Override
	public boolean actualizar(Categoria categoria) {
		Connection connect = null;
		Statement stm = null;

		boolean actualizar = false;

		String sql = "UPDATE categoria SET nombre_categoria='nombre_categoria' WHERE id_categoria" ;
		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			actualizar = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase CategoriaDaoImple, método actualizar");
			e.printStackTrace();
		}
		return actualizar;

	}

	@Override
	public boolean eliminar(Categoria categoria) {
		Connection connect = null;
		Statement stm = null;

		boolean eliminar = false;
		String sql = "DELETE FROM categoria WHERE id_categoria" ;
		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			eliminar = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método eliminar");
			e.printStackTrace();
		}
		return eliminar;

	}

}
