package AppBanco;

public class ContaCorrente extends ContaBancaria {
	
	private double taxaDeOperacao;
	
	//add the constructor
	public ContaCorrente(long numeroConta, double saldo, double taxaDeOperacao) {	
		// TODO Verify the tax of operation
		super (numeroConta, saldo);
	}
	//getters and setters
	public double getTaxaDeOperacao() {
		return taxaDeOperacao;
	}	

	public void setTaxaDeOperacao(double taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}
	
	// Override of methods from ContaBancaria
	@Override
	public void sacar (double valor) {
		//n�o sei se est� certo esse c�lculo. I don't know if it is right this measure.
		setSaldo(getSaldo() - (valor + (taxaDeOperacao*valor)));
	}
	
	public void depositar (double valor) {
		//n�o sei se est� certo esse c�lculo. I don't know if it is right this measure.
		setSaldo(getSaldo() + (valor - (taxaDeOperacao*valor)));
	}

	@Override
	public void mostrarDados() {
		System.out.println(getNumeroConta() + "\t" +
				getSaldo() + "\t"); 		
	}
}
