package AppBanco;

public class contaPoupan�a extends contaBancaria {
	
	private double limite;

	//add the constructor
	public contaPoupan�a(long numeroConta, double saldo, double limite) {
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
	
	//Override of methods from contaBancaria
	@Override
	public void sacar(double valor) {
		if (valor < getSaldo()) {
			setSaldo(getSaldo() - valor);
		}else if (valor < limite) {
			limite = limite - valor;
		}
	}
	

}
