package proje;

public class RegularVehicle implements IVehicle{
	private String plate;
	
	
	public RegularVehicle(String plate) {
		this.plate = plate;
	}

	@Override
	public String getPlate() {
		return plate;
	}

	@Override
	public Subscription getSubscription() {
		return null;
	}

	@Override
	public boolean isSpecial() {
		return false;
	}
}
