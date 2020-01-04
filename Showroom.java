package mydemos;

import java.util.ArrayList;

public class Showroom {
	
	
	
	
	String showName;
	String location;
	ArrayList<Car> carList = new ArrayList<Car>();
	
	
	
	
	public Showroom(String showName, String location, ArrayList<Car> carList) {
		super();
		this.showName = showName;
		this.location = location;
		this.carList = carList;
	}


	//def cons
	
	public Showroom() {
		super();
	}

	
	
	
	
	
	public String getShowName() {
		return showName;
	}


	public void setShowName(String showName) {
		this.showName = showName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public ArrayList<Car> getCarList() {
		return carList;
	}


	public void setCarList(ArrayList<Car> carList) {
		this.carList = carList;
	}
	
}



