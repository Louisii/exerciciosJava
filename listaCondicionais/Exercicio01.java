/*
 * EM UMA FEIRA,AS MA��S CUSTAM R$1,30CADA SE FOREM COMPRADAS MENOS DE UMA D�ZIA,
 * E R$1,00SE   FOREMCOMPRADAS   PELO   MENOS12.ESCREVA   UM   PROGRAMA   QUE   
 * LEIA   O   N�MERO   DE MA��S COMPRADAS,CALCULE EESCREVA O CUSTO TOTAL DA COMPRA.
 * */

package listaCondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		
	    DecimalFormat formatador = new DecimalFormat("0.00");
		 
	    System.out.print("N�mero de ma��s compradas: ");
	    
	    double custoTotalCompra;
	    int nMacasCompradas = teclado.nextInt();
	    
	    
	    if(nMacasCompradas < 12) {
	    	
	    	custoTotalCompra = nMacasCompradas * 1.30;
	    } else {
	    	
	    	custoTotalCompra = nMacasCompradas * 1.00;
	    }
	    
	    System.out.println("Custo total da compra: " + formatador.format(custoTotalCompra));
	}

}
