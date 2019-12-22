package sii.maroc;

public class Restaurant {
	private static int nbOfSalads;
	
	public static int getNbOfSalads() {
		return nbOfSalads;
	}

	public Restaurant(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
	}

	public Ticket order(String string) {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket();
		nbOfSalads = Integer.parseInt(string.substring(0, 1));
		return ticket;
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		Meal meal = new Meal();
		return meal;
	}


	
}
