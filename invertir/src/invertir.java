import java.util.Scanner;

public class invertir {
	
	public static void main(String []args)
	{
		
		try (Scanner entrada = new Scanner(System.in)) 
		{
			System.out.println("Ingresa un dato a invertir: ");
			String texto = entrada.nextLine();
			
			String invertirString = "";
			for(int i = texto.length()-1; i >= 0; i--)
			{
				
				invertirString += texto.charAt(i);
				
			}
			
			System.out.println(invertirString);
		}//Fin try
		
	}
	
	

}
