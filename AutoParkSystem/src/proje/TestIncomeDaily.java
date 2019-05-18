package proje;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIncomeDaily {

	@Test
	public void subscriberAndRegularTest() {
		Date baslangic = new Date(14,5,2019);
		Date bitis = new Date(16,5,2020);
		Subscription s1 = new Subscription(baslangic,bitis,"34AS123");
		s1.getVehicle().setSubscription(s1);
		
		AutoPark otopark = new AutoPark(10,2);
		otopark.addVehicle(s1.getVehicle());
		
		Time entertime = new Time(3,0);
		Time exittime = new Time(12,30);
		
		Time entertime2 = new Time(16,30);
		Time exittime2 = new Time(22,45);
		
		otopark.vehicleEnters("34AS123", entertime, false);
		otopark.vehicleExits("34AS123", exittime);//subscribed, free
		
		otopark.vehicleEnters("34DD555", entertime, false);
		otopark.vehicleExits("34DD555", exittime);//regular
		
		otopark.vehicleEnters("34DD555", entertime2, false);
		otopark.vehicleExits("34DD555", exittime2);//same regular vehicle enters and exits second time in same day.
		double test = otopark.getIncomeDaily();
		assertEquals(90,0 , test);
	}
	@Test
	public void officialExits() {
		AutoPark otopark = new AutoPark(10,2);
		Time entertime = new Time(3,0);
		Time exittime = new Time(12,30);
		
		otopark.vehicleEnters("34A001", entertime, true);
		otopark.vehicleExits("34A001", exittime);//official, free
		double test = otopark.getIncomeDaily();
		assertEquals(0,0 , test);
	}
	@Test
	public void invalidSubscribedVehicleExits() {
		Time entertime = new Time(3,45);
		Time exittime = new Time(12,30);
		
		AutoPark otopark = new AutoPark(10,2);
		Date baslangic = new Date(10,3,2019);
		Date bitis = new Date(12,4,2019);
		Subscription s2 = new Subscription(baslangic,bitis,"35CZ596");
		
		s2.getVehicle().setSubscription(s2);
		otopark.addVehicle(s2.getVehicle());
		
		otopark.vehicleEnters("35CZ596", entertime, false);
		otopark.vehicleExits("35CZ596", exittime);//Treated like regular vehicles
		double test = otopark.getIncomeDaily();
		assertEquals(80,0 , test);
		
	}
}
