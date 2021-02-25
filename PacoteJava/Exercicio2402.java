package PacoteJava;

import java.util.Scanner;

/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
 * aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/

public class Exercicio2402 {
	public static void main(String[] args){
		
		int nota1,nota2,nota3,media;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Qual a primeira nota? ");
			nota1 = ler.nextInt();
			System.out.print("Qual a segunda nota? ");
			nota2 = ler.nextInt();
			System.out.print("Qual a terceira nota? ");
			nota3 = ler.nextInt();
			
			media = (int) ((nota1*0.2)+(nota2*0.3)+(nota3*0.5));
			System.out.printf("A média final é de %d",media);
		}		
	}

}
