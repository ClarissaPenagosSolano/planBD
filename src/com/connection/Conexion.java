package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	public static Connection conectar() throws SQLException {
		Connection con = null;

		String password = "";
		String usuario = "root";
		String url = "jdbc:mysql://localhost:3306/minimercado?user=" + usuario + "&password=" + password;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// con = DriverManager.getConnection(url);
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/minimercado?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "");

			if (con != null) {
				System.out.println("Conectado");
			}

		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return con;
	}
}
