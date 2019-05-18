package proje;

public class OfficialVehicle implements IVehicle{
	private String plate;
	
	public OfficialVehicle(String plate) {
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
		return true;
	}
}
