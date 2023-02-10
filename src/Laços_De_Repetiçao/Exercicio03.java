package Laços_De_Repetiçao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num,contMenor=0,contMaior=0;
		
		System.out.println("\nDigite uma idade: ");
		num = leia.nextInt();
		

		while(num>0) {
		
			System.out.println("Digite a idade: ");
            num = leia.nextInt();
            if(num < 21) {
                contMenor++;
            } 
            if(num > 50) {
                contMaior++;
            }
        }

        System.out.println("Total de pessoas menores de 21: " + contMenor);
        System.out.println("Total de pessoas maiores de 50: " + contMaior);
    }

}


