package capitulo8.classesobjetos;

public class Time1 {
	int hour;
	private int minute;
	private int second;

	public void setTime(int h, int m, int s) {
		hour = ((h >= 0 && h < 24) ? h : 0);
		setMinute(((m >= 0 && m < 60) ? m : 0));
		setSecond(((s >= 0 && s < 60) ? s : 0));

	}

	public String toUniversalString() {
		return String.format("%02d:%2d:%02d", hour, getMinute(), getSecond());
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12
				: hour % 12), getMinute(), getSecond(), (hour < 12 ? "AM" : "PM"));
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
