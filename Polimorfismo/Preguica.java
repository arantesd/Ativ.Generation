package Polimorfismo;

public class Preguica extends Animal { //subclasse

	public Preguica() {
		super("Cachorro");
	}
	//implemento m�todos abstratos
		@Override 
		public void Nome(String nomeAnimal) {
			System.out.println("Nome do bicho pregui�a: "+nomeAnimal);
		}
		@Override//sobrescrever um m�todo com a mesma assinatura
		public void Idade(int idadeAnimal) {
			System.out.println("Idade: "+idadeAnimal);	//sobrepor
		}
		@Override
		public void Som(String somAnimal) {
			System.out.println("O som que o bicho pregui�a emite: "+somAnimal);
		}
		public void SubirArvores() {
			System.out.println("Uma das caracteristicas do bicho preguica � subir em �rvores!");
		}
		public void infoPreguica() {
			
		}

}
