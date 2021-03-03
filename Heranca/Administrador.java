package Heranca;

/*Ecercicio 04. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias).*/

public class Administrador extends Pessoa {
	
	private String viagem;
	private String data;
	private float custoViagem;
	private float ajudaDeCusto;
	
	public Administrador(String nome, String endereco,String cpf,String viagem, String data, float custoViagem, float ajudaDeCusto) {
		super(nome,endereco,cpf);
		this.viagem = viagem;
		this.data = data;
		this.custoViagem = custoViagem;
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public String getViagem() {
		return viagem;
	}

	public void setViagem(String viagem) {
		this.viagem = viagem;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public float getCustoViagem() {
		return custoViagem;
	}

	public void setCustoViagem(float custoViagem) {
		this.custoViagem = custoViagem;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto = ((custoViagem*10)/100+custoViagem);
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
}
