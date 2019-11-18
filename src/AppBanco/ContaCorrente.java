package AppBanco;

public class ContaCorrente extends ContaBancaria {
	
	private double taxaDeOperacao;
	
	//add the constructor
	public ContaCorrente(long numeroConta, double saldo, double taxaDeOperacao) {	
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
		//nao sei se esta certo esse calculo. I don't know if it is right this measure.
		setSaldo(getSaldo() - (valor + (taxaDeOperacao*valor)));
	}
	
	public void depositar (double valor) {
		//nao sei se esta certo esse calculo. I don't know if it is right this measure.
		setSaldo(getSaldo() + (valor - (taxaDeOperacao*valor)));
	}

	@Override
	public void mostrarDados() {

		String numeroConta = "Conta: " + getNumeroConta();
		String saldo = "Saldo: R$ " + getSaldo();
		String taxaDeOperacao = "Taxa: " + getTaxaDeOperacao(); 
	}
}
