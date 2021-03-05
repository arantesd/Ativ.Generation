package Polimorfismo;


public abstract class Animal { // Cria��o da superclasse abstrata.
	
	private String TipoAnimal; // Atributos animal
	
	public Animal(String TipoAnimal) {
		this.TipoAnimal = TipoAnimal;
	}
	//M�todos abstrados animal
	abstract public void Nome(String nomeAnimal); 
	abstract public void Idade(int idadeAnimal);
	abstract public void Som(String somAnimal);
	
	public String getTipoAnimal() {
		return TipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}
	
}
