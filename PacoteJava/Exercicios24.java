package PacoteJava;

import java.util.Scanner;

/*Exercic�o 7. Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os
 **valores de x e y.*/

public class Exercicios24 {
	public static void main(String[] args) {
		
		float a,b,c,d,e,f,x,y;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Digite o valor de a: ");
			a = ler.nextFloat();
			System.out.print("Digite o valor de b: ");
			b = ler.nextFloat();
			System.out.print("Digite o valor de c: ");
			c = ler.nextFloat();
			System.out.print("Digite o valor de d: ");
			d = ler.nextFloat();
			System.out.print("Digite o valor de e: ");
			e = ler.nextFloat();
			System.out.print("Digite o valor de f: ");	
			f = ler.nextFloat();
		
			x = (c*e-b*f)/(a*e-b*d);
			y = (a*f-c*d)/(a*e-b*d);
			
			
		/*if ((a*e-b*d) ==0) {
			System.out.println("Equa��o n�o existe, pois o divisor � igual a zero.");
		}else {*/
			System.out.print("O valor de x � "+x);
			System.out.print("\nO valor de y � "+y);
			
		//}
	}
	}	
}
