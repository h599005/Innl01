package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO2 
{
	public static void main(String[] args) 
	{
		for (int i=0; i<10;i++)
		{
			String PoengTxt = showInputDialog("Dine poeng");
			double Poeng = Double.parseDouble(PoengTxt);
			
			if(100<Poeng || Poeng<0)
			{
				i--;
				showMessageDialog(null, "Skriv inn realistisk tall");
				
			}
			else
			{
				if (90<=Poeng && Poeng<=100) 
				{
				showMessageDialog(null, "Gratulere du fikk A med dine: " + Poeng + " poeng. Det er svært imponerande");
				}
				else if (80<=Poeng && Poeng<=89) 
				{
					showMessageDialog(null, "Gratulere du fikk B med dine: " + Poeng + " poeng");
				}
				else if (60<=Poeng && Poeng<=79) 
				{
					showMessageDialog(null, "Gratulere du fikk C med dine: " + Poeng + " poeng");
				}
				else if (50<=Poeng && Poeng<=59) 
				{
					showMessageDialog(null, "Gratulere du fikk D med dine: " + Poeng + " poeng");
				}
				else if (40<=Poeng && Poeng<=49) 
				{
					showMessageDialog(null, "Gratulere du fikk E med dine: " + Poeng + " poeng. Det betyr du besto");
				}
				else if (0<=Poeng && Poeng<=39) 
				{
					showMessageDialog(null, "Du fikk F med dine: " + Poeng + " poeng. Bedre lykke neste gang.");
				}
			}	

		}
		
	}
}
