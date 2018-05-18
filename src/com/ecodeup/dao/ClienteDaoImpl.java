package com.ecodeup.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Conexion;
import com.ecodeup.idao.IClienteDao;
import com.ecodeup.model.Cliente;

public class ClienteDaoImpl implements IClienteDao {

        @Override
	public boolean registrar(Cliente cliente) {
		
		boolean registrar = false;
		Statement stm = null;
		Connection con = null;

		String sql = "INSERT INTO cliente  values ( nombres, apellidos, tipo_doc, num_doc, celular)";

		System.out.println(sql);	
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImpl, m�todo registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public  List<Cliente> obtener() {

		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM cliente ORDER BY num_doc";

		List<Cliente> listaCliente = new ArrayList<Cliente>();

		try {
			co = Conexion.conectar();
			stm = co.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Cliente c = new Cliente();
				c.setNombres(rs.getString(1));
				c.setApellidos(rs.getString(2));
				c.setTipo_doc(rs.getString(3));
				c.setNum_doc(rs.getInt(4));
				c.setCelular(rs.getString(5));
				listaCliente.add(c);
			}
			stm.close();
			rs.close();
			co.close();
			return listaCliente;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, m�todo obtener");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean actualizar(Cliente cliente) {
		Connection connect = null;
		Statement stm = null;

		boolean actualizar = false;

		String sql = "UPDATE cliente SET nombres='nombres', apellidos='apellidos', tipo_doc='tipo_doc', celular='celular', contrasena='contrasena' WHERE num_doc";

		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			System.out.println(sql);

			actualizar = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, m�todo actualizar");
			e.printStackTrace();
		}
		return actualizar;
	}

	@Override
	public  boolean eliminar(Cliente cliente) {
		Connection connect = null;
		Statement stm = null;

		boolean eliminar = false;

		String sql = "DELETE FROM cliente WHERE num_doc=''" ;
		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			eliminar = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, m�todo eliminar");
			e.printStackTrace();
		}
		return eliminar;
	}

}
