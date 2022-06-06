package listaVariaveis;
import java.util.Scanner;

public class Salario_10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 

		 

		  System.out.print("Numero de carros vendidos: "); 

		  int nCarrosVendidos = teclado.nextInt(); 

		 

		  System.out.print("valor total de suas vendas: "); 

		  int valorTotalVendas = teclado.nextInt(); 

		     

		  System.out.print("salario fixo: "); 

		  int salarioFixo = teclado.nextInt(); 

		 

		  int comissao = 5 * valorTotalVendas / 100 ; 

		  int salarioFinal = salarioFixo + comissao; 

		   

		  System.out.print("o salario final do vendedor sera de " + salarioFinal + " reais"); 

	}

}
