package AppBanco;

import java.util.ArrayList;

public class Banco {
	
	public Banco() { } 
	
	public static ArrayList<ContaBancaria> contas = new ArrayList<>();

	public void inserir(ContaBancaria contaBancaria) {
		
		contas.add(contaBancaria);
		
	}
	
	public void remover(Long numero) {
		
		for(int i = 0; i < contas.size(); i++) {
			
			if(contas.get(i).getNumeroConta() == numero) {
				
				contas.remove(i);
			}
		}
		
	}
	
	// ***************ACHO QUE AP�S VARRER O ARRAY E FILTRAR AS CONTAS DESEJADAS � NECESS�RIO CHAMAR mostrarDados()********************
	public void procurar(Long numero) {
		
	}
}
