import java.rmi.*;

public class Serveur {
	
	public static void main (String args[])
	
		{
			
			try {
				
				Annuaire annu = new AnnuaireImpl();
				System.out.println("Annuaire créé");
				
				
				Naming.rebind("Annuaire_d",annu);
				System.out.println("Annuaire_d enregistré dans le RMI registry");
				System.out.println("L'Annuaire est prêt..");
				
			}
			
			
		catch (Exception e)
		
			{
				
				System.out.println("erreur");
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
		}
		
}
