/*
 * DESENVOLVA  UM  PROGRAMA  QUE  LEIA AS  NOTAS  DA 1� E 2�AVALIA��ES DE UM ALUNO.CALCULE A  
 * M�DIA ARITM�TICA SIMPLES EESCREVA UMA MENSAGEM QUE DIGA SE O ALUNO FOI OU N�O APROVADO 
 * (CONSIDERAR QUE NOTA IGUAL OU MAIOR QUE 7 O ALUNO � APROVADO).ESCREVA TAMB�M A M�DIA CALCULADA.
 * */

package listaCondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in); 
		
	    DecimalFormat formatador = new DecimalFormat("0.00");
		 
	    System.out.print("nota da avalia��o 1: ");
	    
	    double nota1 = teclado.nextDouble();
	    
	    System.out.print("nota da avalia��o 2: ");
	    
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
