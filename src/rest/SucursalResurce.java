package rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

import com.ecodeup.dao.sucursal.SucursalDaoImpl;
import com.ecodeup.idao.secursal.ISucursalDao;
import com.ecodeup.model.sucursal.Sucursales;
import com.google.gson.Gson;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.Application;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Path("/Sucursal")
public class SucursalResurce {


		@GET
		@Produces(MediaType.TEXT_HTML)
		public String listar( 
				@QueryParam("id_sucursal") int id_sucursal
				){
			ISucursalDao dao = new SucursalDaoImpl();
			List<String[]> listadoProductos = dao.obtenerProductosSucursal(id_sucursal);
			String json = new Gson().toJson( listadoProductos );
			return json; 
			//return "ola k ase" + String.valueOf(id_sucursal);
		}
		
		
		
	
	// Este codigo recupera los parametros que vienen por la URL
//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String listar(int id_sucursal) {
//		ISucursalDao dao = new SucursalDaoImpl();
//		// aqui mas especificamente segun yo
//
//		if (Request.getParameter("id_sucursal") == null) {
//			System.out.println(".");
//		} else {
//			System.out.println(" <b>" + Request.getParameter("id_sucursal") + "</b>!");
//		}
//		List<String[]> SucursalesCreados = dao.obtenerProductosSucursal(id_sucursal);
//		String json = new Gson().toJson(SucursalesCreados);
//		return json;
//
//	}

}
