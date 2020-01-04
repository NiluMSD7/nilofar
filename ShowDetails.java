package mydemos;



import java.util.ArrayList;
import java.util.HashMap;

public class ShowDetails
{

	public static void main(String[] args) {
		
		
		Car c1 = new Car("Jazz", "Honda", 2017);
		Car c2 = new Car("Civic", "Honda", 2018);
		Car c3 = new Car("Swift", "Suzuki", 2017);
		Car c4 = new Car("City", "Honda", 2017);
		Car c5 = new Car("Duster", "Renault", 2017);
		Car c6 = new Car("Kwid", "Renault", 2017);
		Car c7 = new Car("Micra", "Nissan", 2017);
		Car c8 = new Car("Alto", "Maruti", 2017);
		
		ArrayList<Car> carList1 = new ArrayList<Car>();
		carList1.add(c1);
		carList1.add(c2);
		carList1.add(c3);
		
		ArrayList<Car> carList2 = new ArrayList<Car>();
		carList2.add(c4);
		carList2.add(c5);
		carList2.add(c6);
		
		
		ArrayList<Car> carList3 = new ArrayList<Car>();
		carList3.add(c7);
		carList3.add(c8);

		Showroom s1 = new Showroom("Harsha Cars", "Mehdipatnam", carList1);
		Showroom s2 = new Showroom("SaiTeja Motors", "Attapur", carList2);
		Showroom s3 = new Showroom("Lakshmi Ganapati motors", "Jubilee Hills", carList3);
		
		HashMap<String, ArrayList<Car>> m = new HashMap<String, ArrayList<Car>>();
		m.put("Harsha Car", carList1);
		m.put("SaiTeja Motors", carList2);
		m.put("Lakshmi Ganapati motors", carList3);
		
}
}