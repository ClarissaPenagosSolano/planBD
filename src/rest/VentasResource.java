package rest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	public String nuevo(@javax.ws.rs.FormParam("id_venta") String id_venta, @javax.ws.rs.FormParam(" valor_venta") String  valor_venta, @javax.ws.rs.FormParam("fecha_venta") String  fecha_venta){
		IVentaDao dao = new VentaDaoImpl();
		List<Venta> listaVenta = dao.obtener();
		String json = new Gson().toJson( listaVenta );
		return json;
	}

	@PUT
	public String editar(@javax.ws.rs.FormParam("id_venta") String id_venta, @javax.ws.rs.FormParam(" valor_venta") String  valor_venta, @javax.ws.rs.FormParam("fecha_venta") String  fecha_venta){
		IVentaDao dao = new VentaDaoImpl();
		List<Venta> listaVenta = dao.obtener();
		String json = new Gson().toJson( listaVenta );
		return json;
	}
	
	@DELETE
	public String eliminar(@PathParam("id_venta") String id_venta ){
		IVentaDao dao = new VentaDaoImpl();
		List<Venta> listaVenta = dao.obtener();
		String json = new Gson().toJson( listaVenta);
		return json;
	}
}
