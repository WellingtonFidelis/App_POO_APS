package AppBanco;

public class ContaCorrente extends ContaBancaria {
	
	private double taxaDeOperacao = 0.05;
	
	//add the constructor
	public ContaCorrente(long numeroConta, double saldo) {
		super(numeroConta, saldo);
		// TODO Verify the tax of operation
	}
	
	//getters and setters
	public double getTaxaDeOperacao() {
		return taxaDeOperacao;
	}	

	public void setTaxaDeOperacao(double taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}
	
	// Override of methods from contaBancaria
	@Override
	public void sacar (double valor) {
		//n�o sei se est� certo esse c�lculo. I don't know if it is right this measure.
		setSaldo(getSaldo() - (valor + (taxaDeOperacao*valor)));
	}
	
	public void depositar (double valor) {
		//n�o sei se est� certo esse c�lculo. I don't know if it is right this measure.
		setSaldo(getSaldo() + (valor - (taxaDeOperacao*valor)));
	}
}
