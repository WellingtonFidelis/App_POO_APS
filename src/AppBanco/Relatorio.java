package AppBanco;

public abstract class Relatorio implements Imprimivel {
	public void gerarRelatorio(Imprimivel p ) {
		mostrarDados();
	}
	
	/* tive que colocar a classe Relatorio como abstract para poder implementar a interface Imprimivel
	 * nao sei se esta correto! */
}
