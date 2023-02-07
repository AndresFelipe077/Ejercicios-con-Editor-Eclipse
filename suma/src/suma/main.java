package suma;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {
	
	
	public static int Suma()
	{
		int a,b,c;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe el primer número: ");
		a = entrada.nextInt();
		
		System.out.println("Escribe el segundo número: ");
		b = entrada.nextInt();
		
		c = a + b;
		
		System.out.println("El resultado de la suma es: " + c);
		return a + b;
		
	}

	public static void main(String[] args) {
		
		//int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero: "));
		//int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero: "));
		
		//Operaciones Operaciones = new Operaciones();
		
		
		//Operaciones.suma();
		//Operaciones.resta1();
		//Operaciones.mult();
		//Operaciones.div();
		
		
		//Suma();
		Num_Par_Impar num = new Num_Par_Impar();
		
		num.Numeros_Pares_Impares();
		
		
		
		double raiz;
		
		/*
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un número: ");
		int a = entrada.nextInt();
		System.out.println("Escribe un número: ");
		int b = entrada.nextInt();
		double resultado = a + b;
		
		System.out.println(resultado);
		raiz = Math.sqrt(resultado);
		
		System.out.println("Hola soy Andres Felipe");
		System.out.println("La raiz cuadrada de la suma es: " + raiz);
		*/
		
		//Variables locales
		/*Float base, altura, resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe la base: ");
		base = entrada.nextFloat();
		
		System.out.println("Escribe la altura: ");
		altura = entrada.nextFloat();
		
		resultado = (base * altura)/2;
		
		System.out.println("El area del triangulo es: " + resultado);
		*/
		
		
		
		
	}

}
