package proje;

public class ParkRecord {
    private Time enterTime;
    private Time exitTime;
    private IVehicle vehicle;

    public ParkRecord(Time enterTime,IVehicle vehicle)
    {
        this.enterTime=enterTime;
        this.vehicle=vehicle;
        this.exitTime=null;
    }


    public Time getEnterTime() {
        return enterTime;
    }
    public void setEnterTime(Time enterTime) {
        this.enterTime = enterTime;
    }
    public Time getExitTime() {
        return exitTime;
    }
    public void setExitTime(Time exitTime) {
        this.exitTime = exitTime;
    }
    public int getParkingDuration() {
    	int duration = exitTime.getDifference(enterTime)/60;
    	if (duration < 0) // means that exitTime is in tomorrow
    		duration += 24;
    	return duration;
    }
    public IVehicle getVehicle()
    {
        return vehicle;
    }


	@Override
	public String toString() {
		return "[enterTime=" + enterTime + ", exitTime=" + exitTime + ", vehicle=" + vehicle + "]"+"\n"+"	";
	}
    
}
