package rest;
import javax.ws.rs.GET;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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

@Path("/Sucursales")
public class SucursalesResource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String listar(){
		ISucursalDao dao = new SucursalDaoImpl();
		List<Sucursales> SucursalesCreados = dao.obtener();
		String json = new Gson().toJson( SucursalesCreados );
		return json;
	}
	
	@POST
	public String nuevo(){
		ISucursalDao dao = new SucursalDaoImpl();
		List<Sucursales> SucursalesCreados = dao.obtener();
		String json = new Gson().toJson( SucursalesCreados );
		return json;
	}

	@PUT
	public String editar(){
		ISucursalDao dao = new SucursalDaoImpl();
		List<Sucursales> SucursalesCreados = dao.obtener();
		String json = new Gson().toJson( SucursalesCreados );
		return json;
	}
	
	@DELETE
	public String eliminar(){
		ISucursalDao dao = new SucursalDaoImpl();
		List<Sucursales> SucursalesCreados = dao.obtener();
		String json = new Gson().toJson( SucursalesCreados );
		return json;
	}
	
}
