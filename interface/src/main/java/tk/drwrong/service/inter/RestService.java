package tk.drwrong.service.inter;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("say")
@Produces("application/xml")
public interface RestService {

	@GET
	@Path("{a}/{b}")
	public String handleGet(@PathParam("a") Integer a, @PathParam("b") Integer b);
}
