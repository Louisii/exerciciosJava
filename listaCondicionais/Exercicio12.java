/*
 UMA EMPRESA QUER VERIFICAR SE UM EMPREGADO EST� QUALIFICADO PARA A APOSENTADORIA OU N�O.
 PARAESTAR EM CONDI��ES,UM DOS SEGUINTES REQUISITOS DEVE SER SATISFEITO: 
 TER NO M�NIMO 65 ANOS DE IDADE.
 TER TRABALHADO NO M�NIMO 30ANOS.
 TER NO M�NIMO 60 ANOS E TER TRABALHADO NO M�NIMO 25ANOS.
 COM  BASE  NAS  INFORMA��ES ACIMA,DESENVOLVA  UM  PROGRAMAQUE  LEIA O NOME DO  EMPREGADO,O ANOD E  SEU  NASCIMENTO  
 E O ANO  DE  SEU  INGRESSO  NA  EMPRESA.OPROGRAMA  DEVER� INFORMAR  O  NOME,A IDADE,O  TEMPODE SERVI�ODO  EMPREGADO  
 E  A  MENSAGEM �REQUERER  APOSENTADORIA� OU �N�O REQUERERAPOSENTADORIA�.
 */

package listaCondicionais;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Ano de nascimento: ");
		int anoNascimento = teclado.nextInt();
		
		System.out.print("Ano de ingresso na empresa: ");
		int anoIngressoNaEmpresa = teclado.nextInt();
		
		int idade = 2022 - anoNascimento;
		int tempoNaEmpresa = 2022 - anoIngressoNaEmpresa;
		boolean  aposentado = false;
		
		if(idade >= 65) {
			if(tempoNaEmpresa >= 30) {
				aposentado = true;
			}
		}
		
		System.out.println("nome: " + nome + ", idade: " + idade + ", tempo de trabalho: " + tempoNaEmpresa);
		
		if(aposentado) {
			System.out.println("REQUERER  APOSENTADORIA");
		}else {
			System.out.println("N�O REQUERER  APOSENTADORIA");
		}
	}

}
