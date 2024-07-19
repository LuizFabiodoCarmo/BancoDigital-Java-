package bancojava;

public class ContaPoupanca extends Conta {
	@Override
	public void imprimirExtratro() {
       System.out.println("=== Extrato Conta Poupança ===");
       super.imprimirInfosComuns();
       
	}

}
