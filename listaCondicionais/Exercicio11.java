/*
 FAÇA  UM PROGRAMA PARA  LER AS 3 NOTAS  OBTIDAS  POR  UM ALUNO  NAS 3 AVALIAÇÕES E A  MÉDIA  DOS EXERCÍCIOS  QUE  FAZEM PARTE  DA  AVALIAÇÃO.
 CALCULEA  MÉDIA,USANDO  A  FÓRMULA  ABAIXOE  ESCREVAO CONCEITO DO ALUNO DEACORDO COM A TABELA DE CONCEITOS MAIS ABAIXO:
 MÉDIA DE APROVEITAMENTO =(N1+(N2*2)+(N3*3)+MÉDIADOSEXERCÍCIOS))/7
 A ATRIBUIÇÃO DE CONCEITOS OBEDECE A TABELA ABAIXO: 
 MÉDIA DE APROVEITAMENTO   CONCEITO
    >=9,0                     A
    >=7,5 E <9,0              B
    >=6,0 E <7,5              C
    <6,0                      D
 */

package listaCondicionais;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("nota AV1: ");
		double av1 = teclado.nextDouble();
		
		System.out.print("nota AV2: ");
		double av2 = teclado.nextDouble();
		
		System.out.print("nota AV3: ");
		double av3 = teclado.nextDouble();
		
		System.out.print("nota media dos exercicios: ");
		double mediaEx = teclado.nextDouble();
		
		double mediaDeAproveitamento = (av1 + (av2 * 2) + (av3 * 3)+ mediaEx)/7;
		
		char conceito = 'A';
		
		if(mediaDeAproveitamento >= 9.0) {
			conceito = 'A';
		}else if(mediaDeAproveitamento  >= 7.5 && mediaDeAproveitamento < 9.0) {
			conceito = 'B';
		}else if(mediaDeAproveitamento  >= 6.0 && mediaDeAproveitamento < 7.5) {
			conceito = 'C';
		}else if(mediaDeAproveitamento  < 6.00) {
			conceito = 'D';
		}
		
		System.out.print(conceito);

	}

}
