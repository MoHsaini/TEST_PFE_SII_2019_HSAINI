package sii.maroc;

public class Ticket {
	private static int nbOfPizzas;
	
	public static int getNbOfPizzas() {
		return nbOfPizzas;
	}

	public Ticket and(String string) {
		Ticket ticket = new Ticket();
		nbOfPizzas = Integer.parseInt(string.substring(0, 1));
		return ticket;
	}

}
