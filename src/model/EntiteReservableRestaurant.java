package model;

public class EntiteReservableRestaurant extends EntiteReservable<FormulaireRestaurant>{

	public EntiteReservableRestaurant(FormulaireRestaurant formulaireRestaurant) {
		super(formulaireRestaurant);
	}

	@Override
	public boolean compatible(FormulaireRestaurant formulaire) {
		boolean reservable = false;
		//TODO
		
		return reservable;
	}

	@Override
	public FormulaireRestaurant reserver(FormulaireRestaurant formulaire) {
		// TODO Auto-generated method stub
		return null;
	}
}
