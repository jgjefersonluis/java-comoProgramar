package capitulo7array;

public class PassArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("Effects of passing reference to entire array: \n"
				+ "The values of the original array are:");
		for (int value : array) {
			System.out.printf(" %d", value);

			modifyArray(array);
			System.out.println("\n\nThe values of the modified array are:");

			for (int value1 : array) {
				System.out.printf(" %d", value1);

				System.out.printf(
						"\n\nEffects of passing reference to entire array: \n"
								+ "array[3] before modifyElement: %d\n",
						array[3]);
				modifyArray(array[3]);
				System.out.printf("array[3] after modifyElement: %d\n",
						array[3]);

			}
		}
		/*
		 * public static void modifyArray(array){ for(int counter = 0; counter <
		 * array2.length; counter++){ array2[counter]*=2; } }
		 */
	}

	private static void modifyArray(Object array) {
		// TODO Auto-generated method stub

	}

	public static void modifyElement(int element) {
		element *= 2;
		System.out.printf("Value of element in modifyElement:%d\n", element);
	}

}
