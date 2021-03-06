package Collection;

import java.util.ArrayList;
import java.util.Collection;

/* Exercicio 03. Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades: Armazenar dados da List - Remover dados da list; - 
Atualizar dados da list. - Apresentar todos os dados da list.*/

public class Loja {
	public static void main(String[] args) { //Executar uma cole��o
		Collection <String> produto = new ArrayList<String>(); //cria��o List tipo Array
		
		//Adicionando elementos dentro Arraylist
		produto.add("Blusa");
		produto.add("Cal�a");
		produto.add("Short");
		produto.add("Jaqueta");
		produto.add("Vestido");
		
		System.out.println("Lista de produtos em estoque: "+produto);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Removendo produtos do estoque... Cal�a e Vestido");
		produto.remove("Cal�a");
		produto.remove("Vestido");
		System.out.println("----------------------------------------------------------------------");
		
		for(String ProdutoElementos: produto) {//saber se o produto foi realmente deletado
			System.out.println(ProdutoElementos);
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Lista de produtos em estoque atualizada: "+produto);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Cont�m o produto Sapato? "+produto.contains("Sapato"));
		System.out.println("Cont�m o produto Short? "+produto.contains("Short"));
	}
}


