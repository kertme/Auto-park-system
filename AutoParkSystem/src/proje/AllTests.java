package proje;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAddVehicle.class, TestFindVehicleIndex.class, TestIncomeDaily.class, TestIndexofParkRecord.class,
		TestIsParked.class, TestSearchParkRecord.class, TestSearchVehicle.class, TestVehicleEnters.class,
		TestVehicleExits.class })
public class AllTests {

}
