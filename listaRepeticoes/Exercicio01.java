/*
 DESENVOLVA UM PROGRAMA PARA LER 2 NÚMEROS. SE O SEGUNDO NÚMERO INFORMADO FOR “0”(ZERO),O  PROGRAMA  DEVERÁ  APRESENTAR  
 A  MENSAGEM  DE “VALOR INVÁLIDO!”,E  DEVE  LER  O  SEGUNDO  NÚMERO NOVAMENTE,OU  SEJA,O  PROGRAMA  NÃO  PODE ACEITAR  
 O  VALOR  ZERO  PARA  O  SEGUNDO  NÚMERO.OPROGRAMA DEVE IMPRIMIR O RESULTADO DA DIVISÃO DO PRIMEIRO NÚMERO PELO SEGUNDONÚMERO.
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
				System.out.print("valor inválido \n");
				}
			}while(num2 == 0);
		
		System.out.print("divisao: " + (num1 / num2));
	}

}
