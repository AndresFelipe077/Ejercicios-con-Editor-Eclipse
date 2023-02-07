package Logica;

public class ClaseString {

	public static void main(String[] args) {
		
		//indice en el que se encuentra la letra
		CharAtIndice();

		//Longitud cantidad de caracteres del String
		Length();
		
		//Iterar el String caracter por caracter
		CharAtYLength();
		
		//SubString Mostrar un conjunto de caracteres
		SubStringCortarCadena();
		
		//De mayusculas a minusculas
		LowerCase();
		
		//De minusculas a mayusculas
		UpperCase();
		
		//Reemplazar carateres con replace
		ReplaceReemplazarCaracter();
		
		//Igualar valores con .equals()
		EqualsIgualar();
		
		//StringBuilder para agregar Strings
		StringBuilder();
		
	}
	
	static void CharAtIndice()
	{
		
		String nombre = "Felipe";
		System.out.println(nombre.charAt(2));
		
	}

	static void Length()
	{
		String nombre = "Felipe";
		System.out.println(nombre.length());
		
	}
	
	static void CharAtYLength()
	{
		
		var nombre = "Felipe";
		
		for(int i = 0; i < nombre.length(); i++)
		{
			
			System.out.print(nombre.charAt(i));
			
		}
		
	}
	
	static void SubStringCortarCadena()
	{
		
		String nombre = "Felipe";
		
		System.out.println(nombre.substring(0,2));
		
	}
	
	static void LowerCase()
	{
		String a = "FELIPE";
		System.out.println(a.toLowerCase());
		
	}
	
	static void UpperCase()
	{
		
		String a = "felipe";
		System.out.println(a.toUpperCase());
		
	}
	
	static void ReplaceReemplazarCaracter()
	{
		
		String a = "F e l i p e";
		System.out.println(a.replace(" ", "-"));
		
		
	}
	
	static void EqualsIgualar()
	{
		
		System.out.println("Felipe".equals("Felipe"));//Vieja escuela "Hola" == "Hola", no se recomienda.
		
	}
	
	//StringBuilder
	static void StringBuilder()
	{
		//Objeto vacío
		StringBuilder nuevo = new StringBuilder();
		System.out.println(nuevo);
		
		nuevo.append("Felipe ");
		
		System.out.println(nuevo);
		
		nuevo.append(3148);
		
		System.out.println(nuevo);
		
		nuevo.append(" Hola desconocido");
		System.out.println(nuevo);
		
		System.out.println(nuevo.toString());//Para que nos devuelva toda la info de este objeto
		
	}
	
	
}
