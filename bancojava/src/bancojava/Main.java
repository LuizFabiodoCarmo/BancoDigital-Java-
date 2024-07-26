package bancojava;

public class Main {

	public static void main(String[] args) {
		Cliente luiz = new Cliente();
		luiz.setNome("Luiz");
		
		
		Conta cc = new ContaCorrente(luiz);
		cc.depositar(150);
		
		Conta cp = new ContaPoupanca(luiz);
		cp.depositar(300);
		
		cc.transferir(100, cp);
		
		cc.imprimirExtratro();
		cp.imprimirExtratro();
		
		
			
	}
}
