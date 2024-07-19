package bancojava;

public class ContaCorrente extends Conta {
	@Override
	public void imprimirExtratro() {
       System.out.println("=== Extrato Conta Corrente ===");
       super.imprimirInfosComuns();
       
	}
	
}
