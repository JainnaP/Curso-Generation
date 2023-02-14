package Laços_De_Repetiçao02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
//Escrever um programa que receba vários números inteiros no teclado.
//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)
		
		Scanner leia = new Scanner(System.in);
		int num,soma=0,divisao=0;
		
		do {
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			if(num%3==0 && num!=0) {
				soma=soma+num;
				divisao++;
			 }
		}while (num!=0);
			System.out.println("\nDigite um número: "+(soma/divisao));
		
		
	
	
	}

}
