package br.com.capitulo09.heranca;

//Classe CommissionEmployee representa um funcionario que recebeu uma
// porcentagem das vendas brutas.

public class CommissionEmployee extends Object { // Funcionário da Comissão

	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;
	protected double grossSales; // vendas brutas semanais
	protected double commissionRate; // porcentagem da comissão

	public CommissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales,
			double commissionRate) {
		// super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName; // deve validar
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = (commissionRate > 0.0 && commissionRate < 1.0) ? commissionRate
				: 0.0;
	}

	public double earnings() {
		return commissionRate * grossSales;
	}

	// retorn a representação String do objeto commissionEmployee
	@Override
	// indica que esse metodo sobrescreve um metodo de superclasse
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
				"commission employee", firstName, lastName,
				"social security number", socialSecurityNumber, "gross sales",
				grossSales, "commission rate", commissionRate);
	}
}// fim da classe
