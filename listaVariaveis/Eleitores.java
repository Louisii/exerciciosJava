package listaVariaveis;
import java.util.Scanner;

public class Eleitores {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in); 

		 
	    System.out.print("Total de eleitores: "); 

	    int totalEleitores = teclado.nextInt(); 

	    System.out.print("Total de votos brancos: "); 

	    int brancos = teclado.nextInt(); 

	    System.out.print("Total de votos nulos: "); 

	    int nulos = teclado.nextInt();  

	    int validos = totalEleitores - (nulos + brancos);  

	 

	    double porcentagemVotosBrancos = (brancos * 100.0 / totalEleitores);  

	    double porcentagemVotosNulos = (nulos * 100.0 / totalEleitores);  

	    double porcentagemVotosValidos = (validos * 100.0 / totalEleitores);  

	 

	    System.out.println ("A porcentagem de votos brancos é " + porcentagemVotosBrancos + '%');  

	    System.out.println("A porcentagem de votos nulos é " + porcentagemVotosNulos + '%');  

	    System.out.println ("A porcentagem de votos validos é " + porcentagemVotosValidos + '%'); 

	}

}
