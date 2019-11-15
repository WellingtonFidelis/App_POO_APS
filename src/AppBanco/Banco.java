package AppBanco;

import java.util.ArrayList;

public class Banco {
	
	public Banco() { } 

	ArrayList<ContaBancaria> contas = new ArrayList<>();

	public void inserir(ContaBancaria contaBancaria) {
		
		contas.add(contaBancaria);
		
	}
}
