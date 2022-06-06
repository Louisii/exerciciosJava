package listaArrayMatrizes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeros[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("digite um numero: ");
			numeros[i] = teclado.nextInt();
		}
		
		System.out.print("procurar numero: ");
		int numero = teclado.nextInt();
		String busca = "não achei";		
		
		for(int i = 0; i < 10; i++) {
			if(numero == numeros[i]) {
				busca = "achei";
			}
		}
		
		System.out.print(busca);

	}

}
