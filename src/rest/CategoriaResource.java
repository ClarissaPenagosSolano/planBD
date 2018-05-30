package rest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ecodeup.dao.categoria.CategoriaDaoImpl;
import com.ecodeup.idao.categoria.ICategoriaDao;
import com.ecodeup.model.categoria.Categoria;
import com.google.gson.Gson;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.Application;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Path("/Categoria")
public class CategoriaResource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String listar(){
		ICategoriaDao dao = new CategoriaDaoImpl();
		List<Categoria> categoriasCreadas = dao.obtener();
		String json = new Gson().toJson( categoriasCreadas);
		return json;
	}
	
	@POST
	public String nuevo(@javax.ws.rs.FormParam("id_categoria") String id_categoria, @javax.ws.rs.FormParam("nombre_categoria") String nombre_categoria){
		ICategoriaDao dao = new CategoriaDaoImpl();
		List<Categoria> categoriasCreadas= dao.obtener();
		String json = new Gson().toJson( categoriasCreadas);
		return json;
	}

	@PUT
	public String editar(@javax.ws.rs.FormParam("id_categoria") String id_categoria, @javax.ws.rs.FormParam("nombre_categoria") String nombre_categoria){
		ICategoriaDao dao = new CategoriaDaoImpl();
		List<Categoria> categoriasCreadas= dao.obtener();
		String json = new Gson().toJson( categoriasCreadas);
		return json;
	}
	
	@DELETE
	public String eliminar(@PathParam ("id_categoria") String id_categoria){
		ICategoriaDao dao = new CategoriaDaoImpl();
		List<Categoria> categoriasCreadas= dao.obtener();
		String json = new Gson().toJson( categoriasCreadas);
		return json;
	}
}
