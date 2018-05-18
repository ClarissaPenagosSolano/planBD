package rest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ecodeup.dao.admin.AdminDaoImpl;
import com.ecodeup.idao.admin.IAdminDao;
import com.ecodeup.model.admin.Admin;
import com.google.gson.Gson;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.Application;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Path("/Admin")
public class AdministradorResource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String listar(){
		IAdminDao dao = new AdminDaoImpl();
		List<Admin> AdminsCreados = dao.obtener();
		String json = new Gson().toJson( AdminsCreados);
		return json;
	}
	
	@POST
	public String nuevo(){
		IAdminDao dao = new AdminDaoImpl();
		List<Admin> AdminsCreados= dao.obtener();
		String json = new Gson().toJson( AdminsCreados);
		return json;
	}

	@PUT
	public String editar(){
		IAdminDao dao = new AdminDaoImpl();
		List<Admin> AdminsCreados= dao.obtener();
		String json = new Gson().toJson( AdminsCreados);
		return json;
	}
	
	@DELETE
	public String eliminar(){
		IAdminDao dao = new AdminDaoImpl();
		List<Admin> AdminsCreados= dao.obtener();
		String json = new Gson().toJson( AdminsCreados);
		return json;
	}
}
