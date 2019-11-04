package AppBanco;

public class ContaPoupanca extends ContaBancaria {
	
	private double limite;

	//add the constructor
	public ContaPoupanca(long numeroConta, double saldo, double limite) {
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
