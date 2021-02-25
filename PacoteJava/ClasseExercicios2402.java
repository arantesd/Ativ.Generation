package PacoteJava;

import java.util.Scanner;

/*Exercicio 03. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em
 * segundos e mostre-o expresso em horas, minutos e segundos.*/

public class ClasseExercicios2402 {
	public static void main(String[] args){
		
		int horas,minutos,segundos;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Qual a duração do evento em segundos: ");
			segundos = ler.nextInt();
		}
			
		minutos = segundos/60;
		horas = minutos/60;
		
		System.out.printf("O evento possuí: %d hora(s), %d minuto(s) e %d segundo(s).",horas,minutos,segundos);
		
	}

}
