package model;

public class EntiteReservable <F>{
	F formulaire;
	CalendrierAnnuel calendrier = new CalendrierAnnuel();
	int numero;
	
	public EntiteReservable(F typeFormulaire) {
	}
	
	public boolean estLibre(F formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		
		return calendrier.estLibre(jour, mois);
	}
	
	public boolean compatible(F formulaire) {
		return true;
	}
	
	public <F> reserver(F formulaire) {
		return null;
	}
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
