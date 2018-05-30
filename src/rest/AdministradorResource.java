package rest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;
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
	public String nuevo(@javax.ws.rs.FormParam("id_administrador") String id_administrador, @javax.ws.rs.FormParam("nombres") String nombres, @javax.ws.rs.FormParam(" apellidos") String  apellidos, @javax.ws.rs.FormParam("tipo_doc") String tipo_doc, @javax.ws.rs.FormParam("num_doc") String num_doc, @javax.ws.rs.FormParam("celular") String celular){
		IAdminDao dao = new AdminDaoImpl();
		List<Admin> AdminsCreados= dao.obtener();
		String json = new Gson().toJson( AdminsCreados);
		return json;
	}

	@PUT
	public String editar(@javax.ws.rs.FormParam("id_administrador") String id_administrador, @javax.ws.rs.FormParam("nombres") String nombres, @javax.ws.rs.FormParam(" apellidos") String  apellidos, @javax.ws.rs.FormParam("tipo_doc") String tipo_doc, @javax.ws.rs.FormParam("num_doc") String num_doc, @javax.ws.rs.FormParam("celular") String celular){
		IAdminDao dao = new AdminDaoImpl();
		List<Admin> AdminsCreados= dao.obtener();
		String json = new Gson().toJson( AdminsCreados);
		return json;
	}
	
	@DELETE
	public String eliminar(@PathParam("id_administrador") String id_administrador){
		IAdminDao dao = new AdminDaoImpl();
		List<Admin> AdminsCreados= dao.obtener();
		String json = new Gson().toJson( AdminsCreados);
		return json;
	}
}
