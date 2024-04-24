package model;

public class CentraleReservation <E, F> {
	E[] tabEntite;
	int nbEntite;
	
	public CentraleReservation(E[] tabEntite) {
		this.tabEntite = tabEntite;
		nbEntite = 0;
	}
	
	public int ajouterEntite(E entite) {
		tabEntite[nbEntite] = entite;
		nbEntite += 1;
		return nbEntite;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] tab;
		for(int i = 0; i < nbEntite; i++) {
			if(/* valide */) { // TODO condition if
				tab[i] = formulaire.getIdentificationEntite();
			}
			else {
				tab[i] = 0;
			}
		}
		return tab;
	}
	
	public Reservation reserver(int numeroEntite, F formulaire) {
		E entite = tabEntite[numeroEntite];
		formulaire.setIdentificationIdentite(entite);
		
	}

}
