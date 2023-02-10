package Laços_De_Repetiçao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1,num2,contador;
		
		System.out.println("\nDigite um número: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite outro número: ");
		num2 = leia.nextInt();
		
		if (num1<num2) {
			for(contador=num1;contador<=num2;contador++) {
				if (contador%3==0 && contador%5==0){
					System.out.println("\n"+contador+" é múltiplo de 3 e 5");
				}
			}
			
		}
		
		else {
			System.out.println("\nIntervalo inválido");
		}	
		
				
	}

}
