package br.inatel.dm110.client.api;

import java.io.Serializable;

public class ClientResult implements Serializable{
	
	private static final long serialVersionUID = 8926260435868988766L;
	
	public String name;
	public String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
