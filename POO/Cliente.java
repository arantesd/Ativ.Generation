package POO;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {
	private String nome;
	private String produto;
	private int qtd;
	private float valor;
	
	public Cliente(String nome,int qtd,String produto,float valor) {
		this.nome = nome;
		this.produto = produto;
		this.qtd = qtd;
		this.valor = valor;
	}

	public void ler() {
		System.out.println(nome+" comprou "+qtd+" "+produto+" no valor de R$ "+valor+" a únidade. Valor total da compra foi de R$ "+(qtd*valor));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
}
