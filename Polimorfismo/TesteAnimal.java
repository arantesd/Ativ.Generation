package Polimorfismo;

import java.util.Scanner;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		//inst�nciar
		Scanner ler = new Scanner (System.in); 
		Cachorro Cachorro = new Cachorro();
		Cavalo Cavalo = new Cavalo();
		Preguica Preguica = new Preguica();
		Animal Animal = null; //n�o inst�ncia
		int x=0;
		do {
		System.out.println("Qual tipo do seu animal?\n\n1 - CACHORRO | 2 - CAVALO | 3 - BICHO PREGUI�A |\n");
		x = ler.nextInt();
		if (x==1) {
			Animal = Cachorro;
			System.out.println("Qual nome do seu cachorro?");
			String nome = ler.next();
			System.out.println("Quantos anos seu cachorro tem?");
			int idade = ler.nextInt();
			System.out.println("Essa � legal! Qual som seu cachorro emite?");
			String som = ler.next();
			System.out.println("--------------------------");
			Cachorro.Nome(nome);
			Cachorro.Idade(idade);
			Cachorro.Som(som);
			Cachorro.Corre();
		}
		else if (x==2) {

			Animal = Cavalo;
			System.out.println("Qual nome do seu cavalo?");
			String nome1 = ler.next();
			System.out.println("Quantos anos seu cavalo tem?");
			int idade1 = ler.nextInt();
			System.out.println("Essa � legal! Qual som seu cavalo emite?");
			String som1 = ler.next();
			System.out.println("--------------------------");
			Cavalo.Nome(nome1);
			Cavalo.Idade(idade1);
			Cavalo.Som(som1);
			Cavalo.Corre();
		}
		else if (x==3) {

			Animal = Preguica;
			System.out.println("Qual nome do sua pregui�a?");
			String nome11 = ler.next();
			System.out.println("Quantos anos sua pregui�a tem?");
			int idade11 = ler.nextInt();
			System.out.println("Essa � legal! Qual som sua pregui�a emite?");
			String som11 = ler.next();
			System.out.println("--------------------------");
			Preguica.Nome(nome11);
			Preguica.Idade(idade11);
			Preguica.Som(som11);
			Preguica.SubirArvores();
		}else{
				System.out.println("Informa��o inv�lida!");
		}	
		}while(x<=0 || x>=4);
		
			}
	}

	
	
	
