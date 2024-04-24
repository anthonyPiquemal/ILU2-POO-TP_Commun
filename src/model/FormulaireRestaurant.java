package model;

public class FormulaireRestaurant extends Formulaire{	
	int nombrePersonnes;
	int numService;

	public FormulaireRestaurant(int jour, int mois, int nombrePersonnes, int numService) {
		this.jour = jour;
		this.mois = mois;
		this.nombrePersonnes = nombrePersonnes;
		this.numService = numService;
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
