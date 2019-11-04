package AppBanco;

public abstract class ContaBancaria {
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
}
