package listaVariaveis;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 

		 

		  System.out.print("Nota 1: "); 

		  int nota1 = teclado.nextInt(); 

		  System.out.print("Nota 2: "); 

		  int nota2 = teclado.nextInt(); 

		  System.out.print("Nota 3: "); 

		  int nota3 = teclado.nextInt(); 

		 

		  int media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10; 

		  System.out.print("media final: " + media); 

	}

}
