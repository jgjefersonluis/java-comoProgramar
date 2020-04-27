package capitulo8.enumeracoes;

public class PackageDataTest {

	private static final Object String = null;

	public static void main(String[] args) {

		PackageData packageData = new PackageData();

		System.out.printf("After instantiation: \n%s\n", packageData);

		packageData.number = 77;
		packageData.string = "Goodbye";

		System.out.printf("\nAfter changing values: \n%s\n", packageData);
	}

	public void PackageData() {
		int number = 0;
		String string = "Hello";
	}

	public String toString() {
		Object number = null;
		return ((String) String).format("Number: %d; string: %s", number,
				String);

	}

}
