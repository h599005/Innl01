package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO3 
{
	public static void main(String[] args) 
	{
		for (int i=0; i<1;i++)
		{
		
		String Ntxt = showInputDialog("Skriv eit tall");
		int n = Integer.parseInt(Ntxt);		
		int fact = 1;
			
			if (n<=0)
			{
				i--;
				showMessageDialog(null, "Oppgi eit tall som er større enn 0");
			}
			else
			{
				for (int j=1; j<=n;j++)
				{
					fact=fact*j;			
				}
				showMessageDialog(null, "Fakultet av " + n + " er " + fact);
			}
		}
	}	
}
