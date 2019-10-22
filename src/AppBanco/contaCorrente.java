package AppBanco;

public class contaCorrente extends contaBancaria {
	
	private double taxaDeOperacao = 0.05;
	
	//add the constructor
	public contaCorrente(long numeroConta, double saldo, double taxaDeOperacao) {
		super(numeroConta, saldo);
		// TODO Auto-generated constructor stub
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
		//não sei se está certo esse cálculo. I don't know if it is right this measure.
		setSaldo(getSaldo() - (valor + (taxaDeOperacao*valor)));
	}
	
	public void depositar (double valor) {
		//não sei se está certo esse cálculo. I don't know if it is right this measure.
		setSaldo(getSaldo() + (valor - (taxaDeOperacao*valor)));
	}
}
