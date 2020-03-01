package c19Exercise51REST.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/services")
public class Messages {
	
	@Path("/hello")
	@GET
	public String diHola(@QueryParam ("name") String name) {
		return "Hola: " + name;
	}
	
	@Path("/plus")
	@POST
	public String diHolo(@QueryParam ("name") String name) {
		return ("Hola: " + name).toLowerCase();
	}
	
	@Path("/suma")
	@GET
	public int Suma(@QueryParam ("numbers") int a, int b) {
		int resultado = a+b;
		return resultado;
	}

}
