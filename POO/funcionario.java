package POO;

/*Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/

public class funcionario {
	private String nome;
	private int ht;
	private float vls;

	public funcionario(String nome,int ht,float vls) {
		this.nome = nome;
		this.ht = ht;
		this.vls = vls;
	}
	public void entrada() {
		System.out.println("O(a) funcion�rio(a) "+nome+" trabalhou messe m�s "+ht+" horas. Seu sal�rio ser� no valor de R$ "+(ht*vls));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHt() {
		return ht;
	}
	public void setHt(int ht) {
		this.ht = ht;
	}
	public float getVls() {
		return vls;
	}
	public void setVls(float vls) {
		this.vls = vls;
	}
	
}
