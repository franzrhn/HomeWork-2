package Homework2;

public class Laptop {
	private String name;
	private String opSystem;
	private	static double screenSize;
	private static String screenResolution;
	private static double price = 0.0;
	
	
	Laptop () {
		
		System.out.println("My Laptop: MacBook Pro");	
	}
	
	Laptop (String name, String os) {
		
		this.name = name;
		this.opSystem = os;
	}
	
	public Laptop(String sr, double ss) {
		
		sr = screenResolution;
		ss = screenSize;	
	}


	public void basicsInfo() {
		
		System.out.println("The brand is " + name + "\nOperation System is " + opSystem);
	}

	public static void laptopScreen(String sr, double ss) {
		
		System.out.println("Screen resolution and size is " + sr + "and " + ss);
	}

	public static double  getPrice(double price) {
		
		return price;
			
	}
	
	public static void main(String[] args) {
	
		System.out.println("price: USD" + Laptop.getPrice(2000.0));
		Laptop obj = new Laptop();
		 Laptop.laptopScreen("2560x1600 " ,  13.3);
	}

	public static double getPrice() {
		return price;
	}

	public static void setPrice(double price) {
		Laptop.price = price;
	}


}
