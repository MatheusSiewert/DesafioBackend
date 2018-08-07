package br.com.desafiobackend.CheckinBackend2;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/entry-point")
public class CheckinService {
	
	@GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "Test";
    }
	
	@POST
    @Path("teste")
    @Produces(MediaType.TEXT_PLAIN)
    public String test(String mensagem) {
        return mensagem;
    }
}
