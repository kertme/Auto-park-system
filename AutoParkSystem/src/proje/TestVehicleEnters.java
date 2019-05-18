package proje;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVehicleEnters {

	@Test
	public void subscribedVehicleEnters() {
		Date baslangic = new Date(14,5,2019);
		Date bitis = new Date(16,5,2020);
		Subscription s1 = new Subscription(baslangic,bitis,"34AS123");
		s1.getVehicle().setSubscription(s1);
		
		AutoPark otopark = new AutoPark(10,2);
		otopark.addVehicle(s1.getVehicle());
		Time entertime = new Time(3,0);

		boolean test = otopark.vehicleEnters("34AS122", entertime, false);
		assertEquals(true, test);
	}
	@Test
	public void regularVehicleEnters() {
		AutoPark otopark = new AutoPark(10,2);
		Time entertime = new Time(3,0);
		boolean test = otopark.vehicleEnters("35CZ596", entertime, false);
		assertEquals(true, test);
	}
	@Test
	public void officialVehicleEnters() {
		AutoPark otopark = new AutoPark(10,2);
		Time entertime = new Time(3,0);
		boolean test = otopark.vehicleEnters("35CZ596", entertime, true);
		assertEquals(true, test);
	}
	@Test
	public void samePlateVehicleTryToEnter() {
		AutoPark otopark = new AutoPark(10,2);
		Time entertime = new Time(3,0);
		otopark.vehicleEnters("35CZ596", entertime, false);
		boolean test = otopark.vehicleEnters("35CZ596", entertime, false);
		assertEquals(false, test);
	}
	@Test
	public void vehicleKeepEntersAndExits() {
		AutoPark otopark = new AutoPark(10,2);
		Time entertime = new Time(3,0);
		Time exittime = new Time(12,30);
		Time entertime2 = new Time(13,15);

		otopark.vehicleEnters("35CZ596", entertime, false);
		otopark.vehicleExits("35CZ596", exittime);
		boolean test1 = otopark.vehicleEnters("35CZ596", entertime2, false);
		assertEquals(true, test1);
	}
	@Test
	public void vehicleTryToEnterFullAutopark() {
		AutoPark otopark = new AutoPark(10,1); //capacity = 1
		Time entertime = new Time(3,0);
		
		otopark.vehicleEnters("35CZ596", entertime, false);
		boolean test =otopark.vehicleEnters("34AS196", entertime, false);
		assertEquals(false, test);
	}
}
