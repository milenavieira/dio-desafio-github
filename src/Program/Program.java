package Program;

import java.util.Scanner;

import Banco.Banco;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter acoount number: ");
		double numeroDaConta = sc.nextDouble();
		sc.nextLine(); // para pular linha quando tem double e depois string
		System.out.println("Enter account holder: ");
		String nomeDaConta = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? "); //poderia usar char response = sc.next().charAt(0) para ler a resposta
		String querDepositar = sc.nextLine();
		
		
		Banco banco = new Banco(nomeDaConta, numeroDaConta); //construtor com os parametros dessa classe referenciando nome econta da outra classe (só os indispensaveis para iniciar o obj)
		
		if (querDepositar.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			banco.setSaldo(depositoInicial); //atualizando para depositoinicial
		}
		
		
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.println(banco);
		
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		System.out.println("Updated account data: ");
		banco.setSaldo(deposito + banco.getSaldo());//atualizando para saldo (depositoinciial) + deposito
		System.out.println(banco);
		
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		double saque = sc.nextDouble();
			if (saque > 0.0) {
				banco.setSaldo(banco.getSaldo()- saque - 5.00);// atualizando para saldo anterior - sque, etc 
			}
		System.out.println("Updated account data: ");
		System.out.println(banco);
		

		
		
		sc.close();

	}

}
