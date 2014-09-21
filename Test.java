public class Test
{
	public static void main(String [] args)
	{
		AnnuaireImpl annu = new AnnuaireImpl();
		annu.ajouterContact("olivier", "Pau", "1", "0645730212");
		annu.ajouterContact("alain", "Tarbe", "2", "0699999969");
		String x = annu.rechercherNoms("0645730212");
		String y = annu.rechercherPhone("alain");
		System.out.println(x);
		System.out.println(y);
	}
}
