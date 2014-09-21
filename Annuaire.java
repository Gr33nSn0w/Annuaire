import java.lang.* ;

interface Annuaire extends java.rmi.Remote  
{
	
		void ajouterContact ( String name , String addr, String desk, String number ) throws java.rmi.RemoteException;
		String rechercherNoms (String phone) throws java.rmi.RemoteException;
		String rechercherPhone (String name) throws java.rmi.RemoteException;		
}

