package POO;

/*Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
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
		System.out.println("O(a) funcionário(a) "+nome+" trabalhou messe mês "+ht+" horas. Seu salário será no valor de R$ "+(ht*vls));
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
