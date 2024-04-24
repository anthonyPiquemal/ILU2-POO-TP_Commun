package model;

public abstract class EntiteReservable <T extends Formulaire>{

	CalendrierAnnuel calendrier = new CalendrierAnnuel();
	int numero;
	
	public EntiteReservable(T typeFormulaire) {
	}
	
	public boolean estLibre(T formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		
		return calendrier.estLibre(jour, mois);
	}
	
	public abstract boolean compatible(T formulaire);
	
	public abstract T reserver(T formulaire);
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
