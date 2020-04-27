package capitulo8.classesobjetos;

public class ThisTest {

	public static void main(String[] args) {
		SimpleTime time = new SimpleTime();
		System.out.println(time.buildString());
	}
}

class SimpleTime {
	private int hour = 15;
	private int minute  = 30;
	private int second= 19;

	public void Simpletime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String buildString() {
		return String.format("%24s:%s\n%24s:%s", "this.toUniversalString()",
				this.toUniversalString(), "toUniversalString()",
				toUniversalString());
	}

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute,
				this.second);
	}
}
