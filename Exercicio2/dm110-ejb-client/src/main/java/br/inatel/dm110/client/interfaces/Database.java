package br.inatel.dm110.client.interfaces;

import java.util.List;

import br.inatel.dm110.client.api.ClientResult;

public interface Database {
	
	List<ClientResult> listAll();
	
	void addNewClient(String name, String emai);
}
