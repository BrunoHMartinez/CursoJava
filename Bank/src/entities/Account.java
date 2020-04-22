package entities;

public class Account {

	private String holder;
	private int number;
	private double balance;
	
	//Construtor com apenas 2 atributos, pois a conta pode ser iniciada com 0
	public Account(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}

	public Account(String holder, int number, double initialDeposit) {
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit); 
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	// o método set foi excluido pois não é permitido fazer alteração no numero da conta através do código 
	public int getNumber() {
		return number;
	}

	// o método set foi excluido pois não é permitido fazer alteração do saldo através do código 
	public double getBalance() {
		return balance;
	}
	
	// método para o depósito do dinheiro
	public void deposit(double amount) {
		balance += amount;
	}
	
	// método para o saque de dinheiro
	public void withdraw (double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "Account: "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
