package br.inatel.dm110.client.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.dm110.client.api.ClientResult;
import br.inatel.dm110.client.dao.ClientDAO;
import br.inatel.dm110.client.entities.Client;
import br.inatel.dm110.client.interfaces.DatabaseLocal;
import br.inatel.dm110.client.interfaces.DatabaseRemote;


@Stateless
@Remote(DatabaseRemote.class)
@Local(DatabaseLocal.class)
public class ClientBeans implements DatabaseRemote, DatabaseLocal  {
	
	@EJB
	private ClientDAO clientDAO;

	@Override
	public List<ClientResult> listAll() {
		List<ClientResult> allClients = new ArrayList<>();
		
		for(Client dataC : clientDAO.listAll()) {
			ClientResult clientR = new ClientResult();
			clientR.setName(dataC.getName());
			clientR.setEmail(dataC.getEmail());
			allClients.add(clientR);
		}
		
		return allClients;
	}

	@Override
	public void addNewClient(String name, String email) {
		Client dataCli = new Client();
		dataCli.setName(name);
		dataCli.setEmail(email);
		clientDAO.insert(dataCli);
		
	}
}
