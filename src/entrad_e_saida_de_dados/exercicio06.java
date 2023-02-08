package entrad_e_saida_de_dados;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double x1,x2,y1,y2,Resultado,Soma;
		
		System.out.println("\nDigite o valor de x1");
		x1 = leia.nextDouble();
		System.out.println("\nDigite o valor de x2");
		x2 = leia.nextDouble();
		System.out.println("\nDigite o valor de y1");
		y1 = leia.nextDouble();
		System.out.println("\nDigite o valor de y2");
		y2 = leia.nextDouble();
		
		Soma = Math.pow((x2-x1),2) + Math.pow((y1-y2),2);
		Resultado = Math.sqrt(Soma);
		
		System.out.printf("\nO resultado é: %.2f",Resultado);
		
		
	}

}
