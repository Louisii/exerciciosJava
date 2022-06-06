/*
A JORNADA DE TRABALHO DE UM FUNCIONÁRIO É DE 40 HORAS SEMANAIS. PODE OCORRER DO
FUNCIONÁRIO FAZER HORA EXTRA, CUJO CÁLCULO É O VALOR DA HORA REGULAR COM UM ACRÉSCIMO DE 50%.
DESENVOLVA UM PROGRAMA QUE LEIA O NÚMERO DE HORAS TRABALHADAS EM UM MÊS, O SALÁRIO POR HORA
E ESCREVA O SALÁRIO TOTAL DO FUNCIONÁRIO, QUE DEVERÁ SER ACRESCIDO DAS HORAS EXTRAS, CASO
TENHAM SIDO TRABALHADAS (CONSIDERE QUE O MÊS POSSUA 4 SEMANAS EXATAS).
*/

package listaCondicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		 
	    System.out.print("Número de horas trabalhadas no mês: ");
	    int totalHorasDeTrabalho = teclado.nextInt();
	    
	    System.out.print("Salário por hora: ");
	    int salarioPorHora = teclado.nextInt();
	    
	    int salarioTotal;
	    
	    if(totalHorasDeTrabalho > 40) {
	    	int horaExtra = totalHorasDeTrabalho - 40;
		    
		    salarioTotal = ((horaExtra * (salarioPorHora + (salarioPorHora / 2))) + (salarioPorHora * 40));
	    }
	    else {
	    	salarioTotal = totalHorasDeTrabalho * salarioPorHora;
	    }
	    
	    System.out.print("Salário total: " + salarioTotal);
	}

}
