package mydemos;



class Car{
	
	
	
	String carName;
	String carMenu;
	int yearMenu;
	
	
	
	
	public Car(String carName, String carMenu, int yearMenu) {
		super();
		this.carName = carName;
		this.carMenu = carMenu;
		this.yearMenu = yearMenu;
	}

	
	
	
	public Car() {
		super();
	}




	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarMenu() {
		return carMenu;
	}

	public void setCarMenu(String carMenu) {
		this.carMenu = carMenu;
	}

	public int getYearMenu() {
		return yearMenu;
	}

	public void setYearMenu(int yearManu) {
		this.yearMenu = yearManu;
	}
	
}




