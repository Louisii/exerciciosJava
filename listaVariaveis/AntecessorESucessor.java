package listaVariaveis;
import java.util.Scanner; 

public class AntecessorESucessor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 

	    System.out.print("Insira um valor num�rico: "); 

	    int numero = teclado.nextInt(); 

	    System.out.println("o antecessor � " + (numero - 1)); 

	    System.out.println("o sucessor � " + (numero + 1)); 

	}

}
