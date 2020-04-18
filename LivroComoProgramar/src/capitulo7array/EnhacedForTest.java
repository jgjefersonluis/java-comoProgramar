package capitulo7array;

public class EnhacedForTest {

	public static void main(String[] args) {

		int[] array = { 87, 668, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 0;

		for (int number : array) {
			total += number;

			System.out.printf("Total of array elements: %d\n", total);
		}
	}
}
