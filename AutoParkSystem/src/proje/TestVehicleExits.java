package proje;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVehicleExits {

	@Test
	public void standartExit() {
		AutoPark otopark = new AutoPark(10,2);
		Time entertime = new Time(3,0);
		Time exittime = new Time(1,0);
		
		otopark.vehicleEnters("34AS122", entertime, false);
		boolean test = otopark.vehicleExits("34AS122", exittime);
		assertEquals(true, test);
	}
	@Test
	public void notEnteredVehicleTryToExits() {
		AutoPark otopark = new AutoPark(10,2);
		Time exittime = new Time(1,0);
		boolean test = otopark.vehicleExits("35BZ786", exittime);
		assertEquals(false, test);
	}
	

}
