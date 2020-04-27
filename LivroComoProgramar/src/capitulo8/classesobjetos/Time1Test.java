package capitulo8.classesobjetos;

public class Time1Test {

	public static void main(String[] args) {
		Time1 time = new Time1();

		System.out.println("The initial universal time is: ");
		System.out.println(time.toUniversalString());
		System.out.println("The initial standard time is: ");
		System.out.println(time.toString());
		System.out.println();

		time.setTime(13, 27, 6);
		System.out.println("Universal time after setTime is: ");
		System.out.println(time.toUniversalString());
		System.out.println("Standard time after setTime is: ");
		System.out.println(time.toString());
		System.out.println();

		time.setTime(99, 99, 99);
		System.out.println("after attempting invalid settings: ");
		System.out.println("Universal time: ");
		System.out.println(time.toUniversalString());
		System.out.println("Standard time: ");
		System.out.println(time.toString());

	}

}
