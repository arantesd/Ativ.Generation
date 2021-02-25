package LacosCondicionais;

/*Exercicio 01-Faça um programa que receba três inteiros e diga qual deles é o maior.*/

import java.util.Scanner;

public class Exercicio2502 {
	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Digite o primeiro número: ");
			num1 = ler.nextInt();
			System.out.print("Digite o segundo número: ");
			num2 = ler.nextInt();
			System.out.print("Digite o terceito número: ");
			num3 = ler.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.printf("O número maior é: %d",num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.printf("O número maior é: %d",num2);	
		}
		
		else
		{
			System.out.printf("O número maior é: %d",num3);	
		}
		
		}
	}	
}	