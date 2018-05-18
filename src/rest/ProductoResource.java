package rest;
import javax.ws.rs.GET;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ecodeup.dao.producto.ProductoDaoImpl;
import com.ecodeup.idao.producto.IProductoDao;
import com.ecodeup.model.producto.Producto;
import com.google.gson.Gson;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.Application;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Path("/Producto")
public class ProductoResource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String listar(){
		IProductoDao dao = new ProductoDaoImpl();
		List<Producto> croductosRegistrados = dao.obtener();
		String json = new Gson().toJson( croductosRegistrados );
		return json;
	}
	
	@POST
	public String nuevo(){
		IProductoDao dao = new ProductoDaoImpl();
		List<Producto> croductosRegistrados = dao.obtener();
		String json = new Gson().toJson( croductosRegistrados );
		return json;
	}

	@PUT
	public String editar(){
		IProductoDao dao = new ProductoDaoImpl();
		List<Producto> croductosRegistrados = dao.obtener();
		String json = new Gson().toJson( croductosRegistrados );
		return json;
	}
	
	@DELETE
	public String eliminar(){
		IProductoDao dao = new ProductoDaoImpl();
		List<Producto> croductosRegistrados = dao.obtener();
		String json = new Gson().toJson( croductosRegistrados );
		return json;
	}
}
