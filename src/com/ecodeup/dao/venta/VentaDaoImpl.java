package com.ecodeup.dao.venta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Conexion;
import com.ecodeup.idao.venta.IVentaDao;
import com.ecodeup.model.venta.Venta;


public class VentaDaoImpl implements IVentaDao {

	@Override
	public boolean registrar(Venta venta) {
		boolean registrar = false;

		Statement stm = null;
		Connection con = null;

		String sql = "INSERT INTO venta values ( id_venta, valor_venta, fecha_venta)";
		System.out.println(sql);
		try {
			con = Conexion.conectar();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase VentaDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;

	}

	@Override
	public List<Venta> obtener() {

		Connection co = null;
		Statement stm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM venta ORDER BY id_venta";

		List<Venta> listaVenta= new ArrayList<Venta>();

		try {
			co = Conexion.conectar();
			stm = co.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Venta v = new Venta();
				v.setId_venta(rs.getInt(1));
				v.setValor_venta(rs.getString(2));
				v.setFecha_venta(rs.getInt(3));;
				listaVenta.add(v);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ventaDaoImple, método obtener");
			e.printStackTrace();
		}

		return listaVenta;

	}

	@Override
	public boolean actualizar (Venta venta) {
		Connection connect = null;
		Statement stm = null;

		boolean actualizar = false;

		String sql = "UPDATE venta SET valor_venta='valor_venta', fecha_venta='fecha_venta' WHERE id_venta";

		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			actualizar = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase VentaDaoImple, método actualizar");
			e.printStackTrace();
		}
		return actualizar;
	}

	@Override
	public boolean eliminar(Venta venta) {
		Connection connect = null;
		Statement stm = null;

		boolean eliminar = false;

		String sql = "DELETE FROM venta WHERE id_venta";
		try {
			connect = Conexion.conectar();
			stm = connect.createStatement();
			stm.execute(sql);
			eliminar = true;
		} catch (SQLException e) {
			System.out.println("Error: Clase VentaDaoImple, método eliminar");
			e.printStackTrace();
		}
		return eliminar;

	}
}
