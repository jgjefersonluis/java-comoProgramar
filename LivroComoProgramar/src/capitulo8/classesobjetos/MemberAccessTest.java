package capitulo8.classesobjetos;

public class MemberAccessTest {

	public static void main(String[] args) {
		Time1 time = new Time1();

		time.hour = 7;
		time.setMinute(15);
		time.setSecond(30);

	}

}
