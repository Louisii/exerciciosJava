package listaCondicionais;

import java.util.Scanner;

/*
FA�A UM PROGRAMA PARA LER A QUANTIDADE ATUAL DE UM PRODUTO EM ESTOQUE. TAMB�M DEVER� SER
INFORMADO A QUANTIDADE M�XIMA E A QUANTIDADE M�NIMA QUE ESTE PRODUTO PODE TER EM ESTOQUE. O
PROGRAMA DEVE CALCULAR E ESCREVER A QUANTIDADE M�DIA ((QUANTIDADE M�DIA = QUANTIDADE M�XIMA +
QUANTIDADE M�NIMA)/2). SE A QUANTIDADE EM ESTOQUE FOR MAIOR OU IGUAL A QUANTIDADE M�DIA
ESCREVER A MENSAGEM �N�O � NECESS�RIO EFETUAR A COMPRA DESTE PRODUTO�, SEN�O ESCREVER A
MENSAGEM �EFETUAR A COMPRA DESTE PRODUTO�.
*/
public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		
	    System.out.print("qntd atual do produto no estoque: ");
	    int qtdProdutoNoEstoque = teclado.nextInt();

	    System.out.print("qntd maxima do produto no estoque: ");
	    int qtdMaxima = teclado.nextInt();

	    System.out.print("qntd minima do produto no estoque: ");
	    int qtdMinima = teclado.nextInt();
	    
	    int qtdMedia = ((qtdMaxima + qtdMinima)/2);
	    
	    if(qtdProdutoNoEstoque >= qtdMedia) {
	    	
	    	System.out.print("N�O � NECESS�RIO EFETUAR A COMPRA DESTE PRODUTO");
	    }else {
	    	System.out.print("EFETUAR A COMPRA DESTE PRODUTO");
	    }
	    
	}
}
