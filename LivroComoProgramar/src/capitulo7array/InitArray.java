package capitulo7array;

public class InitArray {

	public static void main(String[] args) {
		// verifica o numero de argumentos de linha de comando

		if (args.length != 3) {
			System.out
					.println("Error: Please re-enter the entire command, including\n"
							+ "an array size, initial value and increment.");
		} else {
			// obt�m o tamanho do array a partir do primeiro argumento
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength]; // cria o array

			// obtem o valor inicial e o incrementa a partir dos argumentos de
			// linha de comando
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);

			// calcula o valor de cada elemento do array
			for (int counter = 0; counter < array.length; counter++) {
				array[counter] = initialValue + increment * counter;

				System.out.printf("%s%8s\n", "Index", "Value");

				// exibe o valor e o indice de array
				for (int counter2 = 0; counter < array.length; counter++) {
					System.out.printf("%5d%8d\n", counter, array[counter]);
				}

			}

		}

	}// fim main

}// fim do programa
