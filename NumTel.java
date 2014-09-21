public class NumTel
{
		private String [] numero ;
		private int nb ;

	NumTel()
	{
		numero = new String [50] ;

		nb = 0 ;
	}


	public int rechercherNom (String number )
	{
		
		
		boolean trouve = false ;
		
		int i = 0 ; 
		
		
		while (!trouve && (i<nb)) 
		{
			
			if (number.equals(numero[i]))
			
				trouve = true ; 
				
			else i++;
			
			
		}
		
		
		if (trouve)
		
			return i;
			
		else return 0 ; 
		
		
	}

	public String getNum (int x)
	{
		return numero[x];
	}

	public void enregistrerTel (String a)
	{
		numero[nb] = a ;

		nb ++;
	}
}
