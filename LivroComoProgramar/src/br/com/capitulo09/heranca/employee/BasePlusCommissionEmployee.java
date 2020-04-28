package br.com.capitulo09.heranca.employee;

import br.com.capitulo09.heranca.CommissionEmployee;

//representa um empregado que recebe um salario base
//alem da comissão

public class BasePlusCommissionEmployee extends CommissionEmployee {

		private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		// TODO Auto-generated constructor stub
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = ((baseSalary < 0.0) ? 0.0 : baseSalary);
	}
	
	// calcula os lucros
	@Override
	public double earnings() {
		return baseSalary + (commissionRate * grossSales);
	}
	
	
	@Override
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
				"base salaried commission employee", firstName, lastName,
				"social security number", socialSecurityNumber, "gross sales",
				grossSales, "commission rate", commissionRate, "base salary",
				baseSalary);
	}




	

}
