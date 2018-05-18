package com.ecodeup.dao.producto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Conexion;
import com.ecodeup.idao.producto.IProductoDao;
import com.ecodeup.model.producto.Producto;

public class ProductoDaoImpl implements IProductoDao {

	@Override
	public boolean registrar(Producto producto) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		String sql = "INSERT INTO producto values ( id_producto, nombre_producto, precio_producto, marca, presentacion)";
		System.out.println(sql);
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ProductoDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;

	}

	@Override
	public List<Producto> obtener() {

		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM producto ORDER BY id_producto";

		List<Producto> listaProducto = new ArrayList<Producto>();

		try {
			co = Conexion.conectar();
			stm = co.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Producto p = new Producto();
				p.setId_producto(rs.getInt(1));
				p.setNombre_producto(rs.getString(2));
				p.setPrecio_producto(rs.getString(3));
				p.setMarca(rs.getString(4));
				p.setPresentacion(rs.getString(5));
				listaProducto.add(p);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ProductoDaoImple, método obtener");
			e.printStackTrace();
		}

		return listaProducto;

	}

	@Override
	public boolean actualizar(Producto producto) {
		Connection connect = null;
		Statement stm = null;

		boolean actualizar = false;

		String sql = "UPDATE producto SET nombre_producto='nombre_producto', precio_producto='precio_producto', marca='marca', presentacion='presentacion' WHERE id_producto ";

		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			actualizar = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ProductoDaoImple, método actualizar");
			e.printStackTrace();
		}
		return actualizar;
	}

	@Override
	public boolean eliminar(Producto producto) {
		Connection connect = null;
		Statement stm = null;

		boolean eliminar = false;

		String sql = "DELETE FROM producto WHERE id_producto";
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
