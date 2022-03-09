package desafio.dio.Banco;

public class Main {

	public static void main(String[] args) {
		Cliente alanjoabio = new Cliente();
		alanjoabio.setNome("AlanJoabio");
		
		Conta cc = new ContaCorrente(alanjoabio);
		Conta poupanca = new ContaPoupanca(alanjoabio);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}