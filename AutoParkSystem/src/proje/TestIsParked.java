package proje;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIsParked {

	@Test
	public void test() {
		Time entertime = new Time(16,30);
		
		AutoPark otopark = new AutoPark(10,2);
		otopark.vehicleEnters("34BZ789", entertime, false);
		
		boolean test = otopark.isParked("34BZ789");
		assertEquals(true, test);
		
		test = otopark.isParked("58AB112");
		assertEquals(false, test);
	}

}
