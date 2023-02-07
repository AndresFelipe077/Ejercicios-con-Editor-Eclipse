package Logica;

import java.util.Iterator;

public class Funciones_Metodos {
	
	public static void main(String[] args)
	{
		//Llamar a una función
		//Saludar("Felipe");
		
		//Llamar metodo
		//Funciones_Metodos saludo = new Funciones_Metodos();
		//saludo.MyMetodo("Hola");
	
		//Funcion suma
		//Sumar(10, 40);
		
		//Funcion nombre y edad
		//Podemos crear variables generales con var
		//var nombre = "Andres Felipe";
		//var edad = 18;
		
		//NombreEdad("Andres Felipe",18);
		//NombreEdad(nombre, edad);
	
		
		//Funciones que retornan
		//var suma = SumaReturn(1, 2);
		//System.out.println("La suma es: " + suma);
		
		//SobreCarga de Funciones y/o Metodos
		//SumaDecimales();
		//System.out.println(SumaReturn(45,50));
		
		//System.out.println(SumaDecimales(4.5, 4.5));
		//Es poder poder el mismo nombre a las funciones, pero que retornen diferente tipo de valor.
		
		//Funciones Recursivas
		//CuentaRegresiva(10);
		
		//Factorial con funcion recursiva
		//System.out.println(Factorial(5));
		
		//Varargs Funciones indefinidas
		//System.out.println("La suma de todos los números es: " + sumaVaragsIndefinida(0, 0,1,2,3));
		//System.out.println(sumaVaragsIndefinida("Felipe",3,2,1));
		
		
	}//Fin Main
	
	
	
	//Definición de una función
	static void Saludar(String nombre) // void: Devuelve algo.
		{
			System.out.println("Hola " + nombre + " Desde la función");
		}
	
	//Definición de un Método
	public void MyMetodo(String saludo)
		{
			System.out.println(saludo);
		}
	
	
	//Funcion de sumar
	static void Sumar(int a, int b)
	{
		
		int suma = a + b;
		System.out.printf("La suma de %d + %d es %d\n",a,b,suma);
		
	}

	static void NombreEdad(String nombre, int edad)
	{
		
		System.out.printf("Hola %s tu edad es %d \n",nombre,edad);
		
	}
	
	
	//Funciones que retornan
	static int SumaReturn(int a, int b) //Se pone int no void ya que devuelve un entero.Depende del valor 
	{
		
		return a + b;
		
	}
	
	//SobreCarga de Funciones y/o Metodos
	static double SumaDecimales(double a, double b)
	{
		
		return a + b;
		
	}
	
	static void CuentaRegresiva(int numero)
	{
		
		numero --;
		
		if(numero > 0)
		{
			System.out.println(numero);
			CuentaRegresiva(numero);
		}
		else 
		{
			System.out.println("Llego hasta 0");
		}
		
	}
	
	static int Factorial(int numero)
	{
		
		if(numero > 1)
		{
			numero = numero * Factorial(numero - 1);
		}
		return numero;
		
	}
	
	static int sumaVaragsIndefinida(String nombre,int... numeros)//Siempre el parametro 
	{														//indefinido va al final	
		/*													//Por que es sintaxis.				
		int suma = 0;
		for (int num : numeros) 
		{
			
			suma += num;
			
		}
		
		return suma;
		*/
		System.out.println("La suma de es " + nombre);
		int suma = 0;
		for(int num : numeros)
		{
			
			suma += num;
			
		}
		
		return suma;
		
	}
	
	
}//Fin clase







