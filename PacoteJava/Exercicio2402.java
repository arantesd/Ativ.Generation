package PacoteJava;

import java.util.Scanner;

/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
 * aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.*/

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
			System.out.printf("A m�dia final � de %d",media);
		}		
	}

}
