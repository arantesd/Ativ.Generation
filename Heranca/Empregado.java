package Heranca;

/*Exercicio  03. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
inst�ncia da classe Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa,
os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
retida dos impostos). Implemente a classe Empregado com m�todos seletores e modificadores
e um m�todo calcularSalario. Escreva um programa de teste adequado para a classe
Empregado.*/

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	private float calcularSalario;
	
	public Empregado(String nome, String endereco,String cpf,int codigoSetor, float salarioBase, float imposto, float calcularSalario) {
		super(nome,endereco,cpf);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		this.calcularSalario = calcularSalario;
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto = ((salarioBase*8)/100);
	}
	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	public float getCalcularSalario() {
		return calcularSalario = (salarioBase-imposto);
	}
	public void setCalcularSalario(float calcularSalario) {
		this.calcularSalario = calcularSalario;
	}
}
