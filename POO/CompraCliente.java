package POO;

public class CompraCliente {
	public static void main(String[] args) {
		Cliente venda = new Cliente("Ana",5,"meias",50);
		
		System.out.println("Venda 01: ");
		venda.ler();
		
		Cliente venda2 = new Cliente("João",2,"calças",250);
		System.out.println("\nVenda 02: ");
		venda2.setQtd(4);
		venda2.ler();
	}

}
