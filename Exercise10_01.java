public class Exercise10_01 {
	/** Main method */
	public static void main(String[] args) {
		// Create two Time objects
		Time time1 = new Time();
		Time time2 = new Time(555550000);

		// Display Time objects hour, minute, and
		// second in the format hour:minute:second
		System.out.println(time1.getHour() + ":" + time1.getMinute() +
			":" + time1. getSecond());
		System.out.println(time2.getHour() + ":" + time2.getMinute() +
			":" + time2. getSecond());
	}
}

class Time {
	// Data fields
	private int hour;
	private int minute;
	private int second;

	// Creates a Time object for the current time
	Time() {
		this(System.currentTimeMillis());
	}

	// Constructs a Time object with a specified elapsed
	// time since midnight, January 1, 1970, in milliseconds.
	Time(long elapseTime) {
		setTime(elapseTime);
	}

	// Constructs a Time object with the specified hour, minute, and second
	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// Return hour
	public int getHour() {
		return hour;
	}

	// Return minute
	public int getMinute() {
		return minute;
	}

	// Return second
	public int getSecond() {
		return second;
	}

	// Sets a new time for the object using the elapsed time
	public void setTime(long elapseTime) {
    long totalS = elapseTime/1000;
    second = (int)(totalS % 60);

    long totalM = totalS / 60;
    minute = (int) (totalM % 60);

    long totalH = totalM / 60;
    hour = (int)(totalH % 24);
	}
}
