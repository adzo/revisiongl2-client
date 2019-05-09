package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Pret;
import entities.TypePret;

import services.PretServiceRemote;

public class QuestionC {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String jndiName = "revisionGL1-ear/revisionGL1-ejb/PretService!services.PretServiceRemote";
		Context context = new InitialContext();
		PretServiceRemote proxy = (PretServiceRemote) context.lookup(jndiName);
		
		proxy.ajouterPret(new Pret(20000,7.5,TypePret.PRET_CONSO));
		proxy.ajouterPret(new Pret(250000,8.5,TypePret.PRET_VOITURE));
		
		System.out.println("Prets ajoutes");
		
	}

}
