//DESENVOLVA  UM  PROGRAMA  QUE  LEIA  A  QUANTIDADE  DE PONTOS  DE  UM  ALUNO  EM  UMA  AVALIAÇÃO.
//DESENVOLVAUM MÉTODO SEM RETORNO (“PROCEDIMENTO”)QUE RECEBAESSA PONTUAÇÃO POR PARÂMETRO E INFORMEO 
//CONCEITO DO ALUNO NA AVALIAÇÃO CONFORME A TABELA ABAIXO:

//ATÉ 60 PONTOS   INSATISFATÓRIO
//61 A 75 PONTOS  SATISFATÓRIO
//76 A 90 PONTOS  BOM
//CIMA DE 90      ÓTIMO


package listaFuncoesEProcedimentos;

import java.util.Scanner;

public class Questão02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a pontuação: ");
		int pontos = teclado.nextInt();
		
		informaConceito(pontos);
		teclado.close();

	}
	
	static void informaConceito(int pontos) {
		if(pontos <= 60) {
			System.out.print("INSATISFATÓRIO");
		}else if(pontos > 60 && pontos <= 75) {
			System.out.print("SATISFATÓRIO");
		}else if(pontos > 75 && pontos <= 90) {
			System.out.print("BOM");
		}else {
			System.out.print("ÓTIMO");
		}
	}

}
