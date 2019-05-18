package proje;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIndexofParkRecord {

	@Test
	public void test() {
		AutoPark otopark = new AutoPark(10,2);
		
		Time entertime = new Time(3,0);
		
		otopark.vehicleEnters("34AS123", entertime, false);

		
		ParkRecord parkRecord = otopark.getParkRecords().get(0);
		int test = otopark.indexOfParkRecord(parkRecord);
		assertEquals(test, 0);
	}

}
