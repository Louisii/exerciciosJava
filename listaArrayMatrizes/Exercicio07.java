package listaArrayMatrizes;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		int a[][] = new int[3][3];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print("numero posição " + i + ", " + j + ": ");
				a[i][j] = teclado.nextInt();
			}
		}
		
		System.out.print("multiplicador: ");
		int multiplicador = teclado.nextInt();
		
		int resultado[][] = new int[3][3];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				resultado[i][j] = a[i][j];
			}
		}
		
		for(int i = 0; i < resultado.length; i++) {
			for(int j = 0; j < resultado[i].length; j++) {
				resultado[i][j] *= multiplicador;
			}
			System.out.println();
		}
		
		System.out.println("matriz a");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("matriz resultado");
		for(int i = 0; i < resultado.length; i++) {
			for(int j = 0; j < resultado[i].length; j++) {
				System.out.print(resultado[i][j]);
			}
			System.out.println();
		}

	}

}
