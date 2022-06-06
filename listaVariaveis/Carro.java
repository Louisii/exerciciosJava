package listaVariaveis;
import java.util.Scanner;

public class Carro {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 

		 

		  System.out.print("modelo do carro: "); 

		  String modeloCarro = teclado.nextLine(); 

		     

		  System.out.print("custo de fabrica: "); 

		  int custoFabrica = teclado.nextInt(); 

		     

		  int custoDistribuidor = 28 * custoFabrica / 100 ; 

		  int custoImpostos = 45 * custoFabrica / 100; 

		     

		  int custoFinal = custoFabrica + custoDistribuidor +custoImpostos; 

		 

		  System.out.print("o custo final do(a) " + modeloCarro + " é de " + custoFinal); 
		
	}

}
