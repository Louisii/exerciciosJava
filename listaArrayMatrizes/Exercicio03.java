package listaArrayMatrizes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
			Scanner teclado = new Scanner(System.in);
			int numeros[] = new int[10];
			
			for(int i = 0; i < 10; i++) {
				System.out.print("digite um numero: ");
				numeros[i] = teclado.nextInt();
			}
			
			System.out.print("procurar numero: ");
			int numero = teclado.nextInt();
			int busca = 0;		
			
			for(int i = 0; i < 10; i++) {
				if(numero == numeros[i]) {
					busca++;
				}
			}
			
			System.out.print("o numero " + numero + " foi encontrado " + busca + " vezes");


	}

}
