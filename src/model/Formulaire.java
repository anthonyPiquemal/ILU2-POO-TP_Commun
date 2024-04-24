package model;

public abstract class Formulaire {
	int jour;
	int mois;
	int identificationEntite;
	
	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}
	
	public int getIdentificationEntite() {
		return identificationEntite;
	}
	
	public void setIdentificationEntite(int identificationEntite) {
		this.identificationEntite = identificationEntite;
	}
}
