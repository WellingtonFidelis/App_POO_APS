package AppBanco;

<<<<<<< HEAD:src/AppBanco/ContaPoupanca.java
public class ContaPoupanca extends ContaBancaria {
=======
public class ContaPoupanÁa extends ContaBancaria {
>>>>>>> ddcc16e857ff558b13474e7035b40471c61b5ad6:src/AppBanco/contaPoupan√ßa.java
	
	private double limite;

	//add the constructor
<<<<<<< HEAD:src/AppBanco/ContaPoupanca.java
	public ContaPoupanca(long numeroConta, double saldo, double limite) {
=======
	public ContaPoupanÁa(long numeroConta, double saldo, double limite) {
>>>>>>> ddcc16e857ff558b13474e7035b40471c61b5ad6:src/AppBanco/contaPoupan√ßa.java
		super(numeroConta, saldo);
		// TODO Auto-generated constructor stub
	}
	
	//getters and setters
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//Override of methods from ContaBancaria
	@Override
	public void sacar(double valor) {
		if (valor < getSaldo()) {
			setSaldo(getSaldo() - valor);
		}else if (valor < limite) {
			limite = limite - valor;
		}
	}

	@Override
	public void mostrarDados() {
		System.out.println(getNumeroConta() + "\t" +
				getSaldo() + "\t" +
				getLimite()); 

	}
}
