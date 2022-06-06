/*
CRIE UM PROGRAMA PARA LER O NOME DE 2 TIMES DE FUTEBOL E O NÚMERO DE GOLS MARCADOS NA
PARTIDA (PARA CADA TIME). ESCREVA O NOME DO VENCEDOR. CASO NÃO HAJA VENCEDOR DEVERÁ SER
IMPRESSA A PALAVRA “EMPATE”.
 */

package listaCondicionais;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.print("Nome do time de futebol 1: ");
		String timeA = entrada.nextLine();
		
		System.out.print("Nome do time de futebol 2: ");
		String timeB = entrada.nextLine();
		
		System.out.print("qtd de gols "+ timeA +": ");
		int qtdGolsA = entrada.nextInt();
		
		System.out.print("qtd de gols "+ timeB +": ");
		int qtdGolsB = entrada.nextInt();
		
	
		if(qtdGolsA > qtdGolsB) {
			System.out.print(timeA + " foi o vencedor");
			
		} else {
			if(qtdGolsA < qtdGolsB) {
				System.out.print(timeB + " foi o vencedor");
			}else {
				System.out.print("Empate");
			}
		}

	}

}
