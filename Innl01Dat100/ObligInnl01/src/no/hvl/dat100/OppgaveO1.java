package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO1 
{
	public static void main(String[] args) 
	{
		String InntektTxt = showInputDialog("BrutoInntekt");
		double Inntekt = Double.parseDouble(InntektTxt);
		
		
		
		if (184800<=Inntekt && Inntekt<264100) 
		{
			double skatt = Inntekt*0.017;
			showMessageDialog(null, "din trinnskatt er på 1,7% og dermed må du betale " + skatt);
		}
		
		else if (264100<=Inntekt && Inntekt<651250)
		{
			double skatt = Inntekt*0.04;
			showMessageDialog(null, "din trinnskatt er på 4% og dermed må du betale " + skatt);
		}
	
		else if (651250<=Inntekt && Inntekt<1021550)
		{
			double skatt = Inntekt*0.132;
			showMessageDialog(null, "din trinnskatt er på 13,2% og dermed må du betale " + skatt);
		}
	
		else if (1021550<=Inntekt)
		{
			double skatt = Inntekt* 0.162;
			showMessageDialog(null, "din trinnskatt er på 16,2% og dermed må du betale " + skatt);

		}
		
		else 
		{
			showMessageDialog(null, "Din inntekt er for lav til å få trinnskatt");
		}
	}


}
