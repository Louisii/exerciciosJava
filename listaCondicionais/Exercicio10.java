/*
 FAÇA UM PROGRAMA PARA LER O NOME DE UM PRODUTO,A QUANTIDADE ADQUIRIDA E O PREÇO UNITÁRIO.
 CALCULE E ESCREVA O TOTAL (TOTAL =QUANTIDADE ADQUIRIDA*PREÇO UNITÁRIO),
 O DESCONTO E O TOTALA PAGAR (TOTAL A PAGAR =TOTAL -DESCONTO),
 SABENDO-SE QUE: SE QUANTIDADE <=5O DESCONTO SERÁ DE 2%SE QUANTIDADE >5E QUANTIDADE <=10O DESCONTO SERÁ DE 3%SE QUANTIDADE >10O DESCONTO SERÁ DE 5%
 */

package listaCondicionais;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("nome do produto: ");
		String nome = teclado.nextLine();
		
		System.out.print("quantidade adquirida: ");
		int qtd = teclado.nextInt();
		
		System.out.print("preço unitário: ");
		double precoUnitario = teclado.nextDouble();
		
		double total = qtd * precoUnitario;
		
		double desconto = 0;
		
		if(qtd <= 50) {
			desconto = 0.02;
		}else {
			if(qtd <= 100) {
				desconto = 0.03;
			}else {
				desconto = 0.05;
			}
		}
		
		double totalAPagar = total - (total * desconto);
		
		System.out.print(totalAPagar);

	}

}
