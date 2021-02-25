package LacosCondicionais;

/*Exercicio 3 - Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra
 * 10-14 infantil / 15-17 juvenil / 18-25 adulto  */

import java.util.*;

public class Ex2502 {
	public static void main(String[] args) {
		
		int idade;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Qual a idade: ");
			idade = ler.nextInt();
		}
		if(idade>=10 && idade<=14)
		{
			System.out.print("Essa pessoa pertence a categoria infantil.");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.print("Essa pessoa pertence a categoria juvenil.");	
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.print("Essa pessoa pertence a categoria adulto.");
		}
		else
		{
			System.out.print("Você digitou uma idade inválida.");
		}
	}
}
