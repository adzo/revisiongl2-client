package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.PretServiceRemote;

public class QuestionD {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String jndiName = "revisionGL1-ear/revisionGL1-ejb/PretService!services.PretServiceRemote";
		Context context = new InitialContext();
		PretServiceRemote proxy = (PretServiceRemote) context.lookup(jndiName);
		
		proxy.affecterClientPret(1, 1);
		proxy.affecterClientPret(2, 2);
		System.out.println("Affected");
		
	}

}
