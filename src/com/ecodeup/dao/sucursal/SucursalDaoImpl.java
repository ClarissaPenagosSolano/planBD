package com.ecodeup.dao.sucursal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Conexion;
import com.ecodeup.idao.secursal.ISucursalDao;
import com.ecodeup.model.sucursal.Sucursales;


public class SucursalDaoImpl implements ISucursalDao {
	
	@Override
	public boolean registrar(Sucursales sucursales) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		String sql = "INSERT INTO sucursal values ( id_sucursal, razon_social, direccion_suc, telefono, id_administrador)";
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
	public List<Sucursales> obtener() {

		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM sucursal ORDER BY id_sucursal";

		List<Sucursales> listaSucursal= new ArrayList<Sucursales>();

		try {
			co = Conexion.conectar();
			stm = co.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Sucursales s = new Sucursales();
				s.setId_sucursal(rs.getInt(1));
				s.setRazon_social(rs.getString(2));
				s.setDireccion_suc(rs.getString(3));
				s.setTelefono(rs.getString(4));
				s.setId_administrador(rs.getInt(5));

				listaSucursal.add(s);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}

		return listaSucursal;
	}

	@Override
	public boolean actualizar(Sucursales sucursales) {
		Connection connect = null;
		Statement stm = null;
		boolean actualizar = false;
		String sql = "UPDATE sucursal SET razon_social='razon_social', direccion_suc='direccion_suc', telefono='telefono', id_administrador= id_administrador  WHERE id_sucursal";
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
	public boolean eliminar(Sucursales sucursales) {

		Connection connect = null;
		Statement stm = null;

		boolean eliminar = false;

		String sql = "DELETE FROM encargado WHERE id_sucursal";
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
	@Override
	public boolean innerJoin(Sucursales sucursales) {
		boolean innerJoin = false;

		Statement stm = null;
		Connection con = null;

		String sql = "SELECT  ( id_sucursal, razon_social, direccion_suc, telefono, id_administrador)";
		System.out.println(sql);
	
		
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			innerJoin = true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase RncargadoDaoImpl, método registrar");
			e.printStackTrace();
		}
		return innerJoin;
	}
	public List<String[]> obtenerProductosSucursal( int idSucursal ) {

		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "select sucursal.razon_social, producto.nombre_producto from producto_sucursal" +
                " inner join producto on producto_sucursal.producto_idproducto = producto.id_producto" +
                " inner join sucursal on producto_sucursal.sucursal_id_sucursal = sucursal.id_sucursal" +
                "where sucursal.id_sucursal = " + String.valueOf(idSucursal) + ";";

		List<String[]> listaSucursal= new ArrayList<String[]>();

		try {
			co = Conexion.conectar();
			stm = co.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {

                String[] productoSucursal = new String[2];
                productoSucursal[0] = rs.getString(1); // nombre de la sucursal
                productoSucursal[1] = rs.getString(2); // nombre del producto
				listaSucursal.add(productoSucursal);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, metodo obtener");
			e.printStackTrace();
		}

		return listaSucursal;
	}

	

}
