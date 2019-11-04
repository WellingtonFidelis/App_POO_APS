package AppBanco;

<<<<<<< HEAD:src/AppBanco/ContaBancaria.java
public abstract class ContaBancaria {
=======
public abstract class ContaBancaria implements Imprimivel {
>>>>>>> ddcc16e857ff558b13474e7035b40471c61b5ad6:src/AppBanco/contaBancaria.java
	private long numeroConta;
	private double saldo;
	
	
	//add the constructor
	public ContaBancaria(long numeroConta, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	// getters and setters
	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//methods sacar and depositar
	public void sacar(double valor){
        saldo -= valor;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    //abstract public void mostrarDados();
    
    public void transferir(double valor, ContaBancaria origem, ContaBancaria destino) {
    	// sacar o valor da conta de origem
    	origem.sacar(valor);
    	
    	// depositar o valor na conta de destino
    	destino.depositar(valor);
    }
}
