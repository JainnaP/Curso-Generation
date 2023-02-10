package Laços_Condicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean res; 
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do doador: ");
		nome = leia.nextLine();
		System.out.println("\nOlá "+nome+" quantos anos você tem?");
		idade = leia.nextInt();
		System.out.println("\n"+nome+" é sua primeira doação de sangue?");
		res = leia.nextBoolean();
		
		if (idade>=18 && idade<60) {
			System.out.println("\n"+nome+" está apto para doar sangue! ");
			
		}
		else if (idade>=60 && idade<=69 ){
			if (res==false) {
				System.out.println("\n+"+nome+" está apto para doar sangue!");
				
			}
			else {
				System.out.println("\n"+nome+ " Não está apto para doar sangue!");
				
			}
			
			
			
		}
		else   {
			System.out.println("\n"+nome+" Não está apto para doar sangue! ");
		}
		
		
		
		
	}

}
