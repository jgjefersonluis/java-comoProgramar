package br.com.capitulo09.heranca;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		CommissionEmployee employee = new CommissionEmployee("Sue", "Jones",
				"222-22-2222", 10000, 0.6);

		// obtem os dados de empregados comissionado
		System.out.println("Employee information obtained by get methods:\n");
		System.out.printf("%s %s\n", "First name is", employee.getFirstName());
		System.out.printf("%s %s\n", "Lastt name is", employee.getLastName());
		System.out.printf("%s %s\n", "Social security number is",
				employee.getGrossSales());
		System.out.printf("%s %s\n", "Commission rate is",
				employee.getCommissionRate());
		
		employee.setGrossSales(500); // configura vendas brutas
		employee.setCommissionRate(.1); // configura a taxa de comissão
		
		System.out.printf("%s %s\n",
				"Updated employee information obtained by toString", employee);
	}
}
