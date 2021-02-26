package LacosDeRepeticao;
/*Exercicio 03 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
*21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/

import java.util.Scanner;

public class Exercicio26 {
		public static void main(String[] args)	{
			
		int idade,cont=0,cont2=0;
			
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Digite a idade: ");
			idade = ler.nextInt();
					
			while(idade!=-99) 
			{
				if(idade<=21) {
					cont++;
				}
				else if(idade>=50) {
				cont2++;
				}
				
				System.out.print("\nDigite a idade: ");
				idade = ler.nextInt();
			}
		}
		System.out.printf("\nA quantidade pessoas que possuem menos de 21 anos é de: %d",cont);
		System.out.printf("\nA quantidade pessoas que possuem mais de 50 anos é de: %d",cont2);
	}

}

