/*
UM POSTO DE COMBUST�VEL EST� VENDENDO SEUS COMBUST�VEIS COM A SEGUINTE TABELA DE
DESCONTOS:

		�LCOOL AT� 20 LITROS, DESCONTO DE 3% POR LITRO
		ACIMA DE 20 LITROS, DESCONTO DE 5% POR LITRO
		
		GASOLINA AT� 20 LITROS, DESCONTO DE 4% POR LITRO
		ACIMA DE 20 LITROS, DESCONTO DE 6% POR LITRO
		
DESENVOLVA UM PROGRAMA QUE LEIA O N�MERO DE LITROS VENDIDOS E O TIPO DE COMBUST�VEL
(CODIFICADO DA SEGUINTE FORMA: 1 -> �LCOOL, 2 -> GASOLINA), CALCULE E IMPRIMA O VALOR A SER PAGO
PELO CLIENTE SABENDO-SE QUE O PRE�O DO LITRO DA GASOLINA � R$ 6,90 E O PRE�O DO LITRO DO �LCOOL
� R$ 6,20.
 */

package listaCondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.print("Tipo do combustivel (1 -> �LCOOL, 2 -> GASOLINA): ");
		int combustivel = teclado.nextInt();
		
		System.out.print("Quantidade em Litros: ");
		int litros = teclado.nextInt();
		
		double valorASerPago = 0;
		double precoLitro = 0;
		
		switch(combustivel) {
		
			case 1:
				if(litros <= 20) {
					precoLitro = 6.20 - ((6.20/100) * 3);
				} else {
					precoLitro = 6.20 - ((6.20/100) * 5);
				}
				
			case 2:
				if(litros <= 20) {
					precoLitro = 6.90 - ((6.20/100) * 4);
				} else {
					precoLitro = 6.90 - ((6.20/100) * 6);
				}
				
		}
		
		valorASerPago = (precoLitro * litros);
		System.out.print("valor a ser pago: " + formatador.format(valorASerPago));
	}
}
