package Banco;

public class Banco {

	private String nome;
	private double conta;
	private double saldo;
	
	public Banco() {
	}
	
	public Banco(String nome, double conta) {
		this.nome = nome;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getConta() {
		return conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;		
	}
	
	public String toString() {
		return "Account " + conta + ", Holder " + nome + ", Balance R$ " + saldo;
	}
}



