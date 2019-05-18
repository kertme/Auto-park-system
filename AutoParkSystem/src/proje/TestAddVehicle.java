package proje;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddVehicle {

	@Test
	public void test() {
		Date baslangic = new Date(14,5,2019);
		Date bitis = new Date(16,5,2020);
		
		AutoPark otopark = new AutoPark(10,2);
		Subscription s1 = new Subscription(baslangic,bitis,"34AS123");
		s1.getVehicle().setSubscription(s1);
		
		boolean test = otopark.addVehicle(s1.getVehicle());
		assertEquals(true,test);
		test = otopark.addVehicle(s1.getVehicle());
		assertEquals(false,test);
		
	}

}
