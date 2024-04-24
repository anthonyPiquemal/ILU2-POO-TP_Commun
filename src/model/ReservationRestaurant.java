package model;

public class ReservationRestaurant{
	int jour;
	int mois;
	int numService;
	int numTable;

	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		this.jour = jour;
		this.mois = mois;
		this.numService = numService;
		this.numTable = numTable;
	}
	
	public String toString() {
		String service;
		if(numService == 1)
			service = "premier";
		else
			service = "deuxième";
		return("Le " + jour + "/" + mois + "\nTable " + numTable + " pour le " + service + " service.");
	}
}
