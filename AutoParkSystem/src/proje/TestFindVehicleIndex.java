package proje;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindVehicleIndex {

	@Test
	public void test() {
		Date baslangic = new Date(14,5,2019);
		Date bitis = new Date(16,5,2020);
		Subscription s1 = new Subscription(baslangic,bitis,"34AS123");
		Subscription s2 = new Subscription(baslangic,bitis,"35CZ596");
		s1.getVehicle().setSubscription(s1);
		s2.getVehicle().setSubscription(s2);
		
		AutoPark otopark = new AutoPark(10,2);
		otopark.addVehicle(s1.getVehicle());
		otopark.addVehicle(s2.getVehicle());
		
		int test = otopark.findVehicleIndex("34AS123");
		assertEquals(0, test);
		test = otopark.findVehicleIndex("35CZ596");
		assertEquals(1, test);
	}

}
