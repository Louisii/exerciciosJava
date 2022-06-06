//FAÇA  UM  PROGRAMA  QUE LEIA  UMA  MATRIZ ADE  TAMANHO 3X4.EM  SEGUIDA  DESENVOLVAUM  
//MÉTODO COM RETORNO (“FUNÇÃO”)QUE RECEBA COMO PARÂMETRO A MATRIZ AE CONTABILIZE OS NÚMEROS 
//PARES.OPROGRAMA DEVE APRESENTAR QUANTOS NÚMEROSPARES A MATRIZ APOSSUI.

package listaFuncoesEProcedimentos;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][4];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(i + "," + j + ": ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		System.out.print(contarNumerosPares(matriz));
	}
	
	static int contarNumerosPares(int[][] matriz) {
		int nPares = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				
				if(matriz[i][j] % 2 == 0) {
					nPares++;
				}
			}
		}
		return nPares;
	}

}
