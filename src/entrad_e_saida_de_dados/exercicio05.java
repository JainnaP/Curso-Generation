package entrad_e_saida_de_dados;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double n1,n2,n3,total;
		
		System.out.println("\nDigite sua primeira nota.");
		n1 = leia.nextDouble();
		System.out.println("\nDigite sua segunda nota.");
		n2 = leia.nextDouble();
		System.out.println("\nDigite sua terceira nota.");
		n3 = leia.nextDouble();
		
		total = (n1*0.2) + (n2*0.3) + (n3*0.5);
		
		System.out.printf("\nSua média final é: %.1f",total);
		
	}

}
