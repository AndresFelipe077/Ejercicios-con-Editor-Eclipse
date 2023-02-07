package Logica;

import java.util.Scanner;

public class Condiciones_Anidadas_Simples {

	public static void main(String[] args) {
		
		//Valeria();
		
		/*if(true)
		{
			System.out.print("Se cumple la condición!");
		}
		else
		{
			System.out.println("No se cumple la condición!");
		}*/
		
		// Condición anidada
		//Espar();
		
		//Condición multiple
		//Esvocal();
		
		//NumMayor();
		
		//Multiplo3_5();
		
		
		//ESTRUCTURA SELECTIVA MULTIPLE SWITCH
		//switchPruebaDias();
		
		//EstacionAno();
		
		//NumeroLetras();
		
		//OperacionEnSwitch();
		
		
		//ESTRUCTURA REPETITIVA MIENTRAS
		//BucleWhile();
		
		//Bucle Do While
		
		//bucleDoWhile();
		
		
		//RETO UDEMY
		//SumaWhilePrimerosNumeros();
		
		//CantidadNumerosEnteros();
		
		
		//BUCLES PARA FOR
		//BuclesPara();
		
		
		//BREAK Y CONTINUE
		
		//FuncionBreak();
		
	}

	static void Valeria()
	{
		String vale = "LEIDY VALERIA LULIGO";
		System.out.println(vale);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe tu primer nombre: ");
		String primerNombre = entrada.nextLine();
		System.out.println("Escribe tu primer apellido: ");
		String primerApellido = entrada.nextLine();
		
		System.out.println("Tu primer nombre es: " + primerNombre + " y tu primer apellido es: " + primerApellido);
	}
	
	private static void Espar() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un número: ");
		var n = entrada.nextInt();
		
		/*if(n % 2 == 0)
		{
			System.out.println("El número es par!");
		}
		else
		{
			System.out.println("El número es impar!");
		}*/
		
		
		//Condiciones anidadas
		if(n != 0)
		{
			if(n > 0)
			{
				if(n % 2 == 0)
				{
					System.out.printf("El número ingresado %d es Par Positivo!\n",n);
				}
				else
				{
					System.out.printf("El número %d es impar positivo!\n",n);
				}
			}
			else
			{
				if(n % 2 == 0)
				{
					System.out.printf("El número ingresado %d es par negativo!\n",n);
				}
				else
				{
					System.out.printf("El número ingresaro %d es impar negativo!\n",n);
				}
			}
		}
		else
		{
			System.out.printf("El número %d es neutro\n",n);
		}
		
		
		
	}

	private static void Esvocal() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese una letra: ");
		String c = entrada.nextLine(); // sino se quiere colocar String se puede con Chart c = entrada.next().ChartAt(0);
										// y con comillas simples para dejarlo con el comparador ==.
		if("a".equals(c) || "A".equals(c))
		{
			System.out.printf("La letra %s es una vocal!\n",c);
			
		}
			else if("e".equals(c) || "E".equals(c))
			{
				System.out.printf("La letra %s es una vocal!\n",c);
			}
			else if("i".equals(c) || "I".equals(c))
			{
				System.out.printf("La letra %s es una vocal!\n",c);
			}
			else if("o".equals(c) || "O".equals(c))
			{
				System.out.printf("La letra %s es una vocal!\n",c);
			}
			else if("u".equals(c) || "U".equals(c))
			{
				System.out.printf("La letra %s es una vocal!\n",c);
			}
		else
		{
			System.out.printf("La letra %s no es una vocal!\n",c);
		}
		
		
	}

	static void NumMayor()
	{
		
		Scanner entrada = new Scanner(System.in);
		int a,b;
		
		System.out.println("Escribe el primer valor: ");
		a = entrada.nextInt();
		System.out.println("Escribe el segundo valor: ");
		b = entrada.nextInt();
		
		if(a > b)
		{
			System.out.printf("El primer número %d es mayor al segundo valor %d", a,b);
		}
		else
		{
			System.out.printf("El segundo número %d es mayor al primer número %d.",b,a);
		}
		
	}
	
	static void Multiplo3_5()
	{
		
		Scanner entrada = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Ingresa un número: ");
		a = entrada.nextInt();
		
		System.out.println("Ingresa un número: ");
		b = entrada.nextInt();
		
		if(a % 3 == 0 && b % 5 == 0)
		{
			System.out.println("Ambos números son multiplos de 3 y 5");
		}
		else
		{
			System.out.println("No son multiplos de 3 y 5");			
		}
		
		
		
	}
	
	static void switchPruebaDias() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un número de la semana: ");
		
		int dia = entrada.nextInt();
		String nombreDia = null;
		
		
		switch(dia)
		{
			case 1:	
				nombreDia = "Domingo";
				break;
			case 2:
				nombreDia = "Lunes";
				break;
			case 3:
				nombreDia = "Martes";
				break;
			case 4:
				nombreDia = "Miercoles";
				break;
			case 5:
				nombreDia = "Jueves";
				break;
			case 6:
				nombreDia = "Viernes";
				break;
			case 7:
				nombreDia = "Sabado";
				break;
			default:
				System.out.println("Número de día incorrecto.");
		
		}//Fin switch
		
		System.out.println("El día es " + nombreDia);
		
	}

	static void EstacionAno()
	{
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un valor para saber la estación del año: ");
		int numEstacion = entrada.nextInt();
		String nombreEstacion = null;
		
		
		
		switch(numEstacion)
		{
			case 1:
				nombreEstacion = "Verano";
				break;
			case 2:
				nombreEstacion = "Otoño";
				break;
			case 3:
				nombreEstacion = "Invierno";
				break;
			case 4:
				nombreEstacion = "Primavera";
				break;
			default:
				System.out.println("Estación del año desconocida.");
				
		
		}//fin switch
		
		System.out.println("La estación del año es: " + nombreEstacion);
		
	}
	
	static void NumeroLetras() {
		
		Scanner entrada = new Scanner(System.in);
			
		int numLetras;
		String numeroEnLetras = null;
		
		System.out.println("Ingrese un dígito para saber el número en letras: ");
		numLetras = entrada.nextInt();
		
		switch(numLetras)
		{
			case 0:
				numeroEnLetras = "cero";
				break;
			case 1:
				numeroEnLetras = "uno";
				break;
			case 2:
				numeroEnLetras = "dos";
				break;
			case 3:
				numeroEnLetras = "tres";
				break;
			case 4:
				numeroEnLetras = "cuatro";
				break;
			case 5:
				numeroEnLetras = "cinco";
				break;
			case 6:
				numeroEnLetras = "seis";
				break;
			case 7:
				numeroEnLetras = "siete";
				break;
			case 8:
				numeroEnLetras = "ocho";
				break;
			case 9:
				numeroEnLetras = "nueve";
				break;
			default:
				System.out.println("El valor introducido es incorrecto.");
		
		
		}//Fin switch
		
		System.out.println("El numero en letras es: " + numeroEnLetras);
		
	}
	
	static void OperacionEnSwitch() {
		
		Scanner entrada = new Scanner(System.in);
		
		String signoOperador = null;
		
		int num1,num2,result = 0;
		
		System.out.println("Escribe el signo para operar los números: ");
		signoOperador = entrada.nextLine();
		System.out.println("Escribe el primer número: ");
		num1 = entrada.nextInt();
		System.out.println("Escribe el segundo número: ");
		num2 = entrada.nextInt();
		
		switch(signoOperador) {
		
		case("+"):
			result = num1 + num2;
			break;
		case("-"):
			result = num1 - num2;
			break;
		case("*"):
			result = num1 * num2;
			break;
		case("/"):
			if(num2 == 0)
			{
				result = 0;
			}
			else
			{
				result = num1 / num2;
			}
			
			break;
		default:
			System.out.println("Signo incorrecto.");
		
		}//Fin switch
		
		System.out.println("El resultado de la operación es: " + result);
		
	}
	
	static void BucleWhile() {
		
		/*while(true)
		{
			System.out.println("No parare de ejecutarme.");
		}*/
		//bucle Infinito
		
		//int c = 0;
		
		/*while(c <= 10)
		{
			System.out.println("El valor de c es: " + c);
			c++;
		}*/ //Bucle no infinito
		
		
		Scanner entrada = new Scanner(System.in);
		
		/*System.out.println("Ingresa un número entero: ");
		int n = entrada.nextInt();
		
		int c = 0;
		
		while(c <= 10) 
		{
			System.out.printf("%d * %d = %d \n", n,c,(n*c));
			c++;
		}*/
		
		//Bucle for
		System.out.println("Ciclo for");
		int a = entrada.nextInt();
		
		//int b = 10;
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.printf("%d * %d = %d \n", a,i,(a*i));
		}
		
		
	}
	
	static void bucleDoWhile()
	{
		int c = 0;
		do
		{
			System.out.println("El valor de c es: " + c);
			c++;
		}
		while(c <= 10);
		
		
	}
	
	static void SumaWhilePrimerosNumeros()
	{
		
		Scanner entrada = new Scanner(System.in);
		
		int iterador = 1,num,suma = 0;
		//iterador = 1;
		
		System.out.println("Escribe un número para sumar los dos primeros: ");
		num = entrada.nextInt();
		
		
		
		
		while(iterador <= num)
		{
			
			System.out.println(iterador);
			suma = suma + iterador;
			iterador++;
			
			
		}//fin While
		
		System.out.println("La suma es: " + suma);
		
	}
	
	static void CantidadNumerosEnteros()
	{
		
		Scanner entrada = new Scanner(System.in);
		
		 /*System.out.println("ingrese el numero inicial: ");
	        int Nent = entrada.nextInt();
	        System.out.println("ingrese el numero final: ");
	        int Nsal = entrada.nextInt();
	        int cont = 0;

	        while (Nent <Nsal){
	            Nent++;
	            cont++;
	        }
	        System.out.println(cont);*/
		
		int iterador = 0, numInicial,numFinal,cantidad = 0;
		
		System.out.print("Escribe el primer número: \n" );
		numInicial = entrada.nextInt();
		
		System.out.println("Escribe el segundo número: \n");
		numFinal = entrada.nextInt();
		
		while(iterador < numInicial && iterador < numFinal)
		{
			
			//System.out.println(iterador);
			cantidad = numFinal - numInicial;
			
			
			iterador++;
		}
		
		System.out.printf("La cantidad de números que existen son: %d",iterador);
		
	}

	static void BuclesPara(){
		
		int n = 8;
		
		/*for(int i = 0; i <= 10; i++)
		{
			
			//System.out.println("Valor de i es: " + i);
			System.out.printf("%d * %d = %d\n",n,i,(n*i));
			
		}*/
		
		int a = 9;
		
		for(int i = 1; i <= a ; i++) 
		{
			//System.out.println("Alexander");
			System.out.printf("%d * %d = %d\n",a,i,(a*i));
			
		}
		
	}
	
	static void FuncionBreak()
	{
		
		/*for(int i = 0;i <= 10; i++)
		{
			
			System.out.println("Valor de i: " + i);
			if(i == 5)
			{
				System.out.println("Detener bucle for!");
				break;
			}
			
		}*/
		
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Valor de i: " + i);
			if(i == 3)
			{
				System.out.println("Saltar a la siguiente ejecución!");
				continue;
			}
			
			System.out.println("No me ejecutaré en 5");//Cuando la ejecucion llegue a 3 del if
			System.out.println("FELIPE");//El codigo no amostrará Estas dos impresiones
		}
		
		
		
	}
	
}
