//DESENVOLVA  UM  PROGRAMA  QUE  LEIA  A  QUANTIDADE  DE PONTOS  DE  UM  ALUNO  EM  UMA  AVALIA��O.
//DESENVOLVAUM M�TODO SEM RETORNO (�PROCEDIMENTO�)QUE RECEBAESSA PONTUA��O POR PAR�METRO E INFORMEO 
//CONCEITO DO ALUNO NA AVALIA��O CONFORME A TABELA ABAIXO:

//AT� 60 PONTOS   INSATISFAT�RIO
//61 A 75 PONTOS  SATISFAT�RIO
//76 A 90 PONTOS  BOM
//CIMA DE 90      �TIMO


package listaFuncoesEProcedimentos;

import java.util.Scanner;

public class Quest�o02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a pontua��o: ");
		int pontos = teclado.nextInt();
		
		informaConceito(pontos);
		teclado.close();

	}
	
	static void informaConceito(int pontos) {
		if(pontos <= 60) {
			System.out.print("INSATISFAT�RIO");
		}else if(pontos > 60 && pontos <= 75) {
			System.out.print("SATISFAT�RIO");
		}else if(pontos > 75 && pontos <= 90) {
			System.out.print("BOM");
		}else {
			System.out.print("�TIMO");
		}
	}

}
