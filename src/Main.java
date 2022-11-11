
public class Main {
	
	public static void main(String[] args) {
		Cliente Lucas = new Cliente();
		Lucas.SetNome("Lucas");
		
		Conta cc = new ContaCorrente(Lucas);
		cc.depositar(100);
	
		
		Conta poupanca = new ContaPoupança(Lucas);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
