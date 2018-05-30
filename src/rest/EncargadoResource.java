package rest;
import javax.ws.rs.GET;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ecodeup.dao.encargado.EncargadoDaoImpl;
import com.ecodeup.idao.encargado.IEncargadoDao;
import com.ecodeup.model.encargado.Encargado;
import com.google.gson.Gson;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.Application;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Path("/Encargado")
public class EncargadoResource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String listar(){
		IEncargadoDao dao = new EncargadoDaoImpl();
		List<Encargado> EncargadosCreados = dao.obtener();
		String json = new Gson().toJson( EncargadosCreados);
		return json;
	}
	
	@POST
	public String nuevo(@javax.ws.rs.FormParam("id_encargado") String id_encargado, @javax.ws.rs.FormParam("nombres") String nombres, @javax.ws.rs.FormParam(" apellidos") String  apellidos, @javax.ws.rs.FormParam("tipo_doc") String tipo_doc, @javax.ws.rs.FormParam("num_doc") String num_doc, @javax.ws.rs.FormParam("celular") String celular){
		IEncargadoDao dao = new EncargadoDaoImpl();
		List<Encargado> EncargadosCreados= dao.obtener();
		String json = new Gson().toJson( EncargadosCreados);
		return json;
	}

	@PUT
	public String editar(@javax.ws.rs.FormParam("id_encargado") String id_encargado, @javax.ws.rs.FormParam("nombres") String nombres, @javax.ws.rs.FormParam(" apellidos") String  apellidos, @javax.ws.rs.FormParam("tipo_doc") String tipo_doc, @javax.ws.rs.FormParam("num_doc") String num_doc, @javax.ws.rs.FormParam("celular") String celular){
		IEncargadoDao dao = new EncargadoDaoImpl();
		List<Encargado> EncargadosCreados= dao.obtener();
		String json = new Gson().toJson( EncargadosCreados);
		return json;
	}
	
	@DELETE
	public String eliminar(@PathParam ("id_encargado") String id_encargado){
		IEncargadoDao dao = new EncargadoDaoImpl();
		List<Encargado> EncargadosCreados= dao.obtener();
		String json = new Gson().toJson( EncargadosCreados);
		return json;
	}
}
