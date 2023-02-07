package logica;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(generadorPassword());

	}

	static String generadorPassword()
	{
		
		char [] mayusculas = {'A','B','C','D','E','F','G'};
		char [] minusculas = {'a','b','c','d','e','f','g'};
		char [] numeros = {'1','2','3','4','5','6','7','8','9','0'};
 		
		StringBuilder caracteres = new StringBuilder();
		caracteres.append(mayusculas);
		caracteres.append(minusculas);
		caracteres.append(numeros);
		
		StringBuilder password = new StringBuilder();
		
		for(int i = 0; i <= 15; i++)
		{
			
			int cantidadCaracteres = caracteres.length();
			int numeroRandom = (int)(Math.random() * cantidadCaracteres);
			
			password.append((caracteres.toString()).charAt(numeroRandom));
			
		}
		
		
		return password.toString();
		
	}//Fin generadorPassword
	
}
