package Polimorfismo;

public class Cavalo extends Animal { //subclasse

	public Cavalo() {
		super("Cachorro");
	}
	//implemento métodos abstratos
		@Override 
		public void Nome(String nomeAnimal) {
			System.out.println("Nome do cavalo: "+nomeAnimal);
		}
		@Override//sobrescrever um método com a mesma assinatura
		public void Idade(int idadeAnimal) {
			System.out.println("Idade: "+idadeAnimal);	//sobrepor
		}
		@Override
		public void Som(String somAnimal) {
			System.out.println("O som que o cavalo emite: "+somAnimal);
		}
		public void Corre() {
			System.out.println("Uma das caracteristicas do cavalo é correr!");
		}
}
