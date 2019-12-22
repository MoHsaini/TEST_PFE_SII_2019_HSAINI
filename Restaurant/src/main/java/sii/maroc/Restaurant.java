package sii.maroc;

public class Restaurant {
	private static int nbOfSalads;
	private int nbOfMozzarella;
	private int nbOfTomatoes;
	String nbOfMozzarellaString ;
	String nbOfTomatoesString ;
	
	public static int getNbOfSalads() {
		return nbOfSalads;
	}

	public Restaurant(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
		String nbOfMozzarellaString = string;
		String nbOfTomatoesString = string2;
		nbOfMozzarella = Integer.parseInt(nbOfMozzarellaString.substring(0, 1));
		nbOfTomatoes = Integer.parseInt(nbOfTomatoesString.substring(0, 1));

	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
	}

	public Ticket order(String string) {
		// TODO Auto-generated method stub
		nbOfSalads = Integer.parseInt(string.substring(0, 1));
		Ticket ticket = new Ticket();
		return ticket;
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		Meal meal = new Meal();
		return meal;
	}

	public void isOutStock(String order) throws UnavailableDishException {
		int nbOfCommand = Integer.parseInt(order.substring(0, 1));
		if(nbOfMozzarella < nbOfCommand || nbOfTomatoes < 2*nbOfCommand ){
			throw new UnavailableDishException();
		}
	}
	
}
