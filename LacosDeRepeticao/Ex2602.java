package LacosDeRepeticao;

import java.util.Scanner;

/*Exercicio 05 -Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números digitados.*/

public class Ex2602 {
	public static void main(String[] args) {
	
		int num,soma=0,cont=0;
				
		do {
			Scanner ler = new Scanner(System.in);
			System.out.printf("Digite o número: ");
			num = ler.nextInt();
			soma = soma+num;
			cont++;
		}
		while(num!=0);
			{
				
			}
			System.out.printf("\nForam digitados %d números. A soma dos números digitados é de: %d",cont,soma);
	}
}
