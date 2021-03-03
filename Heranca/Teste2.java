package Heranca;

public class Teste2 {
	public static void main(String[] args) {
		
		Administrador a1 = new Administrador("Roberto Castilho", null, "456.987.581-44", "Minas Gerais", "12.12.2020", 450.50f, 0);
		Administrador b1 = new Administrador("Josiane Araujo", null, "482.847.951-27","Fortaleza", "02.01.2021", 780.79f, 0);
		Administrador c1 = new Administrador("Barbara Novaes", "Av. Ipiranga", null, "Bahia", null, 699.99f, 0);
		a1.setEndereco("Rua Borba Gato");
		b1.setEndereco("Rua Bela Vista");
		c1.setCpf("748.984.985-70");
		c1.setData("01.12.2020");
		
		System.out.println("\nReembolso para o administrador(a) "+a1.getNome()+" residente em "+a1.getEndereco()+" referente a viagem em "+a1.getData()+
		" para a unidade do estado de "+a1.getViagem()+". O valor da ajuda de custo será de R$ "+a1.getAjudaDeCusto());
		
		System.out.println("\nReembolso para o administrador(a) "+b1.getNome()+" referente a viagem em "+b1.getData()+" para a unidade do estado de "+
		b1.getViagem()+". O valor da ajuda de custo será de R$ "+b1.getAjudaDeCusto());
		
		System.out.println("\nReembolso para o administrador(a) "+c1.getNome()+" portador (a) do CPF: "+c1.getCpf()+" referente a viagem em "+c1.getData()+
		" para a unidade do estado de "+c1.getViagem()+". O valor da ajuda de custo será de R$ "+c1.getAjudaDeCusto());
		
	}

}

