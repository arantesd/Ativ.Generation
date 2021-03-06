package Collection;

import java.util.ArrayList;
import java.util.Collection;

/* Exercicio 03. Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades: Armazenar dados da List - Remover dados da list; - 
Atualizar dados da list. - Apresentar todos os dados da list.*/

public class Loja {
	public static void main(String[] args) { //Executar uma coleção
		Collection <String> produto = new ArrayList<String>(); //criação List tipo Array
		
		//Adicionando elementos dentro Arraylist
		produto.add("Blusa");
		produto.add("Calça");
		produto.add("Short");
		produto.add("Jaqueta");
		produto.add("Vestido");
		
		System.out.println("Lista de produtos em estoque: "+produto);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Removendo produtos do estoque... Calça e Vestido");
		produto.remove("Calça");
		produto.remove("Vestido");
		System.out.println("----------------------------------------------------------------------");
		
		for(String ProdutoElementos: produto) {//saber se o produto foi realmente deletado
			System.out.println(ProdutoElementos);
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Lista de produtos em estoque atualizada: "+produto);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Contém o produto Sapato? "+produto.contains("Sapato"));
		System.out.println("Contém o produto Short? "+produto.contains("Short"));
	}
}


