package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Agence;
import services.AgenceRemote;

public class QuestionA {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub

		String jndiName = "revisionGL1-ear/revisionGL1-ejb/AgenceService!services.AgenceRemote";
		Context context = new InitialContext();
		AgenceRemote proxy = (AgenceRemote) context.lookup(jndiName);
		proxy.ajouterAgence(new Agence( "Rue med 5"));
		proxy.ajouterAgence(new Agence( "Montplaisir"));
		proxy.ajouterAgence(new Agence( "Centre Urbain"));
		proxy.ajouterAgence(new Agence( "Charguia"));
		System.out.println("Agences ajoutees");
		
		
		
		
//		adresse= rue Mohamed 5) et 
//    (adresse = rue Montplaisir)

	}

}
