
public class Main {
	
	public static void main(String[] args) {
		
		Cliente kerrison = new Cliente();
		kerrison.setNome("Kerrison");
		
		Cliente maiky = new Cliente();
		maiky.setNome("Maiky");
		
		
		Conta cc = new ContaCorrente(kerrison);
		Conta cp = new ContaPoupanca(maiky);
		
		
		
		cc.depositar(500);
		cp.transferir(200, cc);
		cc.sacar(50);
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
