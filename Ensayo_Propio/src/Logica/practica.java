package Logica;

import java.util.Scanner;

public class practica {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//Variables
		
		int acumulador = 0;
		
		int total = 30;
		
		String continuar = "si";
		
		System.out.println("Juego de dados");
		
		while (acumulador <= total)
		{
			
			int numeroDado = (int)(Math.random() * 6 + 1);//Bien
			
			//Visualizar valor dado
			System.out.println(numeroDado);
			
			if(numeroDado == 1)
			{
				
				//Fin del juego
				System.out.println("GAME OVER");
				break;
				
			}//Fin if
			else
			{
			
				System.out.println("Acumulas puntos");
				acumulador += numeroDado;
				System.out.println("Valor acumulado: " + acumulador);
				
			}//Fin else
			if(acumulador >= total)
			{
				System.out.println("GANASTE");
				break;
				
			}
			
			
			System.out.println("Valor acumulado g: " + acumulador);
			
			
			System.out.println("Desea continuar: si/no");
			if(acumulador <= total)
			{
				continuar = entrada.nextLine();
				
			}
			
		}
		
	/*	for(int i = 0; i < total;i++)
		{
			
		
			int numeroDado = (int)(Math.random() * 6 + 1);//Bien
			
			//Visualizar valor dado
			System.out.println(numeroDado);
			
			if(numeroDado == 1)
			{
				
				//Fin del juego
				System.out.println("GAME OVER");
				break;
				
			}//Fin if
			else
			{
			
				System.out.println("Acumulas puntos");
				acumulador += numeroDado;
				System.out.println("Valor acumulado: " + acumulador);
				
			}//Fin else
			if(acumulador >= total)
			{
				System.out.println("GANASTE");
				break;
				
			}
			
			
			System.out.println("Valor acumulado g: " + acumulador);
			
		}
		
		*/
		

	}

}
