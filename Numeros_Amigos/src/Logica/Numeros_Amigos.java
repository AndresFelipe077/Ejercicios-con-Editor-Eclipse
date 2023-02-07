package Logica;

public class Numeros_Amigos {

	public static void main(String[] args)
	{
		
		//Numero amigos
		//La suma de sus divisores es igual a el numero del otro
		int num1 = 284,num2 = 220, cont1 = 0, cont2 = 0;
		int suma1 = 0, suma2 = 0;
		
		
		for (int i = 1; i < num1; i++)
		{
			
			if(num1 % i == 0)
			{
				
				//cont1++;
				suma1 += i;
				
				
			}
			
		}//Fin for 1
		System.out.println(suma1);
		
		
		//suma1 = suma1 + cont1;
		
		for (int k = 1; k < num2; k++)
		{
			
			if(num2 % k == 0)
			{
				
				//cont2++;
				suma2 += k;
				
				
			}
			
		}//Fin for 2
		
		System.out.println(suma2);
		//suma2 = suma2 + cont2;
		
		if(suma1 == num2 && suma2 == num1)
		{
			
			System.out.println("Son amigos");
			
		}
		else 
		{
		
			System.err.println("No son amigos");
			
		}
		
		
	}
	
	
	
}
