/*
SUPONHA QUE O CÓDIGO DE ACESSO DE UM USUÁRIO A UM SISTEMA SEJA IGUAL A 12345 E QUE A SENHA DE
ACESSO SEJA 54321. FAÇA UM PROGRAMA PARA LER O CÓDIGO DE ACESSO DO USUÁRIO. CASO ESTE CÓDIGO
SEJA DIFERENTE DO CÓDIGO ARMAZENADO INTERNAMENTE O PROGRAMA DEVE APRESENTAR A MENSAGEM
“USUÁRIO INVÁLIDO!”. CASO O CÓDIGO SEJA CORRETO, DEVE SER LIDO A SENHA. SE ESTA SENHA ESTIVER
INCORRETA O PROGRAMA DEVE MOSTRAR A MENSAGEM “SENHA INCORRETA!”. CASO A SENHA ESTEJA
CORRETA, DEVE SER MOSTRADA A MENSAGEM “ACESSO PERMITIDO!”.
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
			System.out.print("USUÁRIO INVÁLIDO!");
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
