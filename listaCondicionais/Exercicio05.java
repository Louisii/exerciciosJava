package listaCondicionais;

import java.util.Scanner;

/*
FAÇA UM PROGRAMA PARA LER A QUANTIDADE ATUAL DE UM PRODUTO EM ESTOQUE. TAMBÉM DEVERÁ SER
INFORMADO A QUANTIDADE MÁXIMA E A QUANTIDADE MÍNIMA QUE ESTE PRODUTO PODE TER EM ESTOQUE. O
PROGRAMA DEVE CALCULAR E ESCREVER A QUANTIDADE MÉDIA ((QUANTIDADE MÉDIA = QUANTIDADE MÁXIMA +
QUANTIDADE MÍNIMA)/2). SE A QUANTIDADE EM ESTOQUE FOR MAIOR OU IGUAL A QUANTIDADE MÉDIA
ESCREVER A MENSAGEM “NÃO É NECESSÁRIO EFETUAR A COMPRA DESTE PRODUTO”, SENÃO ESCREVER A
MENSAGEM “EFETUAR A COMPRA DESTE PRODUTO”.
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
	    	
	    	System.out.print("NÃO É NECESSÁRIO EFETUAR A COMPRA DESTE PRODUTO");
	    }else {
	    	System.out.print("EFETUAR A COMPRA DESTE PRODUTO");
	    }
	    
	}
}
