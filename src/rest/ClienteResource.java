package rest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ecodeup.dao.ClienteDaoImpl;
import com.ecodeup.idao.IClienteDao;
import com.ecodeup.model.Cliente;
import com.google.gson.Gson;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.Application;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Path("/Cliente")
public class ClienteResource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String listar(){
		IClienteDao dao = new ClienteDaoImpl();
		List<Cliente> clientesRegistrados = dao.obtener();
		String json = new Gson().toJson( clientesRegistrados );
		return json;
	}
	
	@POST
	public String nuevo(@javax.ws.rs.FormParam("nombres") String nombres, @javax.ws.rs.FormParam(" apellidos") String  apellidos, @javax.ws.rs.FormParam("tipo_doc") String tipo_doc, @javax.ws.rs.FormParam("num_doc") String num_doc, @javax.ws.rs.FormParam("celular") String celular){
		IClienteDao dao = new ClienteDaoImpl();
		List<Cliente> clientesRegistrados = dao.obtener();
		String json = new Gson().toJson( clientesRegistrados );
		return json;
	}

	@PUT
	public String editar(@javax.ws.rs.FormParam("nombres") String nombres, @javax.ws.rs.FormParam(" apellidos") String  apellidos, @javax.ws.rs.FormParam("tipo_doc") String tipo_doc, @javax.ws.rs.FormParam("num_doc") String num_doc, @javax.ws.rs.FormParam("celular") String celular){
		IClienteDao dao = new ClienteDaoImpl();
		List<Cliente> clientesRegistrados = dao.obtener();
		String json = new Gson().toJson( clientesRegistrados );
		return json;
	}
	
	@DELETE
	public String eliminar(@PathParam ("num_doc") String num_doc){
		IClienteDao dao = new ClienteDaoImpl();
		List<Cliente> clientesRegistrados = dao.obtener();
		String json = new Gson().toJson( clientesRegistrados );
		return json;
	}
}
