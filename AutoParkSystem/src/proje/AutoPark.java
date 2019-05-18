package proje;
import java.util.Vector;

public class AutoPark {
	private Vector<SubscribedVehicle> subscribedVehicles; //Contains vehicles that subscribed to Autopark
	private Vector<ParkRecord> parkRecords; //Contains all the park records including old ones (exiting is not cause deleting park record, storages all)
	private double hourlyFee;
	private double incomeDaily=0;
	private int capacity;	//Capacity of Autopark (Max limit of "guncel")
	private int guncel=0;	//Number of vehicles that been parked in Autopark at the moment
	private double ucret;
	
	public AutoPark(double hourlyFee, int capacity) {
		this.subscribedVehicles = new Vector<SubscribedVehicle>(capacity);
		this.parkRecords =new Vector<ParkRecord>();
		this.hourlyFee = hourlyFee;
		this.capacity = capacity;
	}
	
	public Vector<ParkRecord> getParkRecords() {
		return parkRecords;
	}
	public Vector<SubscribedVehicle> getSubscribedVehicles(){
		return subscribedVehicles;
	}
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getHourlyFee() {
		return hourlyFee;
	}
	public void setHourlyFee(double hourlyFee) {
		this.hourlyFee = hourlyFee;
	}
	public double getIncomeDaily() {
		return incomeDaily;
	}

	public void setIncomeDaily(double incomeDaily) {
		this.incomeDaily = incomeDaily;
	}
	
	public double getUcret() {
		return ucret;
	}

	public void setUcret(double ucret) {
		this.ucret = ucret;
	}

	public int getGuncel() {
		return guncel;
	}
	public void setGuncel(int guncel) {
		this.guncel = guncel;
	}
	public boolean isParked(String plate) // Searching vehicle that has this plate is in the Autopark or not
    {
        for(int i=0;i<getParkRecords().size(); i++)
        {
           if ((getParkRecords().get(i).getVehicle().getPlate().equals(plate) == true) && (getParkRecords().get(i).getExitTime()== null))
           {
        	   System.out.println("Arac otoparkta park halinde.");
               return true;
           }
        }
        return false;
    }
	public SubscribedVehicle searchVehicle(String plate) //Finds subscribedVehicle in subscribedVehicles vector.
    {
        SubscribedVehicle subscribedVehicle;
        for(int i=0;i<getSubscribedVehicles().size();i++)
        {

            subscribedVehicle=getSubscribedVehicles().get(i);
            if(subscribedVehicle.getPlate().equals(plate) == true)
            {
                return subscribedVehicle;
            }
        }
        subscribedVehicle=null;
        return subscribedVehicle;
    }
	public int findVehicleIndex(String plate) { //Finds index of subscribedVehicle that already found at "searchVehicle" method.
		SubscribedVehicle subscribedVehicle;
        for(int i=0;i<getSubscribedVehicles().size();i++)
        {
            subscribedVehicle=getSubscribedVehicles().get(i);
            if(subscribedVehicle.getPlate()==plate)
                return i;
        }
        return -1;
	}
	public ParkRecord searchParkRecord(String plate) //Searching park record with given plate for vehicle that has not leave Autopark yet.
    {
        ParkRecord parkRecord;
        for(int i=0;i<parkRecords.size();i++)
        {
            parkRecord=getParkRecords().get(i);
            if((parkRecord.getVehicle().getPlate().equals(plate) == true) && (getParkRecords().get(i).getExitTime()== null))
            {
                return parkRecord;
            }
        }
        parkRecord=null;
        return parkRecord;
    }
	public int indexOfParkRecord(ParkRecord parkRecord) //Finds index of parkrecord that already found at "searchParkRecord" method.
    {

        for(int i=0;i<getParkRecords().size();i++)
        {
            if (parkRecord==getParkRecords().get(i))
            {
                return i;
            }
        }
        return -1;
    }
	public boolean addVehicle(SubscribedVehicle subscribedVehicle)
    {		
        for(int i=0;i<getSubscribedVehicles().size();i++)
        {

                if (subscribedVehicle.getPlate() == getSubscribedVehicles().get(i).getPlate()) //checks if already added
                {
                	System.out.println("Bu plaka zaten otoparka kayýtlý.");
                    return false;
                }

        }
        getSubscribedVehicles().add(subscribedVehicle);
        System.out.println("Abone eklendi.");
        return true;
    }
	public boolean vehicleEnters(String plate,Time enter,boolean isOfficial)
    {
		if (getCapacity()== getGuncel()) { //Checks if we reached max capacity or not
			System.out.println("Otopark dolu."+plate+" plakali arac giris yapamadi.");
			return false;
		}
		else {
			
	        ParkRecord parkRecord;
	        if(isParked(plate)==true)//checks if that vehicle already in auto park or not
	        {
	            return false;
	        }
	        else
	        {
	            SubscribedVehicle subscribedVehicle;
	            subscribedVehicle=searchVehicle(plate);
	            if(subscribedVehicle!=null)//checks if this is a subscribed vehicle or not
	            {
	                parkRecord=new ParkRecord(enter,subscribedVehicle);
	                getParkRecords().add(parkRecord);
	                setGuncel(getGuncel()+1);
	                System.out.println(plate+" plakali arac otoparka basariyla giris yapti.(Subscribed)");
	                return true;
	            }
	            else
	            {
	                if(isOfficial==true)//checks if this is a official vehicle or not
	                {
	                    OfficialVehicle officialVehicle=new OfficialVehicle(plate);
	                    parkRecord=new ParkRecord(enter,officialVehicle);
	                    getParkRecords().add(parkRecord);
	                    setGuncel(getGuncel()+1);
	                    System.out.println(plate+" plakali arac otoparka basariyla giris yapti.(Official)");
	                    return true;
	                }
	                else //regular
	                {
	                    RegularVehicle regularVehicle=new RegularVehicle(plate);
	                    parkRecord=new ParkRecord(enter,regularVehicle);
	                    getParkRecords().add(parkRecord);
	                    setGuncel(getGuncel()+1);
	                    System.out.println(plate+" plakali arac otoparka basariyla giris yapti.(Regular)");
	                    return true;
	                }
	            }
	          }
		}
    }
	public boolean vehicleExits(String plate,Time exit)
    {	
		setUcret(0.00); // parking cost
		boolean isparked = isParked(plate);
		if ( isparked == false) {
			System.out.println(plate+" plakalý arac otoparkta degil.");
			return false;
		}
			
		
        ParkRecord parkRecord;
        parkRecord=searchParkRecord(plate);
        
        SubscribedVehicle subscribedVehicle;
        subscribedVehicle=searchVehicle(plate);
        if(parkRecord!=null && subscribedVehicle!=null) //for subscribed vehicle
        {
          if (subscribedVehicle.getSubscription().isValid()==true)//validity control for subscription
          {
        	  int a=indexOfParkRecord(parkRecord);
              parkRecord.setExitTime(exit);
              getParkRecords().setElementAt(parkRecord,a);
              setGuncel(getGuncel()-1);
              System.out.println(plate+" plakali arac otoparktan basariyla cikis yapti.(Subscribed)");
              return true;
          }
          else
          {
        	  int a=indexOfParkRecord(parkRecord);
              parkRecord.setExitTime(exit);
              setUcret(parkRecord.getParkingDuration()*getHourlyFee());
              setIncomeDaily(getIncomeDaily()+getUcret());
              getParkRecords().setElementAt(parkRecord,a);
              setGuncel(getGuncel()-1);
              System.out.println(plate+" plakali arac otoparktan basariyla cikis yapti.(Not valid Subscribed)");
              return  true;
          }
        }
        else if(parkRecord.getVehicle().isSpecial()==false)//Regular
        {
        	int a=indexOfParkRecord(parkRecord);
            parkRecord.setExitTime(exit);
            setUcret(parkRecord.getParkingDuration()*getHourlyFee());
            
            setIncomeDaily(getIncomeDaily()+getUcret());
            getParkRecords().setElementAt(parkRecord,a);
            setGuncel(getGuncel()-1);
            System.out.println(plate+" plakali arac otoparktan basariyla cikis yapti.(Regular)");
            System.out.println("Ödenmesi gereken ücret:"+getUcret());
            return true;
        }
        else //official
        {
        	int a=indexOfParkRecord(parkRecord);
            parkRecord.setExitTime(exit);
            getParkRecords().setElementAt(parkRecord,a);
            setGuncel(getGuncel()-1);
            System.out.println(plate+" plakali arac otoparktan basariyla cikis yapti.(Official)");
            return true;
        }
    }

	@Override
	public String toString() {
		return "AutoPark: subscribedVehicles=" + getSubscribedVehicles() + "\n"+"	  parkRecords=" + getParkRecords() + "\n"+"	"+"hourlyFee="
				+ getHourlyFee() + ", incomeDaily=" + getIncomeDaily() + ", capacity=" + getCapacity() + ", guncel=" + getGuncel();
	}
	
	
}
