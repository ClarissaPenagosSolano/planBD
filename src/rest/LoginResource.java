package rest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import com.connection.Conexion;
import com.ecodeup.dao.login.LoginDaoImpl;
import com.ecodeup.idao.login.ILoginDao;
import com.ecodeup.model.login.login;
import com.google.gson.Gson;
@Path("/Login")
public class LoginResource {
	//Metodo para el login

	
	@POST
	 public String login (@javax.ws.rs.FormParam("password") String password, @javax.ws.rs.FormParam("rol") String rol, @javax.ws.rs.FormParam("usuario") String usuario) {
		ILoginDao dao = (ILoginDao) new LoginDaoImpl(); 
		List<login> listarLogin= dao.obtener();
		if( usuario == usuario ){
			      if( password == password){

			      }else{
			       System.out.println("<h1> Contraseña incorrecta </h1>");   
			      }
			    }else{
			    System.out.println("<h1> Usuario incorrecto </h1>");
			    }
		   
		String json = new Gson().toJson( listarLogin);
		return json;
	}
}
