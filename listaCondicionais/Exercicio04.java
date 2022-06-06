/*
A JORNADA DE TRABALHO DE UM FUNCION�RIO � DE 40 HORAS SEMANAIS. PODE OCORRER DO
FUNCION�RIO FAZER HORA EXTRA, CUJO C�LCULO � O VALOR DA HORA REGULAR COM UM ACR�SCIMO DE 50%.
DESENVOLVA UM PROGRAMA QUE LEIA O N�MERO DE HORAS TRABALHADAS EM UM M�S, O SAL�RIO POR HORA
E ESCREVA O SAL�RIO TOTAL DO FUNCION�RIO, QUE DEVER� SER ACRESCIDO DAS HORAS EXTRAS, CASO
TENHAM SIDO TRABALHADAS (CONSIDERE QUE O M�S POSSUA 4 SEMANAS EXATAS).
*/

package listaCondicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		 
	    System.out.print("N�mero de horas trabalhadas no m�s: ");
	    int totalHorasDeTrabalho = teclado.nextInt();
	    
	    System.out.print("Sal�rio por hora: ");
	    int salarioPorHora = teclado.nextInt();
	    
	    int salarioTotal;
	    
	    if(totalHorasDeTrabalho > 40) {
	    	int horaExtra = totalHorasDeTrabalho - 40;
		    
		    salarioTotal = ((horaExtra * (salarioPorHora + (salarioPorHora / 2))) + (salarioPorHora * 40));
	    }
	    else {
	    	salarioTotal = totalHorasDeTrabalho * salarioPorHora;
	    }
	    
	    System.out.print("Sal�rio total: " + salarioTotal);
	}

}
