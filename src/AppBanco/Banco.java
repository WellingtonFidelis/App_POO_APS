package AppBanco;

import java.util.ArrayList;

public class Banco {

	public Banco() { } 

	public static ArrayList<ContaBancaria> contas = new ArrayList<>();

	public void inserir(ContaBancaria contaBancaria) {

		//ADICIONA CONTA NO ARRAYLIST
		contas.add(contaBancaria);

	}

	public void remover(Long numero) throws Exception {

		boolean removeu = false;
		try {

			//VERIFICA SE O NUMERO DA CONTA ESTA NO ARRAYLIST E REMOVE
			for(int i = 0; i < contas.size(); i++) {
				
				if(contas.get(i).getNumeroConta() == numero) {

					contas.remove(i);
					removeu = true;
					break;
				}
			}

			//SE NAO REMOVEU NENHUMA CONTA CRIA UMA EXCECAO E CAI NO CATCH 
			if(!removeu) {
				
				throw new Exception() ;
			}

		} catch (Exception e) {
			
			//CRIA UMA NOVA EXCECAO PARA CAIR NO CATCH DA CLASSE RemoverConta E EXIBIR MENSAGEM QUE A CONTA NAO EXISTE
			throw new Exception() ;

		} 

	}

	public ContaBancaria procurar(Long numero) {

		ContaBancaria conta = null;
		
		//PERCORRE O ARRAYLIST DE CONTAS
		for (int i = 0; i < contas.size(); i++) {
			
			//QUANDO ENCONTRA A CONTA DESEJADA RETORNA AS INFORMACOES DELA PARA O A CLASSE RelatorioSaldo
			if (contas.get(i).getNumeroConta() == numero) {
			
				conta = contas.get(i);
				
			}
		}
		
		return conta;
		
	}
}
