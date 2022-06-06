/*
 * DESENVOLVA  UM  PROGRAMA  QUE  LEIA AS  NOTAS  DA 1ª E 2ªAVALIAÇÕES DE UM ALUNO.CALCULE A  
 * MÉDIA ARITMÉTICA SIMPLES EESCREVA UMA MENSAGEM QUE DIGA SE O ALUNO FOI OU NÃO APROVADO 
 * (CONSIDERAR QUE NOTA IGUAL OU MAIOR QUE 7 O ALUNO É APROVADO).ESCREVA TAMBÉM A MÉDIA CALCULADA.
 * */

package listaCondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in); 
		
	    DecimalFormat formatador = new DecimalFormat("0.00");
		 
	    System.out.print("nota da avaliação 1: ");
	    
	    double nota1 = teclado.nextDouble();
	    
	    System.out.print("nota da avaliação 2: ");
	    
	    double nota2 = teclado.nextDouble();
	    
	    
	    double media =  (nota1 + nota2) / 2;
	    String situacao;
	    
	    if(media >= 7) {
	    	
	    	situacao = "aprovado";
	    } else {
	    	
	    	situacao = "reprovado";
	    }
	    
	    
	    
	    System.out.println(situacao + " com media " + formatador.format(media));
	    

	}

}
