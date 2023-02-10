package Laços_Condicionais;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Float num1,num2,resultado;
		int cod;
		
		System.out.println("\nDigite o primeiro número");
		num1 = leia.nextFloat();
		System.out.println("\nDigite o segundo número");
		num2 = leia.nextFloat();
		System.out.println("\nCodigo 1 - Soma");
		System.out.println("\nCodigo 2 - Subtração");
		System.out.println("\nCodigo 3 - Multiplicação");
		System.out.println("\nCodigo 4 - Divisão");
		System.out.println("\nDigite o códiga da operação desejada");
		cod = leia.nextInt();
		
		switch(cod) {
		case 1:
			System.out.printf("\nO resultado da operação é: %.2f", (num1+num2));
		break;
		case 2:
			System.out.printf("\nO resultado da operação é: %.2f",(num1-num2));
			break;
		case 3:
			System.out.printf("\nO resultado da operação é: %.2f",(num1*num2));
			break;
		case 4:
			System.out.printf("\nO resultado da operação é: %.2f",(num1/num2));
			break;
			default:
				System.out.println("\nOperação inválida.");
		}
		
		
		
		
		
	}

}
