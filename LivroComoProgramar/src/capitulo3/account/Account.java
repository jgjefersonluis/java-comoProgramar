package capitulo3.account;

public class Account { // conta

	private double balance;

	public Account(double initialBalance) {
		if (initialBalance > 0.0) {
			balance = initialBalance; // saldo
		}
	}

	public void credit(double amount) {
		balance = balance + amount; // montante
	}

	public double getBalance() {
		return balance;
	}
}
