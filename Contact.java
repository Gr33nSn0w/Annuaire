public class Contact 
{
	private String [] nom ;
	private String [] adresse ;
	private String [] bureau ;

	private int nb ;

	Contact()
	{
		nom = new String [50] ; 
		
		adresse = new String [50] ;

		bureau = new String [50] ; 

		nb = 0 ;
	}

	public int rechercherNum (String name )
	{
		
		
		boolean trouve = false ;
		
		int i = 0 ; 
		
		
		while (!trouve && (i<nb)) 
		{
			
			if (name.equals(nom[i]))
			
				trouve = true ; 
				
			else i++;
			
			
		}
		
		
		if (trouve)
		
			return i;
			
		else return 0 ; 
		
		
	}

	public String getNom (int x)
	{
		return nom[x];
	}


	public void enregistrer (String a, String b, String c)
	{
		nom[nb] = a ;
		
		adresse[nb] = b ; 
		
		bureau[nb] = c;

		nb ++;
	}
}
