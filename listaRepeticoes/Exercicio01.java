/*
 DESENVOLVA UM PROGRAMA PARA LER 2 N�MEROS. SE O SEGUNDO N�MERO INFORMADO FOR �0�(ZERO),O  PROGRAMA  DEVER�  APRESENTAR  
 A  MENSAGEM  DE �VALOR INV�LIDO!�,E  DEVE  LER  O  SEGUNDO  N�MERO NOVAMENTE,OU  SEJA,O  PROGRAMA  N�O  PODE ACEITAR  
 O  VALOR  ZERO  PARA  O  SEGUNDO  N�MERO.OPROGRAMA DEVE IMPRIMIR O RESULTADO DA DIVIS�O DO PRIMEIRO N�MERO PELO SEGUNDON�MERO.
 */


package listaRepeticoes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("numero 1: ");
		int num1 = teclado.nextInt();
		int num2 = 0;
		
		do {
				System.out.print("numero 2: ");
				num2 = teclado.nextInt();
			
				if(num2 == 0) {
				System.out.print("valor inv�lido \n");
				}
			}while(num2 == 0);
		
		System.out.print("divisao: " + (num1 / num2));
	}

}
