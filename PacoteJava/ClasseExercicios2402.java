package PacoteJava;

import java.util.Scanner;

/*Exercicio 03. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em
 * segundos e mostre-o expresso em horas, minutos e segundos.*/

public class ClasseExercicios2402 {
	public static void main(String[] args){
		
		int horas,minutos,segundos;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Qual a dura��o do evento em segundos: ");
			segundos = ler.nextInt();
		}
			
		minutos = segundos/60;
		horas = minutos/60;
		
		System.out.printf("O evento possu�: %d hora(s), %d minuto(s) e %d segundo(s).",horas,minutos,segundos);
		
	}

}
