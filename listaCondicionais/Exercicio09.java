/*
UMA FRUTEIRA ESTÁ VENDENDO FRUTAS COM A SEGUINTE TABELA DE PREÇOS:

            ATÉ 5KG              ACIMA DE 5KG
MORANGO     R$2,50 / KG          R$2,20 / KG
MAÇÃ        R$1,80 / KG          R$1,50 / KG

SE  O  CLIENTE  COMPRAR MAIS  DE 8KG  EM  FRUTAS  OU  O  VALOR  TOTAL  
DA  COMPRA  ULTRAPASSAR R$25,00, RECEBERÁ AINDA  UM  DESCONTO  DE 10% SOBRE  
ESTE  TOTAL. DESENVOLVA  UM  PROGRAMA PARA  LER  A QUANTIDADE (EM KG)DE MORANGOS  
E A  QUANTIDADE (EM KG) DE  MAÇAS ADQUIRIDAS E  ESCREVA  O  VALOR A SER 
PAGO PELO CLIENTE
*/

package listaCondicionais;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Morango (kg): ");
		double kgMorango = entrada.nextDouble();
		
		System.out.print("Maçã (kg): ");
		double kgMaca = entrada.nextDouble();
		
		double valorMorango  = 0;
		double valorMaca  = 0;
		
		if(kgMorango <= 5.00) {
			valorMorango = (kgMorango * 2.50);
		} else {
			valorMorango = (kgMorango * 2.20);
		}
		
		if(kgMaca <= 5.00) {
			valorMaca = (kgMaca * 1.80);
		} else {
			valorMaca = (kgMaca * 1.50);
		}
		
		double valorTotal = valorMorango + valorMaca;
		double kgTotal = kgMorango + kgMaca;
		
		if(valorTotal > 25.00 || kgTotal > 8.00) {
			valorTotal = (valorTotal - ((valorTotal /100) * 10));
		}
		
		System.out.print(valorTotal);
		
	}

}
