package listaVariaveis;
import java.util.Scanner; 

public class IdadeEmDias {
	
	public static void main(String[] args) {

		    Scanner teclado = new Scanner(System.in); 

		    System.out.print("Idade: "); 

		    int idade = teclado.nextInt(); 

		    System.out.println("sua idade em meses � " + (idade * 12) + " meses"); 

		    System.out.println("sua idade em dias � " + (idade * 365) + " dias"); 
		
	}
}
