package LacosDeRepeticao;

import java.util.Scanner;

/*Exercicio 05 -Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros digitados.*/

public class Ex2602 {
	public static void main(String[] args) {
	
		int num,soma=0,cont=0;
				
		do {
			Scanner ler = new Scanner(System.in);
			System.out.printf("Digite o n�mero: ");
			num = ler.nextInt();
			soma = soma+num;
			cont++;
		}
		while(num!=0);
			{
				
			}
			System.out.printf("\nForam digitados %d n�meros. A soma dos n�meros digitados � de: %d",cont,soma);
	}
}
