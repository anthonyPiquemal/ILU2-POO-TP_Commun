package model;

public class FormulaireRestaurant {	
	int jour;
	int mois;
	int nombrePersonnes;
	int numService;
	int identificationEntite;

	public FormulaireRestaurant(int jour, int mois, int nombrePersonnes, int numService) {
		this.jour = jour;
		this.mois = mois;
		this.nombrePersonnes = nombrePersonnes;
		this.numService = numService;
	}
	
	public int getIdentificationEntite() {
		return identificationEntite;
	}
	
	public void setIdentificationEntite(int identificationEntite) {
		this.identificationEntite = identificationEntite;
	}

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

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public void setNombrePersonnes(int nombrePersonnes) {
		this.nombrePersonnes = nombrePersonnes;
	}

	public int getNumService() {
		return numService;
	}

	public void setNumService(int numService) {
		this.numService = numService;
	}
	}
