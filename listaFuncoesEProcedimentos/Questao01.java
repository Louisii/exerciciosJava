//DESENVOLVA UM PROGRAMA QUE LEIA A IDADE DE UM NADADOR. DESENVOLVAUM MÉTODO SEM RETORNO 
//(“PROCEDIMENTO”)QUE   RECEBA ESSA   IDADE POR   PARÂMETRO E   INFORMEA   CATEGORIA   DO   
//NADADOR CONFORME TABELA ABAIXO:
//ATÉ 10 ANOS    MIRIM
//11 A 14 ANOS   INFANTIL
//15 A 19 ANOS   JUVENIL
//ACIMA DE 19    ADULTO

package listaFuncoesEProcedimentos;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a idade: ");
		int idade = teclado.nextInt();
		informaCategoriaNadador(idade);
		teclado.close();
	}
	
	static void informaCategoriaNadador(int idade) {
		
		if(idade < 11) {
			System.out.print("mirim");
		}else if(idade > 10 && idade < 15) {
			System.out.print("infantil");
		}else if(idade > 14 && idade < 20) {
			System.out.print("juvenil");
		}else {
			System.out.print("adulto");
		}
	}
	
}
