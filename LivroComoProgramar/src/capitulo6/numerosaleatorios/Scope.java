package capitulo6.numerosaleatorios;

public class Scope {

	private int x = 1;

	public void begin() {

		int x = 5;

		System.out.printf("Local x in method begin is %d\n", x);

		useLocalVariable();
		useField();
		useLocalVariable();
		useField();

		System.out.printf("\nLocal x in method begin is %d\n", x);

	}

	public void useLocalVariable() {
		int x = 25;

		System.out.printf(
				"\nLocal x on entering method useLocalVariable is %d\n", x);
		++x;
		System.out.printf(
				"Local x before exiting method userLocalVariable is %d\n", x);
	}

	private void useField() {
		System.out.printf("\nField x on entering method useField is %d\n", x);
		x *= 10;
		System.out.printf("Field x before exiting method useField is %d\n", x);

	}

}
