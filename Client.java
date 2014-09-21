import java.rmi.*;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class Client extends JFrame
{
	private String init1 = "nom";
	private String init2 = "adresse";
	private String init3 = "bureau";
	private String init4 = "numero";
	
	private JButton bouAjo = new JButton("Ajouter");
	private JButton bouChe1 = new JButton("Chercher");
	private JButton bouChe2 = new JButton("Chercher");

	private JLabel labNum = new JLabel("numero");
	private JLabel labNom = new JLabel("inconnu");

	private JTextField cno = new JTextField(init4, 7);
	private JTextField cnu = new JTextField(init1, 7);

	private JTextField ano = new JTextField(init1, 7);
	private JTextField aad = new JTextField(init2, 7);
	private JTextField abu = new JTextField(init3, 7);
	private JTextField anu = new JTextField(init4, 7);

	Client()
	{
		this.setTitle("Annuaire");
		Container cp = this.getContentPane();

		JPanel haut = new JPanel();
		haut.add(bouAjo);
		haut.add(ano);
		haut.add(aad);
		haut.add(abu);
		haut.add(anu);

		JPanel milieu = new JPanel();
		milieu.add(bouChe1);
		milieu.add(cno);
		milieu.add(labNom);

		JPanel bas = new JPanel();
		bas.add(bouChe2);
		bas.add(cnu);
		bas.add(labNum);

		bouAjo.addActionListener(new Bouton1Listener());
		bouChe1.addActionListener(new Bouton2Listener());
		bouChe2.addActionListener(new Bouton3Listener());

		cp.add(haut,BorderLayout.NORTH);
		cp.add(milieu,BorderLayout.CENTER);
		cp.add(bas,BorderLayout.SOUTH);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();		
		this.setVisible(true);
	}

	public static void main(String [] args)
	{
		JFrame cli = new Client();
	}

	class Bouton1Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0)
		{
			Annuaire annu = null ;
						
			try 
			{		
				String url = new String ("//Oliviers-MacBook-Pro.local/Annuaire_d");
				annu = (Annuaire)Naming.lookup(url);				
			}
			catch (Exception e)
			{		
				System.out.println("ErreurClient1 : "+e);
			}
			
			try 
			{	
				String x1 = ano.getText();
				String x2 = aad.getText(); 
				String x3 = abu.getText(); 
				String x4 = anu.getText(); 

				annu.ajouterContact(x1, x2, x3, x4); 
			}
			catch(Exception e)	
			{			
				System.out.println("ErreurClient3");					
			}				
		}
	}

	class Bouton2Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0)
		{
			Annuaire annu = null ;
						
			try 
			{		
				String url = new String ("//Oliviers-MacBook-Pro.local/Annuaire_d");
				annu = (Annuaire)Naming.lookup(url);				
			}
			catch (Exception e)
			{		
				System.out.println("ErreurClient1 : "+e);
			}
			
			try 
			{	
				String x = cno.getText();
				labNom.setText(annu.rechercherNoms(x));

			}
			catch(Exception e)	
			{			
				System.out.println("ErreurClient3");					
			}				
		}
	}

	class Bouton3Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0)
		{
			Annuaire annu = null ;
						
			try 
			{		
				String url = new String ("//Oliviers-MacBook-Pro.local/Annuaire_d");
				annu = (Annuaire)Naming.lookup(url);				
			}
			catch (Exception e)
			{		
				System.out.println("ErreurClient1 : "+e);
			}
			
			try 
			{	
				String x = cnu.getText();
				labNum.setText(annu.rechercherPhone(x));

			}
			catch(Exception e)	
			{			
				System.out.println("ErreurClient3");					
			}				
		}
	}
}
