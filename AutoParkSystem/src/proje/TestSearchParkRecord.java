package proje;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSearchParkRecord {

	@Test
	public void test() {		
		AutoPark otopark = new AutoPark(10,2);
		
		Time entertime = new Time(3,0);
		
		otopark.vehicleEnters("34AS123", entertime, false);
		
		ParkRecord test = otopark.searchParkRecord("34AS123");
		ParkRecord actual = otopark.getParkRecords().get(0); 
		assertEquals(test, actual);
		
	}

}
