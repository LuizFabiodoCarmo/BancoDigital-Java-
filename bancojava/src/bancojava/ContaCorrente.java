package bancojava;

public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtratro() {
       System.out.println("=== Extrato Conta Corrente ===");
       super.imprimirInfosComuns();
       
	}
	
}
