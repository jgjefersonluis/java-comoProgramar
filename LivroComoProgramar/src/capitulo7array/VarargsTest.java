package capitulo7array;

public class VarargsTest {

	// metodo (logica)
	public static double average(double... numbers) {
		// calcula a média
		double total = 0.0; // inicializa o total

		// calcula o total utilizando a instrução for aprimorada
		for (double d : numbers) {
			total += d;
		}
		return total / numbers.length;
	}// fim do metodo media

	public static void main(String[] args) {
		// variaveis
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;

		// saida
		System.out.printf("d1 = %.1f\nd2 = %.1f\n3 = %.1f\nd4 = %.1f\n\n", d1,
				d2, d3, d4);
		System.out.printf("Average of d1 and d2 is %.1f\n", average(d1, d2));
		System.out.printf("Average of d1, d2, and d3 is %.1f\n",
				average(d1, d2, d3));
		System.out.printf("Average of d1, d2, d3 and d4 is %.1f\n",
				average(d1, d2, d3, d4));

	}

}
