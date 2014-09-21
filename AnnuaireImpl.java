import java.io.Serializable;
import java.util.*;
import java.rmi.*;
import java.rmi.server.*;

class AnnuaireImpl extends UnicastRemoteObject implements Annuaire
{
	private int i;
	Contact cont = new Contact();
	NumTel num = new NumTel();
	
	AnnuaireImpl() throws java.rmi.RemoteException
	{
		i = 0;
		
	}
		
	public void ajouterContact ( String name , String addr, String desk, String number ) throws java.rmi.RemoteException
	{ 
		cont.enregistrer(name, addr, desk);
		num.enregistrerTel(number);
	}

	public String rechercherNoms (String phone) throws java.rmi.RemoteException
	{
		return cont.getNom(num.rechercherNom(phone));
	}

	public String rechercherPhone (String name) throws java.rmi.RemoteException
	{
		return num.getNum(cont.rechercherNum(name));
	}	
}
