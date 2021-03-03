package POO;

public class salarioFuncionario {
	public static void main(String[] args) {
		
		funcionario a = new funcionario("Maria Lucia",90,(float) 4.50);
		System.out.println("Funcionário A: ");
		a.entrada();
		
		funcionario b = new funcionario("Gustavo Silva",140,7);
		System.out.println("\nFuncionário B: ");
		b.entrada();
		
		funcionario c = new funcionario("Mario César",135,(float) 6.50);
		System.out.println("\nFuncionário C: ");
		c.setHt(133);
		c.entrada();
	}

}
