package com.ecodeup.dao.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Conexion;
import com.ecodeup.model.login.login;


public class LoginDaoImpl {

	
	public List<login> obtener() {
		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT usuario FROM usuario";

		List<login> login = new ArrayList<login>();

		try {
			co = Conexion.conectar();
			stm = co.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				login l = new login();
				l.setPassword(rs.getString(1));
				l.setUsuario(rs.getString(2));

				login.add(l);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase LoginDaoImple, método obtener");
			e.printStackTrace();
		}

		return login;

	}
	
}
