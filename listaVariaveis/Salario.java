package listaVariaveis;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in); 

		 

		  System.out.print("salario: "); 

		  int salario = teclado.nextInt(); 

		 

		  System.out.print("data base: "); 

		  int dataBase = teclado.nextInt(); 

		 

		  System.out.println("salario atual: " + salario); 

		    System.out.print("novo salario: " + (salario + (dataBase * salario)/100)); 

	}

}
