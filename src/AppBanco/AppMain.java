//package AppBanco;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Collections;
//
//public class AppMain {
//
//	// variável comum
//	static int index = 0;
//
//	// Lista de contas
//	static ArrayList<ContaBancaria> lista = new ArrayList<>();
//
//	static Scanner tecla = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		int op;
//		do {
//			System.out.println("*** MENU PRINCIPAL ***");
//			System.out.println("1 - Incluir Conta Corrente");
//			System.out.println("2 - Incluir Conta Poupança");
//			System.out.println("3 - Excluir Conta");
//			System.out.println("4 - Sacar");
//			System.out.println("5 - Depositar");
//			System.out.println("6 - Transferir");
//			System.out.println("7 - Listar Contas em Ordem Crescente de Saldo");
//			System.out.println("8 - Sair");
//			System.out.println("Digite sua opção: ");
//			op = tecla.nextInt();
//			switch (op) {
//			case 1: criarContaCorrente(); break;
//			case 2: criarContaPoupaca(); break;
//			case 3: excluirConta();	break;
//			case 4:	sacarValor(); break;
//			case 5:	depositarValor(); break;
//			case 6: transferir(); break;
//			case 7:	listarContas();	break;
//			case 8:	break;
//			}
//		} while (op != 8);
//	}
//
//	private static void criarContaPoupaca() {
//		// input data
//		System.out.println("Digite o número da conta:");
//		long numeroConta = tecla.nextInt();
//		System.out.println("Digite o saldo da conta:");
//		double saldo = tecla.nextDouble();
//		System.out.println("Digite o limite da conta:");
//		double limite = tecla.nextDouble();
//		// add the new object and input in the list
//		lista.add(new ContaPoupanca(numeroConta, saldo, limite));
//		System.out.println("Conta cadastrada com sucesso!");
//	}
//
//	private static void criarContaCorrente() {
//		// input data
//		System.out.println("Digite o número da conta:");
//		long numeroConta = tecla.nextLong();
//		System.out.println("Digite o saldo da conta:");
//		double saldo = tecla.nextDouble();
//		// add the new object and input in the list
//		lista.add(new ContaCorrente(numeroConta, saldo));
//		System.out.println("Conta cadastrada com sucesso!");
//	}
//
//	public static void excluirConta() { 
//		//Entrada
//		System.out.println("Digite o número da conta:");
//		long numeroConta = tecla.nextLong();
//
//		//Procurar a conta na lista para exclusão
//		for (ContaBancaria algumaConta : lista) {
//			if (algumaConta.getNumeroConta() == numeroConta) {
//				lista.remove(algumaConta); 
//				break; 
//				}
//			}
//		System.out.println("Conta " + numeroConta + " excluída com sucesso.");
//		}
//	public static void sacarValor() {
//		//Entrada
//		System.out.println("Digite o número da conta:");
//		long numeroConta = tecla.nextLong();
//		System.out.println("Digite o valor do saque:");
//		double valor = tecla.nextDouble();
//		//Procurar a conta na lista para efetuar o saque
//		for (ContaBancaria conta : lista) {
//			if (conta.getNumeroConta() == numeroConta) {
//				conta.sacar(valor);
//				break;
//			}
//		}
//	}
//	public static void depositarValor() {
//		//Entrada
//		System.out.println("Digite o número da conta:");
//		long numeroConta = tecla.nextLong();
//		System.out.println("Digite o valor do deposito:");
//		double valor = tecla.nextDouble();
//		//Procurar a conta na lista para efetuar o deposito
//		for (ContaBancaria conta : lista) {
//			if (conta.getNumeroConta() == numeroConta) {
//				conta.depositar(valor);
//				break;
//			}
//		}
//	}
//	public static void listarContas() {
//		double total = 0;
//		System.out.println("=======================");
//		System.out.println("CONTA:	SALDO:	LIMITE:");
//		System.out.println("=======================");
//		ordenarLista();
//		for (ContaBancaria conta : lista) {
//			if (!conta.equals(null)) {
//				//				if (conta instanceof Corrente) {
//				//					Corrente c = (Corrente) conta;
//				//					System.out.println(c.getNumero() + "\t" +
//				//									   c.getSaldo() + "\t" +
//				//									   c.getLimite()); 
//				//				}
//				/* poder do polimorfismo, em tempo de execução o objeto se comporte como outro objeto
//				 * */	
//				imprimir(conta);	
//				total += conta.getSaldo();
//			}
//		}
//		System.out.println("Total:........" + total);
//		System.out.println("=======================");
//	}
//	public static void imprimir(Imprimivel p) {
//		p.mostrarDados();
//	}
//	public static void ordenarLista() {
//		Collections.sort(lista);
//	}
//	public static void transferir() {
//		// input data
//		System.out.println("Digite o numero da conta de origem:");
//		long numeroContaOrigem = tecla.nextLong();
//		System.out.println("Digite o numero da conta de destino:");
//		long numeroContaDestino = tecla.nextLong();
//		System.out.println("Digite o valor:");
//		double valor = tecla.nextDouble();
//		// search in list to find the origin account and sacar()
//		for (ContaBancaria conta : lista) {
//			if (conta.getNumeroConta() == numeroContaOrigem) {
//				conta.sacar(valor);
//				break;
//			}
//		}
//		// search in list to find the origin account and depositar()
//		for (ContaBancaria conta : lista) {
//			if (conta.getNumeroConta() == numeroContaDestino) {
//				conta.depositar(valor);
//				break;
//			}
//		}
//	}
//}