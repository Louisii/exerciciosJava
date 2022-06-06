package listaVariaveis;
import java.util.Scanner;

public class Racao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 

		 

		  System.out.print("Peso do saco de racao (kg): "); 

		  int pesoSacoRacao = teclado.nextInt(); 

		 

		  System.out.print("Racao Caramelo (kg): "); 

		  int racaoCaramelo = teclado.nextInt(); 

		 

		  System.out.print("Racao Frajola (kg): "); 

		  int racaoFrajola = teclado.nextInt(); 

		 

		  int gastoRacaoDia = racaoCaramelo + racaoFrajola; 

		 

		  System.out.print("restara de ração após 5 dias: " + ((pesoSacoRacao - gastoRacaoDia)*5) + "kg"); 

	}

}
