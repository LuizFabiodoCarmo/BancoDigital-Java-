package bancojava;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtratro() {
       System.out.println("=== Extrato Conta Poupança ===");
       super.imprimirInfosComuns();
       
	}

}
