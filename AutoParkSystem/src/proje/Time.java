package proje;

public class Time {
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	public int getDifference(Time other) {
		int temp1 = hour*60 + minute;
		int temp2 = other.hour*60 + other.minute;
		
		return temp1-temp2;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	@Override
	public String toString() {
		return "[hour=" + hour + ", minute=" + minute + "]";
	}
	
}
