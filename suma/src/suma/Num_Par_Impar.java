package suma;

import java.util.Scanner;

public class Num_Par_Impar {
	
	public void Numeros_Pares_Impares()
	{
		float a;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un n�mero para saber si es par o impar: ");
		a = entrada.nextFloat();
		
		if(a % 2 == 0)
		{
			System.out.println("El n�mero es par");
		}
		else 
		{
			System.out.println("El n�mero es impar");
		}
		
	}

}
