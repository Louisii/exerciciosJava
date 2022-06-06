/*
 UMA EMPRESA QUER VERIFICAR SE UM EMPREGADO ESTÁ QUALIFICADO PARA A APOSENTADORIA OU NÃO.
 PARAESTAR EM CONDIÇÕES,UM DOS SEGUINTES REQUISITOS DEVE SER SATISFEITO: 
 TER NO MÍNIMO 65 ANOS DE IDADE.
 TER TRABALHADO NO MÍNIMO 30ANOS.
 TER NO MÍNIMO 60 ANOS E TER TRABALHADO NO MÍNIMO 25ANOS.
 COM  BASE  NAS  INFORMAÇÕES ACIMA,DESENVOLVA  UM  PROGRAMAQUE  LEIA O NOME DO  EMPREGADO,O ANOD E  SEU  NASCIMENTO  
 E O ANO  DE  SEU  INGRESSO  NA  EMPRESA.OPROGRAMA  DEVERÁ INFORMAR  O  NOME,A IDADE,O  TEMPODE SERVIÇODO  EMPREGADO  
 E  A  MENSAGEM “REQUERER  APOSENTADORIA” OU “NÃO REQUERERAPOSENTADORIA”.
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
			System.out.println("NÃO REQUERER  APOSENTADORIA");
		}
	}

}
