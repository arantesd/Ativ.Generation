package Arrays;

import java.util.Scanner;

/*Exercicio 02- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados; • A soma dos números pares digitados;
• Os números ímpares digitados; • A quantidade de números ímpares digitados.*/

public class Exercicio0103 {
	public static void main(String[] args) {
		
		int num[] = new int [6],somapar=0,qtdimpar=0;
		try (Scanner ler = new Scanner(System.in)) {
			for(int x=0;x<6;x++)
			{
				System.out.println("\nDigite o número: ");
				num[x] = ler.nextInt();
			
				if(num[x]%2==0) 
				{
					somapar = somapar + num[x];
					System.out.println("Esse número é par.");
				}
				else
				{
					qtdimpar++;
					System.out.println("Esse número é ímpar.");
				}
			}
		}
		System.out.printf("\nA soma dos números pares é: %d",somapar);
		System.out.printf("\nA quantidade de números ímpares digitados foi de: %d",qtdimpar);
	}

}
