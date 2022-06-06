/*
SUPONHA QUE O C�DIGO DE ACESSO DE UM USU�RIO A UM SISTEMA SEJA IGUAL A 12345 E QUE A SENHA DE
ACESSO SEJA 54321. FA�A UM PROGRAMA PARA LER O C�DIGO DE ACESSO DO USU�RIO. CASO ESTE C�DIGO
SEJA DIFERENTE DO C�DIGO ARMAZENADO INTERNAMENTE O PROGRAMA DEVE APRESENTAR A MENSAGEM
�USU�RIO INV�LIDO!�. CASO O C�DIGO SEJA CORRETO, DEVE SER LIDO A SENHA. SE ESTA SENHA ESTIVER
INCORRETA O PROGRAMA DEVE MOSTRAR A MENSAGEM �SENHA INCORRETA!�. CASO A SENHA ESTEJA
CORRETA, DEVE SER MOSTRADA A MENSAGEM �ACESSO PERMITIDO!�.
 */

package listaCondicionais;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int codigo = 12345;
		int senha = 54321;
		
		System.out.print("Codigo de acesso: ");
		int entradaUsuarioCodigo = entrada.nextInt();
		
		
		if(entradaUsuarioCodigo != codigo) {
			System.out.print("USU�RIO INV�LIDO!");
		}else {
			
			System.out.print("Senha: ");
			int entradaUsuarioSenha = entrada.nextInt();
			
			if(entradaUsuarioSenha != senha) {
				System.out.print("SENHA INCORRETA!");
			}else {
				System.out.print("ACESSO PERMITIDO!");
			}
		}
		
	}
}
