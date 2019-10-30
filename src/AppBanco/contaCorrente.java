package AppBanco;

public class ContaCorrente extends ContaBancaria {
	
	private double taxaDeOperacao = 0.05;
	
	//add the constructor
	public ContaCorrente(long numeroConta, double saldo, double taxaDeOperacao) {
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
	
	// Override of methods from ContaBancaria
	@Override
	public void sacar (double valor) {
		//não sei se está certo esse cálculo. I don't know if it is right this measure.
		setSaldo(getSaldo() - (valor + (taxaDeOperacao*valor)));
	}
	
	public void depositar (double valor) {
		//não sei se está certo esse cálculo. I don't know if it is right this measure.
		setSaldo(getSaldo() + (valor - (taxaDeOperacao*valor)));
	}

	@Override
	public void mostrarDados() {
		System.out.println(getNumeroConta() + "\t" +
				getSaldo() + "\t"); 		
	}
}
