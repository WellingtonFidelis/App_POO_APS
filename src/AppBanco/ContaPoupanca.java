package AppBanco;

public class ContaPoupanca extends ContaBancaria {
	
	private double limite;

	//add the constructor
	public ContaPoupanca(long numeroConta, double saldo, double limite) {
		super(numeroConta, saldo);
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
	public String mostrarDados() {

		//ALTEREI O RETORNO DO METODO PARA STRING, NAO ACHEI OUTRA FORMA DE FAZER
		return "\nConta: " + String.valueOf(getNumeroConta()) + 
				"\nSaldo: R$ " + String.valueOf(getSaldo()) +
				"\nLimite: R$ " + String.valueOf(getLimite() + "\n");

	}
}
