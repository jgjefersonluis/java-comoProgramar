package br.com.capitulo09.heranca;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
				"Bob", "Lewis", "333-33-3333", 5000, 0.4, 300);

		// obtem os dados do empregado comissionado com salario base

		System.out.println("Employee information obtained by get methods:\n");
		System.out.printf("%s %s\n", "First name is", employee.getFirstName());
		System.out.printf("%s %s\n", "Lastt name is", employee.getLastName());
		System.out.printf("%s %.2f\n", "Social security number is",
				employee.getGrossSales());
		System.out.printf("%s %.2f\n", "Commission rate is",
				employee.getCommissionRate());
		System.out.printf("%s %.2f\n", "Base salary is",
				employee.getBaseSalary());

		employee.setBaseSalary(1000); // configura o salario base

		System.out.printf("%s %s\n",
				"Updated employee information obtained by toString",
				employee.toString());
	}

}
