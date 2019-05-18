package proje;

public class SubscribedVehicle implements IVehicle{
	private String plate;
	private Subscription subscription;
	
	public SubscribedVehicle(String plate, Subscription subscription) {
		this.plate = plate;
		this.subscription = subscription;
	}
	public SubscribedVehicle(String plate) {
		this.plate = plate;
	}
	
	@Override
	public String getPlate() {
		return plate;
	}
	
	@Override
	public Subscription getSubscription() {
		return subscription;
	}
	
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	@Override
	public boolean isSpecial() {
		return false;
	}
	@Override
	public String toString() {
		return "SubscribedVehicle [plate=" + plate + "]";
	}
	
}
