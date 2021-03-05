package Polimorfismo;

public class Cachorro extends Animal { //subclasse
	
	public Cachorro() {
	super("Cachorro");
	}
	//implemento métodos abstratos
	@Override //
	public void Nome(String nomeAnimal) {
		System.out.println("Nome do cachorro: "+nomeAnimal);
	}
	@Override //sobrescrever um método com a mesma assinatura
	public void Idade(int idadeAnimal) {
		System.out.println("Idade: "+idadeAnimal);	//sobrepor
	}
	@Override
	public void Som(String somAnimal) {
		System.out.println("O som que o cachorro emite: "+somAnimal);
	}
	public void Corre() {
		System.out.println("Uma das caracteristicas do cachorro é correr!");
	}
	
}
