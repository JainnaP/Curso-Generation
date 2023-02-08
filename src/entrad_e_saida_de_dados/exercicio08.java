package entrad_e_saida_de_dados;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float custoC,impostos,distri,custoF;
		
		System.out.println("\nEscreva o custo para a fábrica:");
		custoF = leia.nextFloat();
		
		impostos = (custoF*45) / 100;
		distri = (custoF*28) / 100;
		custoC = impostos + distri + custoF;
		
		System.out.printf("\nO custa para o consumidor é: %.2f",custoC);
		
		
		
	}

}
