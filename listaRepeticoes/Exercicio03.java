/*
 FAÇA UM PROGRAMA PARA LER UM VALOR INTEIRO (ACEITAR SOMENTE VALORES ENTRE 1E 10)E ESCREVA A TABUADA DO VALOR LIDO.
 */
package listaRepeticoes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		
		
		do {
			System.out.print("numero: ");
			num = teclado.nextInt();
		}while(num < 0 && num > 11);
		
		for(int i = 0; i < 11; i++) {
			System.out.print(num + " x " + i + " = " + (i * num) + "\n");
		}

	}

}
