package Logica;


public class Bucles{

	public static void main(String[] args) {
		
		
		
		//suma();
		//mayorQueElPrimero();
		
		numeroMajor();
		
	}//Fin main
	
	private static void numeroMajor() {
		
		/*
		Escriba un programa que 
		pregunte cu�ntos n�meros se 
		van a introducir, pida esos 
		n�meros, y muestre un mensaje
		cada vez que un n�mero no sea
		mayor que el primero.
		*/
		Scanner entrada = new Scanner(System.in);
		int pedirCuantosNumeros, primerNumero = 0, numeroSeguidos = 0, i = 0, k = 0;
		
		System.out.println("Cuantos numeros vas ingresar? ");
		pedirCuantosNumeros = entrada.nextInt();
		
		if (pedirCuantosNumeros <= 0) 
		{
			System.out.println("Error, no puede ser menor o igual a 0");
		}
		else 
		{
			
			System.out.println("Escribe un n�mero: ");
			primerNumero = entrada.nextInt();
			
			//for(int i = 1; i <= pedirCuantosNumeros; i++)
			while(i <= pedirCuantosNumeros) 
				{
				
				
				System.out.println("Escribe un numero mas grande: ");
				numeroSeguidos = entrada.nextInt();
				
				if(numeroSeguidos <= primerNumero)
				{
					
					while (numeroSeguidos <= primerNumero) 
					{
						System.out.printf("� %d no es mas grande que el anterior !\n",numeroSeguidos);
						
						numeroSeguidos = entrada.nextInt();
								
						k++;
					}//Fin while
					
				}//Fin if
				
				
				i++;
				
			}//Fin while
			
			System.out.println("Gracias por su colaboracion");

			
		}//Fin else
		
		
		
		
	}

	/*
	
	1) Declara dos variables num�ricas (con el valor que desees), 
	muestra por consola la suma, resta, multiplicaci�n, divisi�n y 
	m�dulo (resto de la divisi�n).
	
	*/
	
	static void suma()
	{
		Scanner entrada = new Scanner(System.in);
		
		/*
		double smith = 4, marnol = 20;
		
		for(double i = 1; i <= 1;i++)
		{
			
			System.out.println(smith + marnol);
			System.out.println(smith - marnol);
			System.out.println(smith * marnol);
			System.out.println(smith / marnol);
			System.out.println(smith % marnol);
			
		}//Fin for
		*/
		
		/*
		 *Escribir un programa que pregunte al usuario su edad y 
		 *muestre por pantalla todos los a�os que ha cumplido 
		 *(desde 1 hasta su edad).
		 * 
		 * */
		/*
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe tu edad: ");
		int edad = entrada.nextInt();
		for(int i = 0;i <= edad;i++)
		{
			System.out.println("Tu edad es: " + i);
		}
		*/
		
		
		/*
		 *Escribir un programa que pida al usuario un n�mero 
		 *entero positivo y muestre por 
		 *pantalla todos los n�meros impares desde 1 hasta ese n�mero 
		 *separados por comas.*/
		System.out.println("Escribe tu cualquier numero: ");
		int num = entrada.nextInt();
		
		for(int i = 1; i <= num;i+=2)
		{
			
			System.out.println("Impar: " + i);
			
		}//Fin for
		
		
	}//Fin suma
	
	static void mayorQueElPrimero()
	{
		int numero, valores, primero;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantos numeros quieres introducir?");
		
		valores = entrada.nextInt();
		
		if(valores < 1)
		{
			System.out.println("Imposible");
		}
		else 
		{
			System.out.print("Escriba un numero: \n");
			primero = entrada.nextInt();
			
			for(int i = 1; i < valores; i++)
			{
				
				System.out.println("Escriba un numero mas grande que: " + primero);
				numero = entrada.nextInt();
				
				if(numero <= primero)
				{
					System.out.println("No es mayor que " + primero);
				}
				
			}
			System.out.println("Gracias por su colaboracion!!!");
			
		}
		
		
		/*
		cantNums = entrada.nextInt();
		
		
		while(i <= cantNums)
		{
			System.out.println("Escribe un n�mero: ");
			numInicial = entrada.nextInt();
			
			if(i == 0)
			{
				System.out.println(numInicial);
			}//Fin if
			
			//Validar que el numero siga siendo mayor
			
			System.out.println("Escribe un numero mayor al anterior");
			numIncremento = entrada.nextInt();
			
			if(numIncremento > numInicial)
			{
				
				System.out.println("Bien hecho, escribe otro numero mas grande");
				
			}//Fin if
			else 
			{
				
				System.out.println("Bien hecho, escribe otro numero mas grande");
				
			}
			
			
			i++;
			
		}
		System.out.println("Gracias. Fin del programa!");
		*/
		
		
	}
	

}//Fin Bucles
