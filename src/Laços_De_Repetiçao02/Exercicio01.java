package Laços_De_Repetiçao02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.		
		
		Scanner leia = new Scanner(System.in);
		int x;
		
		
		for (x=1000; x < 2000; x++){
		    if (x%11==5) {
		        System.out.println(x);
		    }
		}
		
		
	}

}
