/*
 DESENVOLVA UM PROGRAMA PARA LER 10 N�MEROS E ESCREVA AM�DIA DESSES N�MEROS LIDOS.
 */

package listaRepeticoes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double soma = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.print("numero " + i + ": ");
			int num = teclado.nextInt();
			soma += num;
		}
		
		System.out.print(soma / 10);

	}

}
