package suma;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Operaciones {

	public void resta1()
	{
		int a,b,c;
		int r;
		
		Scanner entrada = new Scanner(System.in);
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer número: "));
		
		//System.out.println("Escribe el primer número: ");
		//a = entrada.nextInt();
		
		b = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo número: "));
		
		//System.out.println("Escribe el segundo número: ");
		//b = entrada.nextInt();
		
		c = a - b;
		
		//System.out.println("El resultado de la resta es: " + c);
		
		JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + c);
		
	}
	
	
	public void suma()
	{
		
		float a,b,c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer valor: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo valor: "));
		
		c = a + b;
		
		JOptionPane.showMessageDialog(null, "El valor de la suma es: " + c);
		
	}
	
	public void mult()
	{
		
		float a,b,c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer valor: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo valor: "));
		
		c = a * b;
		
		JOptionPane.showMessageDialog(null, "El resultado de multiplicación es: " + c);
		
		
	}
	
	public void div()
	{
		
		float a,b,c;
		
		a = Float.parseFloat(JOptionPane.showInputDialog("Escribe el primer valor: "));
		b = Float.parseFloat(JOptionPane.showInputDialog("Escribe el segundo valor: "));
		
		c = a / b;
		
		if(b == 0)
		{
			System.out.println("No se puede dividir");
			JOptionPane.showMessageDialog(null, "Error");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "El resultado de la división es: " + c);
		}
		
		
		
	}
	
}




