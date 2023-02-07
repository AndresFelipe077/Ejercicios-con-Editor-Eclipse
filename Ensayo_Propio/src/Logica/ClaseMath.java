package Logica;

public class ClaseMath {

	public static void main(String[] args) {
		
		NumeroPI();
		
		NumeroEuler();
		
		PotenciarNumero();
											//Primer numero es aquien se eleva
		NumeroRandom();								//Segundo numero cuantas veces se eleva
		
		RaizCuadrada();
		
		NumMaxAlto();
		
		NumMinPequeno();
		
		RedondearNumero();
		
	}
	
	static void NumeroPI()
	{
		
		System.out.println(Math.PI);
		
	}
	
	static void NumeroEuler()
	{
		
		System.out.println(Math.E);
		
	}
	
	static void PotenciarNumero()
	{
		
		System.out.println(Math.pow(4,2.0));//Para resolver potencias
		
	}
	
	static void NumeroRandom(){
		
		//System.out.println(Math.random()); //numeros decimales entre 0 y 9
		
		int numeroRandom = (int)(Math.random() * 101);//Numero enteros entre 0 y 100
		System.out.println(numeroRandom);
		
		
	}
	
	static void RaizCuadrada()
	{
		
		//System.out.println(Math.sqrt(64));//Aqui devuelve el numero en decimal
		System.out.println((int)(Math.sqrt(100)));//Numero entero
		
	}

	static void NumMaxAlto()
	{
		
		System.out.println("El número más alto es: " + Math.max(9, 10));
		
	}

	static void NumMinPequeno()
	{
		
		System.out.println("El número más pequeño es: " + Math.min(4, 5));
		
	}
	
	static void RedondearNumero()
	{
		
		System.out.println(Math.round(3.778));
		
		//Redondear numeros con las decimales que queramos
		double moneda = (double)Math.round(3.2149 * 100d)/100;//Si quieres un decimal pones el 1 y el 0
															 //La cantidad de ceros indica la cantidad de decimales que 
															 //Queremos que muestre.
		System.out.println(moneda);
		
	}
	
}
