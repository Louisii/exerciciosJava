package listaArrayMatrizes;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int resultado[][] = new int[3][3];
		
		
		System.out.println("_____Matriz A_____");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print("numero posição " + i + ", " + j + ": ");
				a[i][j] = teclado.nextInt();
			}
		}
		
		System.out.println("______Matriz B______");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print("numero posição " + i + ", " + j + ": ");
				b[i][j] = teclado.nextInt();
			}
		}
		
		//resultado
		for(int i = 0; i < resultado.length; i++) {
			for(int j = 0; j < resultado[i].length; j++) {
				resultado[i][j] = a[i][j] + b[i][j];
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
		
		System.out.println("matriz b");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
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
