package Laços_Condicionais;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		double valor,salario;
		int cod;
		
		System.out.println("\nOlá, qual o seu nome?");
		nome = leia.nextLine();
		System.out.println("\nOi "+nome+" por favor digite seu salário:");
		salario = leia.nextDouble();
		System.out.println("\nCodigo 1 - Gerente");
		System.out.println("\nCodigo 2 - Vendedor");
		System.out.println("\nCodigo 3 - Supervisor");
		System.out.println("\nCodigo 4 - Motorista");
		System.out.println("\nCodigo 5 - Estoquista");
		System.out.println("\nCodigo 6 - Técnico de TI");
		System.out.println("\nDigite o código que corresponde ao seu cargo: ");
		cod = leia.nextInt();
		
		
		switch(cod) {
		case 1:
			valor = (salario *10)/100;
			System.out.printf("\nSeu novo salário é: %.2f", (salario+valor));
		break;
		case 2:
			valor = (salario*7)/100;
			System.out.printf("\nSeu novo salário é: %.2f",(salario+valor));
			break;
		case 3:
			valor = (salario*9)/100;
			System.out.printf("\nSeu novo salário é: %.2f",(salario+valor));
			break;
		case 4:
			valor = (salario*6)/100;
			System.out.printf("\nSeu novo salário é: %.2f",(salario+valor));
			break;
		case 5:
			valor = (salario*5)/100;
			System.out.printf("\nSeu novo salário é: %.2f",(salario+valor));
			break;
		case 6:
			valor = (salario*8)/100;
			System.out.printf("\nSeu novo salário é: %.2f",(salario+valor));
			break;
			default:
				System.out.println("\nPor favor selecione uma opção válida.");
		
		
		}
	}

}
