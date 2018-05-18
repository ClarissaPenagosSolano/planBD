package rest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ecodeup.dao.venta.VentaDaoImpl;
import com.ecodeup.idao.venta.IVentaDao;
import com.ecodeup.model.venta.Venta;
import com.google.gson.Gson;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.Application;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Path("/Venta")
public class VentasResource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String listar(){
		IVentaDao dao = new VentaDaoImpl();
		List<Venta> listaVenta = dao.obtener();
		String json = new Gson().toJson( listaVenta);
		return json;
	}
	
	@POST
	public String nuevo(){
		IVentaDao dao = new VentaDaoImpl();
		List<Venta> listaVenta = dao.obtener();
		String json = new Gson().toJson( listaVenta );
		return json;
	}

	@PUT
	public String editar(){
		IVentaDao dao = new VentaDaoImpl();
		List<Venta> listaVenta = dao.obtener();
		String json = new Gson().toJson( listaVenta );
		return json;
	}
	
	@DELETE
	public String eliminar(){
		IVentaDao dao = new VentaDaoImpl();
		List<Venta> listaVenta = dao.obtener();
		String json = new Gson().toJson( listaVenta);
		return json;
	}
}
