package Laços_De_Repetiçao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;
        int qtd=0; 
        int media=0; 
        int p1=0; 
        
        do {
            System.out.println("Digite um número:");
            n = leia.nextInt();
            
            if(n%3==0 && n!=0) {
                p1+=n;
                qtd++;
            }
            
        }while(n!=0);
        media = p1/qtd;
        
        System.out.printf("A média de todos os números múltiplos de 3 é: %.2f",media);
	}

}
