package Arrays;

import java.util.Scanner;

/*Exercicio 02- Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados; � A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados; � A quantidade de n�meros �mpares digitados.*/

public class Exercicio0103 {
	public static void main(String[] args) {
		
		int num[] = new int [6],somapar=0,qtdimpar=0;
		try (Scanner ler = new Scanner(System.in)) {
			for(int x=0;x<6;x++)
			{
				System.out.println("\nDigite o n�mero: ");
				num[x] = ler.nextInt();
			
				if(num[x]%2==0) 
				{
					somapar = somapar + num[x];
					System.out.println("Esse n�mero � par.");
				}
				else
				{
					qtdimpar++;
					System.out.println("Esse n�mero � �mpar.");
				}
			}
		}
		System.out.printf("\nA soma dos n�meros pares �: %d",somapar);
		System.out.printf("\nA quantidade de n�meros �mpares digitados foi de: %d",qtdimpar);
	}

}
