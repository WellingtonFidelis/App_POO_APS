package AppBanco;

public class ContaCorrente extends ContaBancaria {
	
	private double taxaDeOperacao = 0.05;
	
	//add the constructor
<<<<<<< HEAD:src/AppBanco/ContaCorrente.java
	public ContaCorrente(long numeroConta, double saldo) {
=======
	public ContaCorrente(long numeroConta, double saldo, double taxaDeOperacao) {
>>>>>>> ddcc16e857ff558b13474e7035b40471c61b5ad6:src/AppBanco/contaCorrente.java
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
