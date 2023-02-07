package Logica;
import java.util.*;

public class Operadores_Logicos {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//int a = 10; comentario por linea
		/*int b = 5;
		
		System.out.println(a - b);
		System.out.println("La resta es: " + (a - b));comentario por bloques
		*/ 
		
		/*int Alex = 15;
		int Felipe = 4;
		
		System.out.println(Alex % Felipe);
		System.out.println(Alex == Felipe);
		*/
		/*
		String a = "Alex";
		String b = "Alex";
		
		boolean f = false;
		boolean g = false;
		
		System.out.println(f || g);
		*/
		
		
		//INCREMENTO
	/*	int a = 0;
		
		a+=4;
		a+=4;
		a+=2;
		int c = a++;
		System.out.println(c);
		*/
		//DECREMENTO
	/*	int b = 0;
		
		b-=4;
		b-=4;
		b-=2;
		int f = b;
		System.out.println(f);
	*/	
		//Decremente e incremento ENSAYO
	/*	
		int i = 0;
		i++;
		i-=2;
		System.out.println(i);
		i+=10;
		i--;
		System.out.println(i);
		*/
		//Ensayo con for
		
		/*String fel = "FELIPE";
		
		for (int j = 0;j < fel.length();++j) //Se puede colocar el iterador j++ o ++j, pero el primero significa que es un pospreceso, y el otro un preproceso.
			
		{
			System.out.print(j);
		}
		*/
		
		//ENTRADA DE DATOS
		//EntradaDatos();
		
		//SUMA DE NUMEROS
		//SumaDeDosNumeros();
		
		
		//VALOR DE PRODUCTO
		//ValorProducto();
		
		//RETO DE UDEMY ENTRADA DE DOS NUMEROS SUMAR Y RESTAR
		//EntradaDosNumeros();
		
		
		//RETO DE UDEMY SACAR EL COCIENTE Y RESIDUO DE DOS NUMEROS
		//CocienteResiduo();
		
		
		// RETO DE INTERNET
		//EntradaDeDatosInternet();
		
		//Ensayo De Internet DECLARAA UN ARRAY
		//Ensayo();
		
}
	//DECLARAR ARRAYS
	
	private static void Ensayo() {
		
		int[] Arr;
		
		Arr = new int[3+1];
		
		Arr[1] = 7;
		
		Arr[2] = 2;
		
		Arr[3] = 3;
		int sum = 0;
		for(int i = 1; i < Arr.length;i++)
		{
			
			System.out.println("Elemento en el �ndice: " + i + " : " + Arr[i]);
			sum = sum + i;
			System.out.println(sum);
			
		}
		
		
		
	}

	//PEDIR DATOS
	
	public static void EntradaDatos()
	{
		Scanner entrada = new Scanner(System.in);
		String nombre,apellido,fechaDeNacimiento;
		int edad;
		char sexo;
		
		
		System.out.print("Ingresa tu nombre: ");
		nombre = entrada.nextLine();
		//System.out.println("Hola " + nombre);
		
		
		System.out.print("Ingresa tu apellido: ");
		apellido = entrada.nextLine();
		//System.out.println("Hola " + apellido);
		
		System.out.print("Ingresa tu fecha de nacimiento: ejemplo(dd/mm/yyyy)");
		fechaDeNacimiento = entrada.nextLine();
		
		System.out.print("Ingresa tu edad: ");
		edad = entrada.nextInt();
		//System.out.println("Tu edad es: " + edad);
		
		System.out.print("Tipo de g�nero (M/F): ");
		sexo = entrada.next().charAt(0);
		
		//System.out.println("Tu fecha de naciemiento es: " + fechaDeNacimiento);
		
		System.out.println("Hola " + nombre + " " + apellido + " tus datos son los siguientes: tienes " + edad + " a�os de edad y tu fecha de nacimiento es " + fechaDeNacimiento + " con sexo " + sexo);
		System.out.printf("Nombre: %s Edad: %d",nombre,edad);
	}

	public static void SumaDeDosNumeros()
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe un n�mero: ");
		var num1 = entrada.nextInt();
		System.out.print("Escribe un n�mero: ");
		var num2 = entrada.nextInt();
		
		var result = num1 + num2;
		System.out.printf("El resultado de la suma de %d y %d es: %d",num1,num2,result);
	}
	
	public static void ValorProducto()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa valor de venta: ");
		double valorVenta = entrada.nextDouble();
		
		double igv = valorVenta * 0.18;
		
		double precioVenta = valorVenta + igv;
		System.out.println("Valor de venta: " + valorVenta);
		System.out.println("IGV: " + igv);
		System.out.printf("Precio de venta: %.2f",precioVenta);
	}
	
	public static void EntradaDosNumeros()
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingresa un n�mero: ");
		var numero1 = entrada.nextInt();
		System.out.print("Ingresa un n�mero: ");
		var numero2 = entrada.nextInt();
		var resultSuma = numero1 + numero2;
		var resultResta = numero1 - numero2;
		
		System.out.printf("La suma de %d y %d es: %d \n", numero1, numero2, resultSuma);
		System.out.printf("La resta de %d y %d es: %d", numero1, numero2, resultResta);
		
		
		
	}
	
	public static void CocienteResiduo()
	{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingresa un n�mero: ");
		var numero1 = entrada.nextInt();
		System.out.print("Ingresa un n�mero: ");
		var numero2 = entrada.nextInt();
		var resultCociente = numero1 / numero2;
		var resultResto = numero1 % numero2;
		
		System.out.printf("El cociente entre %d y %d es: %d \n", numero1, numero2, resultCociente);
		System.out.printf("El resto de la divisi�n de %d y %d es: %d", numero1, numero2, resultResto);
		
		
	}
	
	public static void EntradaDeDatosInternet()
	{
		//Entrada de datos siempre y cuando:
		/* suma de todos los numeros introducidos sea superior a 100 
		 * se introduzca 3 veces el valor 3 
		 * se intruduzca 2 veces el valor 2
		 * se introduzca 8 veces consecutivas el mismo valor*/
		
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		//int i = 0;
		for (int i = 0; i <= 101; i++) 
		{
			
			System.out.println("Ingresa valores: ");
			num = entrada.nextInt();
			num = num + i;
			System.out.println(num);
			
			
			
			if(num == 3)
			{
				count = count + 1;
				if(count == 3)
				{
					System.out.println("Bien numero 3");
				}
			}//Fin if
			if(num == 2)
			{
				count1 += 1;
				if(count1 == 2) 
				{
					System.out.println("Bien numero 2");
				}
			}
			if(num == num)
			{
				count2 = count2 + 1;
				if(count2 == 8)
				{
					System.out.println("Bien numero repetido");
				}
			}
			
			
		}//Fin for
			
		System.out.println("Fin funci�n");
		
	}//Fin Funci�n
	
	
}
