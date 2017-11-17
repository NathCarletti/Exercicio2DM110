package br.inatel.dm110.client.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.client.api.ClientResult;
import br.inatel.dm110.client.api.ClientService;
import br.inatel.dm110.client.interfaces.DatabaseRemote;

@RequestScoped
public class ClientServiceImpl implements ClientService{
	
	@EJB(lookup="java:app/dm110-ejb-0.1-SNAPSHOT/ClientBeans!br.inatel.dm110.client.interfaces.DatabaseRemote")
	private DatabaseRemote clientBean;
	
	@Override
	public List<ClientResult> listAllClients() {
		return  clientBean.listAll();
	}

	@Override
	public void addNewClient(ClientResult newClient) {
		clientBean.addNewClient(newClient.getName(), newClient.getEmail());
		
	}

}
