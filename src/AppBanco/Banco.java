package AppBanco;

import java.util.ArrayList;

public class Banco {

	public Banco() { } 

	public static ArrayList<ContaBancaria> contas = new ArrayList<>();

	public void inserir(ContaBancaria contaBancaria) {

		contas.add(contaBancaria);

	}

	public void remover(Long numero) throws Exception {

		boolean removeu = false;
		try {

			for(int i = 0; i < contas.size(); i++) {

				if(contas.get(i).getNumeroConta() == numero) {

					contas.remove(i);
					removeu = true;
					break;
				}
			}

			if(!removeu) {
				
				throw new Exception() ;
			}

		} catch (Exception e) {

			throw new Exception() ;

		} 

	}

	// ***************ACHO QUE APÓS VARRER O ARRAY E FILTRAR AS CONTAS DESEJADAS É NECESSÁRIO CHAMAR mostrarDados()********************
	public void procurar(Long numero) {

	}
}
