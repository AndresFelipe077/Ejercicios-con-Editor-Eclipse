package Logica;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		finalizar:
		while(true)
		{
			
			System.out.println("Conversor");
			System.out.println("1. Soles peruanos a dolares \n"
					+ "2. Pesos mexicanos a dolares\n"
					+ "3. Pesos colombianos a dolares\n"
					+ "4. Salir\n"
					+ "---------------------------------");
			
			System.out.println("INGRESA UNA OPCION: ");
			char opcion = entrada.next().charAt(0);
			
			switch (opcion) 
			{
				case '1': 
					convertir(3.58, "Soles peruanos");
					break;
				case '2':
					convertir(22.15, "Pesos mexicanos");
					break;
				case '3':
					convertir(3851.90, "Pesos colombianos");
					break;
				case '4':
					System.out.println("Cerrando programa...");
					break finalizar;
			default:
				System.out.println("Error");
			}
			
		}
		

	}
	
	static void convertir(double valorDolar, String pais)
	{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Ingresa la cantidad de %s : ", pais);
		double cantidadModena = entrada.nextDouble();
		
		double dolares = cantidadModena / valorDolar;
		
		dolares = (double)Math.round(dolares * 100d)/100;
		
		System.out.println("------------------------");
		System.out.println("Tienes $ "+ dolares + " dolares.");
		System.out.println("------------------------");
		
		
	}//fin convertir
	

}
