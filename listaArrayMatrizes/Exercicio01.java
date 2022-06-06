package listaArrayMatrizes;

public class Exercicio01 {

	public static void main(String[] args) {
		String nomes[] = {"louisi", "artur", "jorge", "camille", "erica", "jader", "luiz", "eduardo", "felipe", "anna"};
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.print(nomes[i] + "\n");
		}
		
		System.out.print("---------------------\n");
		
		for(int i = (nomes.length - 1); i >= 0  ; i--) {
			System.out.print(nomes[i] + "\n");
		}

	}

}
