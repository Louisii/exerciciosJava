/*
DESENVOLVA  UM  PROGRAMA  PARA  LER 10 N�MEROSE  ESCREVA QUANTOS  DESSES N�MEROSLIDOS  S�O NEGATIVOS.
*/

package listaRepeticoes;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contador = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.print("numero " + i + ": ");
			int num = teclado.nextInt();
			
			if(num < 0) {
				contador++;
			}
		}
		
		System.out.print("numeros negativos: " + contador);

	}

}
