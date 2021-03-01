package Arrays;

import java.util.Scanner;

/*Exercicio 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

public class Ex0103 {
	public static void main(String[] args) {
		
		float num[][] = new float [3][3],cont=0;
		
		Scanner ler = new Scanner(System.in);
		for(int l=0;l<3;l++) 
		{
			for(int c=0;c<3;c++)
			{
				System.out.println("Entre com o valor: ");
				num[l][c] = ler.nextFloat();
				
			}
		}
		for(int l=0;l<3;l++) 
		{
			for(int c=0;c<3;c++)
			{
				if(num[l][c]>10)
				{
				System.out.printf("\nOs números maiores que 10 são: %f",num[l][c]);	
				}
			}
				}
		}

	}