package proje;
import java.util.Calendar;

public class Date{

	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date(){
		
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isAfterThan(Date other) {
		int temp;
		int temp2;
		temp = day + 30*month + 365*year;
		temp2 = other.getDay() + 30*other.getMonth() + 365*other.getYear();
		if (temp > temp2)
			return true;
		else 
			return false;
	}
	public boolean isBeforeThan(Date other) {
		int temp;
		int temp2;
		temp = day + 30*month + 365*year;
		temp2 = other.getDay() + 30*other.getMonth() + 365*other.getYear();
		if (temp < temp2)
			return true;
		else 
			return false;
	}
	public boolean isEqualsWith(Date other) {
		int temp;
		int temp2;
		temp = day + 30*month + 365*year;
		temp2 = other.getDay() + 30*other.getMonth() + 365*other.getYear();
		if (temp == temp2)
			return true;
		else 
			return false;
	}
	
	@SuppressWarnings("deprecation")
	public static Date getToday() {
		Calendar cal = Calendar.getInstance();
		Date today = new Date();
		today.day = cal.getTime().getDate();
		today.month = cal.getTime().getMonth()+1;
		today.year = cal.getTime().getYear()+1900;
		return today;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
