package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Client;
import services.AgenceRemote;
import services.ClientServiceRemote;

public class QuestionB {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String jndiName = "revisionGL1-ear/revisionGL1-ejb/ClientService!services.ClientServiceRemote";
		Context context = new InitialContext();
		ClientServiceRemote proxy = (ClientServiceRemote) context.lookup(jndiName);
		
		proxy.ajouterClient(new Client("Derbali","Sameh","08864755"));
		proxy.ajouterClient(new Client("Khenissi","Yassine","25445755"));
		System.out.println("Clients ajoutes");
		
	}

}
