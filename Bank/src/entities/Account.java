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

	// o m�todo set foi excluido pois n�o � permitido fazer altera��o no numero da conta atrav�s do c�digo 
	public int getNumber() {
		return number;
	}

	// o m�todo set foi excluido pois n�o � permitido fazer altera��o do saldo atrav�s do c�digo 
	public double getBalance() {
		return balance;
	}
	
	// m�todo para o dep�sito do dinheiro
	public void deposit(double amount) {
		balance += amount;
	}
	
	// m�todo para o saque de dinheiro
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
