package listaArrayMatrizes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeros[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			do {
				System.out.print(i + ". digite um numero: ");
				numeros[i] = teclado.nextInt();
			}while(numeros[i] < 0);
		}
		
		int maiorNumero = 0;
		int menorNumero = 0;
		int posicaoMaiorNumero = 0;
		int posicaoMenorNumero = 0;
		
		for(int i = 0; i < 10; i++) {
			if(i == 0) {
				maiorNumero = numeros[i];
				menorNumero = numeros[i];
			}
			if(numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
				posicaoMaiorNumero = i;
			}
			if(numeros[i] < menorNumero) {
				menorNumero = numeros[i];
				posicaoMenorNumero = i;
			}
		}
		
		System.out.print("o maior numero é " + maiorNumero + " na posicao " + posicaoMaiorNumero +"\n");
		System.out.print("o menor numero é " + menorNumero + " na posicao " + posicaoMenorNumero +"\n");

	}

}
