//DESENVOLVA  UM  PROGRAMA  PARA  SIMULAR  UMA  CALCULADORA  COM  AS  OPERA��ES  DE  
//ADI��O,SUBTRA��O,DIVIS�O  E  MULTIPLICA��O.AS  OPERA��ES  S�O  APENAS  DE  DOIS  N�MEROS.
//DESENVOLVA M�TODOS PARA AS OPERA��ES E O PROGRAMA AL�M DE MOSTRAR O RESULTADO DA OPERA��O 
//SELECIONADA PELO  USU�RIO  DEVE  PERMITIR  QUE  ELE  POSSAEXECUTAR  QUANTAS  OPERA��ES  ELE  
//DESEJAR AT�  QUE  ELE DECIDA ENCERRAR O PROGRAMA.

package listaFuncoesEProcedimentos;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("primeiro numero: ");
		double n1 = teclado.nextDouble();
		
		System.out.print("segundo numero: ");
		double n2 = teclado.nextDouble();
		
		System.out.print("operacao: ");
		String operacao = teclado.next();
		
		System.out.print(fazOperacao(operacao, n1, n2));

	}
	
	
	static double somar(double n1, double n2) {
		return n1 + n2;
	}
	
	static double subtrair(double n1, double n2) {
		return n1 - n2;
	}
	
	static double dividir(double n1, double n2) {
		return n1 / n2;
	}
	
	static double multiplicar(double n1, double n2) {
		return n1 * n2;
	}
	
	static double fazOperacao(String operacao, double n1, double n2) {
		double resultado = 0;
		
		switch (operacao) {

			case "+":
				resultado = somar(n1, n2);
			break;

			case "-":
				resultado = subtrair(n1, n2);
			break;

			case "/":
				resultado = dividir(n1, n2);
			break;
		
			case "*":
				resultado = multiplicar(n1, n2);
			break;
		}
		
		return resultado;
	}

}
