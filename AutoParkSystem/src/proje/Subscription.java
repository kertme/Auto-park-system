package proje;

public class Subscription {
	private Date begin;
	private Date end;
	private SubscribedVehicle vehicle;
	
	public Subscription(Date begin, Date end, String plate) {
		this.begin = begin;
		this.end = end;
		this.vehicle = new SubscribedVehicle(plate);	
	}
	public SubscribedVehicle getVehicle()
	{
	    return vehicle;
	}
	
	public boolean isValid() {
		if ((end.isAfterThan(Date.getToday()) || end.isEqualsWith(Date.getToday())) && (begin.isBeforeThan(Date.getToday()) || begin.isEqualsWith(Date.getToday()))) {
			return true;
		}
		else {
			return false;
		}	
	}
	@Override
	public String toString() {
		return "Subscription [begin=" + begin + ", end=" + end + "]";
	}
	
}
