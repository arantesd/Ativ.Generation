package Polimorfismo;

public class Preguica extends Animal { //subclasse

	public Preguica() {
		super("Cachorro");
	}
	//implemento métodos abstratos
		@Override 
		public void Nome(String nomeAnimal) {
			System.out.println("Nome do bicho preguiça: "+nomeAnimal);
		}
		@Override//sobrescrever um método com a mesma assinatura
		public void Idade(int idadeAnimal) {
			System.out.println("Idade: "+idadeAnimal);	//sobrepor
		}
		@Override
		public void Som(String somAnimal) {
			System.out.println("O som que o bicho preguiça emite: "+somAnimal);
		}
		public void SubirArvores() {
			System.out.println("Uma das caracteristicas do bicho preguica é subir em árvores!");
		}
		public void infoPreguica() {
			
		}

}
