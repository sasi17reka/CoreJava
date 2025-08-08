package day17;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    ArrayList<String> bike = new ArrayList<String>();
	    bike.add("Pulsar");
	    bike.add("Royal Enfield");
	    bike.add("deo");
	    
	    bike.addAll(cars);
	    
	    System.out.println(bike);
	}

}
