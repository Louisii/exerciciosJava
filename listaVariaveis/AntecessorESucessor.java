package listaVariaveis;
import java.util.Scanner; 

public class AntecessorESucessor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 

	    System.out.print("Insira um valor numérico: "); 

	    int numero = teclado.nextInt(); 

	    System.out.println("o antecessor é " + (numero - 1)); 

	    System.out.println("o sucessor é " + (numero + 1)); 

	}

}
