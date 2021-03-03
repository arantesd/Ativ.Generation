package Heranca;

/*Exerc�cio 01.Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
String telefone*/

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String cpf;
	
	public Pessoa(String nome,String endereco,String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
	}
@Override	
public String toString() {
		return "[Nome: "+nome+" endere�o: "+endereco+" CPF: "+cpf+"]";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}
