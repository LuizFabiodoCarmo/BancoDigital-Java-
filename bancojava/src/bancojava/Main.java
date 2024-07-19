package bancojava;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(150);
		
		Conta cp = new ContaPoupanca();
		cp.depositar(300);
		
		cc.transferir(100, cp);
		
		cc.imprimirExtratro();
		cp.imprimirExtratro();
	}
}
