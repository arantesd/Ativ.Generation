package LacosCondicionais;

/*Exercicio 01-Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

import java.util.Scanner;

public class Exercicio2502 {
	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Digite o primeiro n�mero: ");
			num1 = ler.nextInt();
			System.out.print("Digite o segundo n�mero: ");
			num2 = ler.nextInt();
			System.out.print("Digite o terceito n�mero: ");
			num3 = ler.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.printf("O n�mero maior �: %d",num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.printf("O n�mero maior �: %d",num2);	
		}
		
		else
		{
			System.out.printf("O n�mero maior �: %d",num3);	
		}
		
		}
	}	
}	