import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		//Iniciando dados dos clientes
		String nome = "Cleber Batista";
		String tipoConta = "Corrente";
		double saldo = 1200.00;
		int opcao = 0;

				
		System.out.println("****************************");
		System.out.println("\nNome do cliente: " + nome);
		System.out.println("Tipo de conta: " + tipoConta);
		System.out.println("saldo atual: " + saldo );
		System.out.println("\n****************************");
		
		
		//menu de opçoes 
		String menu = "\nDigite sua opção:\n"
	            + "1 - Consultar saldo\n"
	            + "2 - Transferir valor\n"
	            + "3 - Receber valor\n"
	            + "4 - Sair\n"
	            + ""
	            + ""
	            + "";

				
		Scanner leitura =  new Scanner(System.in);
		
		while (opcao != 4) {
			System.out.println(menu);
			opcao = leitura.nextInt();
			
			if (opcao == 1) {
				System.out.println("O saldo atualizado é " + saldo);
			}else if (opcao == 2) {
				System.out.println("Qual o valor que deseja tranferir " );
				double valor = leitura.nextDouble();
				if (valor > saldo) {
					System.out.println("Nao há saldo suficiente para realizar tranferencia");
				}else {
					saldo -= valor;
					System.out.println("Novo saldo " + saldo);
				}
			}else if (opcao == 3 ) {
				System.out.println("Valor recebido: ");
				double valor = leitura.nextDouble();
				saldo += valor ;
				System.out.println("Novo saldo " + saldo);
			}else if (opcao != 4) {
				System.out.println("Opção invalida");
			}
		}

	}

}
