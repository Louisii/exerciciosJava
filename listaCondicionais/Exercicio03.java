/*
 *CRIE  UM  PROGRAMA  QUE LEIA A  HORA  DE  INÍCIO  E A HORA  DE  FIM  
 *DE  UM  JOGO  DE XADREZ(CONSIDERE APENAS HORAS INTEIRAS,SEM OS MINUTOS)
 *E CALCULE A DURAÇÃO DO JOGO EM HORAS,SABENDO-SE QUE O TEMPO MÁXIMO 
 *DE DURAÇÃO DO JOGO É DE 24 HORAS E QUE O JOGO PODE INICIAR EM UM DIA 
 *E TERMINAR NO DIA SEGUINTE. 
 * */

package listaCondicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		
	    System.out.print("Hora de inicio do jogo: ");
	    
	    int horaInicio = teclado.nextInt();
	    
	    System.out.print("hora do fim do jogo: ");
	    
	    int horaFim = teclado.nextInt();
	    
	    System.out.print("o jogo terminou no dia 1 ou 2: ");
	    
	    int diaFim = teclado.nextInt();
	    
	    int duracaoTotal;
	    
	    if(diaFim == 2) {
	    	int horasNoDia1 = 24 - horaInicio;
	    	int horasNoDia2 = horaFim;
	    	duracaoTotal = horasNoDia1 + horasNoDia2;
	    } else {
	    	duracaoTotal = horaFim - horaInicio;
	    }
	    
	    System.out.print("O jogo teve " + duracaoTotal + " horas");
	    
	}

}
