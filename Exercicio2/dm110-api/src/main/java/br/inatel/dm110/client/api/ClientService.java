package br.inatel.dm110.client.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/client")
public interface ClientService {

	
	@GET
	@Path("/listAll")
	@Produces(MediaType.APPLICATION_JSON)
	List<ClientResult> listAllClients();

	@POST
	@Path("/addClient")
	@Consumes(MediaType.APPLICATION_JSON)
	void addNewClient(ClientResult newClient);
	
}
