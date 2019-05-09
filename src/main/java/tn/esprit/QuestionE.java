package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Pret;
import services.PretServiceRemote;

public class QuestionE {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String jndiName = "revisionGL1-ear/revisionGL1-ejb/PretService!services.PretServiceRemote";
		Context context = new InitialContext();
		PretServiceRemote proxy = (PretServiceRemote) context.lookup(jndiName);
		
		for (Pret pret : proxy.getPretsParClient(2)) {
			System.out.println(pret.getIdPret()+" | "+pret.getMontant()+" | "+pret.getTypePret());
		}
	}

}
