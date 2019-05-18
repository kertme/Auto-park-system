package proje;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSearchVehicle {

	@Test
	public void test() {
		Date baslangic = new Date(14,5,2019);
		Date bitis = new Date(16,5,2020);
		Subscription s1 = new Subscription(baslangic,bitis,"34AS123");
		s1.getVehicle().setSubscription(s1);
		
		AutoPark otopark = new AutoPark(10,2);
		otopark.addVehicle(s1.getVehicle());
		SubscribedVehicle test = otopark.searchVehicle("34AS123");
		
		assertEquals(s1.getVehicle(), test);
		test = otopark.searchVehicle("25TS386");
		assertEquals(null, test);
	}

}
