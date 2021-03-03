package Heranca;

public class TesteHeranca {
	public static void main(String[] args) {
		Empregado f1 = new Empregado(null, null, null, 45, 2900, 0, 0);
		Empregado f2 = new Empregado(null, null, "111.222.333-44", 51, 3000, 0, 0);
		Empregado f3 = new Empregado("Gustavo Dias", "Av.Paulista, nº 01", null, 19, 3200, 0, 0);
		f1.setNome("Claudio dos Santos");
		f2.setNome("André Aguiar");
		
		System.out.println("\nFuncionário(a) código "+f1.getCodigoSetor()+" nome: "+f1.getNome()+" teve desconto de imposto FGTS no valor de "+f1.getImposto()+" seu salário líquido será no valor de R$ "+f1.getCalcularSalario());
		System.out.println("\nFuncionário(a) portador(a) do CPF "+f2.getCpf()+" nome: "+f2.getNome()+" teve desconto de imposto FGTS no valor de "+f2.getImposto()+" seu salário líquido será no valor de R$ "+f2.getCalcularSalario());
		System.out.println("\nFuncionário(a) residente em "+f3.getEndereco()+" nome: "+f3.getNome()+" código "+f3.getCodigoSetor()+" teve desconto de imposto FGTS no valor de "+f3.getImposto()+" seu salário líquido será no valor de R$ "+f3.getCalcularSalario());

	}

}
